def f(arr: List[Int]): List[Int] = {
    val indices = arr.indices.filter(y => y%2 == 1).toList
    indices.map(i => arr(i))
}

val x = f(List(8, 15, 22, 1, 10, 6))

println(x)