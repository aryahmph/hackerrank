function getMoneySpent(keyboards, drives, b) {
  keyboards.sort((a, b) => b - a);
  drives.sort((a, b) => a - b);

  let i = 0,
    j = 0;
  let max = -1;
  const keyLen = keyboards.length;
  const driveLen = drives.length;

  while (i < keyLen) {
    while (j < driveLen) {
      if (keyboards[i] + drives[j] > b) break;
      if (keyboards[i] + drives[j] > max) max = keyboards[i] + drives[j];
      j++;
    }
    i++;
  }
  return max;
}
