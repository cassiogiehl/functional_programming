
val line1: Array[Int] = Array(-9, -9, -9, 1, 1, 1)
val line2: Array[Int] = Array(0, -9, 0, 4, 3, 2)
val line3: Array[Int] = Array(-9, -9, -9, 1, 2, 3)
val line4: Array[Int] = Array(0, 0, 8, 6, 6, 0)
val line5: Array[Int] = Array(0, 0, 0, -2, 0, 0)
val line6: Array[Int] = Array(0, 0, 1, 2, 4, 0)

/*
 * Fazer um algoritmo que soma as posicoes do hourglass:
 * 1 = [0, 1, 2]
 * 2 =    [1]
 * 3 = [0, 1, 2]
 * */

val arr: Array[Array[Int]] = Array(
    line1,
    line2,
    line3,
    line4,
    line5,
    line6
  )

// I don't know if this run!!!
val indices: List[Int] = arr.indices.filter(
                line => {
                  line == 0 ||
                  line == 1 ||
                  line == 2
                }  
              ).toList

def verifyExists(arr: Array[Array[Int]], index: Int): Array[Int] = {
  if(arr.indices.toList.contains(index)) {
    arr(index)
  } else {
    Array(0)
  }
}

def verifyExists(arr: Array[Int], index: Int): Int = {
  if(arr.indices.toList.contains(index)) {
    arr(index)
  } else {
    0
  }
}

def getHourglass(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int) = {

  var result: Int = 0

  indices.map(
    index => {
      if(index == 0) {
        result = result + verifyExists(verifyExists(arr, index), a)
        result = result + verifyExists(verifyExists(arr, index), b)
        result = result + verifyExists(verifyExists(arr, index), c)
      } else if(index == 2) {
        result = result + verifyExists(verifyExists(arr, index), e)
        result = result + verifyExists(verifyExists(arr, index), f)
        result = result + verifyExists(verifyExists(arr, index), g)
      } else {
        result = result + verifyExists(verifyExists(arr, index), d)
      }
    }
  )

  result
}

print(getHourglass(0, 1, 2, 1, 0, 1, 2))
print(getHourglass(1, 2, 3, 2, 1, 2, 3))
print(getHourglass(2, 3, 4, 3, 2, 3, 4))
print(getHourglass(3, 4, 5, 4, 3, 4, 5))


