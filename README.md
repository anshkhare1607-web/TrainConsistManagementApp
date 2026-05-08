# Train Consist Management App

## Description

The Train Consist Management App is a Java application designed to manage the bogies (carriages) of a train. It allows users to add bogies with their type and capacity, view all bogies in the train consist, and search for specific bogies by their ID.

## Features

- Add bogies to the train consist by specifying the bogie type and capacity
- Display all bogies currently in the train consist
- Search for a bogie by its type ID
- Exception handling for search operations when no bogie is found

## Project Structure

- `src/com/main/Main.java`: Main entry point of the application
- `src/com/controller/MainController.java`: Handles user interface and menu operations
- `src/com/trainconsist/Train.java`: Contains the Train class and Bogie inner class for managing bogies
- `bin/`: Directory containing compiled class files


## Usage

The application provides a menu-driven interface with the following options:
1. Add bogies
2. View bogies
3. Search bogie by ID
4. Exit