# 🔤 String Compression in Java

Compress consecutive repeating characters by storing the character followed by its count.

---

## 📌 Problem Statement

Given a string, compress consecutive repeated characters.

### Input

```text
aaabbccccd
```

### Output

```text
a3b2c4d1
```

---

## 🧠 Observation

We do NOT need the total frequency of every character.

We need the frequency of consecutive characters.

Example:

```text
aaabbccccd

aaa → a3

bb → b2

cccc → c4

d → d1
```

---

## 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Nested Counting | O(n²) worst case | O(n) |
| Single Traversal | O(n) | O(n) |

---

## ⚡ Optimal Idea

Maintain:

```text
Current Character

+

Count
```

Keep increasing count while the next character is the same.

When the character changes:

```text
Append Character

Append Count

Reset Count
```

---

## 🔍 Dry Run

Input:

```text
aaabbc
```

| Current | Next | Count | Result |
|---|---|---:|---|
| a | a | 2 | |
| a | a | 3 | |
| a | b | 3 | a3 |
| b | b | 2 | a3 |
| b | c | 2 | a3b2 |
| c | End | 1 | a3b2c1 |

Output:

```text
a3b2c1
```

---

## 🌍 Real-Life Example

Suppose warehouse boxes are arranged:

```text
AAAABBBCC
```

Instead of writing every box:

```text
AAAABBBCC
```

we store:

```text
A4 B3 C2
```

This is the basic idea behind compression.

---

## 🎯 Pattern

```text
Consecutive Elements
        ↓
Compare Neighbours
        ↓
Count Until Change
```

---

## ⭐ Key Takeaways

- Consecutive frequency is different from total frequency.
- StringBuilder avoids repeated immutable String creation.
- One traversal is sufficient.
- Time complexity can be reduced to O(n).
