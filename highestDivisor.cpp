/** Highest divisor problem Codechef Contest Feb 21 2021 **/
#include <iostream>

using namespace std;

int main()
{
    int arr[]={10,9,8,7,6,5,4,3,2,1},n;
    cin>>n;
    for(int i = 0; i < 10; i++)
    {
        if(n % arr[i] == 0)
        {
                 cout<<arr[i];
                 break;
        }

    }
    return 0;
}
