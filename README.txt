Project Title: Monopoly Junior - Part 2
Authors:
Yasrib Yasir Farook
Description:
   This application is a Java-based version of the board game Monopoly Junior. 
   Toy Boat, Toy Car, Little Hazel, and Little Scottie are the four players who alternately roll a die to move across the board. 
   Players can purchase properties, draw Chance cards, receive money after passing GO, and engage with other board spaces. 
   The program ends and the winner—the player with the largest cash balance—is announced after the game continues until one player declares bankruptcy.
   The program uses an abstract `BoardSpace` class with multiple subclasses representing different sorts of board spaces, illustrating object-oriented programming concepts such as inheritance, polymorphism, and encapsulation.

List of Classes:
Main.java – Entry point of the game.
Player.java – Represents players.
BoardSpace.java – Abstract class for spaces.
Go.java – GO space logic.
Property.java – Property spaces.
Jail.java – Jail space logic.
FreeParking.java – Free Parking space.
Chance.java – Chance card logic.
GameBoard.java – Manages the game board.
Die.java – Simulates a dice roll.