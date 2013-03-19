//            Fixed-Length Arrays

/**
 *  An array of ten integers, all initialized with zero
 */
val nums = new Array[Int](10)


/**
 *  A string array with ten elements, all initialized with
 */
val a = new Array[String](10)


/**
 * An Array[String] of length 2—the type is inferred
 *
 * Note: No new when you supply initial values
 */
val s = Array("Hello", "World")


/**
 * Use () instead of [] to access elements
 */
s(0) = "Goodbye"
// Array("Goodbye", "World")

/**
 * convert from array to ArrayBuffer
 */
s.toBuffer


//         Variable-Length Arrays: Array Buffers

import scala.collection.mutable.ArrayBuffer

/**
 * An empty array buffer, ready to hold integers
 */
val b = ArrayBuffer[Int]()
val b = new ArrayBuffer[Int]


/**
 * Add an element at the end with +=
 */
b += 1
// ArrayBuffer(1)


/**
 * Add multiple elements at the end by enclosing them in parentheses
 */
b += (1, 2, 3, 5)
// ArrayBuffer(1, 1, 2, 3, 5)


/**
 * You can append any collection with the ++= operator
 */
b ++= Array(8, 13, 21)
// ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)


/**
 * Removes the last five elements
 */
b.trimEnd(5)
// ArrayBuffer(1, 1, 2)

/**
 * Insert before index 2
 */
b.insert(2, 6)
// ArrayBuffer(1, 1, 6, 2)


/**
 * You can insert as many elements as you like
 */
b.insert(2, 7, 8, 9)
// ArrayBuffer(1, 1, 7, 8, 9, 6, 2)


/**
 * Remove element at specified index.
 */
b.remove(2)
// ArrayBuffer(1, 1, 8, 9, 6, 2)


/**
 * Remove element.
 * The first parameter specify index.
 * The second parameter tells how many elements to remove
 */
b.remove(2, 3)
// ArrayBuffer(1, 1, 2)
// 

/**
 * Convert from ArrayBuffer to Array
 */
b.toArray
// Array(1, 1, 2)



/**
 * Traverse an array or array buffer with a for loop:
 *
 * The variable i goes from 0 to a.length - 1.
 * The until method belongs to the RichInt class, and it returns all numbers up to
 * (but not including) the upper bound. For example,
 *    0 until 10
 *    // Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
 */
for (i <- 0 until a.length)
  println(i + ": " + a(i))


/**
 * To visit every second element
 */
for (i <- 0 until (a.length, 2))
  println(i + ": " + a(i))
// Range(0, 2, 4, ...)

/**
 *  To visit the elements starting from the end of the array
 */
for (i <- (0 until a.length).reverse))
  println(i + ": " + a(i))
// Range(..., 2, 1, 0)


/**
 * for each loop 
 */
var a = Array("Aaa", "Bbb", "Ccc")
for (elem <- a)
  println(elem)

/**
 * create new array 
 */
val a = Array(2, 3, 5, 7, 11)
val result = for (elem <- a) yield 2 * elem
// result is Array(4, 6, 10, 14, 22)


/**
 * 
 */
for (elem <- a if a % 2 == 0) yield 2 * elem


//


/**
 * Sum of elements
 */
Array(1, 7, 2, 9).sum
// 19

/**
 * Max and Min elements 
 */
ArrayBuffer("Mary", "had", "a", "little", "lamb").max
// "little"
ArrayBuffer(5, 1, 7, 9, 7).min
// 1

/**
 * sorting array buffer 
 */
val b = ArrayBuffer(1, 7, 2, 9)
val bSorted = b.sorted(_ < _)
// b is unchanged; bSorted is ArrayBuffer(1, 2, 7, 9)


/**
 * Sorting array, not applicable for array buffer 
 */
val a = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(a)
// a is now Array(1, 2, 7, 9)

/**
 * Create string from array
 * Parameter is separator between elements 
 */
a.mkString(" and ")
// "1 and 2 and 7 and 9"

/**
 * Create string from array
 * Parameters are prefix, separator between elements, suffix. 
 */
a.mkString("<", ",", ">")
// "<1,2,7,9>"

/**
 * toString
 */
b.toString
// "ArrayBuffer(1, 7, 2, 9)"


//  
/**
 * Multidimensional Array
 */
val matrix = Array.ofDim[Double](3, 4) // Three rows, four columns


/**
 * Access an element
 */
matrix(row)(column) = 42


/**
 * ragged arrays, with varying row lengths
 */
val triangle = new Array[Array[Int]](10)
for (i <- 0 until triangle.length)
	triangle(i) = new Array[Int](i + 1)
