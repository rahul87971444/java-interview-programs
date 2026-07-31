# Longest Common Prefix

---

## Q1. Brute Force?

Compare all strings character by character.

### Time Complexity

```
O(n × m)
```

### Space Complexity

```
O(1)
```

---

## Q2. Why does comparing only the first and last string after sorting work?

After sorting,

the strings that differ the most become the first and last.

Any common prefix shared by all strings must also be shared by these two.

Example

Before sorting

```
flower
flow
flight
```

After sorting

```
flight
flow
flower
```

Compare

```
flight

flower
```

Answer

```
fl
```

---

## Q3. Why use

```java
startsWith()
```

Checks whether a string begins with a prefix.

---

## Q4. Pattern Used

```
Prefix Comparison
```

---

## Q5. Edge Cases

```
One String

↓

Return that string.
```

```
No Common Prefix

↓

Return ""
```

---

## Q6. Common Mistakes

❌ Forgetting empty strings.

❌ Comparing every pair unnecessarily.

---

## Q7. How to Recognize?

Question contains

```
Prefix

Beginning

Starts With
```

Think

```
Character Comparison
```
