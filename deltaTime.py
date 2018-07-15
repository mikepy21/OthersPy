def time_delta(t1, t2):
    dateA = int(t1[-5:-2])+float(t1[-2:])/60
    dateB = int(t2[-5:-2])+float(t2[-2:])/60
    print dateA
    print dateB
    print dateA + dateB
    


#t1 = "Sun 10 May 2015 13:54:36 -0700"
#t2 = "Sun 10 May 2015 13:54:36 -0000"
t1 = "Sat 02 May 2015 19:54:36 +0530"
t2 = "Fri 01 May 2015 13:54:36 -0000"



delta = time_delta(t1, t2)

