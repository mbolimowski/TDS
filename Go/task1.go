package main

import (
	"fmt"
	"strings"
)

func task1(sentence string) int {
	return len(strings.Fields(sentence))
}

func main() {
	var sentence = "legia to *****, a Lech mistrz Polski"
	fmt.Println(task1(sentence))
}