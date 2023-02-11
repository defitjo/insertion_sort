package main

import "fmt"

func insertionSort(arr []int) []int {
	for i := 1; i < len(arr); i++ {
		for i > 0 && arr[i-1] > arr[i] {
			arr[i-1], arr[i] = arr[i], arr[i-1]
			i -= 1
		}
	}
	return arr
}

func main() {
	arr := []int{4, 1, 9, 11, 6, 10, 8, 2, 7, 3, 5}
	fmt.Println(insertionSort(arr))
}
