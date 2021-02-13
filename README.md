# SortStack
Exercise related with Stacks and Queues.

## Exercise Challenge
Write a program to sort a stack such that the smallest items are on the top.
You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as an array).
The stack supports the following operations: push, pop, peek, and isEmpty.

### Solution
We use a second stack which will contain the elements ordered in reverse order from the origial.
We do that by always inserting the elements in the aux stack in order. So if we find an element which is not in order, we pop the elements from the aux stack to the original stack until we can insert the new element correctly.
Finally, when we have all the elements in reverse order at the aux stack, we puck them back to the main stack so will end up ordered as we want.
This algorith runs in O(N^2) time and O(N) space.