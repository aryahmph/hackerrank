package hackerrank

import (
	"fmt"
	"testing"
)

func workbook(n int32, k int32, arr []int32) int32 {
	unique := int32(0)
	pageNumber := int32(1)
	problemNumber := int32(1)

	for i := int32(0); i < n; {
		if problemNumber <= pageNumber && pageNumber <= min(problemNumber+k-1, arr[i]) {
			unique++
		}
		pageNumber++
		problemNumber += k
		if problemNumber > arr[i] {
			i++
			problemNumber = 1
		}
	}
	return unique
}

func min(a, b int32) int32 {
	if a < b {
		return a
	}
	return b
}

func TestPage(t *testing.T) {
	page := workbook(25, 10, []int32{1, 29, 94, 15, 87, 100, 20, 55, 100, 45, 82, 80, 100, 100, 3, 53, 100, 2, 100, 100, 100, 100, 100, 100, 1})
	fmt.Println(page)
}
