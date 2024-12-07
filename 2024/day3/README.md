# Day Three : Mull it Over

### My thoughts :

This problem was easier than day 2, it made me finally use my regex knowledge which made it stupidly easy for me to do. The only trouble I had was with all those JavaScript mistypings and I spent 20 min figuring out that I typed ``dont()`` instead of ``don't()``... So as I said, I chose JavaScript for this one using Node.JS, simply because the first time I ever used RegEx was in a JavaScript project for college... In total it took me an hour and a half to do the two parts, as I said, very easy.

## How it works :

### Common functions :

Each part has its own function and RegEx. There are two functions that are used for both parts, the first one simply reads the entire file into one string, this can be dangerous for your RAM usage if you input a very big file. Fortunately, the input wasn't THAT big. This function then has a returning anonymous function that simply ``console.log`` each ``mul`` function that I made with the data it got from the file.

Then the ``parseInts`` is the function that actually multiplies the two numbers, it takes each value from an array of ``mul(___,___)`` strings, puts them in a left and right variable after taking only the numbers with another RegEx that I then parse to ints just to be sure (you never know with this demonic language) and return the result of the product of the two.

### Part One :

This one is tiny, it takes the data as a parameter which contains the entirety of the input file as one string. I then match the RegEx to create an array in the form of ``mult(___,___)`` elements. then I loop through it and increment the res variable with the result of the ``parseInts`` function.

### Part Two :

This one is a bit spaghetti but eh, 12:30am, I just wanted to sleep. This function is the same as part one but now it has a boolean to check whether or not you are in a ``do()`` statement, I then loop through the same array as part one and check if I have a ``do()`` or ``don't()`` which changes the boolean value.

## How to run it ?

Install Node.JS, simply run :

```bash
node main.js
```

> [!WARNING]
> Make sure to have a ``input.txt`` file with your valid input in the same directory as the ``main.js`` file as I didn't make it a cmdline argument since it doesn't work for some reason.