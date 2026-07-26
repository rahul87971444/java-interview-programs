# 🔄 Reverse Words in a String

Reverse every word of a sentence while keeping the word order the same.

---

# 📌 Problem Statement

Given a sentence, reverse each word individually.

---

## Example

### Input

```text
Java is Awesome
```

### Output

```text
avaJ si emosewA
```

---

# 🎯 Learning Objectives

- String Traversal
- StringBuilder
- split()
- Reverse Logic

---

# 🧠 Observation

Every word is independent.

Split the sentence into words.

Reverse each word separately.

Join them back.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Using split() | O(n) | O(n) |
| Manual Traversal | O(n) | O(n) |

---

# 📖 Algorithm

1. Split sentence using spaces.
2. Reverse every word.
3. Print all reversed words.

---

# 🌍 Real-Life Example

Input

```
Good Morning
```

Output

```
dooG gninroM
```

---

# 💡 Why This Works

Each word is processed independently.

The sentence order never changes.

Only characters inside each word are reversed.

---

# ⏱ Complexity

Time

```
O(n)
```

Space

```
O(n)
```

---

# ⭐ Key Takeaways

✔ split()

✔ StringBuilder

✔ Reverse Logic
