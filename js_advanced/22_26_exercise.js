let x = Math.floor((Math.random()*100)+1)
let chances = 0;
let input = 0
while(input != x){
  input = Number.parseInt(prompt("Enter number between 0 to 100"))

  if(input > x){
    console.log("The number is smaller than " +input)
  }

  else if(input < x){
    console.log("The number is bigger than " +input)
  }

  chances++
}

console.log("Congrats Champ")
console.log("Your score is " +(100 - chances)+ " and number is " +x)