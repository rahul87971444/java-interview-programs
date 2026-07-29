# 🔤 First Non-Repeating Character in Java

Find the first character that appears exactly once in a string.

---

# 📌 Problem Statement

Given a string, return the first non-repeating character.

If none exists, print "No Unique Character".

---

## Example

Input

```
aabbcdde
```

Output

```
c
```

---

# 🎯 Learning Objectives

- Character Frequency
- HashMap
- LinkedHashMap
- String Traversal

---

# 🧠 Observation

To know whether a character is unique,

we first need its frequency.

Then traverse the string again.

The first character having frequency 1 is the answer.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Nested Loop | O(n²) | O(1) |
| HashMap | O(n) | O(n) |

---

# 💡 Why HashMap?

HashMap stores

Character → Frequency

allowing fast lookup.

---

# 🌍 Real-Life Example

Attendance

```
A A B C C
```

Only

```
B
```

appears once.

Hence,

answer is

```
B
```

---

# ⭐ Key Takeaways

✔ Frequency Count

✔ HashMap

✔ Two Traversals
