#include<iostream>
using namespace std;

int main() {

	int arr1[] = { 5,7,8,9,11 };
	int arr2[] = { 1,6,10,12 };
	int arr3[9] = { 0 };
	int n = 5, m = 4;
	int i = 0, j = 0, k = 0;
	while (i < n && j < m) {
		if (arr1[i] < arr2[j]) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		else {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
	}

	while (i < n) {
		arr3[k] = arr1[i];
		k++;
		i++;
	}
	while (j < m) {
		arr3[k] = arr2[j];
		k++;
		j++;
	}
	
	for (int a = 0; a < 9; a++) {
		cout << arr3[a]<<endl;
	}

	return 0;
}
