# 🔄 String Rotation in Java

Check whether one String is a rotation of another String.

---

## 📌 Problem Statement

Given two Strings, determine whether one is a rotation of the other.

### Example

```text
String 1 = "abcd"
String 2 = "cdab"
```

Output:

```text
Rotation
```

Because:

```text
abcd
```

rotated left gives:

```text
cdab
```

---

## ❌ Example

```text
String 1 = "abcd"
String 2 = "acbd"
```

Output:

```text
Not Rotation
```

---

# 🧠 Important Trick

Suppose:

```text
s1 = "abcd"
```

Create:

```text
s1 + s1
```

which becomes:

```text
abcdabcd
```

Now check whether:

```text
s2 = "cdab"
```

exists inside:

```text
abcdabcd
```

It does.

Therefore:

```text
s2 is a rotation of s1
```

---

# ⚡ Main Formula

For two Strings `s1` and `s2`:

```text
Length must be equal
AND
(s1 + s1) must contain s2
```

Therefore:

```java
s1.length() == s2.length()
&&
(s1 + s1).contains(s2)
```

---

# 🔍 Example

```text
s1 = "waterbottle"
```

A rotation can be:

```text
"bottlewater"
```

Because:

```text
waterbottlewaterbottle
```

contains:

```text
bottlewater
```

---

# 🚀 Approaches

| Approach | Time | Space |
|---|---:|---:|
| Try Every Rotation | O(n²) | O(n) |
| Concatenation + contains | O(n) average* | O(n) |

`String.contains()` performance can depend on the Java implementation/JDK and input, so for interview complexity it's safest to state the practical approach as linear/near-linear rather than relying on a strict worst-case bound.

---

# 🎯 Pattern Recognition

If the question says:

```text
Rotation
Circular String
Rotated String
```

think:

```text
s1 + s1
```

---

# ⭐ Key Takeaways

- Both Strings must have the same length.
- A rotation preserves the characters and their order cyclically.
- `s1 + s1` contains every possible rotation of `s1`.
- This is a very common Java interview trick.
