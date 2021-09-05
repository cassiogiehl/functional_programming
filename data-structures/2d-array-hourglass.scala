
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

def verifyExists(arr: Array[Array[Int]], index: Int): Array[Int] = {
  if(arr.indices.toList.contains(index)) {
    arr(index)
  } else {
    Array(0, 0, 0, 0, 0, 0)
  }
}

// def verifyExists(arr: Array[Int], index: Int): Int = {
//   if(arr.indices.toList.contains(index)) {
//     arr(index)
//   } else {
//     0
//   }
// }

// def sumIfExists(arr: Array[Array[Int]], index: Int) = {
//   var result: Int = 0 
//   if(index == 0 || index == 2) {
//     result = result + verifyExists(verifyExists(arr, index), 0)
//     result = result + verifyExists(verifyExists(arr, index), 1)
//     result = result + verifyExists(verifyExists(arr, index), 2)
//   } else {
//     result = result + verifyExists(verifyExists(arr, index), 1)
//   }

//   result
// }

// def getHourglass(arr: Array[Array[Int]]) = {
//   val result = scala.collection.mutable.ArrayBuffer[Int]()
//   val indices: List[Int] = List(0, 1, 2)

//   indices.map(
//     index => {
//       result += sumIfExists(arr, index)
//     }
//   )
// }

val result = scala.collection.mutable.ArrayBuffer[Array[Int]]()

def recur(arr: Array[Int]) = {
  //
}

def getArr(arr: Array[Array[Int]]) = {
  // arr.foreach(
  //   x => println(x.mkString(" "))
  // )

  val lines = arr.indices.map(
    indice => {
      result += Array(indice)
      var resultSum: Int = 0
      // está percorendo uma vez cada linha, ajustar para percorrer todas as colunas também
      resultSum = resultSum + verifyExists(arr, indice).slice(0, 3).reduce(_+_)
      resultSum = resultSum + verifyExists(arr, indice + 1).slice(1, 2).reduce(_+_)
      resultSum = resultSum + verifyExists(arr, indice + 2).slice(0, 3).reduce(_+_)

      result(indice) = Array(resultSum)
    }
  )

  result.foreach(
    x => println(x.mkString)
  )
}

print(getArr(arr))
