# Two Sum Problem - Python Solution

## Description
This repository contains a Python implementation of the **Two Sum** problem, where the goal is to find two indices in an array such that their corresponding values sum up to a given target.

## Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

**Constraints:**
- Each input has **exactly one solution**, and the same element cannot be used twice.
- You may return the answer in any order.

## Implementation
The solution uses a **hash map (dictionary)** to store visited numbers and their indices. The algorithm runs in **O(n) time complexity**.

## Code
```python
class Solution:
    def twoSum(self, nums, target):
        num_map = {}  # Dictionary to store number and index
        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement], i]  # Return indices of the two numbers
            num_map[num] = i  # Store the index of the current number
        return []  # This case won’t occur as per the problem statement
```

## Example Usage
```python
solution = Solution()
nums = [2, 7, 11, 15]
target = 9
result = solution.twoSum(nums, target)
print(result)  # Output: [0, 1]
```

## Explanation
- Iterate through `nums` while maintaining a dictionary (`num_map`) to track visited numbers and their indices.
- For each element `num`, calculate its **complement** (`target - num`).
- If the **complement exists** in `num_map`, return its stored index along with the current index.
- Otherwise, store `num` in `num_map` and continue.

## Complexity Analysis
- **Time Complexity:** `O(n)`, as we traverse the list once and use constant-time dictionary operations.
- **Space Complexity:** `O(n)`, since we store up to `n` elements in `num_map`.

## License
This project is open-source and available under the MIT License.

