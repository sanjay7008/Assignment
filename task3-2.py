def compute(n):
    if n < 10:
        out = n ** 2
    elif n < 20:
        out = 1
        for i in range(1, n-9): #changed -10 to -9 as range runs upto n-1 iterations
            out *= i
    else:
        lim = n - 20
        out = lim * lim
        out = out + lim #changed - operator to + operator
        out = out / 2 
    print(out)
    
n = int(input("Enter an integer: "))
compute(n)
