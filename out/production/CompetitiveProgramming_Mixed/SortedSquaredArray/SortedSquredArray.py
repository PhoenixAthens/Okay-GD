testCases = [[-4,-1,0,3,10], [-7,-3,2,3,11], [], [0], [-5,-3,-2,-1], [1,2,3,4,5], [-10,-5,0,5,10], [-3,-1,0,1,3], [-2,-1,0,1,2], [-7,-5,-3,-1,1,3,5,6]];

def sorted_squared(array):
    if(len(array)<1):
        return array
    else:
        for i in range(0,len(array)):
            array[i] = array[i]**2;
        array.sort()
        return array

# for i in range(0, len(testCases)):
#     print(f"Sorted Array: {sorted_squared(testCases[i])}")

print("=" * 100);

# using O(n) space
def sorted_squared_2(array): # [-4,-1,0,3,10] , 4A0, 3A0, 3A1, 2A1, 2,2
    lenOfArr = len(array)
    if(lenOfArr < 1):
        return array
    elif(array[0] < 0):
        resultArr = [0]*lenOfArr
        start = 0
        end = lenOfArr - 1
        changeIndex = end
        while(start <= end):
            startSq = array[start] ** 2;
            endSq = array[end] ** 2;
            if(startSq >= endSq):
                resultArr[changeIndex] = startSq;
                start+=1
            else:
                resultArr[changeIndex] = endSq
                end-=1
            changeIndex-=1
        return resultArr
    else:
        for i in range(0, len(array)):
            array[i] = array[i] ** 2;
        return array

for i in range(0, len(testCases)):
    print(f"Sorted Array: {sorted_squared_2(testCases[i])}")
