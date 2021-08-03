/*

Update the values of a list with their absolute values. 
The input and output portions will be handled automatically during grading. 
You only need to write a function with the recommended method signature.

*/

def f(arr: List[Int]): List[Int] = {
    arr.map(x => x.abs)
}

print(f(List(1, -2, 3, -3, 4, -6)))