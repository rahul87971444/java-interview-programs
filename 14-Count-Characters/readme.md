# 🔤 Count Vowels, Consonants, Digits & Spaces in Java

Given a String, count the number of:

- Vowels
- Consonants
- Digits
- Spaces

---

## 📌 Problem Statement

Input:

```text
Hello Java 123
```

Output:

```text
Vowels     = 4
Consonants = 5
Digits     = 3
Spaces     = 2
```

---

# 🧠 Main Idea

Traverse every character once and classify it.

For every character ask:

```text
Is it a vowel?
Is it a consonant?
Is it a digit?
Is it a space?
```

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Multiple Traversals | O(n) | O(1) |
| Single Traversal | O(n) | O(1) |

Both are O(n), but a single traversal is cleaner and avoids unnecessary passes.

---

# ⚡ Optimal Logic

For every character:

```text
Character
   ↓
Letter?
 /    \
YES    NO
 ↓      ↓
Vowel? Digit?
 ↓      ↓
V/C    Digit

Otherwise check Space
```

---

# 🔍 Example

Input:

```text
Java 123
```

| Character | Category |
|---|---|
| J | Consonant |
| a | Vowel |
| v | Consonant |
| a | Vowel |
| space | Space |
| 1 | Digit |
| 2 | Digit |
| 3 | Digit |

Result:

```text
Vowels     = 2
Consonants = 2
Digits     = 3
Spaces     = 1
```

---

# 💡 Useful Java Methods

```java
Character.isLetter(ch)
```

Checks whether `ch` is a letter.

```java
Character.isDigit(ch)
```

Checks whether `ch` is a digit.

```java
Character.toLowerCase(ch)
```

Converts uppercase characters to lowercase.

---

# 🎯 Pattern Recognition

If the question asks:

```text
Count character types
Classify characters
Count vowels/digits/spaces
```

think:

```text
Single Traversal
+
Character Classification
```

---

# ⭐ Key Takeaways

- Traverse the String once.
- Use `Character` utility methods.
- Convert letters to lowercase before vowel checking.
- Time Complexity: O(n)
- Space Complexity: O(1)
