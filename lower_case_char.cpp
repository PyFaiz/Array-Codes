#include <iostream>
using namespace std;

char lowerConvert(char c) {
	if (c >= 'a' && c <= 'z') {
		return c;
	}
	else if(c>='A' && c <='Z') {
		c = c - 'A' + 'a';
		return c;
	}
	return c;
}


int main() {
	char k;
	cout << "Enter a character:";
	cin >> k;
	cout <<"In Lower Case: "<< lowerConvert(k);
	
	return 0;
}
