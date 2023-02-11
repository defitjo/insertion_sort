const insertionSort = (arr: number[]): number[] => {
  for (let i = 1; i < arr.length; i++) {
    while (i > 0 && arr[i - 1] > arr[i]) {
      let temp = arr[i - 1];
      arr[i - 1] = arr[i];
      arr[i] = temp;
      i -= 1;
    }
  }
  return arr;
};

let arr = [4, 1, 9, 11, 6, 10, 8, 2, 7, 3, 5];
console.log(insertionSort(arr));
