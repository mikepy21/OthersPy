import json
import requests
r = requests.get('http://polls.apiblueprint.org/questions')
print r.json()