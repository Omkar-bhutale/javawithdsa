#include<iostream>
using namespace std;
class construct{
    public:
    int a,b;
    construct(int x,int y){
        a=x;
        b=y;
    }
};
int main(){
    construct c(11,22);
    //construct c1; //shows error
    cout<<"a:"<<c.a<<" "<<"b:"<<c.b<<endl;
    construct c2=c;
    cout<<"a:"<<c2.a<<" "<<"b:"<<c2.b;
    

}