package main

import "fmt"

func main() {
	var a int = 5
	var b int = 3

	for j := 1; j <= b; j++ {
		for i := 1; i <= a; i++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
