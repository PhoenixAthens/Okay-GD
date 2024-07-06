//Runtime: 75ms
func subarraySum(_ nums: [Int], _ k: Int) -> Int {
    var result = 0
   var sum = 0
   var map = [0:1]
    for i in nums{
        sum+=i
        let diff = sum-k
        result += map[diff] ?? 0
        map[sum] = (map[sum] ?? 0) + 1
    }
    return result
}
