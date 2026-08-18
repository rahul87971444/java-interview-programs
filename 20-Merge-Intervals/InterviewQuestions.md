# 🎯 Merge Intervals — Complete Interview Preparation

## 📌 Problem

Given an array of intervals, merge all overlapping intervals.

Example:

```text
Input:
[[1,3],[2,6],[8,10],[15,18]]

Output:
[[1,6],[8,10],[15,18]]
```

---

# 🔥 BASIC QUESTIONS

## Q1. What is an interval?

An interval represents a range using:

```text
[start, end]
```

Example:

```text
[2,6]
```

means the range starts at `2` and ends at `6`.

---

## Q2. What is the main idea of Merge Intervals?

First sort the intervals by their starting value.

Then process them from left to right.

For every interval:

```text
Overlap → Merge
No overlap → Save current and start new
```

---

## Q3. Why do we sort the intervals first?

Sorting makes the starting values increase from left to right.

For example:

```text
Before:
[8,10]
[1,3]
[15,18]
[2,6]

After:
[1,3]
[2,6]
[8,10]
[15,18]
```

Now we can process intervals sequentially.

---

# 🔥 OVERLAPPING LOGIC

## Q4. How do you know whether two intervals overlap?

Suppose:

```text
Current = [1,6]
Next    = [5,8]
```

The next interval starts at `5`.

The current interval ends at `6`.

Since:

```text
5 <= 6
```

they overlap.

Therefore the condition is:

```java
currentStart <= end
```

---

## Q5. Why do we use `<=` instead of `<`?

Because intervals touching at the endpoint are considered overlapping.

Example:

```text
[1,4]
[4,5]
```

Since:

```text
4 <= 4
```

they merge into:

```text
[1,5]
```

---

## Q6. How do you merge two intervals?

Keep the current starting value and take the larger ending value.

Example:

```text
[1,6]
[5,10]
```

Merged:

```text
[1,10]
```

Code:

```java
end = Math.max(end, currentEnd);
```

---

## Q7. Why do we use Math.max()?

Consider:

```text
[1,10]
[2,5]
```

If we use:

```java
end = currentEnd;
```

we get:

```text
[1,5]
```

which is incorrect.

Instead:

```java
end = Math.max(10,5);
```

gives:

```text
10
```

So the correct result is:

```text
[1,10]
```

---

# 🧠 ALGORITHM QUESTIONS

## Q8. Explain the algorithm step-by-step.

1. Sort intervals by starting value.
2. Store the first interval as the current interval.
3. Traverse the remaining intervals.
4. Check whether the next interval overlaps.
5. If it overlaps, extend the current ending value.
6. If it does not overlap, add the current interval to the result.
7. Start a new current interval.
8. Add the final interval after the loop.

---

## Q9. Why do we only compare with the current merged interval?

Because after sorting, all later intervals start at the same point or further to the right.

If the next interval doesn't overlap the current merged interval, it cannot overlap that completed interval later.

Therefore we can safely save the current interval.

---

## Q10. Why can't we simply compare adjacent intervals?

Because multiple intervals can merge into one large interval.

Example:

```text
[1,5]
[2,6]
[4,10]
```

First:

```text
[1,5] + [2,6]
→ [1,6]
```

Then:

```text
[1,6] + [4,10]
→ [1,10]
```

So we need to maintain the current merged interval.

---

## Q11. Why do we need `start` and `end` variables?

They represent the current merged interval.

```text
start → beginning of merged interval
end   → end of merged interval
```

Example:

```text
start = 1
end = 6
```

represents:

```text
[1,6]
```

---

## Q12. Why do we add the final interval after the loop?

Inside the loop, we normally save an interval when we discover a non-overlapping next interval.

The final interval has no next interval.

Therefore we must explicitly add it after the loop.

```java
result.add(new int[]{start, end});
```

---

# ⏱️ COMPLEXITY QUESTIONS

