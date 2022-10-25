#include <iostream>
using namespace std;

int getpivot(int arr[], int size) {
	int start = 0;
	int end = size - 1;
	int mid = start + (end - start) / 2;
	while (start < end) {
		if (arr[mid] >= arr[0]) {
			start = mid + 1;
		}
		else {
			end = mid;
		}
		mid = start + (end - start) / 2;
	}
	return start;
}
int binary_search(int arr[],int s,int e,int item) {
	int start = s;
	int end = e;
	int mid = start + (end - start) / 2;
	int ans = -1;
	while (start <= end) {
		if (item == arr[mid]) {
			return mid;
		}
		else if (item > arr[mid]) {
			start = mid + 1;
		}
		else {
			end = mid - 1;
		}
		mid = start + (end - start) / 2;
	}
	return -1;
}

int main() {
	int arr[4] = { 8,9,4,5 };
	int size = 4;
	int item = arr[3];
	int pivot = getpivot(arr, 4);
	if (item >= arr[pivot] && item <= arr[size - 1]){
		cout << "Element Found!! At Index of: " << binary_search(arr, pivot, size - 1, item);
		}
	else {
		cout<<"Element Found!! At Index of: " << binary_search(arr, 0, pivot - 1, item);
	}
}
