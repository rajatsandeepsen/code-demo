#include <stdio.h>
int main()
{

    printf("Enter the limit of Array: ");
    int n;
    scanf("%d", &n);
    int array[n], i;
    // only for the sorted array
    printf("Enter the elements for the Array in sorted order:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &array[i]);
    }

    // searching starts here
    int x;
    printf("Enter the Search Element: ");
    scanf("%d", &x);
    int flag = -1;

    // essencial for the searching
    int F = 0, L = n - 1;
    while (F <= L)
    {
        int MID = F + (L - F) / 2;
        if (array[MID] == x)
        {
            flag = MID;
            break;
        }
        if (array[MID] < x)
            F = MID + 1;

        else
            L = MID - 1;
    }

    if (flag == -1)
        printf("Element not found\n");
    else
        printf("Element found at %d location\n", (flag + 1));
    // location is not based on the array
}