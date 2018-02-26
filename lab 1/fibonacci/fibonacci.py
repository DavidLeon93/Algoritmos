def fibM(n):
    memo = {}
    def fib(n):
        if n==0 :
            return 0
        if n==1 :
            return 1
        if (n-2) not in memo:
            memo[n-2] = fib(n-2)
        if (n-1) not in memo:
            memo[n-1] = fib(n-1)
        return memo[n-1] + memo[n-2]
    return fib(n)
    
n = 8
result = ''
j = 0
while (j < n):
        result = result + ' ' + str(fibM(j))
        j = j + 1
print(result)

fibM(8)