# Find Duplicate Characters — Interview Questions

## Q1. What is the brute-force approach?

Compare every character with the remaining characters.

### Time Complexity

```text
O(n²)
```

### Space Complexity

Depends on how duplicate printing is handled.

---

## Q2. What is the optimized approach?

Use HashMap frequency counting.

Store:

```text
Character → Frequency
```

### Time Complexity

```text
O(n) average
```

### Space Complexity

```text
O(n)
```

---

## Q3. Why HashMap?

Because we need two pieces of information:

```text
Character
+
Count
```

HashMap stores:

```text
Key → Value
```

Therefore:

```text
Character → Frequency
```

is a natural fit.

---

## Q4. Why not HashSet?

HashSet can tell us:

```text
Have I seen this character?
```

But it doesn't directly store:

```text
How many times?
```

Since we need frequencies, HashMap is more suitable.

---

## Q5. Explain getOrDefault().

```java
map.getOrDefault(ch, 0)
```

If the key exists:

```text
Return existing value
```

Otherwise:

```text
Return 0
```

---

## Q6. Explain this line.

```java
map.put(ch, map.getOrDefault(ch, 0) + 1);
```

Meaning:

```text
Get Current Frequency
        ↓
Add 1
        ↓
Store Updated Frequency
```

---

## Q7. What is Map.Entry?

A HashMap stores:

```text
Key → Value
```

`Map.Entry` represents one key-value pair.

Example:

```text
g → 2
```

Here:

```java
entry.getKey()
```

returns:

```text
g
```

and:

```java
entry.getValue()
```

returns:

```text
2
```

---

## Q8. Why check:

```java
entry.getValue() > 1
```

Because a duplicate must appear more than once.

---

## Q9. Does HashMap maintain insertion order?

No.

HashMap does not guarantee insertion order.

If insertion order matters, use:

```java
LinkedHashMap
```

---

## Q10. HashMap vs HashSet?

Use HashSet when you need:

```text
Existence / Uniqueness
```

Use HashMap when you need:

```text
Value + Additional Information
```

such as:

```text
Character → Frequency
```

---

## Q11. Edge Case

Input:

```text
abcdef
```

Every frequency is 1.

Therefore:

```text
No duplicate characters
```

---

## Q12. Edge Case

Input:

```text
aaaa
```

Frequency:

```text
a → 4
```

Output:

```text
a = 4
```

---

## Q13. Are uppercase and lowercase the same?

By default:

```text
A != a
```

If case should be ignored:

```java
str = str.toLowerCase();
```

---

## Q14. What pattern is used?

```text
Frequency Counting
       ↓
     HashMap
```

---

## Q15. How to Recognize This Pattern?

If the interviewer says:

```text
frequency
count
occurrence
duplicate
most frequent
least frequent
```

think:

```text
HashMap
```

---

## Q16. Common Mistakes

- Using HashSet when frequency is required.
- Forgetting `+1` while updating frequency.
- Assuming HashMap maintains insertion order.
- Printing characters whose count is 1.

---

## Q17. One-Line Revision

```text
Need Frequency?

Character → Count

Use HashMap
```
