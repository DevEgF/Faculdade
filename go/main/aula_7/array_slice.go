package main

import "fmt"

func main() {
	fmt.Println("Array and Slice Example")

	// Array declaration
	var arr [5]int
	arr[0] = 1
	arr[1] = 2
	arr[2] = 3
	arr[3] = 4
	arr[4] = 5
	fmt.Println("Array:", arr)

	// Slice declaration
	slice := []int{6, 7, 8, 9, 10}
	fmt.Println("Slice:", slice)

	// Appending to a slice
	slice = append(slice, 11)
	slice = append(slice, 12, 13, 14)
	fmt.Println("Updated Slice:", slice)
}
