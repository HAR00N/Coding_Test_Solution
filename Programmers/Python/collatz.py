n = 16
answer = 0

while True:
    if answer >= 500:
        answer = -1
        break

    if n == 1:
        break

    if n % 2 == 0:
        n /= 2
    else:
        n = n * 3 + 1

    answer += 1

print(answer)
