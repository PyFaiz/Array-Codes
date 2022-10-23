#include <iostream>
using namespace std;

void printarray(int arr[], int size) {
	cout << "Printing Array: ";
	for (int i = 0; i < size; i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}

int sumofarray(int arr[], int size) {
	int sum = 0;
	for (int i = 0; i < size; i++) {
		sum += arr[i];
	}
	return sum;
}

int main() {
	int arr1[5] = { 7,3,4,1,5 };
	printarray(arr1, 5);
	cout << "The Sum of Array is: " << sumofarray(arr1, 5);
	return 0;
}
