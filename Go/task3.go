package main
import (
    "encoding/csv"
    "fmt"
    "os"
	"io"
	"strconv"
	"log"
	"strings"
)
func main() {
	all := 0
	good := 0
    file, e := os.Open("quiz.csv")
	if e != nil {
        log.Fatal(e)
    }
    defer file.Close()
    csvReader := csv.NewReader(file)
	for {
        help, e := csvReader.Read()
        if e == io.EOF {
            break
        }
		tmp1 := strings.Fields(help[0])
		res, e := strconv.Atoi(strings.Fields(help[1])[0])
		tmp2:= strings.Split(tmp1 [0], "+")
		x, e := strconv.Atoi(tmp2[0])
		y, e := strconv.Atoi(tmp2[1])
		if(x + y == res){
			good = good + 1
		}	
		all= all+ 1
    }   
	fmt.Println("All: ", allAnswers)
	fmt.Println("Good: ", correctAnswers)
}