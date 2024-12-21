import json
import xmltodict

json_file = open('schedule.json', 'r', encoding='utf-8')
json_data = json.load(json_file)

xml_data = xmltodict.unparse({"schedule": json_data}, pretty=True)

xml_file = open('result.xml', 'w', encoding='utf-8')
xml_file.write(xml_data)