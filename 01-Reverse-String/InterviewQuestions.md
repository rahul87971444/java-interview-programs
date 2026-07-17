# Reverse String - Interview Questions

---

## Q1. What is a String?

A String is a sequence of characters used to store text.

Example

```java
String name = "Rahul";
```

---

## Q2. Why is String immutable?

Java keeps Strings immutable because of:

- Security
- String Constant Pool
- Thread Safety
- Better Performance
- Stable HashCode

Memory Trick

```
SSTPH

S → Security

S → String Pool

T → Thread Safety

P → Performance

H → HashCode
```

---

## Q3. Difference between String and StringBuilder?

| String | StringBuilder |
|---------|---------------|
| Immutable | Mutable |
| Slow for modification | Fast |
| New object created | Same object modified |

---

## Q4. Difference between StringBuilder and StringBuffer?

| StringBuilder | StringBuffer |
|---------------|--------------|
| Faster | Slower |
| Not synchronized | Synchronized |
| Not thread-safe | Thread-safe |

---

## Q5. Difference between == and equals()?

== compares object references.

equals() compares actual content.

---

## Q6. Why is StringBuilder faster?

It modifies the same object instead of creating a new object every time.

---

## Q7. Which approach is preferred in interviews?

The Two Pointer approach is usually preferred because it demonstrates algorithmic thinking.

---

## Q8. What is the time complexity?

O(n)

---

## Q9. What is the space complexity?

O(n)

---

## Q10. Can we reverse a String without using another String?

Yes. Convert it to a character array and use the Two Pointer approach.
