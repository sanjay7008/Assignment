def compute(n):
    if n < 10:
        out = n ** 2
    elif n < 20:
        out = 1
        for i in range(1, n-9): #2
            out *= i
    else:
        lim = n - 20
        out = lim * lim
        out = out + lim #1
        out = out / 2 
    print(out)
    
compute(8)
