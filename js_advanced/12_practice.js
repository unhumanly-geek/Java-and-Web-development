const students = {}
let a = prompt("Total no of enteries: ")

for(let i =0; i<a; i++){
    let b = prompt("name of students: ");
    let c = prompt("marks of the : ")
    
    students[b]=c;
}
console.log(students);

for (let i = 0; i < Object.keys(students).length; i++) {
    console.log("The marks of: " + Object.keys(students)[i], " :are: " + students[Object.keys(students)[i]]);
}