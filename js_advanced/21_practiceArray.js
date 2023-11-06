let n = prompt("Enter total numbers: ")
let arr = []
for (let i = 0; i < n; i++) {
    let k = prompt("Enter values")
    k = Number.parseInt(k)
    if (k != 0) {
        arr.push(k)
    }
}
console.log(arr);
