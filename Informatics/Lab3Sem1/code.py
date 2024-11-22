import re

print('-------------------------------Task1-------------------------------')
pattern = '8-('

tests1 = [
    'h_-(8-((((((((((((8-(8-8(((',  # 2
    '8-(8-(8-(8-(',  # 4
    '',  # 0
    '88888888---------((((((((((88--((',  # 0
    '8-('  # 1
]
for text in tests1:
    pattern = r"8-\("
    matches = re.findall(pattern, text)
    print(len(matches))

print('-------------------------------Task2-------------------------------')
tests2 = [
    'Одинокая луна восходит',  # не хайку мало строк
    'Шёпот ветра в траве / Роса на утренней траве / Мгновения тишины / Солнце поднимается.',
    # не хайку много строк
    'Звёзды на небе,/ Прохладный ветер сквозь деревья — / Ночь проходит.',  # не хайку по слогам
    'Волнуясь, дарю / новые хайку друзьям - / новым и старым.',  # хайку
    '',  # далеко не хайку
    '//'  # далеко не хайку
]
pattern1 = r'[^/]+\/[^/]+\/[^/]+'
pattern2 = r"[аеёиоуыэюя]"
for i in tests2:
    if re.findall(pattern1, i, re.IGNORECASE):
        j = i.split('/')
        if len(re.findall(pattern2, j[0], re.IGNORECASE)) == 5 \
                and len(re.findall(pattern2, j[1], re.IGNORECASE)) == 7 \
                and len(re.findall(pattern2, j[2], re.IGNORECASE)) == 5:
            print(i)
            print('Хайку!')
            print()
        else:
            print(i)
            print('Не хайку.')
            print()
    else:
        print(i)
        print('Не хайку. Должно быть 3 строчки.')
        print()

print('-------------------------------Task3-------------------------------')
tests3 = [
    "example@gmail.com",  # гуд
    "firstname.lastname@domain.io",  # гуд
    "1234567890@domain.com",  # гуд
    "plainaddress",  # Нет "@" и домена
    "@missingusername.com",  # Нет имени пользователя
    "username@.com.my",  # Домен начинается с точки
    "username@domain..com",  # Две точки подряд в домене
    "username@domain,com",  # Запятая вместо точки
    "username@domain@domain.com",  # Два "@" в адресе
    "username@domain.com.",  # Заканчивается точкой
    "username@.com",  # Нет доменного имени
    "username@domain"  # Нет доменного суффикса
]

def check_address(address):
    if re.fullmatch(r'[._a-zA-Z0-9]+@[a-zA-Z]+\.[a-zA-Z]+', address):
        return True
    return False


def server(address):
    if check_address(address):
        for i in range(len(address)):
            if re.fullmatch(r'@[a-zA-Z]+\.[a-zA-Z]+', address[i:]):
                return address[i:]
    return 'Invalid address'


for i in tests3:
    print(i)
    if check_address(i):
        print('Норм email')
    else:
        print('Плохой email')
    print(f'Server: {server(i)}')
    print()

