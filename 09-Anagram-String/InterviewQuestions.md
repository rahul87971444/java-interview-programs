# Anagram - Interview Questions

---

## Q1. What is an Anagram?

Two strings containing the same characters with the same frequency.

Example

```
listen

silent
```

---

## Q2. Brute Force Approach?

Sort both strings.

Compare them.

### Time Complexity

```
O(n log n)
```

### Space Complexity

```
O(n)
```

---

## Q3. Optimal Approach?

Store character frequencies using HashMap.

Decrease frequencies using the second string.

If the HashMap becomes empty,

the strings are Anagrams.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

## Q4. Why compare lengths first?

Different lengths

↓

Cannot be Anagrams.

This avoids unnecessary processing.

---

## Q5. Why remove characters when frequency becomes zero?

It makes checking easier.

If the map becomes empty,

every character matched perfectly.

---

## Q6. Pattern Used

```
Frequency Count

↓

HashMap
```

---

## Q7. Similar Questions

- Character Frequency

- Group Anagrams

- Valid Anagram

- Isomorphic Strings

---

## Q8. Common Mistakes

❌ Forgetting length check.

❌ Comparing references instead of content.

❌ Ignoring uppercase/lowercase differences.

---

## Q9. Interview Discussion

Interviewer

"Can you solve it without sorting?"

Answer

Yes.

Using HashMap.

Time becomes

```
O(n)
```

instead of

```
O(n log n)
```

---

## Q10. One-Line Revision

```
Same Characters

↓

Same Frequency

↓

Anagram
```
