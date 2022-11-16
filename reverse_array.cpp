#include <iostream>
using namespace std;

int main() {
	int arr[] = { 10,20,30,40,50 };
	int s = 0, e = 4;
	while (s <= e) {
		swap(arr[s], arr[e]);
		s++;
		e--;
	}
	for (int i = 0; i < 5; i++) {
		cout << arr[i] << "\n";
	}
	return 0;
}
