import re
import time
start_time = time.time()
for _ in range(100):
    file = open('schedule.json').read()

    file = '<schedule>' + file[1:-1] + '</schedule>'
    file = file.split('\n')
    a = ['' for i in range(len(file))]
    flag = False
    last = 0
    for i in range(1, len(file) - 1):
        if ':' in file[i]:
            key = re.findall(r'["]{1}.*["]{1}:', file[i])[0]
            key = key[key.find('"') + 1:key.rfind('"')]
            if not '[' in file[i]:
                a[i] = '<' + key + '>'
            else:
                last = '<' + key + '>'
        if '[' in file[i]:
            flag = True
        if flag and '{' in file[i]:
            a[i] = last
        if ']' in file[i]:
            flag = False

    a[0] = '<schedule>'

    b = ['' for i in range(len(file))]
    b[0] = ''
    b[-1] = '</schedule>'
    for i in range(len(file)):
        if a[i] != '':
            if '{' in file[i]:
                k = 1
                for j in range(i + 1, len(file)):
                    if '{' in file[j]:
                        k += 1
                    elif '}' in file[j]:
                        k -= 1
                    if k == 0:
                        b[j] = '</' + a[i][1:]
                        break
            else:
                b[i] = '</' + a[i][1:]
    b[0] = ''
    b[-1] = '</schedule>'
    res = ['' for i in range(len(file))]

    for i in range(len(file)):
        res[i] += re.findall(r'^\s*', file[i])[0]
        if a[i] != '' and b[i] != '':
            res[i] += a[i]
            subres = re.findall(r':.*$', file[i])[0]
            res[i] += subres[subres.find('"') + 1:subres.rfind('"')].strip()
            res[i] += b[i]
        else:
            res[i] += a[i]
            res[i] += b[i]
    res = [i for i in res if i.strip() != '']
    resultfile = open('result.xml', 'w')
    resultfile.write('<?xml version="1.0" encoding="utf-8"?>')
    resultfile.write('\n')
    for i in res:
        resultfile.write(i)
        resultfile.write('\n')
end_time = time.time()
print(end_time - start_time)