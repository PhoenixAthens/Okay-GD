class Solution:
    def kthGrammar(self, n: int, k: int) -> int:
        if n == 1:
            return 0
        if k <= 2**(n-1)/2:
            r = self.kthGrammar(n-1,k)
            return r
        else:
            r = not self.kthGrammar(n-1,k-(2**(n-1))/2)
            return 1 if r==True else 0

print(Solution().kthGrammar(4,8))
