let num = [1,2,3,4,5,6,7,8]

// for each loop
num.forEach((element)=>{
    console.log(element);
})

// Array.from
let name = "Akshat"
let arr = Array.from(name)
console.log(arr);
// for...of
for (let i of num){
    console.log(i);
}
