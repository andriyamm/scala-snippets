/**
 * A throw expression has the special type Nothing. That is useful in if/else expressions.
 * If one branch has type Nothing, the type of the if/else expression is the type of the
 * other branch.
 */
if (x >= 0) { sqrt(x) 
} else throw new IllegalArgumentException("x should not be negative")


/** 
 * The syntax for catching exceptions
 * 
 */
try { 
  process(new URL("http://horstmann.com/fred-tiny.gif"))
} catch {
  case _: MalformedURLException => println("Bad URL: " + url)
  case ex: IOException => ex.printStackTrace()
}

/**
 * The  try/finally statement lets you dispose of a resource whether or not an
 * exception has occurred.
 */
var in = new URL("http://url.com/url.gif").openStream()
try {
  process(in)
} finally {
  in.close()
}