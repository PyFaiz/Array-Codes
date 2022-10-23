#include <iostream>
using namespace std;

void printArray(int arr[], int size) {
	cout << "Printing array: " << endl;
	for (int i = 0; i < size; i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}

int minofarray(int arr[],int size) {
	int min = INT_MAX;
	for (int i = 0; i < size; i++) {
		if (arr[i] < min) {
			min = arr[i];
		}
	}
	return min;
}

int maxofarray(int arr[], int size) {
	int max = INT_MIN;
	for (int i = 0; i < size; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	return max;
}

int main() {
	int num[15];
	for (int i = 0; i < 15; i++) {
		num[i] = i + 2;
	}
	printArray(num, 15);
	cout << "The Maximum is " << maxofarray(num, 15) << endl;;
	cout << "The Minimum is " << minofarray(num, 15)<<endl;

	
	return 0;
}
