#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Declarando a variavel
    int op;
    float a,b;
    printf("----CALCULADORA----");
    //Menu para escolher opera��o
    printf("\n 1-Soma");
    printf("\n 2-Subtrac�o");
    printf("\n 3-Divis�o");
    printf("\n 4-Multiplica��o");
    //SOlicitando ao usuario que escolha a opera��o que deseja
    printf("\n Escolha uma opera��o: ");
    //salvando a variavel escolhida
    scanf("%d", &op);
    //Solicitando ao ususario que escolha dois numeros
    printf("\n Digite dois numeros: ");
    //Salvando a variavel
    scanf("%f %f", &a, &b);
    //condi��o de escolha para cada op��o de opera��o
    switch(op){
    //soma
    case 1:
        printf("\nA soma do seus n�meros �:%.2f ", a+b);
        break;
    //subtra��o
    case 2:
        printf("\nA subtra��o dos seus dois n�meros �:%.2f ", a-b);
        break;
    //divis�o
    case 3:
        printf("\nA Divis�o dos seus dois n�meros �:%.2f ", a/b);
        break;
    //multiplic��o
    case 4:
        printf("\nA multiplica��o do seus dois n�meros �:%.2f ", a*b);
        break;
    default:
        printf("\nEscolha invalida");
    }


}
