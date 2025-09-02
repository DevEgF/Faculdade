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

	// Removing from a slice
	slice = slice[:len(slice)-2]
	fmt.Println("Slice after removal:", slice)

	// Iterating over a slice
	for i, v := range slice {
		fmt.Printf("Index: %d, Value: %d\n", i, v)
	}

	// Slicing a slice
	newSlice := arr[0:5]
	fmt.Println("Sliced Portion:", newSlice)
	newSlice = append(newSlice, 15, 16, 17)
	fmt.Println("Updated Sliced Portion:", newSlice)
}
