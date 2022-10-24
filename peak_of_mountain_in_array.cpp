$include <iostream>
using namespace std;

int peakofarray(int arr[], int size) {
	int s = 0;
	int e = size - 1;
	int mid = s + (e - s) / 2;
	while (s < e) {
		if (arr[mid] < arr[mid + 1]) {
			s = s + 1;
		}
		else {
			e = mid;
		}
		mid = s + (e - s) / 2;
	}
	return s;
}


int main() {
	int arr[4] = {0,10,5,2};
	cout << "Peak Of Mountain is at index : " << peakofarray(arr, 4);
}
