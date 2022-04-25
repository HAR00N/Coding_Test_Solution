var n = 3412322315
var m = 1223234641445

var a = Math.min(n,m)
var b = Math.max(n,m)
var t = 1

while (t > 0) {
    t = b % a
    b = a
    a = t
}

var answer = [b, n * m / b]
console.log(answer)
