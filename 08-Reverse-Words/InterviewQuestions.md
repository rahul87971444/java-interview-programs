# Reverse Words - Interview Questions

---

## Q1. Which method splits a sentence?

```java
split(" ")
```

---

## Q2. Why use StringBuilder?

Because Strings are immutable.

StringBuilder allows fast modifications.

---

## Q3. What is the complexity?

### Using split()

Time

```
O(n)
```

Space

```
O(n)
```

---

### StringBuilder

Time

```
O(n)
```

Space

```
O(n)
```

---

## Q4. Why not use String concatenation?

Every concatenation creates a new String object.

StringBuilder modifies the same object.

---

## Q5. Which class reverses a String easily?

```java
StringBuilder
```

---

## Q6. Similar Questions

- Reverse String
- Reverse Words Order
- Reverse Characters
- Reverse Sentence

---

## Q7. Pattern Used

```
Split

↓

Process

↓

Join
```

---

## Q8. Interview Discussion

Interviewer

"Can you do it without using reverse()?"

Answer

Yes.

Traverse every word from end to beginning.

---

## Q9. Common Mistakes

❌ Forgetting spaces

❌ Using String concatenation repeatedly

❌ Reversing the entire sentence instead of each word

---

## Q10. One-Line Revision

```
Split

↓

Reverse

↓

Join
```
