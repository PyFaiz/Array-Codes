#include <iostream>
using namespace std;

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

void print(int arr[], int size) {
	for (int i = 0; i < size; i++) {
		cout << arr[i] << endl;
	}
}


void ziggyzaggy(int arr[], int size) {
	for (int i = 1; i < size; i += 2) {
		//swap(arr[i], arr[i + 1]);
		
		int temp = arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;

	}
}

int main() {

	int arr[5] = { 3,4,5,1,4 };
	int size = sizeof(arr) / sizeof(int);
	//cout << size;
	//print(arr, 5);
	insertion_sort(arr, size);
	ziggyzaggy(arr, size);
	print(arr, size);
	return 0;
}
