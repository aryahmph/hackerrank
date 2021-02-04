function staircase(n) {

    for (let i = n - 1; i >= 0; i--) {

        for (let j = 0; j < n; j++) {
            if (j < i) {
                process.stdout.write(".");
            } else {
                process.stdout.write("#");
            }
        }
        console.log("");

    }

}

staircase(6);
