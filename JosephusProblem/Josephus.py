def findTheWinner(n, k):
    arr = [i for i in range(1,n+1)];
    while(len(arr)!=1):
        for i in range(1,k):
            arr.append(arr.pop(0));
        arr.pop(0)
    return arr[0]

print(findTheWinner(5,2))

def findWinner_2(n,k):
    arr = [i+1 for i in range(n)]
    print(arr)
    i = 0
    while(len(arr)!=1):
        index = (i+k-1)%len(arr)
        print(index)
        arr.pop(index);
        i+=1
    return arr[0]

print(findWinner_2(5,2))
