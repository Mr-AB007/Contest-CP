#include<bits/stdc++.h>

using namespace std;

int maxFun(long long n)
{
    vector<long long> arr;
    long n1,m=0;
    for(long long i = 0; i < n; i++)
    {
        cin>>n1;
        arr.push_back(n1);
    }
    m = *max_element(arr.begin(),arr.end()) - *min_element(arr.begin(),arr.end());
    return m*2;
}

int main()
{
    long long t;
    vector<long long> arr;
    cin>>t;
    while(t--)
    {
        long long n;
        cin>>n;
        cout<<maxFun(n)<<endl;
    }
    return 0;
}
