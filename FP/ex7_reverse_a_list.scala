/*

You are given a list of N elements. Reverse the list without using the reverse function. 
The input and output portions will be handled automatically. 
You need to write a function with the recommended method signature.

*/

def f(arr: List[Int]): List[Int] = arr match {
    case List() => arr
    case x :: xs => f(xs) ::: List(x)
}


print(f(List(1, 2, 3)))
print('\n')