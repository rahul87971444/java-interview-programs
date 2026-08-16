# final, finally and finalize() — Java Interview Questions

## Q1. What is `final` in Java?

`final` is a Java keyword used to restrict modification.

It can be used with:

```text
Variable
Method
Class
```

A:

```text
final variable → cannot be reassigned
final method   → cannot be overridden
final class    → cannot be inherited
```

---

## Q2. What is a final variable?

A final variable can be assigned only once.

```java
final int age = 22;

// age = 25;  // Compile-time error
```

Once `age` is assigned, it cannot be reassigned.

---

## Q3. Can a final variable be initialized later?

Yes.

This is called a blank final variable.

```java
class Student {

    final int age;

    Student(int age) {
        this.age = age;
    }
}
```

It must be assigned exactly once before it is used.

---

## Q4. Can a final reference point to a different object?

No.

But the object's internal state may still be changed if the object itself is mutable.

Example:

```java
final StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");   // Allowed

// sb = new StringBuilder("Python");  // Not allowed
```

The reference cannot change, but the StringBuilder object can be modified.

### Important:

```text
final reference
      ↓
reference cannot change

It does NOT automatically mean
the object is immutable.
```

---

## Q5. What is a final method?

A final method cannot be overridden by a subclass.

```java
class Parent {

    final void show() {
        System.out.println("Parent");
    }
}
```

A child class cannot provide another implementation of `show()`.

---

## Q6. Can a final method be overloaded?

Yes.

`final` prevents overriding, not overloading.

```java
class Parent {

    final void show() {
        System.out.println("No argument");
    }

    void show(int x) {
        System.out.println(x);
    }
}
```

This is valid.

---

## Q7. What is a final class?

A final class cannot be extended.

```java
final class Vehicle {
}
```

This is invalid:

```java
class Car extends Vehicle {
}
```

---

## Q8. Give an example of a final class from Java.

`String` is a final class.

Therefore:

```java
class MyString extends String {
}
```

is not allowed.

---

## Q9. Can a constructor be final?

No.

Constructors cannot be overridden because they are not inherited.

Therefore `final` cannot be applied to constructors.

---

## Q10. Can an abstract class be final?

No.

An abstract class is intended to be inherited, while a final class cannot be inherited.

Therefore:

```java
abstract final class A {
}
```

is invalid.

---

# 🔥 FINALLY

## Q11. What is `finally`?

`finally` is a block used with exception handling.

It normally executes after the `try`/`catch` processing.

Example:

```java
try {
    int result = 10 / 2;
}
catch (ArithmeticException e) {
    System.out.println("Error");
}
finally {
    System.out.println("Cleanup");
}
```

---

## Q12. Why is `finally` used?

It is commonly used for cleanup operations.

For example:

```text
Close resources
Release resources
Cleanup operations
```

However, for many resources such as files and streams, modern Java generally prefers try-with-resources.

---

## Q13. Can `finally` execute when an exception occurs?

Yes.

```java
try {
    int result = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Exception handled");
}
finally {
    System.out.println("Finally executed");
}
```

Output:

```text
Exception handled
Finally executed
```

---

## Q14. Can `finally` execute when there is no exception?

Yes.

```java
try {
    System.out.println("Success");
}
finally {
    System.out.println("Finally");
}
```

Output:

```text
Success
Finally
```

---

## Q15. Can we have `try` without `catch`?

Yes, if `finally` is present.

```java
try {
    System.out.println("Work");
}
finally {
    System.out.println("Cleanup");
}
```

---

## Q16. Can we have `finally` without `try`?

No.

`finally` must be associated with a `try`.

---

## Q17. Is `finally` guaranteed to execute?

Normally it executes, but don't say it is absolutely guaranteed.

For example:

```java
System.exit(0);
```

terminates the JVM, so normal `finally` execution may not happen.

A good interview answer is:

> "`finally` normally executes when control leaves the try/catch, but it should not be described as absolutely guaranteed because the JVM can terminate before it runs."

---

# ⚠️ FINALIZE()

## Q18. What is `finalize()`?

`finalize()` was an old Java mechanism associated with object finalization before garbage collection.

It was intended for cleanup associated with objects, but it was never appropriate to rely on it for deterministic resource management.

---

## Q19. Is `finalize()` recommended in modern Java?

No.

It is deprecated and deprecated for removal.

