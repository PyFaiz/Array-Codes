#include <iostream>
using namespace std;

class palidrome_checker{
    public:
    string text;
    bool tf = true;  
    palidrome_checker(){
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
        if(tf){cout << "Given Word is Palidrome\n";}
        else cout << "Given Word is Not a Palidrome\n";
    }

};
int main(){
    palidrome_checker *me = new palidrome_checker();
    return 0;
}