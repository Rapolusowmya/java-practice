Iterator : is an interface from collections. It is used to traverse in the list accessing the lements and removing the elements

#Methods
It has 3 methods
1. boolean hasNext(): checks if it has next ele 
2. Object next(): it returns the next element until hasNext() returns true. Throws NOSUchElement if no ele presnet
3. void remove(): it removes the current element and throws an IllegalStateException if called before next() method 

some list 
Iterator itr = list.iterator();
while(itr.hasNext())
{
    sout(irt.next());
}


ListIterator: is an interface from collection which can traverse in reverse direction.
#methods
1. void add(Object o): it inserts an ele immediately before the element which returned by next();
2. boolean hasNext(): it returns if the list has next ele or not
3. boolean hasPrevious(): it returns if the previous ele is presnet or not. Throws NOSUchElement if no ele presnet 
4. Object next(): returns the next ele until hasNext() returns true. Throws NOSUchElement if no ele presnet
5. void remove: removes the current ele by next(). throiws an IllegalStateException when called before next().

#comparison
Iterator                                            ListIterator
1. traveerses in 1 direction (forward)              1. traverses in both the directions
2. inserting is not allowed                         2. inserting as allowed
3. cannot modify                                    3. can modify the ele using set()
4. can be usd for set, map, list                    4. can be iterated in only lists
5. cannot fetch index of the ele                    5. can fetch index of the ele 