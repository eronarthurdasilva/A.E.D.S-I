# Algoritmos e Estrutura de Dados 1

Ola, se você se interessou por esse assunto este repositório é uma compilação dos meus estudos em Algoritmos e Estrutura de Dados 1, parte fundamental do meu curso de Engenharia da Computação, onde eu aprendi alguns conceitos de estrura de dados e como posso aplicalos em algoritmos. As linguagens utilizadas nesse repositório e c++ e também o java. Espero que gostem, e se precisar de uma ajuda para entender algo e so entrar em contato.

## Conteúdo

- **Recursividade:** Exploração aprofundada dos conceitos e aplicações de funções recursivas, proporcionando uma compreensão sólida desse importante método.
Exemplo em C++:
  ```cpp
  int fatorial(int n) {
      if (n <= 1) {
          return 1;
      }
      return n * fatorial(n - 1);
  }
  
- **Função e Procedimento:** Cobertura abrangente das nuances das funções e procedimentos em linguagem C/C++, destacando as diferenças, aplicações e boas práticas.
Exemplo em c:
    `````c
    //Função 
    int soma(int a, int b) {
        return a + b;
    } 
    //Procedimento
    void imprimirMensagem() {
        printf("Olá, Mundo!\n");
    }  

 
- **Programação Orientada a Objetos (POO):** Introdução e aplicação dos princípios da POO, oferecendo uma visão abrangente dessa paradigma essencial para o desenvolvimento de software modular e reutilizável.
Exemplo em C++:
    ``````C++
    class Carro {
    public:
        string marca;
        int ano;

        Carro(string m, int a) : marca(m), ano(a) {}

        void exibirInfo() {
            cout << "Marca: " << marca << ", Ano: " << ano << endl;
        }
    };

    // Uso da classe
    Carro meuCarro("Toyota", 2022);
    meuCarro.exibirInfo();

- **Estruturas de Controle (If e Else):** Estudo aprofundado das estruturas condicionais, abordando if, else e outros operadores relacionais, contribuindo para uma lógica de programação robusta.
    ``````
    if(number > 1){
        return number * factorial(number - 1);
    }
    else{
        return null;
    }


- **Repetição (For, While, Do While):** Compreensão detalhada das estruturas de repetição, com ênfase em for, while e do-while, proporcionando as habilidades necessárias para iterações eficientes nos algoritmos.

- **Outros Conceitos Importantes:** Abordagem de conceitos adicionais essenciais, como manipulação de arrays, ponteiros, alocação dinâmica de memória e mais.

## Como Utilizar

1. Clone o repositório
2. Navegue na paginas dos projetos 
    cd AEDS1
3. Abra a pasta do exemplo que deseja utilizar com um editor

## Contribuições 
Sinta-se à vontade para contribuir, seja sugerindo melhorias nos códigos existentes, adicionando novos algoritmos ou corrigindo possíveis erros. Seu envolvimento é valioso para o aprendizado coletivo.

## Livros utilizados
- Entendendo Algoritmos 
- Algoritmos e Estrutura de dados I
- Algoritmos e Estrutura de dados em Java