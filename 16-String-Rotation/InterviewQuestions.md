# String Rotation — Interview Questions

## Q1. What is a String rotation?

A String is a rotation of another String if characters are moved from one end to the other while maintaining their relative order.

Example:

```text
abcd → cdab
```

---

## Q2. What is the most common trick?

Check:

```java
(s1 + s1).contains(s2)
```

after confirming both Strings have equal length.

---

## Q3. Why concatenate the String with itself?

For:

```text
abcd
```

we create:

```text
abcdabcd
```

This contains every possible circular rotation of the original String as a substring.

---

## Q4. Why check lengths first?

If:

```text
s1.length() != s2.length()
```

they cannot be rotations of each other.

Example:

```text
abcd
abc
```

Clearly not rotations.

---

## Q5. Can we generate every rotation manually?

Yes.

For:

```text
abcd
```

generate:

```text
abcd
bcda
cdab
dabc
```

and compare each with the second String.

But this is less efficient and creates many temporary Strings.

---

## Q6. What is the optimized approach?

```java
s1.length() == s2.length()
&&
(s1 + s1).contains(s2)
```

---

## Q7. What is the complexity?

The concatenated String requires O(n) space.

The `contains()` operation is commonly treated as O(n) average/practical for this interview technique, though exact worst-case behavior depends on the search implementation.

The manual-rotation solution is clearly O(n²).

---

## Q8. Is `==` correct for comparing Strings?

No.

Use:

```java
equals()
```

for String content comparison.

---

## Q9. Example

```text
s1 = "hello"
s2 = "lohel"
```

```text
hellohello
```

contains:

```text
lohel
```

Therefore:

```text
Rotation
```

---

## Q10. Counter Example

```text
s1 = "abcd"
s2 = "acbd"
```

```text
abcdabcd
```

does not contain:

```text
acbd
```

Therefore:

```text
Not Rotation
```

---

## Q11. What pattern is used?

```text
String Concatenation
+
Substring Search
```

---

## Q12. How to recognize this problem?

If the interviewer says:

```text
rotation
circular rotation
rotated String
```

think:

```text
s1 + s1
```

---

## Q13. Common Mistakes

- Forgetting the length check.
- Using `==` instead of `equals()`.
- Confusing rotation with anagram.
- Assuming any rearrangement is a rotation.

---

## Q14. Rotation vs Anagram

Anagram:

```text
Order does not matter
```

Example:

```text
abcd
dcba
```

can be anagrams.

Rotation:

```text
Order must remain cyclically consistent
```

Example:

```text
abcd
cdab
```

is a rotation.

---

## Q15. One-Line Revision

```text
Same Length
    +
(s1 + s1).contains(s2)
    ↓
Rotation
```