## Q13. What is the time complexity?

Sorting:

```text
O(n log n)
```

Merging:

```text
O(n)
```

Therefore:

```text
O(n log n)
```

overall.

---

## Q14. What is the space complexity?

The result can contain up to `n` intervals:

```text
O(n)
```

The exact auxiliary memory used by sorting depends on the implementation.

---

## Q15. If intervals are already sorted, what is the complexity?

The sorting step can be skipped.

Then the merge operation takes:

```text
O(n)
```

---

# 🔥 EDGE CASE QUESTIONS

## Q16. What if there is only one interval?

Example:

```text
[[1,5]]
```

There is nothing to merge.

Output:

```text
[[1,5]]
```

---

## Q17. What if the input is empty?

Example:

```text
[]
```

Return:

```text
[]
```

---

## Q18. What if no intervals overlap?

Input:

```text
[[1,2],[4,5],[7,9]]
```

Output:

```text
[[1,2],[4,5],[7,9]]
```

---

## Q19. What if all intervals overlap?

Input:

```text
[[1,10],[2,5],[3,7]]
```

Output:

```text
[[1,10]]
```

---

## Q20. What if one interval completely contains another?

Example:

```text
[1,10]
[3,5]
```

They overlap.

The result remains:

```text
[1,10]
```

This is why `Math.max()` is important.

---

## Q21. What if intervals contain negative numbers?

The same algorithm works.

Example:

```text
[[-10,-5],[-7,2]]
```

Since:

```text
-7 <= -5
```

they overlap.

Result:

```text
[[-10,2]]
```

---

# 💻 CODE QUESTIONS

## Q22. What does this code do?

```java
Arrays.sort(
    intervals,
    (a, b) -> Integer.compare(a[0], b[0])
);
```

It sorts the intervals according to their starting values.

For example:

```text
[8,10]
[1,3]
[2,6]
```

becomes:

```text
[1,3]
[2,6]
[8,10]
```

---

## Q23. What does this mean?

```java
(a, b) -> Integer.compare(a[0], b[0])
```

`a` and `b` represent two intervals.

For example:

```text
a = [1,5]
b = [3,7]
```

We compare:

```text
a[0] → 1
b[0] → 3
```

So the intervals are sorted by their starting values.

---

## Q24. Explain this condition.

```java
if (currentStart <= end)
```

It checks whether the next interval overlaps or touches the current merged interval.

Example:

```text
Current: [1,6]
Next:    [5,8]
```

Because:

```text
5 <= 6
```

they overlap.

---

## Q25. Explain this line.

```java
end = Math.max(end, currentEnd);
```

It extends the current merged interval to whichever interval ends later.

---

## Q26. Explain this block.

```java
else {

    result.add(new int[]{start, end});

    start = currentStart;
    end = currentEnd;
}
```

This means there is no overlap.

So:

1. Save the current interval.
2. Start tracking the new interval.

---

## Q27. Why do we use `List<int[]>`?

Because we don't know beforehand how many merged intervals will remain.

The result can contain anywhere from:

```text
1
```

to:

```text
n
```

intervals.

An `ArrayList` can grow dynamically.

---

## Q28. Why is the final result converted to `int[][]`?

LeetCode 56 expects the return type:

```java
int[][]
```

So:

```java
result.toArray(new int[result.size()][])
```

converts the list into a two-dimensional array.

---

# 🎯 INTERVIEW TRAPS

## Q29. Is LinkedList better for this problem because we are inserting intervals?

No.

The important operation here is not simply insertion.

We need:

```text
Sorting
Traversal
Random access to interval values
```

An ArrayList is generally more appropriate for storing the result.

---

## Q30. Can we solve Merge Intervals using a HashMap?

Not naturally.

The problem is based on ordered ranges and overlapping relationships.

Sorting is the natural approach.

---

## Q31. Can we use a Set?

