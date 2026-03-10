UC2: Add Passenger Bogies to Train (ArrayList Operations)

Drawback of the UC1 Approach

In UC1, the train consist is initialized but contain no bogies.
There is no way yet to add, remove, or inspect bogies dynamically.

To simulate a real railway system, the application must support operations such as:

Adding passenger bogies
Removing bogies
Checking whether a bogie exists
This leads us to use ArrayList operations.


Goal

Allow dynamic insertion and removal of passenger bogies using ArrayList.

Actor: User

Flow

User runs program
Passenger bogies are added
Bogies are displayed
A bogie is removed
Existence is checked
Program continues

Key Concepts Used in UC2


ArrayList – A resizable collection that allows insertion and deletion at runtime.
add() Method – Inserts elements into the list.
remove() Method – Deletes elements from the list.
contains() Method – Checks whether a given element exists in the list.
Insertion Order Preservation – ArrayList maintains the order in which elements are added.
CRUD Operations – Create, Read, Update, Delete operations on collections.

Key Requirements


Create an ArrayList<String> for passenger bogies.
Add bogies: Sleeper, AC Chair, First Class.
Print the list after insertion.
Remove one bogie (for example AC Chair).
Use contains() to check if Sleeper exists.
Print final list state.

Key Benefits


Demonstrates real-world list management.
Shows how collections grow dynamically.
Introduces CRUD behavior on data structures.
Helps students visualize how bogies are attached and detached.
