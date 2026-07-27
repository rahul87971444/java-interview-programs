# 🔤 Anagram String in Java

Two strings are anagrams if they contain exactly the same characters with the same frequency but in a different order.

---

# 📌 Problem Statement

Given two strings, determine whether they are anagrams.

---

## Example 1

Input

```
listen

silent
```

Output

```
Anagram
```

---

## Example 2

Input

```
hello

world
```

Output

```
Not Anagram
```

---

# 🎯 Learning Objectives

- Character Frequency
- Arrays.sort()
- HashMap
- String Comparison

---

# 🧠 Observation

The order of characters does not matter.

Only the frequency of each character matters.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Sort Both Strings | O(n log n) | O(n) |
| HashMap | O(n) | O(n) |

---

# 🌍 Real-Life Example

Suppose two students have Scrabble tiles.

Student A

```
listen
```

Student B

```
silent
```

Although arranged differently,

both have exactly the same letters.

Hence,

they are Anagrams.

---

# 💡 Why This Works

If two strings are anagrams,

their sorted forms become identical.

Example

listen

↓

eilnst

silent

↓

eilnst

Equal

↓

Anagram

---

# ⭐ Key Takeaways

✔ Character Frequency

✔ Sorting

✔ HashMap
