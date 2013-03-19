/**
 * while loop
 */
var r = 1
var n = 10

while (n > 0) {
  r = r * n
  n -= 1
}

println(r)


/**
 * for loop
 */
r = 1
n = 10

for (i <- 1 to n)
  r = r * i

println(r)


/**
 * use the until method instead of the to method. It returns a range that doesn’t
 * include the upper bound.
 */
val s = "Hello"
var sum = 0
for (i <- 0 until s.length) // Last value for i is s.length - 1
  sum += s(i)

println(sum)


/**
 *  You can directly loop over the characters:
 */
sum = 0
for (ch <- "Hello") sum += ch


/**
 * Scala has no break or continue statements to break out of a loop.What
 * to do if you need a break? 
 * 
 * Here are a few options:
 *  1. Use a Boolean control variable instead.
 *  2. Use nested functions—you can return from the middle of a function.
 *  3. Use the break method in the Breaks object:
 *
 * Use the break method in the Breaks object:
 */
import scala.util.control.Breaks._
breakable {
  for (ch <- "Hello World") {
    if (ch == ' ') break; // Exits the breakable block
    println(ch)
  }
}


/**
 * You can have multiple generators of the form variable <- expression. Separate them
 * by semicolons.
 */
for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
  // Prints 11 12 13 21 22 23 31 32 33


/**
 * Each generator can have a guard, a Boolean condition preceded by if:
 */
for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
  // Prints 12 13 21 23 31 32


/**
 * You can have any number of deﬁnitions, introducing variables that can be used
 * inside the loop:
 */
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")


/**
 * NOTE: If you prefer, you can enclose the generators, guards, and deﬁnitions
 * of a for loop inside braces, and you can use newlines instead of semicolons
 * to separate them:
*/
for { i <- 1 to 3
     from = 4 - i
     j <- from to 3 }
  print((10 * i + j) + " ")


/**
 * When the body of the for loop starts with yield, then the loop constructs a collection
 * of values, one for each iteration:
*/
for (i <- 1 to 10) yield i % 3

/**
 * This type of loop is called a for comprehension.
 * The generated collection is compatible with the ﬁrst generator.
 */
for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
 // Yields "HIeflmlmop"

for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
 // Yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')
