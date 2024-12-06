# Day One : Historian Hysteria

### My thoughts :

This one was pretty easy, it didn't take me long to understand and make the whole code. I chose python after trying C, it was too much of a hassle to read line by line in C without libraries and it was 10:50pm. Maybe I'll try C later !


## How does it work ?

I'm gonna be precise with this one since it was very easy so the most people can understand it, I cannot guarantee that I'll be as precise the next days as the problems get harder.

### Part One :

After reading the file, I iterate through the lines of the file by using its length and separate the left list and the right list in two distinct lists that I then sort using the ``sorted()`` function. I then iterate with the number of lines again and I simply do  the difference and take the absolute value to add it to my res variable.

### Part Two :

I copy pasted the first file, removed the ``sorted()`` function since we don't need it anymore and nested a loop in the second loop from part one that counts the number of iterations of the left number that is then multiplied with the left number and added to the res variable that is then returned.

### How to run ?

With ``input.txt`` as your input, please do not publish your input from the website as stated by the owners. If you don't know where to get that, simply go to https://adventofcode.com/2024/day/1 login then go to the bottom of the page, copy and paste the content of the new tab that will open and put it in your input.txt file.

WARNING : the file size is hardcoded in both files, please use a 1000 lines file OR modify the value.

```terminal
python part1.py input.txt
python part2.py input.txt
```