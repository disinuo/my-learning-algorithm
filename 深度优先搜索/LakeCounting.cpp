//
// Created by 邸思诺 on 17/2/6.
//

#include<iostream>
#include<cstdio>
#include<string>
#include <list>
#include<set>
#include<cstring>
#include<cmath>
#include<algorithm>
using namespace std;

int n,m;
int field[100][100];
void mydps(int i,int j);
bool inRange(int,int);

int countPond(){
    int numOfPond=0;
    for(int i=0;i<n;i++) {
        for (int j = 0; j < m; j++) {
            if(field[i][j]==1){
                mydps(i,j);
                numOfPond++;

            }
        }
    }
    return numOfPond;
}
int main() {
    cin>>n;
    cin>>m;
    for(int i=0;i<n;i++){
        char str[100];
        cin>>str;
        for(int j=0;j<m;j++){
            if(str[j]=='.'){
                field[i][j]=0;
            } else{
                field[i][j]=1;
            }
        }
    }
    int ans=countPond();
    cout<< ans;
    return 1;
}
void mydps(int i,int j){
    field[i][j]=0;
    for(int p=-1;p<=1;p++){
        for(int q=-1;q<=1;q++){
            int nx=i+p;
            int ny=j+q;
            if(inRange(nx,ny)&&field[nx][ny]==1){
                mydps(nx,ny);
            }
        }
    }
}
bool inRange(int i,int j){
    if(i>=0&&i<n&&j>=0&&j<m) return true;
    else return false;
}
