package main

import (
	"fmt"
)

func task2() func() int {
	x, y := 0, 1
	return func() int {
		x, y = y, x+y
		return y - x
	}
}
func main() {
	f := task2()
	x := 7
	for i := 0; i < x; i++ {
		fmt.Println(f())
	}
}