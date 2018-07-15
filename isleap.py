def is_leap(year):
    leap = False
    if abs(year)%4 is 0 :
        leap = True
    elif(year%100 is 0 and year%400 is 0):
		leap = False
    # Write your logic here
    
    return leap

year = 2100
print is_leap(year)

n=3
s=""
for i in range (1,n+1):
    s=s+str(i)
print s