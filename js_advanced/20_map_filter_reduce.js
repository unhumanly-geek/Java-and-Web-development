let arr = [45, 23, 21]

// map method
let a = arr.map((value, index, Array)=>{
    console.log(value, index, Array);
    return value+1
})
console.log(a);
