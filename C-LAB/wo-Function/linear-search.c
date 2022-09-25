#include <stdio.h>
int main()
// Time and Space Complexity
{
    int time = 0;
    printf("Enter the limit of Array: ");
    time++;
    int n;
    time++;
    scanf("%d", &n);
    time++;
    int array[n], i;
    time++;

    printf("Enter the elements for the Array:\n");
    time++;
    for (i = 0; i < n; i++)
    {
        time++;
        scanf("%d", &array[i]);
    }
    time++;

    int x;
    time++;
    printf("Enter the Search Element: ");
    time++;
    scanf("%d", &x);
    time++;
    int flag = -1;
    time++;
    for (i = 0; i < n; i++)
    {
        time++;
        if (array[i] == x)
        {
            time++;
            flag = i;
            break;
        }
        time++;
    }
    time++;
    if (flag == -1)
    {
        time++;
        printf("Element not found\n");
    }
    else
    {
        time++;
        printf("Element found at %d location\n", flag + 1);
    }
    time++;

    for (i = 0; i < n; i++)
    {
        time++;
        printf("%d ", array[i]);
    }
    time++;
    printf("\n Time Complexity %d ", time);
    int space = sizeof(int) * (n + 4);
    printf("\n Space Complexity %d \n", space);
}