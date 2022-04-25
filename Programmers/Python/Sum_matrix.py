def solution(arr1, arr2):
    
    leng1 = len(arr1)
    leng2 = len(arr1[0])

    answer = arr1

    for j in range(0,leng2) :
        for i in range(0,leng1) :
            answer[i][j] = arr1[i][j] + arr2[i][j]
    
    return answer