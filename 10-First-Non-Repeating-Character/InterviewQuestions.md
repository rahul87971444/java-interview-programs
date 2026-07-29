# First Non-Repeating Character

---

## Q1. Brute Force?

Nested loops.

Count frequency for every character.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

## Q2. Better Approach?

HashMap Frequency.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q3. Why do we traverse twice?

First traversal

↓

Store frequencies.

Second traversal

↓

Maintain original order while finding the first unique character.

---

## Q4. Why not use only HashSet?

HashSet stores only unique values.

It does not store frequencies.

---

## Q5. Pattern Used

```
Frequency Count

↓

HashMap
```

---

## Edge Cases

```
aaaa

↓

No Unique Character
```

```
a

↓

a
```

```
abcd

↓

a
```

---

## Common Mistakes

❌ Printing the smallest frequency instead of the first unique character.

❌ Forgetting the second traversal.

---

## Interview Discussion

Interviewer:

Why not sort?

Answer:

Sorting changes the original order.

We need the FIRST non-repeating character.

So we preserve order using the original string.
