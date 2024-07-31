#include <iostream>
#include <format>
#include <cmath>

using std::sqrt;
class SumOfSq{
  public:
  bool judgeSquareSum(int c){
      int sq = (int)sqrt(c);
      if(sq*sq==c)return true;
      for(int i = 0; i<=sq; i++){
          double rem = sqrt(c-i*i);
          if(rem == (int)rem)return true;
      }
      return false;
  }
};
