# String Compression — Interview Questions

## Q1. What is String Compression?

String compression represents repeated consecutive characters using their counts.

Example:

```text
aaabbc
```

becomes:

```text
a3b2c1
```

---

## Q2. What is the simple approach?

Traverse the string and count consecutive equal characters.

Using normal String concatenation:

### Time Complexity

```text
O(n²) worst case
```

because repeated String concatenation may copy existing content.

### Space Complexity

```text
O(n)
```

---

## Q3. What is the optimized approach?

Use:

```text
Single Traversal + StringBuilder
```

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(n)
```

for the compressed output.

---

## Q4. Why StringBuilder?

String is immutable.

This:

```java
result = result + ch;
```

may create a new String repeatedly.

StringBuilder modifies a mutable buffer.

---

## Q5. Why initialize count to 1?

Because the current character itself has already appeared once.

---

## Q6. Why can't we simply use HashMap?

Consider:

```text
aabbaa
```

A HashMap gives:

```text
a = 4
b = 2
```

But consecutive compression should be:

```text
a2b2a2
```

Therefore, global frequency is not enough.

We need consecutive frequency.

---

## Q7. What is the pattern?

```text
Consecutive Elements
        ↓
Group Counting
```

---

## Q8. What if there is only one character?

Input:

```text
a
```

Output:

```text
a1
```

---

## Q9. What if all characters are the same?

Input:

```text
aaaaa
```

Output:

```text
a5
```

The algorithm still takes O(n) time.

---

## Q10. Difference between frequency counting and compression?

Frequency counting:

```text
aabbaa
→ a4 b2
```

Compression:

```text
aabbaa
→ a2b2a2
```

Compression cares about consecutive groups.

---

## Q11. Common Mistakes

- Forgetting the final character group.
- Initializing count to 0 instead of 1.
- Using HashMap for consecutive compression.
- Repeated String concatenation.

---

## Q12. How to Recognize This Pattern?

Question contains:

```text
Consecutive
Repeated
Compress
Encode
Run Length
```

Think:

```text
Group Counting
```

---

## Q13. One-Line Revision

```text
Same Character?

YES → count++

NO → append + reset
```
