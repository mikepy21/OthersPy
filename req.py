from urllib2 import Request, urlopen
import json

request = Request('http://polls.apiblueprint.org/questions')

response_body = urlopen(request).read()
print response_body
print json.loads(response_body)[0]


source.subscribe(on_next=lambda value: print("Received {0}".format(value)),on_completed=lambda: print("Done!"),on_error=lambda error: print("Error Occurred: {0}".format(error)))