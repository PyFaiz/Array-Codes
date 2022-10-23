#include <iostream>
using namespace std;

void sort12(int arr[],int size){
    int i=0;
    int j=size-1;
    int k=0;
    while(i<=j){
        if(arr[i]==0){
            swap(arr[k],arr[i]);
            i++;
            k++;
        }
        else if(arr[i]==2){
            swap(arr[j],arr[i]);
            j--;
        }
        else{
            i++;
        }
    }
}

void printArray(int arr[],int size)
{
    for(int i=0;i<size;i++){
        cout << arr[i] << " ";
    }
}

int main(){
    int arr[7] = {0,1,2,1,2,1,2};
    sort12(arr,7);
    printArray(arr,7);
}

