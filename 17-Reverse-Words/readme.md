# Reverse Words in a String

Reverse the order of words in a sentence without reversing the characters inside each word.

---

##  Problem

Input:

```text
Java is easy
```

Output:

```text
easy is Java
```

Notice:

```text
Java
```

remains:

```text
Java
```

Only the ORDER of words changes.

---

## Example

Input:

```text
I love Java
```

Output:

```text
Java love I
```

---

## ⚠️ Important Difference

We are NOT reversing the complete String.

Complete reversal:

```text
I love Java
```

would produce something like:

```text
avaJ evol I
```

That is NOT what we want.

We want:

```text
Java love I
```

---

# 🧠 Main Idea

Break the sentence into words.

Example:

```text
"I love Java"
```

becomes:

```text
["I", "love", "Java"]
```

Then traverse from right to left:

```text
Java
love
I
```

---

# 🚀 Approaches

| Approach | Time | Extra Space |
|---|---:|---:|
| split() + reverse traversal | O(n) | O(n) |
| Manual traversal | O(n) | O(n) |

---

# 🎯 Example

Input:

```text
"Java is powerful"
```

Words:

```text
Java
is
powerful
```

Reverse word order:

```text
powerful
is
Java
```

Output:

```text
powerful is Java
```

---

# 🧠 Useful Java Methods

### trim()

```java
str.trim()
```

Removes leading and trailing spaces.

### split()

```java
str.split("\\s+")
```

Splits using one or more whitespace characters.

### StringBuilder

Useful for efficiently constructing the final result.

---

# ⭐ Key Takeaways

- Reverse the order of words, not the characters.
- `split("\\s+")` handles multiple spaces.
- Traverse the words from right to left.
- StringBuilder is useful for building the answer.
