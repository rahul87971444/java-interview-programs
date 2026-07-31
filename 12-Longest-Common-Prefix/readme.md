# 🔤 Longest Common Prefix

Find the longest common prefix among all strings.

---

# 📌 Problem Statement

Given an array of strings, return the longest common prefix.

If there is no common prefix, return an empty string.

---

## Example

Input

```
["flower","flow","flight"]
```

Output

```
fl
```

---

# 🎯 Learning Objectives

- String Comparison
- Prefix Matching
- Character Traversal

---

# 🧠 Observation

Compare characters column by column.

The first mismatch ends the common prefix.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Compare Every String | O(n × m) | O(1) |
| Sort + Compare First & Last | O(n log n) | O(1) |

Where

n = number of strings

m = length of shortest string

---

# 🌍 Real-Life Example

Words

```
Interview

Internet

Internal
```

Common beginning

```
Inter
```

---

# ⭐ Key Takeaways

✔ Prefix Matching

✔ Character Comparison

✔ Early Exit
