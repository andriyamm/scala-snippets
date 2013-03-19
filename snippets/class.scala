/**
 * class definition
 */
class Counter {
  
  private var value = 0 // You must initialize the field
  
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}

/**
 * To use this class, you construct objects and invoke methods
 */
val myCounter = new Counter // Or new Counter()
myCounter.increment()
println(myCounter.current)

/**
 * You can call a parameterless method (such as current ) with or without parentheses:
 */
myCounter.current // OK
myCounter.current() // Also OK


/**
 * Define a public field
 * 
 * Scala provides getter and setter methods for every field.
 *
 * Scala generates a class for the JVM with a private age field and getter and setter
 * methods.
 */
class Person {
  var age = 0
}


/**
 * redefine the getter and setter methods yourself
 */
class Person {
  private var privateAge = 0 // Make private and rename

  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue; // Can’t get younger
  }
}

/**
 * read-only property with a getter but no setter
 * need to use a val field
 *
 * Scala makes a private final field and a getter method, but no setter.
 */
class Message {
  val timeStamp = new java.util.Date
}


