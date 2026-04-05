#include <iostream>
using namespace std;

void verificar(int n){
    if(n%2==0) cout<<"Par\n";
    else cout<<"Impar\n";
}

int main(){
    int n;

    cout<<"--- Procedural ---\n";
    cin>>n;
    verificar(n);

    cout<<"--- Modular ---\n";
    verificar(n);

    return 0;
}
