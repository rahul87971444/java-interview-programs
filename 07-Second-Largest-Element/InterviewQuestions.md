# Second Largest Element - Interview Questions

---

## Q1. What is the brute-force solution?

Sort the array.

The second last element becomes the second largest.

### Time Complexity

```
O(n log n)
```

### Space Complexity

Depends on sorting algorithm.

---

## Q2. Why isn't sorting optimal?

Sorting arranges the entire array.

We only need the top two elements.

Most of the work is unnecessary.

---

## Q3. What is the optimal solution?

Maintain

```
Largest

Second Largest
```

during a single traversal.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

## Q4. Why do we write

```java
secondLargest = largest;
largest = num;
```

Suppose

Current

```
Largest = 20

Second Largest = 15
```

New element

```
30
```

Now

Largest becomes

```
30
```

Previous largest

```
20
```

must become

Second Largest.

---

## Q5. Why check

```java
num != largest
```

Example

```
10

20

20

30
```

Without this condition

```
Second Largest

↓

20

↓

20
```

Duplicate values would incorrectly overwrite the second-largest logic.

---

## Q6. Can this work for negative numbers?

Yes.

Because we initialize

```java
largest = Integer.MIN_VALUE;
secondLargest = Integer.MIN_VALUE;
```

---

## Q7. What if all elements are equal?

Example

```
10 10 10
```

There is no second largest distinct element.

Handle this case separately in production code.

---

## Q8. Similar Questions

- Largest Element
- Third Largest
- Second Smallest
- Kth Largest Element

---

## Q9. Pattern Used

```
Running Maximum

↓

Two Variable Tracking
```

---

## Q10. Interview Discussion

**Interviewer:**

Why didn't you sort?

**Answer:**

Sorting requires

```
O(n log n)
```

I only need the top two values.

Therefore a single traversal

```
O(n)
```

is more efficient.

---

## Q11. Common Mistakes

❌ Forgetting duplicate values

❌ Initializing largest with 0

❌ Not updating secondLargest before largest

---

## Q12. One-Line Revision

```
Need Top Two

↓

Track Top Two

↓

One Traversal
```
