# Rock, Paper, Scissors Game

## Overview

This simple console-based Rock, Paper, Scissors game is a classic hand game implemented in Java. The game allows users
to play against a computer opponent, making their move by choosing between Rock (r), Paper (p), or Scissors (s).

## How to Play

1. Run the program.
2. The welcome screen will prompt you with options:
    - **1. Play Game:** Start a new game.
    - **2. Exit:** Exit the game.
3. Choose an option by entering the corresponding number.
4. If you choose to play, you'll be prompted to enter your move (Rock, Paper, or Scissors). The computer will also
   randomly select its move.
5. The game will determine the winner based on the classic Rock, Paper, Scissors rules.
6. The result will be displayed, indicating whether you win, lose, or tie with the computer.
7. You can choose to play again or exit the game.

## Project Structure

- **Main.java:** The main class that orchestrates the game loop and user interface.
- **GameLogic.java:** Handles the logic of the Rock, Paper, Scissors game, including generating computer moves and
  determining the winner.
- **GameUI.java:** Manages the user interface, including welcome screens, exit messages, and outcome displays.

## Running the Game

To run the game, compile the Java files and execute the `Main` class. Follow the on-screen prompts to navigate through
the game.

## Dependencies

The game does not have external dependencies. It utilizes the standard Java libraries for basic input/output operations.

## Example Output

```
=======================================================================================
   ROCK                           PAPER                              SCISSORS          
|    _______                 |   _______                       |    _______         
|---'   ____)                | ---'   ____)____                |---'   ____)____    
|      (_____)               |          ______)                |          ______)   
|      (_____)               |          _______)               |       __________)  
|      (____)                |         _______)                |      (____)        
|---.__(___)                 |---.__________)                  |---.__(___)         
=======================================================================================
Welcome to Rock, Paper, Scissors!
1. Play Game
2. Exit
Choose an option: 1
 >>> Your move ? (r ,p or s ): r
 >>> You played: r
 >>> Computer played: p
 >>> You lose!

Welcome to Rock, Paper, Scissors!
1. Play Game
2. Exit
Choose an option: 1
 >>> Your move ? (r ,p or s ): p
 >>> You played: p
 >>> Computer played: p
 >>> The game was a tie!

Welcome to Rock, Paper, Scissors!
1. Play Game
2. Exit
Choose an option: 2
Exiting the play. Goodbye! =)

