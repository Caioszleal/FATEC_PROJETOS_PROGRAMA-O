#include <iostream>
using namespace std;

double converter(double c){
    return (c*9/5)+32;
}

int main(){
    double c;

    cout<<"--- Procedural ---\n";
    cin>>c;
    cout<<converter(c)<<endl;

    cout<<"--- Modular ---\n";
    cout<<converter(c);

    return 0;
}
