let myNumber;
myNumber = 0;

for (let i = 0; i < 1000; i++){
    if (i % 3 == 0 || i % 5 == 0){
        myNumber += i;
    }
}

console.log(myNumber);