#include <iostream>
using namespace std;

class palindrome_checker{
    public:
    string text;
    bool tf = true;  
    palindrome_checker(){
        cout << "Enter the word:";
        cin >> text;
        real_checker(text);
    }
    void real_checker(string idk){
        int mid = idk.length() /2;
        for(int i=0;i < mid;i++){
            if(idk[i] != idk[idk.length()-i-1]){
                tf = false;
            }
        }
        if(tf){cout << "Given Word is Palindrome\n";}
        else cout << "Given Word is Not a Palindrome\n";
    }

};
int main(){
    palindrome_checker *me = new palindrome_checker();
    return 0;
}