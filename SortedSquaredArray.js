let testCases = [
  [-4, -1, 0, 3, 10],
  [-7, -3, 2, 3, 11],
  [],
  [0],
  [-5, -3, -2, -1],
  [1, 2, 3, 4, 5],
  [-10, -5, 0, 5, 10],
  [-3, -1, 0, 1, 3],
  [-2, -1, 0, 1, 2],
  [-7, -5, -3, -1, 1, 3, 5, 7],
];

function sqSort(arr) {
  if (arr.length <= 1) return arr;
  else {
    arr = arr.map((i) => i * i);
    return arr.sort((a, b) => a - b);
  }
}

testCases.forEach((i) => {
  console.log(sqSort(i));
});
