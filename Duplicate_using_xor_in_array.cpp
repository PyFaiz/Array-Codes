#include <iostream>
using namespace std;

void dupli(int arr[],int size){
        int ans = 0;
        for(int i=0;i<size;i++){
            ans = ans ^ arr[i];
        }
        for(int i=0;i<size;i++){
            ans = ans^i;
        }
    cout << "Repeated Digit is " << ans;
}

int main(){
    int arr1[5]={4,2,1,1,3};
    dupli(arr1,5);
}
