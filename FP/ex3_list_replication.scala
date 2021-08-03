/*Given a list, repeat each element in the list "n" amount of times. The input and output portions will be handled automatically by the grader. You need to write a function with the recommended method signature.

Input Format

The first line contains the integer "S" where "S" is the number of times you need to repeat the elements.
The next  lines each contain an integer. These are the "X" elements in the array.

Output Format

Output each element of the original list "S" times, each on a separate line. You have to return the list/vector/array of "S*X" integers. The relative positions of the values should be the same as the original list provided in the input.

*/

def f(n: Int, arr: List[Int]): List[Int] = {
    arr.flatMap(y => List.fill(n)(y))
}

val x = f(3, List(1, 2, 3, 4))

println(x)