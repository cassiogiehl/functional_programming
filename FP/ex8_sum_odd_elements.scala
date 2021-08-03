/*

You are given a list. Return the sum of odd elements from the given list. 
The input and output portions will be handled automatically. 
You need to write a function with the recommended method signature.

*/

def f(arr: List[Int]): Int = {
    val odd: List[Int] = arr.filter(x => x%2 != 0)
    val sum_odd = odd.sum
    return sum_odd
}


print(f(List(5, -1, -3, -5)))
print('\n')