#Lab 2 - assigned Saturday, February 18, 2017

On page 491 -- Follow the Lottery Application instructions.

Due Saturday, 2016.02.20

Prompt:

Write a Lottery class that simulates a lottery. The class should have an array 
of five integers named lotteryNumbers. The constructor should use the Random 
class (from the Java API) to generate a random number in the range of 0 through
9 for each element in the array. The class should also have a method that 
accepts an array of five integers that represent a person’s lottery picks. 
The method is to compare the corresponding elements in the two arrays and 
return the number of digits that match. For example, the following shows the
lotteryNumbers array and the user’s array with sample numbers stored in each. 
There are two matching digits (elements 2 and 4).

lotteryNumbers array:
7 4 9 1 3

User’s array:
4 2 9 7 3

In addition, the class should have a method that returns a copy of the 
lotteryNumbers array. Demonstrate the class in a program that asks the user to 
enter five numbers. The program should display the number of digits that match 
the randomly generated lottery numbers. If all of the digits match, display a 
message proclaiming the user a grand prize winner.

---
#RunLottery.java

	Usage: java RunLottery [--cheat]
	Options: cheat: Prints the randon numbers generated at the beginning of
			the program.


```shell
java RunLottery --cheat
Cheater Mode: Random Numbers are
 0  5  1  4  2 
Lottery Application
What is your 1st pick? > 1
What is your 2nd pick? > 5
What is your 3rd pick? > 1
What is your 4th pick? > 4
What is your 5th pick? > 2
--------------------------------------------------
You win with 4 correct results!
Your Numbers:
---------------------
| 1 | 5 | 1 | 4 | 2 |
---------------------
The Winning Numbers are:
---------------------
| 0 | 5 | 1 | 4 | 2 |
---------------------
Thanks for Playing!
```
