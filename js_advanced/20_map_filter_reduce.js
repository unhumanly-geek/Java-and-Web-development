let arr = [45, 23, 21]

// map method
let a = arr.map((value, index, Array)=>{
    console.log(value, index, Array);
    return value+1
})
console.log(a);

// filter method
let arr2 = [45, 23, 21, 0, 3, 5]
let a2 = arr2.filter((a)=>{
    return a<10
})
console.log(a2);