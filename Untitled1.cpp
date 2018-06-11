#include <stdio.h>
main()
{
	long int i = 1;
	int num;
	printf("Enter a number : ");
	scanf("%d",&num);
	while( (num*i) % 26 != 1 )
	{
		i++;
	}
	printf("%d",i);
}
