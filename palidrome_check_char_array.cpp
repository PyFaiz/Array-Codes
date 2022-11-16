#include <iostream>
using namespace std;

bool palidrome(char a[], int n) {
	int s = 0;
	int e = n - 1;
	while (s <= e) {
		if (a[s] != a[e]) {
			return 0;
		}
		else {
			s++;
			e--;
		}
	}
	return 1;
}


void reverse(char a[],int n) {
	int s = 0;
	int e = n - 1;

	while (s < e) {
		swap(a[s], a[e]);
		s++;
		e--;
	}
}

int getLen(char ch[]) {
	int counter = 0;
	for (int i = 0; ch[i] != '\0'; i++) {
		counter++;
	}
	return counter;
}

int main() {
	char ch[20];
	cout << "Enter a Name: ";
	cin >> ch;
	cout << "Your Name Have " << getLen(ch)<< " Letters\n";
	reverse(ch, getLen(ch));
	cout << "Reverse is: " << ch << endl;
	if (palidrome(ch, getLen(ch))){
		cout << "This is Palidrome\n";
	}
	else {
		cout << "NICE not a palidrome";
	}



}
