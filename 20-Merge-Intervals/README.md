# 🔥 Merge Intervals — LeetCode 56

## 📌 Problem

Given an array of intervals, merge all overlapping intervals.

Each interval is represented as:

```text
[start, end]
```

---

## Example

### Input

```text
[[1,3],[2,6],[8,10],[15,18]]
```

### Output

```text
[[1,6],[8,10],[15,18]]
```

---

# 🧠 Understand the Problem

Look at:

```text
[1,3]
[2,6]
```

These intervals overlap because:

```text
2 <= 3
```

Therefore:

```text
[1,3] + [2,6]
```

becomes:

```text
[1,6]
```

---

## Visual Explanation

```text
Interval 1:

1 -------- 3
     2 ----------- 6
     ↑
   overlap
```

Merged:

```text
1 ---------------- 6
```

---

# 🔥 Main Trick

Before merging, **sort intervals by their starting value**.

Example:

```text
Before sorting:

[8,10]
[1,3]
[15,18]
[2,6]
```

After sorting:

```text
[1,3]
[2,6]
[8,10]
[15,18]
```

Now we can process from left to right.

---

# 🧠 Why Sort?

Suppose:

```text
[1,3]
[2,6]
[8,10]
[15,18]
```

Once intervals are sorted by their starting value, we know that later intervals start at the same point or further to the right.

This makes checking overlap simple.

---

# 🔑 Overlap Condition

Suppose:

```text
current = [1,6]

next = [5,8]
```

Check:

```text
nextStart <= currentEnd
```

Therefore:

```text
5 <= 6
```

TRUE.

So they overlap.

---

# 🔥 Merge Condition

If:

```java
currentStart <= currentEnd
```

is not the correct comparison because we need to compare the **next interval's start** with the current merged end.

Correct:

```java
nextStart <= end
```

---

# 🚀 Correct Logic

```text
Sort intervals
      ↓
Take first interval
      ↓
Check next interval
      ↓
Does nextStart <= currentEnd?
      ↓
   ┌──YES──┐
   ↓       ↓
 Merge    NO
   ↓       ↓
Update    Save current
end       Start new
```

---

# 🔥 How to Merge

Suppose:

```text
Current = [1,6]
Next    = [5,10]
```

Because:

```text
5 <= 6
```

they overlap.

New interval:

```text
start = 1
end = max(6,10)
```

Therefore:

```text
[1,10]
```

---

# ⚠️ Why use Math.max()?

Consider:

```text
[1,10]
[2,5]
```

They overlap.

If we simply use:

```text
end = nextEnd
```

we would get:

```text
[1,5]
```

which is WRONG.

The correct result is:

```text
[1,10]
```

Therefore:

```java
end = Math.max(end, nextEnd);
```

---

# 📌 Complete Example

Input:

```text
[[1,3],[2,6],[8,10],[15,18]]
```

### Step 1

Current:

```text
[1,3]
```

Next:

```text
[2,6]
```

Check:

```text
2 <= 3
```

YES.

Merge:

```text
[1,6]
```

---

### Step 2

Current:

```text
[1,6]
```

Next:

```text
[8,10]
```

Check:

```text
8 <= 6
```

NO.

Save:

```text
[1,6]
```

Start new:

```text
[8,10]
```

---

### Step 3

Current:

```text
[8,10]
```

Next:

```text
[15,18]
```

Check:

```text
15 <= 10
```

NO.

Save:

```text
[8,10]
```

Start:

```text
[15,18]
```

---

### Step 4

The loop finishes.

We still have:

```text
[15,18]
```

So add it.

Final:

```text
[[1,6],[8,10],[15,18]]
```

---

# ⏱️ Complexity

Sorting:

```text
O(n log n)
```

Merging:

```text
O(n)
```

Overall:

```text
O(n log n)
```

---

# 💾 Space Complexity

The result contains up to `n` intervals:

```text
O(n)
```

The exact auxiliary space used by sorting can depend on the sorting implementation.

---

# 🎯 Pattern to Remember

Whenever you see:

```text
Intervals
Overlapping ranges
Meeting times
Time ranges
Merging ranges
```

Think:

```text
SORT
 ↓
COMPARE
 ↓
MERGE
```

---

# ⭐ Important Edge Cases

### Case 1 — Empty array

```text
[]
```

Output:

```text
[]
```

---

### Case 2 — One interval

```text
[[1,5]]
```

Output:

```text
[[1,5]]
```

---

### Case 3 — No overlap

```text
[[1,2],[4,5],[7,9]]
```

Output:

```text
[[1,2],[4,5],[7,9]]
```

---

### Case 4 — Complete overlap

```text
[[1,10],[2,5],[3,7]]
```

Output:

```text
[[1,10]]
```

---

### Case 5 — Touching intervals

```text
[[1,4],[4,5]]
```

Because:

```text
4 <= 4
```

they merge:

```text
[[1,5]]
```

---

### Case 6 — Negative values

```text
[[-10,-5],[-7,2]]
```

They overlap because:

```text
-7 <= -5
```

Result:

```text
[[-10,2]]
```

---

# 🔥 Final Formula

```text
If:

nextStart <= currentEnd

Then:

currentEnd =
max(currentEnd, nextEnd)
```

Otherwise:

```text
save current interval
start a new interval
```
