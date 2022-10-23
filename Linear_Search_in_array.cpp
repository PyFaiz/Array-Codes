#include <iostream>
using namespace std;

bool linearsearch(int arr[],int size,int item){
    for(int i=0;i<size;i++){
        if(item == arr[i]){
            return true;
        }
    }
    return false;
}

int main(){
    int arr1[10] = {1,2,4,6,1,3,4,1,5,1};
    if(linearsearch(arr1,10,6)){
        cout << "Present ";
    }
    else cout << "Not Present";
}
