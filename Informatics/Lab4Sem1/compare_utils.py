import json
import xmltodict
import time
start_time = time.time()

for _ in range(100):
    json_file = open('schedule.json', 'r', encoding='utf-8')
    json_data = json.load(json_file)

    xml_data = xmltodict.unparse({"schedule": json_data}, pretty=True)

    xml_file = open('result.xml', 'w', encoding='utf-8')
    xml_file.write(xml_data)

end_time = time.time()
print(end_time - start_time)