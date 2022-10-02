// to find the sparse matrix
#include <stdio.h>

struct poly
{
      int coeff;
      int exp;
};
struct poly Z[20], X[10], Y[10];
void printPOLY(struct poly R[], int N)
{
      int d;
      printf("eqn is: ");
      for (d = 0; d < N; d++)
      {
            printf("%dX^%d", R[d].coeff, R[d].exp);
            if (d != N - 1)
                  printf(" + ");
      }
      printf("\n");
}
void printExpo(struct poly X[], int N)
{
      int d;
      printf("\nEnter the coeffecients and exponents in DESCENDING order");
      for (d = 0; d < N; d++)
      {
            printf("\n");
            printf("Coeffient of X: ");
            scanf("%d", &X[d].coeff);
            printf("Exponential of X: ");
            scanf("%d", &X[d].exp);
      }
      printPOLY(X, N);
}

int polyADD(int A, int B)
{
      int i = 0, j = 0, k = 0;
      while (i < A && j < B)
      {
            if (X[i].exp == Y[j].exp)
            {
                  Z[k].exp = X[i].exp;
                  Z[k].coeff = (X[i].coeff + Y[j].coeff);
                  i++;
                  j++;
                  k++;
            }
            else
            {
                  if (X[i].exp > Y[j].exp)
                  {
                        Z[k].exp = X[i].exp;
                        Z[k].coeff = X[i].coeff;
                        i++;
                        k++;
                  }
                  else
                  {
                        Z[k].exp = Y[j].exp;
                        Z[k].coeff = Y[j].coeff;
                        j++;
                        k++;
                  }
            }
      }
      while (i < A)
      {
            Z[k].exp = X[i].exp;
            Z[k].coeff = X[i].coeff;
            i++;
            k++;
      }
      while (j < B)
      {
            Z[k].exp = Y[j].exp;
            Z[k].coeff = Y[j].coeff;
            j++;
            k++;
      }

      return k;
}

int main()
{
      int A, B;
      printf("Enter Poly X1 Size: ");
      scanf("%d", &A);

      printExpo(X, A);

      printf("Enter Poly X2 Size: ");
      scanf("%d", &B);

      printExpo(X, B);
      printf("\n");

      int K = polyADD(A, B);
      printf("Resultant ");
      printPOLY(Z, K);
}
