/*
    Create an array of N integers, where the value of N is passed as an 
    argument to the pre-filled function in your editor. This challenge 
    uses a custom checker, so you can create any array of  integers. For 
    example, if "n=4", you could return [1, 1, 1, 1], [1, 2, 3, 4], or 
    any other array of equal length.
*/

def f(num: Int) : List[Int] = List.fill(num)(1)

print(f(10))