# 🔥 Largest Element in an Array (Java)

Find the largest element present in an array.

---

# 📌 Problem Statement

Given an array of integers, find the largest element.

---

## Example

### Input

```text
[10,5,20,8,15]
```

### Output

```text
20
```

---

# 🎯 Learning Objectives

- Array Traversal
- Running Maximum Pattern
- Time Complexity Analysis

---

# 🧠 Observation

To find the largest element, we don't need to sort the entire array.

We only need to remember the largest element seen so far.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Sorting | O(n log n) | Depends on sorting |
| Linear Traversal | O(n) | O(1) |

---

# 📖 Algorithm (Optimal)

1. Assume the first element is the largest.
2. Traverse the remaining array.
3. If the current element is greater than the largest, update it.
4. Print the largest element.

---

# 🔍 Dry Run

Input

```text
10 5 20 8 15
```

Largest

```
10
```

↓

Compare 5

```
Largest = 10
```

↓

Compare 20

```
Largest = 20
```

↓

Compare 8

```
Largest = 20
```

↓

Compare 15

```
Largest = 20
```

Answer

```
20
```

---

# 🌍 Real-Life Example

Imagine selecting the tallest student in a class.

You don't sort the entire class by height.

You simply compare each student's height with the tallest seen so far.

---

# 💡 Why This Approach Works

Every element is checked exactly once.

Whenever a larger element is found, we update our answer.

Thus, after one complete traversal, we are guaranteed to have the largest element.

---

# ⏱ Complexity

Sorting

Time

```
O(n log n)
```

Traversal

Time

```
O(n)
```

Space

```
O(1)
```

---

# 💼 Companies Asking

- TCS Prime
- Infosys
- Amazon
- Microsoft
- Oracle
- Accenture
- Capgemini

---

# ⭐ Key Takeaways

✔ Running Maximum Pattern

✔ Single Traversal

✔ O(n) Solution