A Set is not appropriate because we need to preserve interval boundaries and merge ranges.

---

## Q32. Can we solve it without sorting?

For arbitrary unsorted intervals, the standard efficient comparison-based solution uses sorting.

Without sorting, you generally end up doing more comparisons.

---

## Q33. Why is sorting the key step?

Without sorting:

```text
[8,10]
[1,3]
[2,6]
[4,9]
```

we don't know which interval should be processed first.

After sorting:

```text
[1,3]
[2,6]
[4,9]
[8,10]
```

the merging process becomes straightforward.

---

# 🔥 IMPORTANT VARIATION

## Q34. What if intervals are NOT considered overlapping when they only touch?

Then the condition changes.

Standard Merge Intervals uses:

```java
currentStart <= end
```

If touching endpoints should remain separate, the condition would instead be:

```java
currentStart < end
```

The correct condition depends on the problem definition.

---

## Q35. What if the problem asks for the number of merged intervals?

We can use the same algorithm.

Instead of returning the intervals, return:

```java
result.size()
```

---

## Q36. What if the problem asks for total covered length?

The same merging concept can be used.

After merging:

```text
length = end - start
```

for each interval, depending on whether endpoints are inclusive/exclusive according to the problem.

---

# 🧠 PATTERN RECOGNITION

## Q37. When should I recognize the Merge Intervals pattern?

Look for words such as:

```text
Intervals
Ranges
Overlapping
Meeting times
Time periods
Schedules
Merge
Combine ranges
```

Then think:

```text
SORT BY START
```

---

## Q38. What is the general interval pattern?

```text
Sort
 ↓
Initialize current interval
 ↓
For each next interval
 ↓
Overlap?
 /      \
YES      NO
 ↓        ↓
Merge    Save
 ↓        ↓
Continue Start new
```

---

# 🎤 MOST IMPORTANT INTERVIEW QUESTION

## Q39. Explain Merge Intervals in an interview.

### Answer:

> "I first sort all intervals by their starting value. Then I maintain the current merged interval using start and end. For each next interval, I check whether its starting value is less than or equal to the current end. If it is, the intervals overlap, so I update the end using Math.max. If it isn't, I add the current interval to the result and start a new interval. After processing all intervals, I add the final interval. Sorting takes O(n log n) and the merge pass takes O(n), so the overall time complexity is O(n log n)."

---

# 🎯 FOLLOW-UP: WALK THROUGH AN EXAMPLE

## Q40. Walk through:

```text
[[1,3],[2,6],[8,10],[15,18]]
```

### Answer:

First the intervals are already sorted.

Start with:

```text
[1,3]
```

Next:

```text
[2,6]
```

Since:

```text
2 <= 3
```

merge:

```text
[1,6]
```

Next:

```text
[8,10]
```

Since:

```text
8 > 6
```

there is no overlap.

Save:

```text
[1,6]
```

and start:

```text
[8,10]
```

Next:

```text
[15,18]
```

Since:

```text
15 > 10
```

save:

```text
[8,10]
```

and start:

```text
[15,18]
```

Finally add the last interval.

Result:

```text
[[1,6],[8,10],[15,18]]
```

---

# ⭐ 10-SECOND REVISION

```text
MERGE INTERVALS
       ↓
SORT BY START
       ↓
nextStart <= end ?
     /       \
   YES        NO
    ↓          ↓
 MERGE       SAVE
    ↓          ↓
max(end,     START
nextEnd)     NEW
       ↓
ADD FINAL
```

---

# 🏆 MUST MEMORIZE

### Condition:

```java
currentStart <= end
```

### Merge:

```java
end = Math.max(end, currentEnd);
```

### Save:

```java
result.add(new int[]{start, end});
```

### Start new:

```java
start = currentStart;
end = currentEnd;
```

### Complexity:

```text
O(n log n) time
O(n) output space
```

### Core pattern:

```text
SORT → CHECK → MERGE
```
