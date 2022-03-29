package hackerrank

import (
	"fmt"
	"testing"
)

func chocolateFeast(n int32, c int32, m int32) int32 {
	var exchanged int32
	eaten := int32(n / c)
	wrapper := eaten

	for {
		exchanged = wrapper / m
		wrapper = wrapper%m + exchanged
		eaten += exchanged

		if wrapper < m {
			break
		}
	}

	return eaten
}

func TestChocolateFeast1(t *testing.T) {
	fmt.Println(chocolateFeast(15, 3, 2))
}
