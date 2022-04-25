import math

n = 2
m = 5

a, b = min(n, m), max(n, m)
t = 1

while t > 0:
    t = b % a
    b, a = a, t

answer = [b, n * m / b]
print(answer)
