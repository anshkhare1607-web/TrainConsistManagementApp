UC3: Track Unique Bogie IDs (Set – HashSet)

Drawback of UC2 Approach

In UC2, bogies are stored in a List. However, a List allows duplicate values, which is dangerous in a railway system.

For example, two bogies could accidentally be registered with the same ID:

BG101, BG101

This violates business rules and can cause inconsistent train formation.

To enforce uniqueness, we introduce the Set data structure.

Goal

Ensure no duplicate bogie IDs are added to the train.

Actor: User

Flow

User adds bogie IDs
System inserts into HashSet
Duplicates are ignored
Unique IDs are displayed.
Key Concepts Used in UC3

HashSet – Stores unique elements.
Set Interface – Collection type that does not allow duplicate elements.
HashSet – Implementation of Set that stores elements using hashing for fast access.
add() Method – Inserts values into the set.
Automatic Deduplication – HashSet ensures uniqueness without manual checks.
Unordered Storage – Elements are not stored using index positions.


Key Requirements


Create a HashSet<String> for bogie IDs.
Add duplicate values intentionally.
Print the final set.
Observe that duplicates are removed automatically.

Key Benefits

Enforces business constraints.
Prevents data corruption.
Teaches students when to use Set instead of List.
Introduces uniqueness as a real-world requirement.


