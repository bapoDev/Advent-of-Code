# Day Two : Red-Nosed Reports

### My thougths :

This one was harder because I was pretty dumb at first and I couldn't debug this easily. This finally took me around 3 hours to finish and I had to use someone else's solution (without reading the code) to find what was wrong with mine by diffing the results. I did this one in Java because... why not ? Java is pretty easy to use when it comes down to reading line by line a file. Everything is in one source file because I simply did not think of making several... So there are two methods that shares code, one for each part of the problem.

## How does it work ?

### Part One :

This one was easy and short to write, I create some variables to store the difference between the two numbers and the one from the last iteration of the loop. I then iterate through the lines of the file after splitting the line into each number, I cast the strings in the string array to integers and simply check if the value is too high, too low, or 0 and then I check if the numbers are sorted in a descendant or ascendant way by comparing with the last difference I calculated, which works because I did not use any absolute value, so the difference could be either positive or negative. As you can see I initialize ``lastDiff`` at the end of the loop so that it doesn't cause problems.

### Part Two :

This one is messy, but trust me the other ways I tried to make it were worse... WAY worse. The core of ``isSecondReportValid`` is basically the same as ``isReportValid`` but instead of returning false right away, I check by removing the current value, the prior value or the prior prior value if I get a successful result by using the method from the first part (pretty clever eh ? took me 2 hours to even think of this...). To remove a value from an array, I could either try with a ``List<String>`` object, but I don't like using them so I just made another method ``removeOneFromArrayByIndex`` which iterates trough the original list in parameter and simple doesn't add the selected index. This is super simple and I hate myself for not thinking about doing it this way, and looking around other dev's weird solutions, I think I felt the impostor syndrome for the first time in a while !

### How to run it ?

You need to be into the ``day2`` directory in your terminal. Linux, MacOS or Windows shouldn't be any different here.

```bash
javac -sourcepath . .\day2Solver.java -d classes

# If you want to test with your own input.
java -cp classes day2.day2Solver "input.txt"

# If you want to use the tests that are provided in the form of prints to the console like a real professional dev would do !
java -cp classes day2.day2Solver
```