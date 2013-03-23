/**
 * creating a list
 */
val fruit = List("apples", "oranges", "pears")
val nums = List(1, 2, 3, 4)
val diag3 =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
val empty = List()

/**
 * creating a list with explicit types added
 */
val fruit: List[String] = List("apples", "oranges", "pears")
val nums: List[Int] = List(1, 2, 3, 4)
val diag3: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
val empty: List[Nothing] = List()


/**
 * All lists can be defined using two fundamental building blocks, 
 * a tail Nil and :: which is pronounced cons. Nil also represents the empty list.
 */
val nums = 1 :: 2 :: 3 :: 4 :: Nil
val empty = Nil // Empty List.


/**
 * head This method returns the first element of a list.
 * tail  This method returns a list consisting of all elements except the first.
 * isEmpty This method returns true if the list is empty otherwise false.
 */
val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
val nums = Nil

println( "Head of fruit : " + fruit.head )
println( "Tail of fruit : " + fruit.tail )
println( "Check if fruit is empty : " + fruit.isEmpty )
println( "Check if nums is empty : " + nums.isEmpty )

/**
 * As an example of how lists can be processed, consider sorting the elements of a list of numbers 
 * into ascending order. One simple way to do so is insertion sort, which works as follows: To sort 
 * a non-empty list x :: xs, sort the remainder xs and insert the first element x at the right position 
 * in the result. Sorting an empty list yields the empty list. Expressed as Scala code, the insertion 
 * sort algorithm looks like:
 */
 def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))
  
  def insert(x: Int, xs: List[Int]): List[Int] = 
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)


/**
 * Concatenating Lists
 */
val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
val fruit2 = "mangoes" :: ("banana" :: Nil)

var fruit = fruit1 ::: fruit2

/**
 * List.fill() method creates a list consisting of zero or more copies of the same element
 */
  val fruit = List.fill(3)("apples")

  /**
   * You can use a function along with List.tabulate() method to apply on all the elements 
   of the list before tabulating the list. Its arguments are just like those of List.fill: 
   the first argument list gives the dimensions of the list to create, and the second 
   describes the elements of the list. The only difference is that instead of the elements 
   being fixed, they are computed from a function:
   */
    // Creates 5 elements using the given function.
      val squares = List.tabulate(6)(n => n * n)