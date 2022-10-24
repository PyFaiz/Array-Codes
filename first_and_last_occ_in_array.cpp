#include <iostream>
using namespace std;

int firstOcc(int arr[], int size, int item) {
	int start = 0;
	int end = size - 1;
	int mid = start + (end - start) / 2;
	int ans = -1;
	while (start <= end) {
		if (arr[mid] == item) {
			ans = mid;
			end = mid - 1;
		}
		else if (arr[mid] > item) {
			end = mid - 1;
		}
		else if (arr[mid] < item) {
			start = mid + 1;
		}
		mid = start + (end - start) / 2;
	}
	return ans;
}

int lastOcc(int arr[], int size, int item) {
	int start = 0;
	int end = size - 1;
	int mid = start + (end - start) / 2;
	int ans = -1;
	while (start <= end) {
		if (arr[mid] == item) {
			ans = mid;
			start = mid + 1;
		}
		else if (item > arr[mid]) {
			start = mid + 1;
		}
		else if (item < arr[mid]) {
			end = mid - 1;
		}
		mid = start + (end - start) / 2;
	}
	return ans;
}



int main() {
	int arr[7] = { 1,2,3,5,5,5,7 };
	cout << "First Occurance is :" << firstOcc(arr, 7, 5);
	cout << "\nLast Occurance is :" << lastOcc(arr, 7, 5);
	cout << "\nTotal Occurance is: " << lastOcc(arr, 7, 5) - firstOcc(arr, 7, 5) + 1;
}
