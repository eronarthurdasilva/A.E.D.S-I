#include <stdio.h>
#include <stdlib.h>
///Programa para colocar o numero 0 a N(digitado pelo usuario)
int main() {
    ///Declara��o de variaveis inteiras
    int n, rep, i, add, reg;;

    ///Solicita ao usuario dois numeros inteiros
    printf("Digite um valor inteiro positivo: ");
    scanf("%d", &n);///salvando a variavel digitada ( 0- N)
    printf("Digite o n�mero de vezes que a sequ�ncia deve ser repetida: ");
    scanf("%d", &rep);/// Salvando o valor da variavel ( quatidade de repeti��o)
    ///Usando o comando de repeti��o for
    for(add = 0 ; add < rep; add++)
     {

         ///condi��o para o valor ser crescente
        for(i = 0; i <= n; i++)
        {
            ///Mostra o valor de forma crescente
            printf(" %d ", i);
        }
        printf("\n");
        ///condi��o para o valor ser decrescente
        for(reg = n; reg >= 0; reg--)
        {
            ///Mostra o valor de forma decrescente
            printf(" %d ", reg);
        }
        printf("\n");
    }

    return 0;
}
