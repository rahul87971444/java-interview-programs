# String Rotation - Interview Questions

---

## Q1. What is the brute-force approach?

Generate every possible rotation.

Compare each one with the second string.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(n)
```

---

## Q2. Optimal approach?

Concatenate

```
s1+s1
```

Then check

```java
contains()
```

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q3. Why does

```
s1+s1
```

work?

Example

```
ABCD
```

Concatenate

```
ABCDABCD
```

Possible rotations

```
BCDA

CDAB

DABC
```

All become substrings.

---

## Q4. Why compare lengths first?

Different lengths

↓

Cannot be rotations.

---

## Q5. Pattern Used

```
Concatenate

↓

Search Substring
```

---

## Q6. Edge Cases

```
Empty Strings

↓

Rotation
```

```
Different Lengths

↓

Not Rotation
```

---

## Q7. Common Mistakes

❌ Forgetting length check.

❌ Comparing only sorted strings.

---

## Q8. Interview Discussion

Interviewer:

Why doesn't sorting work?

Answer:

Sorting only checks the characters.

Rotation also requires maintaining the circular order.

---

## Q9. How to Recognize This Pattern?

Question contains

```
Rotation

Circular

Shift

Wrap Around
```

Think

```
s+s

↓

contains()
```

---

## Q10. One-Line Revision

```
Rotation

↓

Double String

↓

contains()
```
