#include <stdio.h>
#include <stdlib.h>

int main()
{
    float F, C;// variaveis que representam os valores em F de fahrenheit e C de celsius

    printf("Digite a temperatura em Fahrenheit: ");// solicito ao usuario que digite o valor da temperatura em fahrenheit
    scanf("%f", &F);
    //Formula de convers�o de fanreheit para celsius
    C = 5.0 / 9.0 * (F - 32);

    printf("A temperatura em Celsius �: %.2f\n", C);//exibi��o da convers�o


}
