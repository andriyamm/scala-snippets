/**
 * create immutable map
 */
val scores = Map("v" -> 10, "d" -> 3, "q" -> 8)
val scores = Map(("v", 10), ("d", 3), ("q", 8))

/**
 * create mutable map
 */
 val scores = scala.collection.mutable.Map("v" -> 10, "d" -> 3, "q" -> 8)

 /**
  * create a blank map
  */
  val scores = new scala.collection.mutable.HashMap[String, Int]

/**
 * get value from map by key
 */
val dScore = scores("d") 

/**
 *  To check whether there is a key with the given value, 
 */
val dScore = if (scores.contains("d")) scores("d") else 0
val dScore = scores.getOrElse("d", 0)

/**
 *  Updates the existing value for the key "Bob" (assuming scores is mutable)
 */
scores("d") = 10

/**
 * Adds a new key/value pair to scores (assuming it is mutable)
 */
scores("a") = 7


/**
 * Alternatively, you can use the += operation to add multiple associations:
 */
scores += ("d" -> 10, "A" -> 7)

/**
 * To remove a key and its associated value, use the -= operator:
 */
scores -= "q"


/**
 * New map with update
 */
val newScores = scores + ("d" -> 10, "a" -> 7) // 


/**
 * update a var with map
 */
var scores = ...
scores = scores + ("Bob" -> 10, "Fred" -> 7)


/**
 * Remove a key from an immutable map
 */
scores = scores - "Alice"

