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
    if(op>1 && op<4){//caso seja a op��o errada
        printf("\nOpera��o invalida");
    }
    else if(op==1){//soma
        printf("\nA soma dos seus dois valores �;%.1f", a+b);
    }
    else if(op==2){//subtra��o
        printf("\nA subtra��o dos seus dois valores �;%.1f", a-b);
    }
    else if(op==3){//divis�o
        printf("\nA divis�o dos seus dois valores �;%.1f", a/b);
    }
    else if(op==4){//multiplica��o
        printf("\nA multiplica��o dos seus dois valores �;%.1f", a*b);
    }
}
