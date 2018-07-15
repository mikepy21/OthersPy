from rx import Observable

Observable.interval(100) \
    .map(lambda i: "{0} Mississippi".format(i)) \
    .subscribe(lambda s: print(s))

input("Press any key to quit\n")