# Largest Element - Interview Questions

---

## Q1. What is the brute force approach?

Sort the array.

The last element will be the largest.

Example

```
10 5 20 8 15

↓

5 8 10 15 20

↓

Largest = 20
```

### Time Complexity

```
O(n log n)
```

### Space Complexity

Depends upon the sorting algorithm.

---

## Q2. Why is sorting not the best solution?

Sorting arranges every element.

But the problem only asks for one value.

Sorting performs unnecessary work.

---

## Q3. What is the optimal approach?

Traverse the array once.

Keep updating the maximum element.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## Q4. Why do we initialize

```java
int max = arr[0];
```

instead of

```java
int max = 0;
```

Consider

```
-8 -5 -10
```

If

```java
max = 0;
```

Output becomes

```
0
```

which is wrong because 0 is not even present.

Using

```java
max = arr[0];
```

works for both positive and negative numbers.

---

## Q5. Why does the optimal solution work?

At every step,

```
Current Maximum

↓

Compare Current Element

↓

Update if Larger
```

Since every element is visited exactly once, the final maximum is correct.

---

## Q6. Which pattern is used?

```
Running Maximum
```

---

## Q7. Can duplicates affect the answer?

No.

Example

```
10 20 20 5
```

Largest remains

```
20
```

---

## Q8. Can this work for negative numbers?

Yes.

Only if we initialize

```java
max = arr[0];
```

---

## Q9. Similar Interview Questions

- Smallest Element
- Second Largest Element
- Maximum Difference
- Kadane's Algorithm

---

## Q10. Common Mistakes

❌

```java
max = 0;
```

❌

Sorting the array without explaining why it is inefficient.

---

## Q11. Interview Follow-up

Interviewer:

"Can you solve it without sorting?"

Answer:

Yes.

Using one traversal.

Time Complexity becomes

```
O(n)
```

instead of

```
O(n log n)
```

---

## Q12. One-Line Revision

```
Need Maximum

↓

Running Maximum

↓

One Traversal
```
