HashMap internal working principle.

HashMap is a datastructure which stores data in keyt, value pairs. 

Functioning:
1. map.put(2, "two");
2. calculates hashcode for Key 
hashCode() comes from object class that's why only objects are accepted as Keys. Prinitive data type cannot be a key. 
3. 2.hashCode(), now calculate the index 
 index = 2.hashCode() & (map.size()-1)   calculated based on bits. 
4. once the index for example is 12 the key pair stores at index 12 in heap area(all the objects' memory is located in heap area only)
5. if any other elemnet index is also 12 then it will be added to the linkedList
6. Each bucket or index level in map are in linked list, even though multiple ele index is same, then it simply gets added to the linked list
7. Load factor of maop is 0.75 or 75%. Afer 75% of soace is occupied then maps doubles its size. 
8. Initially each map default size is 16.
9. After java 8, in a specific bucket if the nodes i the linked list are more than 8, then list is converted into a RED-BLACK tree for fatser accessing of elements.
10. Before that fetching in same buckett is o(n) complexity, now after treefication its O(log n).