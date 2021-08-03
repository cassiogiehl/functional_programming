
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

def verifyExists(arr: Array[Array[Int]], index: Int, index2: Int = null): Int = {
  if(arr.indices.toList.contains(index)) {
    arr(index)(index2)
  } else {
    Array(0)
  }
}

def getResult() = {

  var result: Int = 0

  indices.map(
    index => {
      if(index == 0 || index == 2) {
        result = result + verifyExists(arr, index, 0)
        result = result + verifyExists(arr, index, 1)
        result = result + verifyExists(arr, index, 2)
      } else {
        result = result + verifyExists(arr, index, 1)
      }
    }
  )

  result
}

print(getResult())
