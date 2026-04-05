#include <iostream>
using namespace std;

bool validar(string s){
    return s.length()>=8;
}

int main(){
    string s;

    cout<<"--- Procedural ---\n";
    cin>>s;
    while(!validar(s)){
        cout<<"Invalida\n";
        cin>>s;
    }

    cout<<"--- Modular ---\n";
    cin>>s;
    while(!validar(s)){
        cout<<"Invalida\n";
        cin>>s;
    }

    return 0;
}
