var arr = [1, 2, 3, 4];

var answer = 0;

for (var i=0; i<arr.length; i++) {
    answer += arr[i];
}

answer /= arr.length;
console.log(answer)