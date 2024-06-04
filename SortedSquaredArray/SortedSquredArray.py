testCases = [[-4,-1,0,3,10], [-7,-3,2,3,11], [], [0], [-5,-3,-2,-1], [1,2,3,4,5], [-10,-5,0,5,10], [-3,-1,0,1,3], [-2,-1,0,1,2], [-7,-5,-3,-1,1,3,5,7]];

def sorted_squared(array):
    if(len(array)<1):
        return array
    else:
        for i in range(0,len(array)):
            array[i] = array[i]**2;
        array.sort()
        return array

for i in range(0, len(testCases)):
    print(f"Sorted Array: {sorted_squared(testCases[i])}")
