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
    i = 0
    while(len(arr)!=1):
        index = (i+k-1)%len(arr)
        arr.pop(index)
        i=index
    return arr[0]

print(findWinner_2(5,2))

def findTheWinner_2_recursive(arr,start, k):
    if len(arr) == 1:
        return arr[0]

    rem = (start+k-1)%len(arr)
    arr.pop(rem);
    return findTheWinner_2_recursive(arr,rem,k)

print(findTheWinner_2_recursive([1,2,3,4,5],0,2))

def findTheWinner_guts(count, jump):
    if count == 1:
        return 0
    else:
        return (findTheWinner_3(count-1,jump)+jump)%count

def findTheWinner_3(count, jump):
    return findTheWinner_guts(count, jump)+1

print(findTheWinner_3(5,3))