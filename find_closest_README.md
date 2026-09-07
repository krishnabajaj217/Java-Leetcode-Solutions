# Find K Closest Elements

## Problem

Given a sorted array `arr`, two integers `k` and `x`, return the `k`
closest integers to `x`.

The answer should be sorted in ascending order.

If two numbers have the same distance from `x`, the smaller number
is preferred.

## Example

Input:
arr = [1,2,3,4,5]
k = 4
x = 3

Output:
[1,2,3,4]

## Approach

### Two Pointer

Since the array is already sorted, the k closest elements will form
a continuous part of the array.

We start with:

left = 0
right = arr.size() - 1

While there are more than k elements between left and right:

1. Compare the distance of arr[left] from x.
2. Compare the distance of arr[right] from x.
3. Remove the element that is farther from x.
4. If distances are equal, remove the right element because the
   smaller value on the left is preferred.

Finally, the elements between left and right are the answer.

## Code

See `Solution.java`.

## Dry Run

arr = [1,2,3,4,5]
k = 4
x = 3

Initial:

left = 0
right = 4

Compare:
1 -> distance 2
5 -> distance 2

Distances are equal, so remove 5.

right = 3

Now:

[1,2,3,4]

There are exactly 4 elements, so stop.

Answer:

[1,2,3,4]

## Complexity

### Time Complexity

The two-pointer loop removes `n-k` elements.

The final loop checks `k` elements.

Therefore:

O(n-k) + O(k) = O(n)

Time Complexity = O(n)

### Auxiliary Space

Only `left`, `right`, and a few variables are used.

Auxiliary Space = O(1)

The returned answer contains `k` elements, so output space is O(k).

## Pattern Learned

Sorted Array + K Closest

→ Two Pointers

→ Compare both ends

→ Remove the farther end

→ Keep exactly k elements