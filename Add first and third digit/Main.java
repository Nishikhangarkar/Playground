#include<stdio.h>
int main()
{
  int a,x,y,z;
  scanf("%d",&a);
  x=a/100;
  y=a%10;
  z=x+y;
  printf("%d",z);
  return 0;
}