/**
 * tuple
 */
 val t = (1, 2)
 //t: (Int, Int) = (1,2)
 val t = new Tuple2(1,2)
//t: (Int, Int) = (1,2)


/**
 * creates a tuple
 */
1->2
//res0: (Int, Int) = (1,2)


/**
 * access tuples components with the methods _1, _2, _3,
 */
val second = t._2 // Sets second to 3.14

/**
 * this
 */
val (first, second, third) = t // Sets first to 1, second to 3.14, third to "Fred"


/**
 * Scala matches the unbound variables on the left, x and y, 
 * with the values contained in the tuple. If you need only one value, we can read one value if we want
 */
val (x, _) = (1,2)
//x: Int = 1

/**
 * Iterate through tuples though:
 */
(1,2,3).productIterator foreach {println _ }            
// 1
// 2
// 3