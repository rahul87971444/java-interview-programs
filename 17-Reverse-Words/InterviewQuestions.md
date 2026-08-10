# Reverse Words in a String — Interview Questions

## Q1. What is the difference between reversing a String and reversing words?

For:

```text
Java is easy
```

Character reversal changes the characters:

```text
ysae si avaJ
```

Word reversal changes only the order:

```text
easy is Java
```

---

## Q2. Why use:

```java
split("\\s+")
```

instead of:

```java
split(" ")
```

Because `\\s+` handles one or more whitespace characters.

It can handle:

```text
spaces
tabs
multiple spaces
```

more reliably.

---

## Q3. What does `\\s+` mean?

Conceptually:

```text
\\s
```

means whitespace.

```text
+
```

means one or more occurrences.

Therefore:

```text
\\s+
```

means:

```text
one or more whitespace characters
```

---

## Q4. Why do we use `trim()`?

Suppose:

```text
"   Java is easy   "
```

Without trimming, leading and trailing spaces can affect the split/result.

```java
str.trim()
```

removes whitespace from both ends.

---

## Q5. Why use StringBuilder?

Because we are repeatedly adding words to the result.

StringBuilder provides a mutable character sequence instead of repeatedly creating new String objects.

---

## Q6. What happens if the input is:

```text
"Java"
```

Output:

```text
Java
```

There is only one word, so reversing the word order changes nothing.

---

## Q7. What happens if the input is:

```text
"Java   is   easy"
```

Using:

```java
split("\\s+")
```

gives:

```text
Java
is
easy
```

Therefore output:

```text
easy is Java
```

---

## Q8. Can this be solved without split()?

Yes.

Scan from right to left.

Whenever a word boundary is found, append that word to the result.

This avoids creating the array returned by split().

---

## Q9. What does this do?

```java
result.append(words[i]);
```

It adds the current word to the StringBuilder.

---

## Q10. Why is the loop going backwards?

The requirement is:

```text
Reverse word order
```

Therefore we process:

```text
last word
→
second-last word
→
...
→
first word
```

---

## Q11. What is the difference between StringBuilder and String?

String:

```text
Immutable
```

StringBuilder:

```text
Mutable
```

If we repeatedly modify text, StringBuilder is generally preferable.

---

## Q12. What happens when StringBuilder is converted to String?

Using:

```java
result.toString()
```

returns a String containing the current contents.

---

## Q13. Interviewer: Can StringBuilder be used safely by multiple threads?

StringBuilder is not synchronized.

For thread-safe mutable string operations, Java provides:

```text
StringBuffer
```

StringBuffer's methods are synchronized.

---

## Q14. Interviewer: Which would you normally prefer, StringBuilder or StringBuffer?

For ordinary single-threaded code:

```text
StringBuilder
```

because synchronization is unnecessary.

StringBuffer is useful when synchronized access is specifically required.

---

## Q15. Interviewer: Is StringBuilder immutable?

No.

It is mutable.

For example:

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");
```

The same StringBuilder object is modified.

---

## Q16. Interviewer: What happens to the original String when we call trim()?

Strings are immutable.

`trim()` returns a new String if changes are needed; it does not modify the original String object.

---

## Q17. Interviewer: What is the difference between trim() and strip()?

`trim()` removes characters based on the older ASCII-oriented definition of whitespace.

`strip()` uses Unicode-aware whitespace rules.

Example:

```java
str.strip()
```

is the modern Java option when Unicode whitespace handling matters.

---

## Q18. Interviewer: What Java version introduced strip()?

`strip()` was introduced in:

```text
Java 11
```

---

## Q19. What is a common mistake in this problem?

Confusing:

```text
reverse words
```

with:

```text
reverse characters
```

---

## Q20. One-Line Revision

```text
Split into words
      ↓
Start from last word
      ↓
Append backwards
      ↓
Reversed word order
```
