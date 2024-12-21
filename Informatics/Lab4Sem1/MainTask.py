import sys

file = open('schedule.json').read()

file = '<schedule>' + file[1:-1] + '</schedule>'
file = file.split('\n')
a = ['' for i in range(len(file))]
flag = False
last = 0
for i in range(1, len(file) - 1):
    if ':' in file[i]:
        key = file[i].split(':')[0].strip()[1:-1]
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
    for j in range(len(file[i])):
        if file[i][j] == ' ':
            res[i] += ' '
        else:
            break
    if a[i] != '' and b[i] != '':
        res[i] += a[i]
        subres = file[i].replace(':', '#$##@', 1).split('#$##@')[1]
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
