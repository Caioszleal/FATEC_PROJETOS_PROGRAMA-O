#include <iostream>
using namespace std;

void classificarTriangulo(double a,double b,double c){
    if(a==b && b==c) cout<<"Equilatero\n";
    else if(a==b || b==c || a==c) cout<<"Isosceles\n";
    else cout<<"Escaleno\n";
}

int main(){
    double a,b,c;

    cout<<"--- Procedural ---\n";
    cin>>a>>b>>c;
    classificarTriangulo(a,b,c);

    cout<<"--- Modular ---\n";
    classificarTriangulo(a,b,c);

    return 0;
}
