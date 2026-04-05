#include <iostream>
using namespace std;

void tabuada(int n){
    for(int i=1;i<=10;i++)
        cout<<i<<" x "<<n<<" = "<<i*n<<endl;
}

int main(){
    int n;

    cout<<"--- Procedural ---\n";
    cin>>n;
    tabuada(n);

    cout<<"--- Modular ---\n";
    tabuada(n);

    return 0;
}
