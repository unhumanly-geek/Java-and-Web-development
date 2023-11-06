// let n = prompt("Enter total numbers: ")
// let arr = []
// for (let i = 0; i < n; i++) {
//     let k = prompt("Enter values")
//     k = Number.parseInt(k)
//     if (k != 0) {
//         arr.push(k)
//     }
// }
// console.log(arr);

let arr = [10,20,33,44,50,70,66]
//  problem 3
let a1  = arr.filter((a)=>{
    if (a%10==0) {
        return a
    }
})
// problem 4
console.log(a1);
a1 = arr.map((value)=>{
    return value*value
})
console.log(a1);