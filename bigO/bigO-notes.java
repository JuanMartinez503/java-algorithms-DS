//O(n) is proportional to the size of the input, n.
//O(n) is linear time complexity., a simple for loop is O(n) because it scales linearly with the input size.


//drop the constants is a rule of thumb in Big O notation to simplify the expression in which the constants are dropped because they don't matter in the long run.

//O(n^2) is quadratic time complexity. It is a nested loop, where the inner loop runs n times for every iteration of the outer loop.its less efficient than O(n) because it scales quadratically with the input size.

//drop the non-dominant terms is another rule of thumb in Big O notation to simplify the expression in which the non-dominant terms are dropped because they don't matter in the long run.

//O(1) is constant time complexity. It is a simple operation that takes the same amount of time regardless of the input size. It is the most efficient time complexity.

//O(log n) is logarithmic time complexity. It is a binary search algorithm that divides the input in half at each step. It is more efficient than O(n) and O(n^2) because it scales logarithmically with the input size. second most efficient time complexity. data has to be sorted.

//big O in array list- if something is added to the end of the array list, it is O(1) because it is a constant time operation. If something is added to the beginning of the array list, it is O(n) because it requires shifting all the elements to the right. if searching for an element in an array list, it is O(n) because it may have to iterate through all the elements to find the desired element. if we are looking for the element at a specific index, it is O(1) because it can directly access the element at that index.