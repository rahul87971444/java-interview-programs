# == vs equals() — Java Interview Questions

## Q1. What is the difference between == and equals()?

For primitive types:

```java
==
```

compares values.

For objects:

```java
==
```

compares references.

`equals()` is used for logical/content equality when the class implements it that way.

For String, `equals()` compares the character contents.

---

## Q2. What is the output?

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);
System.out.println(a.equals(b));
```

Output:

```text
false
true
```

Because two different String objects were created, but their contents are equal.

---

## Q3. What is the output?

```java
String a = "Java";
String b = "Java";

System.out.println(a == b);
```

Output:

```text
true
```

String literals are stored in the String Pool, so these references can point to the same pooled object.

---

## Q4. Is == always wrong for Strings?

It is not syntactically wrong, but it is usually wrong when the intention is to compare String contents.

Use:

```java
a.equals(b)
```

for content comparison.

---

## Q5. Why does this return false?

```java
String a = new String("Java");
String b = new String("Java");

a == b
```

Because `new String()` creates separate objects.

---

## Q6. Why does equals() return true?

Because String overrides equals() to compare the characters contained in the Strings.

Both contain:

```text
Java
```

---

## Q7. What happens if we don't override equals() in our own class?

The inherited Object.equals() implementation behaves like reference identity unless the class overrides it.

Therefore two separate objects with identical field values will not automatically be considered equal.

---

## Q8. Why should equals() be overridden when creating value-like classes?

Suppose:

```java
Student s1 = new Student("Rahul");
Student s2 = new Student("Rahul");
```

If we want these students to be logically equal based on their name, we need to define that equality in equals().

---

## Q9. What is the relationship between equals() and hashCode()?

If:

```java
a.equals(b)
```

is true, then:

```java
a.hashCode() == b.hashCode()
```

must also be true.

The reverse is NOT guaranteed.

Two objects can have the same hash code without being equal.

---

## Q10. Why is this important for HashMap and HashSet?

Hash-based collections use hashCode() to locate objects and equals() to distinguish objects that land in the same hash bucket.

Incorrect equals/hashCode implementations can cause unexpected collection behavior.

---

## Q11. Can equals() return true while == returns false?

Yes.

Example:

```java
String a = new String("Java");
String b = new String("Java");
```

```text
a == b        → false
a.equals(b)   → true
```

---

## Q12. Can == return true while equals() returns false?

It can be possible for a poorly designed or unusual class that violates normal equality expectations, but for a normal object comparing itself to itself, a correct equals() implementation should return true.

For String specifically:

```java
String s = "Java";

s == s
```

and:

```java
s.equals(s)
```

are both true.

---

## Q13. What is String Pool?

String Pool is a special area managed by the JVM for String literals so that identical literals can share the same String object.

Example:

```java
String a = "Java";
String b = "Java";
```

Both can refer to the same pooled object.

---

## Q14. What does new String("Java") do differently?

It explicitly creates a new String object.

```java
String a = new String("Java");
```

Even if `"Java"` already exists in the String Pool, `a` refers to the newly created String object.

---

## Q15. What is the safest way to compare a String with a constant?

Instead of:

```java
name.equals("Rahul")
```

you can write:

```java
"Rahul".equals(name)
```

This avoids a NullPointerException if `name` is null.

---

## Q16. What is the difference between identity and equality?

Identity asks:

```text
Are these the same object?
```

Equality asks:

```text
Should these objects be considered logically equal?
```

In Java:

```text
==       → identity for objects
equals() → logical equality
```

---

## Q17. Interview Answer

"== compares primitive values, but for objects it compares references. equals() is used for logical equality, and classes such as String override equals() to compare content. Therefore, when comparing String contents, I use equals() rather than ==."

---

## Q18. One-Line Memory Trick

```text
==       → Same object?
equals() → Same meaning/content?
```
