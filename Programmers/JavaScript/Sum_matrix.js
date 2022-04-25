function solution(arr1, arr2) {
    
var leng = arr1.length;
var leng_arr = arr1[0].length;

var answer = new Array(leng);
for (var k=0; k<leng; k++){
    answer[k] = new Array(leng_arr);
}

for (var i=0; i<leng; i++){
    for (j=0; j<leng_arr; j++){
        answer[i][j] = arr1[i][j] + arr2[i][j];
    }
}
    
    return answer;
}