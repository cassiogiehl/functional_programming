/*

The series expansion of e^x is given by:

1 + x + x^2/2! + x^3/3! + x^4/4! + ...

Evaluate e^x for given values of x by using the above expansion for the first 10 terms.

 */



def f(x: Float): Float = {
    (List.range(0, 10).map(e => math.pow(x, e) / (1 to e).product)).sum.toFloat
}

print(f(20.0000F))
print("\n")