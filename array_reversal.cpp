#include <iostream>
using namespace std;


void reversearray(int arr[],int size){
    int i=0;
    int j=size-1;
    while(j>=i){
        //swap(arr[i],arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;        
    }
}
void printArray(int arr[],int size){
    cout << "printing array ";
    for(int i=0;i<size;i++){
        cout << " "<< arr[i];
    } cout << endl;
}

int main(){
    int arr[6] = {1,2,3,4,5,6};
    cout <<"Before reversing : \n";
    printArray(arr,6);
    cout<<"\nAfer Reversing : \n";
    reversearray(arr,6);
    printArray(arr,6);
}
