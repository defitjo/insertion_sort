fn main() {
    let mut arr = [5, 1, 9, 3, 10, 2, 6, 4, 8, 7];
    let result = insertion_sort(&mut arr);
    println!("{:?}", result);
}

fn insertion_sort(arr: &mut [i32]) -> &mut [i32] {
    for mut i in 1..arr.len() {
        while i > 0 && arr[i - 1] > arr[i] {
            let temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            i -= 1;
        }
    }
    arr
}
