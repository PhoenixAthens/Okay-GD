#include <vector>
using std::vector;
class Solution {
public:
    //119ms
    bool isMonotonic(vector<int>& nums) {
        bool MD = true ,MI = true;
        for(int i = 0 ; i < nums.size()-1 ; i++){
            if(nums[i] < nums[i+1]){
                MD = false;
            }
            if(nums[i] > nums[i+1]){
                MI = false;
            }
        }
        return MI || MD;
    }
    //106ms
    bool isMonotonic_2(vector<int>& nums) {
        bool MD = true ,MI = true;
        for(int i = 0 ; i < nums.size()-1 ; i++){
            if(nums[i] < nums[i+1]){
                MD = false;
                break;
            }
        }
        for(int i = 0 ; i < nums.size()-1 ; i++){
            if(nums[i] > nums[i+1]){
                MI = false;
            }
        }
        return MI || MD;
    }
};
