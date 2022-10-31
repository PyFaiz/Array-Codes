#include <iostream>
using namespace std;

void selection_sort(int arr[], int size) {
	for (int i = 0; i < size - 1; i++) {
		int minIndex = i;
		for (int j = i + 1; j < size; j++) {
			if (arr[minIndex] > arr[j]) {
				minIndex = j;
			}
		}
		swap(arr[minIndex], arr[i]);
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
	selection_sort(arr, size);
	print(arr, size);
}
