import java.util.Scanner;

public class ListaDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha um exercício para resolver:");
            System.out.println("1. Identificar se um inteiro é par ou ímpar");
            System.out.println("2. Verificar a validade de uma senha");
            System.out.println("3. Verificar se uma data é válida em 2022");
            System.out.println("4. Mostrar o maior, o menor e o elemento do meio dentre três números");
            System.out.println("5. Imprimir 1 se o número for positivo, -1 se for negativo e 0 se for zero");
            System.out.println("6. Mostrar em qual quadrante o ponto se encontra");
            System.out.println("7. Mostrar se o caractere é uma letra maiúscula, minúscula ou um número");
            System.out.println("8. Verificar se os valores lidos consistem em um triângulo e seu tipo");
            System.out.println("9. Calcular e apresentar o IMC de uma pessoa");
            System.out.println("10. Calculadora com as quatro operações aritméticas básicas");
            System.out.println("11. Calculadora com switch");
            System.out.println("12. Mostrar a parte inteira e a parte fracionária de um número real");
            System.out.println("13. Calcular a distância de Manhattan entre dois pontos cartesianos");
            System.out.println("14. Calcular o valor total da compra de parafusos com desconto");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    identificarParOuImpar(scanner);
                    break;
                case 2:
                    verificarSenha(scanner);
                    break;
                case 3:
                    verificarData(scanner);
                    break;
                case 4:
                    mostrarMaiorMenorMeio(scanner);
                    break;
                case 5:
                    imprimirPositivoNegativoZero(scanner);
                    break;
                case 6:
                    mostrarQuadrante(scanner);
                    break;
                case 7:
                    mostrarCaractere(scanner);
                    break;
                case 8:
                    verificarTriangulo(scanner);
                    break;
                case 9:
                    calcularIMC(scanner);
                    break;
                case 10:
                    calculadora(scanner);
                    break;
                case 11:
                    calculadoraSwitch(scanner);
                    break;
                case 12:
                    mostrarParteInteiraFracionaria(scanner);
                    break;
                case 13:
                    calcularDistanciaManhattan(scanner);
                    break;
                case 14:
                    calcularValorParafusos(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void identificarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero <= 0) {
            System.out.println("O número deve ser maior que zero.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }

    private static void verificarSenha(Scanner scanner) {
        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    private static void verificarData(Scanner scanner) {
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        if (ano == 2022 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                System.out.println("Data inválida.");
            } else if (mes == 2 && dia > 28) {
                System.out.println("Data inválida.");
            } else {
                System.out.println("Data válida em 2022.");
            }
        } else {
            System.out.println("Data inválida.");
        }
    }

    private static void mostrarMaiorMenorMeio(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        int maior = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));
        int meio = num1 + num2 + num3 - maior - menor;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Elemento do meio: " + meio);
    }

    private static void imprimirPositivoNegativoZero(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("1");
        } else if (numero < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }

    private static void mostrarQuadrante(Scanner scanner) {
        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Primeiro quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Terceiro quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("Quarto quadrante");
        } else {
            System.out.println("O ponto está sobre um dos eixos");
        }
    }

    private static void mostrarCaractere(Scanner scanner) {
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);
        if (Character.isUpperCase(caractere)) {
            System.out.println("É uma letra do alfabeto maiúscula");
        } else if (Character.isLowerCase(caractere)) {
            System.out.println("É uma letra do alfabeto minúscula");
        } else if (Character.isDigit(caractere)) {
            System.out.println("É um número inteiro entre 0 e 9");
        } else {
            System.out.println("Caractere inválido");
        }
    }

    private static void verificarTriangulo(Scanner scanner) {
        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido");
        }
    }

    private static void calcularIMC(Scanner scanner) {
        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }

    private static void calculadora(Scanner scanner) {
        System.out.println("Escolha a operação: 1. Soma 2. Subtração 3. Multiplicação 4. Divisão");
        int operacao = scanner.nextInt();
        System.out.print("Digite o primeiro operando: ");
        double operando1 = scanner.nextDouble();
        System.out.print("Digite o segundo operando: ");
        double operando2 = scanner.nextDouble();
        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (operando1 + operando2));
                break;
            case 2:
                System.out.println("Resultado: " + (operando1 - operando2));
                break;
            case 3:
                System.out.println("Resultado: " + (operando1 * operando2));
                break;
            case 4:
                if (operando2 != 0) {
                    System.out.println("Resultado: " + (operando1 / operando2));
                } else {
                    System.out.println("Divisão por zero não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }

    private static void calculadoraSwitch(Scanner scanner) {
        System.out.println("Escolha a operação: +, -, *, /");
        char operacaoChar = scanner.next().charAt(0);
        System.out.print("Digite o primeiro operando: ");
        double operando1Char = scanner.nextDouble();
        System.out.print("Digite o segundo operando: ");
        double operando2Char = scanner.nextDouble();
        switch (operacaoChar) {
            case '+':
                System.out.println("Resultado: " + (operando1Char + operando2Char));
                break;
            case '-':
                System.out.println("Resultado: " + (operando1Char - operando2Char));
                break;
            case '*':
                System.out.println("Resultado: " + (operando1Char * operando2Char));
                break;
            case '/':
                if (operando2Char != 0) {
                    System.out.println("Resultado: " + (operando1Char / operando2Char));
                } else {
                    System.out.println("Divisão por zero não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }

    private static void mostrarParteInteiraFracionaria(Scanner scanner) {
        System.out.print("Digite um número real: ");
        float numeroReal = scanner.nextFloat();
        int parteInteira = (int) numeroReal;
        float parteFracionaria = numeroReal - parteInteira;
        System.out.println("Parte inteira: " + parteInteira);
        System.out.println("Parte fracionária: " + parteFracionaria);
    }

    private static void calcularDistanciaManhattan(Scanner scanner) {
        System.out.print("Digite o valor de x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Digite o valor de y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Digite o valor de x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Digite o valor de y2: ");
        int y2 = scanner.nextInt();
        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos são os mesmos");
        } else {
            int distanciaManhattan = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            System.out.println("Distância de Manhattan: " + distanciaManhattan);
        }
    }

    private static void calcularValorParafusos(Scanner scanner) {
        System.out.print("Digite a quantidade de parafusos: ");
        int quantidadeParafusos = scanner.nextInt();
        if (quantidadeParafusos <= 0) {
            System.out.println("Quantidade inválida");
        } else {
            double precoParafuso = 0.50;
            double desconto = 0;
            if (quantidadeParafusos >= 101 && quantidadeParafusos <= 200) {
                desconto = 0.10;
            } else if (quantidadeParafusos >= 201 && quantidadeParafusos <= 300) {
                desconto = 0.20;
            } else if (quantidadeParafusos >= 301 && quantidadeParafusos <= 400) {
                desconto = 0.30;
            } else if (quantidadeParafusos > 401) {
                desconto = 0.40;
            }
            double valorTotal = quantidadeParafusos * precoParafuso * (1 - desconto);
            System.out.println("Valor total da compra: R$ " + valorTotal);
        }
    }
}