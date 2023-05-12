def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

listy = [6,3,1,5,1,3,4,1,3,4,1,3,5,1,4,4,1,4,4,2]
listy2 = quicksort(listy)
print(listy2)