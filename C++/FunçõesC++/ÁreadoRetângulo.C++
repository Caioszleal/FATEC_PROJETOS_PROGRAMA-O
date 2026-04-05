#include <iostream>
using namespace std;

double calcularArea(double a,double l){
    return a*l;
}

int main(){
    double a,l;

    cout<<"--- Procedural ---\n";
    cin>>a>>l;
    cout<<a*l<<endl;

    cout<<"--- Modular ---\n";
    cout<<calcularArea(a,l);

    return 0;
}
