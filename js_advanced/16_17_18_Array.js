let num = [1,2,34,3,4]
let b = num.toString;
let c = num.join("_")
console.log(c); // typeof string
let d = num.pop()
console.log(d);
console.log(num);
let e = num.push(56)
let f = num.push(89)
console.log(num,e,f);
let g = num.shift()
console.log(g);
console.log(num);
let h = num.unshift(54)
console.log(num,h)

// l-18
let n= [11,12,13,14,15,16,17,18]
delete n[0]
console.log(n.length, n);
let newarr = num.concat(n,num)
console.log(newarr);
newarr.sort()
console.log(newarr);


let compare = (a, b)=>{
    return a - b
}
let num2 = [14,58,35,10,175,884,288,2]
num2.sort(compare)
console.log("new arr: ",num2);
num2.reverse()
console.log(num2);

// splice and slice
let num3 = [551, 22,3,14, 5, 6, 7, 8, 229]
let deletedvalues = num3.splice(2,3,1021,1022,1023)
console.log(num3, deletedvalues);