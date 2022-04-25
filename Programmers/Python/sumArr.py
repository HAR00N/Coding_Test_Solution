arr1 = [[1,2,3],[2,3,4]]
arr2 = [[3,5,6],[1,2,1]]

test = [[c + d for c, d in zip(a, b)] for a, b in zip(arr1, arr2)]
print("test1 :", test)

test2 = [list(map(sum, zip(*x))) for x in zip(arr1, arr2)]
print("test2 :", test2)


leng1 = len(arr1)
leng2 = len(arr1[0])

answer = arr1

for j in range(0,leng2) :
    for i in range(0,leng1) :
        answer[i][j] = arr1[i][j] + arr2[i][j]

print(answer)