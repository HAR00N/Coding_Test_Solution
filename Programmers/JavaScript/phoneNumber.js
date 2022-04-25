function solution(phone_number) {
    var answer = '';
    var leng = phone_number.length;
    
    for (var i=0; i<leng-4; i++){
        answer += '*';
    }
    
    for (var j=0; j<4; j++){
        answer += phone_number.charAt(leng-4+j);   
    }
    
    return answer;
}