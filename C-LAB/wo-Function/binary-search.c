#include <stdio.h>
int main()
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
    // only for the sorted array
    printf("Enter the elements for the Array in sorted order:\n");
    time++;
    for (i = 0; i < n; i++, time++)
    {
        scanf("%d", &array[i]);
    }
    time++;

    // searching starts here
    int x;
    time++;
    printf("Enter the Search Element: ");
    time++;
    scanf("%d", &x);
    time++;
    int flag = -1;
    time++;

    // essencial for the searching
    int F = 0, L = n - 1;
    time++;
    while (F <= L)
    {
        int MID = F + (L - F) / 2;
        time++;
        if (array[MID] == x)
        {
            time++;
            flag = MID;
            break;
        }
        time++;
        if (array[MID] < x)
        {
            F = MID + 1;
            time++;
        }
        else
        {
            time++;
            L = MID - 1;
        }
        time++;
    }

    if (flag == -1)
    {
        time++;
        printf("Element not found\n");
    }
    else
    {
        time++;
        printf("Element found at %d location\n", (flag + 1));
    }
    // location is not based on the array
    printf("Time complexity %d\n", time);
    printf("Space complexity %d\n", sizeof(int) * (7 + n));
}