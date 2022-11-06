void insertion_sort(int arr[], int size) {
	for (int i = 1; i < size; i++) {
		int temp = arr[i];
		int j = i - 1;
		for (; j >= 0; j--) {
			if (arr[j] > temp) {
				arr[j + 1] = arr[j];
			}
			else {
				break;
			}
		}
		arr[j + 1] = temp;
	}
}

void print(int arr[],int size) {
	for (int i = 0; i < size; i++) {
		cout << arr[i] << endl;
	}
}

int main() {
	int size = 10;
	int arr[10] = { 5,7,3,1,5,17,9,8,6,20 };
	insertion_sort(arr, 10);
	print(arr, size);
}
