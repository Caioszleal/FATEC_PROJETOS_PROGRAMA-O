#include <iostream>
using namespace std;

int contarVogais(string frase){
    string v="aeiouAEIOU";
    int c=0;
    for(char ch:frase)
        if(v.find(ch)!=string::npos) c++;
    return c;
}

int main(){
    string frase;

    cout<<"--- Procedural ---\n";
    getline(cin,frase);
    cout<<contarVogais(frase)<<endl;

    cout<<"--- Modular ---\n";
    cout<<contarVogais(frase);

    return 0;
}
