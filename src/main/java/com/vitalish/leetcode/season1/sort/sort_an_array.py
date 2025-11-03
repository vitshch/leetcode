class Solution(object):
    def sortArray(self, nums):
        size = len(nums)
        if (size <= 1):
            return nums

        half_size = size / 2
        left = sortArray(nums[0:half_size])
        right = sortArray(nums[half_size:size])
        return [];
        """
        :type nums: List[int]
        :rtype: List[int]
        """

solution = Solution
sorted_array = solution.sortArray(solution, [5, 2, 3, 1])
print(sorted_array)