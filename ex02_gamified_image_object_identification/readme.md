# Identifying objects in pictures using a gamified approach

## Goal of the project

We have a very large volume of pictures at our disposal and we want to identify the main items inside them, to create a search engine for those images based on content. To that end, we want to have a system that creates two types of games for users:

- the first one matches 2 users, shows them a picture and asks each of them to name as many objects in the picture. They are awarded points based on the number of common items they've identified.
- the second game shows individual users a picture and asks them to click on the object within the picture. The item to click on is selected based on the metadata obtained from the first game. They are awarded points based on the time it takes the user to click on the item. 

The system compiles the information about objects from the first game and their approximate location based on the clicks received in the second game to build the search engine database. 

## Task

You are the architect of this future project. Design the solution to be implemented and create approapriate documentation for the implementation team. 