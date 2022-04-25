function solution(x) {
    var answer = false;
    
    var leng = Math.floor( Math.log10(x) )+1;
    var num = x;
    var temp = 0;

    for (var i=0; i<leng; i++) {
        temp += num % 10;
        num = Math.floor(num/10);
    }

    if (x % temp == 0){
        answer = true;
    }
       
    return answer;
}