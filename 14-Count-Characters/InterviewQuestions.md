# Count Vowels, Consonants, Digits & Spaces — Interview Questions

## Q1. What is the optimal approach?

Traverse the String once and classify every character.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

## Q2. Why convert characters to lowercase?

Without conversion:

```text
A
```

and:

```text
a
```

would need separate comparisons.

Using:

```java
Character.toLowerCase(ch)
```

allows us to check only:

```text
a e i o u
```

---

## Q3. How do you identify a vowel?

Check whether the character is:

```text
a
e
i
o
u
```

---

## Q4. What is a consonant?

A consonant is a letter that is not a vowel.

Therefore:

```text
Letter
AND
Not Vowel
```

means:

```text
Consonant
```

---

## Q5. Why check whether it is a letter before counting a consonant?

Because characters such as:

```text
1
@
#
```

are not consonants.

---

## Q6. What does Character.isLetter() do?

```java
Character.isLetter(ch)
```

checks whether a character is a letter.

---

## Q7. What does Character.isDigit() do?

```java
Character.isDigit(ch)
```

checks whether a character represents a digit.

---

## Q8. What does Character.isWhitespace() do?

It checks whitespace characters such as spaces, tabs and line breaks.

---

## Q9. Can we solve it without Character methods?

Yes.

For English ASCII input:

```java
ch >= 'a' && ch <= 'z'
```

checks lowercase letters.

And:

```java
ch >= '0' && ch <= '9'
```

checks digits.

---

## Q10. Which version is preferable?

For simple interview questions, either is acceptable.

Using Character methods generally makes the intention clearer and supports more than basic ASCII characters.

---

## Q11. Pattern Used

```text
Character Classification
+
Single Traversal
```

---

## Q12. How to Recognize?

Question contains:

```text
Count vowels
Count consonants
Count digits
Character types
```

Think:

```text
Traverse Once
+
Classify
```

---

## Q13. Common Mistakes

- Counting digits as consonants.
- Forgetting uppercase vowels.
- Treating symbols as consonants.
- Forgetting whitespace handling.

---

## Q14. One-Line Revision

```text
Traverse Character
      ↓
Classify It
      ↓
Increment Counter
```
