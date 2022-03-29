package hackerrank

func fairRations(B []int32) string {
    fmt.Println(B)
    length := int32(len(B))
    sum := int32(0)
    count := int32(0)
    
    for i := int32(0); i < length; i++ {
        sum += B[i];
    }
    
    if sum % 2 != 0 {
        return "NO"
    } 
    
    for i := int32(0); i < length; i++ {
        if B[i] % 2 != 0 {
            count += 2
            B[i]++
            if i != length-1 {
                B[i+1]++
            }
        }
    }
    
    return strconv.Itoa(int(count))
}
