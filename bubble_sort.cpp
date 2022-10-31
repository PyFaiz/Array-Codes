#include <iostream>
using namespace std;


void bubblesort(int arr[], int size) {

	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size - i; j++) {
			if (arr[j] > arr[j + 1])
				swap(arr[j], arr[j + 1]);
		}
	}
}
void print(int arr[], int size) {
	for (int i = 0; i < size; i++) {
		cout << arr[i] << endl;
	}
}


int main() {
	int arr[6] = { 51,23,12,76,24,52 };
	int size = 6;
	bubblesort(arr, size);
	print(arr, size);
	return 0;
}
