/**
 * To deﬁne a function, you specify the function’s name, parameters, and body
 */
def abs(x: Double) = if (x >= 0) x else -x

/**
 * Recursive function
 */
def fac(n: Int): Int = 
  if (n <= 0) 1 else n * fac(n - 1)

/**
 * default arguments for functions that are used 
 */
def decorate(str: String, left: String = "[", right: String = "]") =
  left + str + right


/**
 * function that can take a variable number of arguments
 */
def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

/**
 * procedure
 */
def box(s : String) { // Look carefully: no =
  val border = "-" * s.length + "--\n"
  println(border + "|" + s + "|\n" + border)
} 

