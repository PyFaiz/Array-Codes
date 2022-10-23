#include <iostream>
using namespace std;

void printarray(int arr[], int size) {
	cout << "Printing Array: ";
	for (int i = 0; i < size; i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}

void swapalt(int arr[],int size) {
	int i = 0;
	while (i < size-1) {
		int temp=arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
		i += 2;
	}
}
int main() {
	int arr1[5] = { 7,3,4,1,5 };
	int arr2[10] = { 1,2,3,4,5,6,7,8,9,10 };
	printarray(arr2, 10);
	cout << "Now Swapping the Array: \n";
	swapalt(arr2, 10);
	printarray(arr2, 10);
	return 0;
}
