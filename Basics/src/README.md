# Day 01 — Arrays

## Topics Covered

* Array traversal
* Maximum and minimum element
* Sum of all, odd, and even elements
* Prefix Sum
* Pivot Element using Prefix Sum
* Difference Array

## Key Concepts

### Prefix Sum

Used to answer repeated range-sum queries efficiently.

* Preprocessing: `O(n)`
* Range Query: `O(1)`
* Space: `O(n)`

### Pivot Element

Used Prefix Sum to find an index where:

```text
left sum = right sum
```

* Time: `O(n)`
* Space: `O(n)` → `O(1)` with optimization

### Difference Array

Used for efficient range updates.

```text
diff[L] += value
diff[R + 1] -= value
```

* Range Update: `O(1)`
* Final Reconstruction: `O(n)`

## Implementation

```text
Day-01/
└── Arrays/
    ├── ArrayBasics.java
    ├── PrefixSum.java
    └── DifferenceArray.java
```

## Takeaway

Learned how **Prefix Sum and Difference Array techniques optimize repeated range operations**, reducing unnecessary traversal.

**Status:** Completed
