/*

Count the number of elements in an array without using count, size or length operators (or their equivalents). 
The input and output portions will be handled automatically by the grader. 
You only need to write a function with the recommended method signature.

*/

def f(arr: List[Int]): Int = arr.map(x => 1).sum


print(f(List(1, 2, 3, 10, 12837)))
print('\n')