#include <iostream>
using namespace std;

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
	cout << "Your Name Have " << getLen(ch)<< " Letters";
}
