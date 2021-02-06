function kangaroo(x1, v1, x2, v2) {
    /* Formula
    Distance = velocity * time
    Time representation with jump, then
    distance = v * j

    x1 + v1*j = x2 + v2*j

    make x2 - x1 because x2 always greater than x1 in constraint.
    v1*j - v2*j = x2 - x1
    j (v1-v2) = x2 - x1
    j = (x2 - x1) / (v1-v2)

    Because j is possible to floating number, we need the remainder
    because j in floating point is in the air not in land, and we need
    same positon at land not air.

    If the remainder of jump is 0, they will meet in land

    */

    if (v1 > v2)
        if ((x2 - x1) % (v1 - v2) == 0) return "YES"

    return "NO";
}