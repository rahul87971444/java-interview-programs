# 🔤 Remove Duplicate Characters from String

Remove duplicate characters from a string while keeping the first occurrence of each character.

---

## 📌 Problem Statement

Given a string, remove duplicate characters.

### Input

```text
programming
```

### Output

```text
progamin
```

---

## 🧠 Observation

For every character, we need to know:

> Have I already seen this character?

This immediately suggests using a:

```text
HashSet
```

A HashSet stores unique values and provides fast lookup.

---

## 🚀 Approaches

| Approach | Time Complexity | Space Complexity |
|---|---:|---:|
| indexOf / Nested Checking | O(n²) | O(n) |
| HashSet + StringBuilder | O(n) average | O(n) |

---

## ⚡ Optimal Algorithm

1. Create an empty HashSet.
2. Create a StringBuilder.
3. Traverse every character.
4. Try adding the character to the HashSet.
5. If it was not already present, append it.
6. Ignore duplicates.

---

## 🔍 Dry Run

Input:

```text
programming
```

| Character | Seen Before? | Result |
|---|---|---|
| p | No | p |
| r | No | pr |
| o | No | pro |
| g | No | prog |
| r | Yes | prog |
| a | No | proga |
| m | No | progam |
| m | Yes | progam |
| i | No | progami |
| n | No | progamin |
| g | Yes | progamin |

Output:

```text
progamin
```

---

## 💡 Why HashSet?

Suppose we already processed:

```text
p r o g
```

HashSet:

```text
[p, r, o, g]
```

Next character:

```text
r
```

Since `r` already exists, skip it.

---

## 🎯 Pattern

```text
Need uniqueness
      ↓
Need fast existence check
      ↓
HashSet
```

---

## ⭐ Key Takeaways

- HashSet stores unique values.
- StringBuilder is useful for building the answer.
- HashSet lookup is O(1) average.
- The optimized solution takes O(n) average time.
