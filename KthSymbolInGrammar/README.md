# Doubts and Explanation
Q: Consider the following Python function intended to find the k-th symbol in an imaginary grammar sequence where each symbol is recursively defined:
```python
def kth_symbol(n, k):
    if n == 1:
        return 0
    length = 2 ** (n-1)
    mid = length // 2
    if k <= mid:
        return kth_symbol(n-1,k)
    else:
        return int(not kth_symbol(n-1,k))
```
An error has been introduced in this modified version of the function. What is the error?

A: The use of `int(not kth_symbol(n-1, k))` in the `else` block is incorrect; it should compute the negation after adjusting the index `k` by subtracting mid. The error in this function is subte but significant. The recursive call in the else block needs to adjust `k` by subtracting mid because the second half of the sequence is a negated version of the first half. The correct code should be: `return int(not kth_symbol(n-1, k-mid))`.

----
Q2: Consider the following Python function intended to find the k-th symbol in an imaginary grammar sequence where each symbol is recursively defined:
```python
def kth_symbol(n, k):
    if n == 1:
        return 0
    length = 2 ** (n-1)
    mid = length // 2
    if k <= mid:
        return kth_symbol(n,k)
    else:
        return int(not kth_symbol(n-1,k-mid))
```
An error has been introduced in this modified version of the function. What is the error?

A: The recursive call kth_symbol(n, k) incorrectly repeats with the same n value, leading to infinite recursion. The key error here is that the recursion does not reduce the problem size in terms of n when k <= mid. Recursing with the same level n and the same position k will cause the function to call itself indefinitely without reaching a base case, leading to a stack overflow error. The correct implementation should decrement n to gradually approach the base case and solve the problem recursively.

----
