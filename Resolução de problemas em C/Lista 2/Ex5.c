#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Declara��o de variavel
    int x;
    //Solicita ao usuario que didite 1 n�mero
    printf("Digite um numero \n");
    //Salvando a variavel com o scan
    scanf("%d", &x);
    fflush(stdin);
    //condi��o numero 1:caso o numero seja positivo aparecerar 1
    if(x>0){
        printf(" 1 ");
    }
    //condi��o numero 2: caso n�o seja positivo aparece�ar -1
    if(x<0)
        printf(" -1 ");
    else
        printf(" 0 ");

    return 0;
}
