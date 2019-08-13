# Guessing Game
A simple command-line number guessing game that allows the player to define a range of numbers in which the number to be guessed lies. Based on the range, the program is able to "promise" the player that it will successfully guess the number within a certain number of questions.

After each question, the range of numbers is halved, in a way similar to the binary search algorithm. When the lowerLimit equals the upperLimit, the program ends.
