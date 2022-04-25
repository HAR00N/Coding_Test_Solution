import math

x = 10

answer = False

temp = x
_sum = 0

while temp >= 1:
    _sum += temp % 10
    temp = math.floor(temp / 10)

if x % _sum == 0:
    answer = True

print(answer)