It should not be used in new Java programs.

---

## Q20. When was `finalize()` deprecated?

`finalize()` was deprecated in:

```text
Java 9
```

and deprecated for removal in:

```text
Java 18
```

---

## Q21. Is `finalize()` guaranteed to execute?

No.

You should never depend on `finalize()` being called.

Garbage collection itself is not something application code should use as a deterministic cleanup mechanism.

---

## Q22. What should be used instead of `finalize()`?

For resources such as files, sockets, streams, and database resources, prefer deterministic cleanup such as:

```text
try-with-resources
```

with:

```text
AutoCloseable
```

For certain special cleanup use cases, Java also provides:

```text
Cleaner
```

---

# 🔥 IMPORTANT DIFFERENCES

## Q23. Difference between final, finally and finalize()?

| Feature | `final` | `finally` | `finalize()` |
|---|---|---|---|
| Type | Keyword | Block | Method |
| Main purpose | Restrict modification | Exception handling/cleanup | Old object-finalization mechanism |
| Used with | Variable, method, class | try/catch | Object |
| Can prevent inheritance? | Yes, for final class | No | No |
| Related to exceptions? | No | Yes | No |
| Modern usage | Yes | Yes | No |
| Status | Normal Java feature | Normal Java feature | Deprecated |

---

# Q24. What is the easiest way to remember them?

```text
final
↓
STOP / RESTRICT

finally
↓
EXCEPTION CLEANUP

finalize()
↓
OLD GC-RELATED MECHANISM
```

---

# 🎯 INTERVIEW TRAPS

## Q25. Does final make an object immutable?

No.

Example:

```java
final StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");
```

This is allowed.

The reference cannot point to another object, but the StringBuilder object itself is mutable.

---

## Q26. Does final prevent method overloading?

No.

It only prevents overriding.

```text
Overloading  → Allowed
Overriding   → Not allowed
```

---

## Q27. Can a final class have methods?

Yes.

```java
final class Student {

    void study() {
        System.out.println("Studying");
    }
}
```

The class can have normal methods.

It simply cannot be inherited.

---

## Q28. Can a final method be inherited?

Yes.

A final method can be inherited by a subclass.

The subclass simply cannot override that method.

---

## Q29. Is `finalize()` the same as `finally`?

No.

They are completely different.

```text
finally
→ exception-handling block

finalize()
→ old object-finalization mechanism
```

---

## Q30. Can `finalize()` be called manually?

Technically a method can be invoked like another method if accessible, but doing so does NOT provide the JVM's garbage-collection finalization semantics and should not be used as a cleanup strategy.

---

# 🎤 BEST INTERVIEW ANSWER

## Q31. Explain final, finally and finalize().

### Answer:

> "`final` is a Java keyword used to restrict modification. A final variable cannot be reassigned, a final method cannot be overridden, and a final class cannot be inherited. `finally` is a block used with exception handling and normally executes when the try/catch processing completes, so it can be used for cleanup. `finalize()` was an old object-finalization mechanism associated with garbage collection, but it is deprecated and deprecated for removal, so it should not be used in modern Java."

---

# ⭐ FOLLOW-UP QUESTIONS TO EXPECT

If the interviewer asks about `final`, be ready for:

```text
1. Can a final variable be initialized later?
2. Can a final reference point to a mutable object?
3. Can a final method be overloaded?
4. Can a final method be overridden?
5. Can a constructor be final?
6. Can an abstract class be final?
7. Can a final class have constructors?
```

If they ask about `finally`:

```text
1. Can try exist without catch?
2. Can finally exist without catch?
3. Does finally always execute?
4. What happens if System.exit() is called?
5. Why is finally used?
6. Is try-with-resources better for closing resources?
```

If they ask about `finalize()`:

```text
1. What was finalize()?
2. Is it guaranteed to execute?
3. Why was it deprecated?
4. When was it deprecated?
5. What should replace it?
```

---

# 🧠 LAST-MINUTE REVISION

```text
final
├── variable → cannot reassign
├── method   → cannot override
└── class    → cannot extend

finally
└── exception handling / cleanup

finalize()
└── old finalization mechanism
    ↓
deprecated
    ↓
don't use
```

# ⭐ MOST IMPORTANT TRICK

```text
final ≠ finally ≠ finalize()
```

They sound similar, but their purposes are completely different.
```
