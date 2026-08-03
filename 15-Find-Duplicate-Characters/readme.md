# 🔤 Find Duplicate Characters in a String

Find all characters that occur more than once in a given String.

---

## 📌 Problem Statement

Given a String, print all duplicate characters along with their frequencies.

### Input

```text
programming
```

### Output

```text
r = 2
g = 2
m = 2
```

---

# 🧠 Observation

For every character, we need to know:

```text
How many times has this character appeared?
```

This is a frequency-counting problem.

The natural pattern is:

```text
Character
   ↓
Frequency
   ↓
HashMap
```

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Nested Loops | O(n²) | O(n) |
| HashMap | O(n) average | O(n) |

---

# ⚡ Optimal Idea

Store:

```text
Character → Frequency
```

Example:

```text
programming
```

Frequency map:

```text
p → 1
r → 2
o → 1
g → 2
a → 1
m → 2
i → 1
n → 1
```

Now print only:

```text
frequency > 1
```

---

# 🔥 Important Java Method

```java
map.getOrDefault(ch, 0)
```

Meaning:

If character exists:

```text
Return its current frequency
```

If character doesn't exist:

```text
Return 0
```

Therefore:

```java
map.put(ch, map.getOrDefault(ch, 0) + 1);
```

means:

```text
Get Old Count
      ↓
Add 1
      ↓
Store New Count
```

---

# 🎯 Pattern Recognition

If the question contains:

```text
Frequency
Occurrence
Count characters
Repeated characters
Duplicate characters
```

Think:

```text
HashMap
```

---

# ⭐ Key Takeaways

- HashMap is excellent for frequency counting.
- Key = Character.
- Value = Frequency.
- `getOrDefault()` simplifies frequency code.
- Optimized average time complexity is O(n).
