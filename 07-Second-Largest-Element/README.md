# 🚀 Second Largest Element in an Array

Find the second largest element in an array.

---

# 📌 Problem Statement

Given an array of integers, return the second largest distinct element.

---

## Example

Input

```text
[10,20,30,40,50]
```

Output

```text
40
```

---

## Example

Input

```text
[10,20,20,30]
```

Output

```text
20
```

The second largest **distinct** element is 20.

---

# 🎯 Learning Objectives

- Running Maximum
- Two Variable Tracking
- Edge Cases
- Duplicate Handling

---

# 🧠 Observation

To find the second largest element, we don't need sorting.

We only need to maintain

```
Largest

Second Largest
```

while traversing the array once.

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Sorting | O(n log n) | Depends |
| One Traversal | O(n) | O(1) |

---

# 🌍 Real-Life Example

Suppose the class topper scores are

```
95

90

88

80
```

Largest

```
95
```

Second Largest

```
90
```

You don't need to arrange every student to know the top two.

---

# 💡 Why One Traversal Works

Whenever a new largest element is found,

The previous largest automatically becomes the second largest.

If the element lies between the largest and second largest,

only the second largest changes.

---

# 🔍 Dry Run

Input

```
10 20 30 15 25
```

| Number | Largest | Second Largest |
|---------|---------|----------------|
|10|10|-∞|
|20|20|10|
|30|30|20|
|15|30|20|
|25|30|25|

Answer

```
25
```

---

# ⏱ Complexity

Sorting

```
Time : O(n log n)
```

One Traversal

```
Time : O(n)

Space : O(1)
```

---

# ⭐ Key Takeaways

✔ Running Maximum

✔ Two Variables

✔ O(n)
