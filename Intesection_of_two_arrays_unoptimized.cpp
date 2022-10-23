#include <iostream>
using namespace std;


void printArray(int aarr[], int size) {
	cout << "Printing Array :" << endl;
	for (int i = 0; i < size; i++) {
		cout << aarr[i] << " ";
	} cout << endl;
}


int main()
{
	int arr[7] = { 3,7,9,10,15,18,21 };
	int arr2[3] = { 4,5,15 };
	int arr3[3]={-1},k=0;
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 3; j++) {
			if (arr[i] == arr2[j]) {
				arr3[k] = arr[i];
                arr2[j] = -1;
				k++;
                break;
			}
		}
	}
	printArray(arr3, k);
	return 0;
}
