# 🔄 String Rotation in Java

Determine whether one string is a rotation of another.

---

# 📌 Problem Statement

Given two strings `s1` and `s2`, determine whether `s2` is a rotation of `s1`.

---

## Example

Input

```
s1 = "ABCD"

s2 = "CDAB"
```

Output

```
Rotation
```

---

## Example

Input

```
s1 = "ABCD"

s2 = "ACBD"
```

Output

```
Not Rotation
```

---

# 🎯 Learning Objectives

- String Concatenation
- contains()
- String Rotation Logic

---

# 🧠 Observation

If

```
ABCD
```

is rotated,

possible strings are

```
BCDA

CDAB

DABC
```

Notice

```
ABCDABCD
```

contains

```
CDAB
```

---

# 💡 Key Idea

If

```
s2
```

is a rotation of

```
s1
```

then

```
s2
```

must appear inside

```
s1 + s1
```

---

# 🚀 Approaches

| Approach | Time | Space |
|----------|------|-------|
| Manual Rotation | O(n²) | O(n) |
| Concatenation + contains() | O(n) | O(n) |

---

# 🌍 Real-Life Example

Think of a clock.

```
12 1 2 3
```

Rotate it

↓

```
2 3 12 1
```

The order changes,

but the circular sequence remains the same.

---

# ⭐ Key Takeaways

✔ String Rotation

✔ contains()

✔ Concatenation Trick
