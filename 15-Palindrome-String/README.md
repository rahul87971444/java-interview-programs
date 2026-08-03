# 🔤 Palindrome String in Java

Check whether a given string reads the same from left to right and right to left.

---

## 📌 Problem Statement

Given a string, determine whether it is a palindrome.

### Input

```text
madam
```

### Output

```text
Palindrome
```

---

## Example 2

Input:

```text
hello
```

Output:

```text
Not Palindrome
```

---

# 🧠 What is a Palindrome?

A palindrome remains the same after reversing.

Examples:

```text
madam
level
radar
racecar
```

Example:

```text
madam
```

Reverse:

```text
madam
```

Therefore:

```text
Palindrome
```

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Reverse + Compare | O(n) | O(n) |
| Two Pointer | O(n) | O(1) |

---

# 💡 Optimal Idea

Instead of reversing the complete String, compare characters from both ends.

```text
m a d a m
↑       ↑
L       R
```

Compare:

```text
m == m
```

Move inward:

```text
m a d a m
  ↑   ↑
  L   R
```

Compare:

```text
a == a
```

Eventually:

```text
L >= R
```

No mismatch found.

Therefore:

```text
Palindrome
```

---

# 🎯 Pattern

```text
Compare From Both Ends
        ↓
Opposite Two Pointer
```

---

# 🌍 Real-Life Analogy

Imagine folding a word from the middle.

If characters on opposite sides always match, the word is symmetric.

That is exactly what Two Pointer checks.

---

# ⭐ Key Takeaways

- Palindrome means same forward and backward.
- Reversing requires extra memory.
- Two Pointer avoids creating another String.
- Compare left and right characters.
- Stop immediately when a mismatch is found.
