#include <stdio.h>
#include <stdlib.h>

int main()
{
    ///Declarando variavel
    char caracter;
    ///solicitando ao usuario uma caracter
    printf("Digite um carater: ");
    ///Salvando a variavel
    scanf("%s", &caracter);
    ///primeira condi��o: caso o caracter for letra maiuscula
    if(caracter >= 'A' && caracter <='z'){
        printf("O caracter escrito e uma letra maiuscula.\n");
    }
    ///segunda condi��o: caso o caracter for lestra minuscula
    if(caracter >='a' && caracter <='z'){
        printf("O caracter escrito e uma letra minuscula.\n");
    }
    ///terceira condi��o: caso o caracter for um n�mero de 0 a 9
    else if(caracter >=0 && caracter <=9){
        printf("O caracter escrito e um numero de 0 a 9 .\n");
    }
    ///ultima condi��o: caso o caracter nao seja valido
    else
        printf("O caracter esta invalido");
    return 0;
}
