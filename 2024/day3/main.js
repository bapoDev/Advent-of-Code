const fs = require('node:fs');

const multRegex = /mul\([0-9]+,[0-9]+\)/gm;
const multRegex2 = /mul\([0-9]{1,3},[0-9]{1,3}\)|do\(\)|don't\(\)/gm;

function mul(data) {
    const multArr = data.match(multRegex);
    let res = 0;
    for (let i = 0; i < multArr.length; i++) {
        res += parseInts(multArr[i]);
    }
    return res;
}

function mul2(data) {
    const multArr = data.match(multRegex2);
    let res = 0;
    let doStatement = true;
    for (let i = 0; i < multArr.length; i++) {
        if (multArr[i] === "don't()") {
            doStatement = false;
        } else if (multArr[i] === "do()") {
            doStatement = true;
        } else if (doStatement) {
            res += parseInts(multArr[i]);
        }
    }
    return res;
}

fs.readFile('input.txt', 'utf-8',(err, data) => {
    console.log("First part answer : " + mul(data))
    console.log("Second part answer : " + mul2(data))
})

function parseInts (currentValue) {
    let nums = currentValue.split(",");
    let left = nums[0].match(/[0-9]+/gm);
    let right = nums[1].match(/[0-9]+/gm);
    return parseInt(left) * parseInt(right);
}
