function gradingStudents(grades) {
    return grades.map(el => {
        return (5 - (el % 5) < 3 && el >= 38) ? el - (el % 5) + 5 : el;
    });
}