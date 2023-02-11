def insertion_sort(arr):
    for i in range(1, len(arr)):
        while i > 0 and arr[i-1] > arr[i]:
            arr[i-1], arr[i] = arr[i], arr[i-1]
            i -= 1
    return arr


arr = [4, 1, 9, 11, 6, 10, 8, 2, 7, 3, 5]
print(insertion_sort(arr))
