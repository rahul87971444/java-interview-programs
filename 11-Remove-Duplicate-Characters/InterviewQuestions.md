# Remove Duplicate Characters — Interview Questions

## Q1. What is the simple approach?

For every character, check whether it already exists in the result.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(n)
```

---

## Q2. What is the optimized approach?

Use:

```text
HashSet + StringBuilder
```

HashSet checks whether a character has already appeared.

### Time Complexity

```text
O(n) average
```

### Space Complexity

```text
O(n)
```

---

## Q3. Why HashSet?

Because HashSet:

- stores unique values
- prevents duplicates
- provides O(1) average lookup/insertion

---

## Q4. What does HashSet.add() return?

It returns a boolean.

New element:

```java
set.add('a');
```

returns:

```text
true
```

Duplicate element:

```java
set.add('a');
```

returns:

```text
false
```

Therefore:

```java
if (set.add(ch))
```

means:

> Execute only when the character is new.

---

## Q5. Why use StringBuilder?

String is immutable.

Repeated:

```java
result = result + ch;
```

creates new String objects.

StringBuilder modifies the same mutable buffer.

---

## Q6. Does HashSet maintain insertion order?

No.

But in this solution we are NOT printing the HashSet.

We traverse the original String and append characters to StringBuilder.

Therefore the original first-occurrence order is preserved.

---

## Q7. What if the interviewer asks to maintain insertion order inside the Set?

Use:

```java
LinkedHashSet
```

It maintains insertion order.

---

## Q8. Difference between HashSet and LinkedHashSet?

HashSet:

```text
No guaranteed insertion order
```

LinkedHashSet:

```text
Maintains insertion order
```

---

## Q9. Pattern Used

```text
Duplicate / Unique
        ↓
     HashSet
```

---

## Q10. How to recognize this pattern?

If the question says:

```text
duplicate
unique
already seen
distinct
remove repeated
```

think:

```text
HashSet
```

---

## Q11. Common Mistake

Do not assume HashSet itself maintains insertion order.

It doesn't.

---

## Q12. One-Line Revision

```text
Need Unique Characters
        ↓
     HashSet
        +
  StringBuilder
```
