import java.util.Scanner;

public class ListaNumeroTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Exibir a tabuada de 1 a 9 de adição, subtração, divisão, multiplicação");
            System.out.println("2. Soma real da sequência");
            System.out.println("3. Sequência crescente e decrescente");
            System.out.println("4. Contar valores positivos, negativos e zeros");
            System.out.println("5. Calcular percentual dos valores positivos, negativos e zeros");
            System.out.println("6. Calcular o produto dos números digitados");
            System.out.println("7. Exibir a sequência Fibonacci");
            System.out.println("8. Soma dos números pares e ímpares");
            System.out.println("9. Levantamento do lucro das mercadorias");
            System.out.println("10. Movimentações financeiras de uma conta de banco digital");
            System.out.println("11. Calcular tempo para população do país A ultrapassar país B");
            System.out.println("12. Informar notas finais da disciplina AED I de 10 alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    exibirTabuada();
                    break;
                case 2:
                    somaRealSequencia();
                    break;
                case 3:
                    sequenciaCrescenteDecrescente();
                    break;
                case 4:
                    contarValores();
                    break;
                case 5:
                    calcularPercentualValores();
                    break;
                case 6:
                    calcularProduto();
                    break;
                case 7:
                    exibirSequenciaFibonacci();
                    break;
                case 8:
                    somaParesImpares();
                    break;
                case 9:
                    levantamentoLucro();
                    break;
                case 10:
                    movimentacoesFinanceiras();
                    break;
                case 11:
                    calcularTempoPopulacao();
                    break;
                case 12:
                    informarNotas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }

    public static void exibirTabuada() {
        // Implementação do exercício 1
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
                System.out.println(i + " - " + j + " = " + (i - j));
                System.out.println(i + " * " + j + " = " + (i * j));
                if (j != 0) {
                    System.out.println(i + " / " + j + " = " + (i / (double)j));
                }
            }
            System.out.println();
        }
    }

    public static void somaRealSequencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        double soma = 0.0;
        int numerador = 1;
        int denominador = 1;

        while (denominador <= n) {
            soma += (double) numerador / denominador;
            numerador += 2;
            denominador++;
        }

        System.out.println("A soma da sequência é: " + soma);
    }

    public static void sequenciaCrescenteDecrescente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n (maior que 1): ");
        int n = scanner.nextInt();
        System.out.print("Digite o número de repetições: ");
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int j = n; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void contarValores() {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, zeros = 0, total = 0;
        int valor;

        System.out.println("Digite os valores (digite -9999 para encerrar):");

        while (true) {
            valor = scanner.nextInt();
            if (valor == -9999) {
                break;
            }
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            } else {
                zeros++;
            }
            total++;
        }

        if (total > 0) {
            double percentualPositivos = (positivos / (double) total) * 100;
            double percentualNegativos = (negativos / (double) total) * 100;
            double percentualZeros = (zeros / (double) total) * 100;

            System.out.println("Percentual de valores positivos: " + percentualPositivos + "%");
            System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");
            System.out.println("Percentual de zeros: " + percentualZeros + "%");
        } else {
            System.out.println("Nenhum valor foi fornecido.");
        }
    }

    public static void calcularPercentualValores() {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, zeros = 0, total = 0;
        int valor;

        System.out.println("Digite os valores (digite 0 para encerrar):");

        do {
            valor = scanner.nextInt();
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            } else {
                zeros++;
            }
            total++;
        } while (valor != 0);

        if (total > 1) { // Subtracting 1 to exclude the terminating zero
            double percentualPositivos = (positivos / (double) (total - 1)) * 100;
            double percentualNegativos = (negativos / (double) (total - 1)) * 100;
            double percentualZeros = (zeros / (double) (total - 1)) * 100;

            System.out.println("Percentual de valores positivos: " + percentualPositivos + "%");
            System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");
            System.out.println("Percentual de zeros: " + percentualZeros + "%");
        } else {
            System.out.println("Nenhum valor foi fornecido.");
        }
    }

    public static void calcularProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        long produto = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            produto *= numero;
        }

        System.out.println("O produto dos números digitados é: " + produto);
    }

    public static void exibirSequenciaFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        long a = 0, b = 1;
        System.out.print("Sequência Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(b + " ");
            long temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
    }

    public static void somaParesImpares() {
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0, numero;

        System.out.println("Digite números inteiros positivos (digite um número maior que 1000 para encerrar):");

        while (true) {
            numero = scanner.nextInt();
            if (numero > 1000) {
                break;
            }
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }

    public static void levantamentoLucro() {
        Scanner scanner = new Scanner(System.in);
        double precoCompra, precoVenda;
        int lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;
        double totalCompra = 0, totalVenda = 0, lucroTotal = 0;

        do {
            System.out.print("Digite o preço de compra (0 para encerrar): ");
            precoCompra = scanner.nextDouble();
            if (precoCompra == 0) {
                break;
            }
            System.out.print("Digite o preço de venda: ");
            precoVenda = scanner.nextDouble();

            if (precoCompra > precoVenda) {
                System.out.println("Erro: O preço de compra não pode ser superior ao preço de venda.");
                continue;
            }

            double lucro = precoVenda - precoCompra;
            double percentualLucro = (lucro / precoCompra) * 100;

            if (percentualLucro < 10) {
                lucroMenor10++;
            } else if (percentualLucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }

            totalCompra += precoCompra;
            totalVenda += precoVenda;
            lucroTotal += lucro;

        } while (precoCompra != 0);

        System.out.println("Quantidade de mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Quantidade de mercadorias com 10% <= lucro <= 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + lucroMaior20);
        System.out.println("Valor total de compra: " + totalCompra);
        System.out.println("Valor total de venda: " + totalVenda);
        System.out.println("Lucro total: " + lucroTotal);
    }

    public static void movimentacoesFinanceiras() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
        int totalPixRecebido = 0, totalPixEnviado = 0, totalSaques = 0, totalDepositos = 0;
        int tipoOperacao;
        double valor;

        do {
            System.out.println("Digite o tipo de operação (1. Depósito em dinheiro, 2. Retirada em dinheiro, 3. Recebimento em PIX, 4. Transferência em PIX, 5. Fim): ");
            tipoOperacao = scanner.nextInt();

            if (tipoOperacao == 5) {
                break;
            }

            System.out.print("Digite o valor da operação: ");
            valor = scanner.nextDouble();

            switch (tipoOperacao) {
                case 1:
                    saldo += valor;
                    totalDepositos++;
                    break;
                case 2:
                    saldo -= valor;
                    totalSaques++;
                    break;
                case 3:
                    saldo += valor;
                    totalPixRecebido++;
                    break;
                case 4:
                    saldo -= valor;
                    totalPixEnviado++;
                    break;
                default:
                    System.out.println("Tipo de operação inválido. Tente novamente.");
            }
        } while (tipoOperacao != 5);

        System.out.println("Saldo final da conta: " + saldo);
        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }

        System.out.println("Número total de PIX recebido: " + totalPixRecebido);
        System.out.println("Número total de PIX enviado: " + totalPixEnviado);
        System.out.println("Número total de saques: " + totalSaques);
        System.out.println("Número total de depósitos em dinheiro: " + totalDepositos);
    }

    public static void calcularTempoPopulacao() {
        int populacaoA = 5000000;
        int populacaoB = 7000000;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * 0.03;
            populacaoB += populacaoB * 0.02;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse a população do país B.");
    }

    public static void informarNotas() {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            if (notas[i] >= 60) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / 10;

        System.out.println("Média das notas: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Número de alunos aprovados: " + aprovados);
        System.out.println("Número de alunos reprovados: " + reprovados);
    }
}
