#include <iostream>
using namespace std;

int binary_search(int arr[], int size, int item) {
	int start = 0;
	int end = size - 1;
	while (start <= end) {
		int mid = (start + end) / 2;
		if (arr[mid] == item) {
			return mid;
		}
		else if (arr[mid] > item) {
			end = mid - 1;
		}
		else if(arr[mid]<item) {
			start = mid + 1;
		}
	}
	return -1;
}

int main() {
	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
	cout << "Binary Searching for 7.....\nIndex Number is:" << binary_search(arr, 10, 7);
	return 0;
}
