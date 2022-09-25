#include <stdio.h>
int main()
{

    printf("Enter the limit of Array: ");
    int n;
    scanf("%d", &n);
    int array[n], i;

    printf("Enter the elements for the Array:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &array[i]);
    }

    int x;
    printf("Enter the Search Element: ");
    scanf("%d", &x);
    int flag = -1;
    for (i = 0; i < n; i++)
    {
        if (array[i] == x)
        {
            flag = i;
            break;
        }
    }
    if (flag == -1)
        printf("Element not found\n");
    else
        printf("Element found at %d location\n", flag + 1);

    for (i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
    printf("\n");
}