#include <iostream>
using namespace std;

void classificarNota(int n){
    if(n>=90) cout<<"A\n";
    else if(n>=80) cout<<"B\n";
    else if(n>=70) cout<<"C\n";
    else if(n>=60) cout<<"D\n";
    else cout<<"E\n";
}

int main(){
    int n;

    cout<<"--- Procedural ---\n";
    cin>>n;
    classificarNota(n);

    cout<<"--- Modular ---\n";
    classificarNota(n);

    return 0;
}
