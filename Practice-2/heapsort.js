function heapify(arr, arrLength, index) {
    var largest = index;
    var left = 2 * index + 1;
    var right = 2 * index + 2;

    if (left < arrLength) {
        if (arr[largest] < arr[left]) {
            largest = left;
        }
    }

    if (right < arrLength) {
        if (arr[largest] < arr[right]) {
            largest = right;
        }
    }

    if (largest != index) {
        swap(arr, index, largest);

        heapify(arr, arrLength, largest);
    }
}

function swap(arr, index1, index2) {
    let tmp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = tmp;
}

function sort(arr) {
    for (let i = Math.floor(arr.length / 2) - 1; i >= 0; i--) {
        heapify(arr, arr.length, i);
    }
    // console.log(arr);
    for (let i = arr.length - 1; i >= 0; i--) {
        swap(arr, i, 0);
        heapify(arr, i, 0);
    }
}


function main() {
    const arr = [5, 3, 5, 2, 5, 1, 6, 8, 3, 224];
    sort(arr);
    console.log(arr);
}

main();