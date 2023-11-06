while (true) {
    let value = Math.floor(Math.random() * 100);
    console.log(value)
    let num = prompt("enter the number");
    num = Number.parseInt(num);

    if (num == value) {

        console.log("you enter the right value")
        break;
    }
    else if (num < value) {
        console.log("you enter the less value");
    }
    else if (num > value) {
        console.log("you enter the greater value");
    }

}