#Program #5: Josephus Problem
##Program #5 for CS143 class

##Overview
This assignment siumulates the Josephus Permutation, where people standing in a circle are eliminated according to a given count until there is only one person remaining.

##Josephus Problem
The Josephus problem is essentially a game of elimination. There simulation begins with a circle of people (this will be read in from a text file) and an elimination count (this will be randomly generated in your constructor). Your program will eliminate people in the circle using the provided count by counting to that number pointing at each person in the circle until the elimination count is reached; the person at that number is then eliminated from the circle.

##Provided Files
JosephusSim: class that simulates the Josephus Permutation
JosephusDriver: engine to test JosephusSim
people.txt & people2.txt: Provided names to load into JosephusSim
PersonNode: Custom LinkedNode class for use in JosephusSim

##Assignment
Build JosephusSim constructor, eliminate(), isOver(), and toString()
Paste sample output in JosephusDriver
