def solution(x, n):

    answer = [0] * n
    answer[0] = x

    for i in range (1,n) :
        answer[i] = answer[i-1] + x
    
    return answer