import java.util.*;//utilizado para importar todas as classes do pacote java.util

/*
 * Lista número 1 e apenas uma desmonstração em C de um algoritmos
 * Alguns problemas de matematica para serem resolvidos, iremos fazer isso em java 
 * e também em C++
 */
class ListaUm{
    private static final Random random = new Random();


    public static void calcularInvestimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser investido: ");
        double valorInvestido = scanner.nextDouble();
        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJurosMensal = scanner.nextDouble() / 100;
        System.out.print("Digite o número de meses: ");
        int numeroMeses = scanner.nextInt();

        double valorTotal = valorInvestido * Math.pow(1 + taxaJurosMensal, numeroMeses);
        double jurosRendidos = valorTotal - valorInvestido;

        System.out.println("Valor total acumulado ao final do período: " + valorTotal);
        System.out.println("Valor de juros rendidos: " + jurosRendidos);

        // Simulação de investimentos em renda fixa e variável
        double taxaFixa = 0.005; // Exemplo de taxa de 0.5% ao mês para renda fixa
        double taxaVariavel = 0.02; // Exemplo de taxa de 2% ao mês para renda variável

        double valorFixa = valorInvestido * Math.pow(1 + taxaFixa, numeroMeses);
        double valorVariavel = valorInvestido * Math.pow(1 + taxaVariavel, numeroMeses);

        System.out.println("Valor acumulado em renda fixa (Tesouro direto, CDI, CDB): " + valorFixa);
        System.out.println("Valor acumulado em renda variável (Ações, FII, Cripto): " + valorVariavel);
    }

    public static void calcularSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o valor do salário mínimo: ");
        float salarioMinimo = scanner.nextFloat();

        float valorHoraTrabalhada = salarioMinimo / 10;
        float salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        float imposto = salarioBruto * 0.05f;
        float salarioReceber = salarioBruto - imposto;

        System.out.println("Salário a receber: " + salarioReceber);
    }

    public static void calcularIMC() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        float peso = scanner.nextFloat();
        System.out.print("Digite sua altura (m): ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        double tmb;
        if (sexo == 'M' || sexo == 'm') {
            tmb = 88.36 + (13.4 * peso) + (4.8 * (altura * 100)) - (5.7 * idade);
        } else {
            tmb = 447.6 + (9.2 * peso) + (3.1 * (altura * 100)) - (4.3 * idade);
        }
        System.out.println("Sua Taxa Metabólica Basal (TMB) é: " + tmb + " calorias/dia");

        System.out.println("Escolha seu objetivo:");
        System.out.println("1. Ganhar massa muscular");
        System.out.println("2. Emagrecer");
        int objetivo = scanner.nextInt();

        double caloriasDiarias;
        if (objetivo == 1) {
            caloriasDiarias = tmb + 500;
            System.out.println("Para ganhar massa muscular, você deve consumir " + caloriasDiarias + " calorias/dia");
        } else if (objetivo == 2) {
            caloriasDiarias = tmb - 500;
            System.out.println("Para emagrecer, você deve consumir " + caloriasDiarias + " calorias/dia");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void resolveProblemas() {

        // a) Perímetro correspondente para o retângulo do exercício anterior.
        float base = random.nextFloat() * 10; // base aleatória entre 0 e 10
        float height = random.nextFloat() * 10; // altura aleatória entre 0 e 10
        float perimeterRectangle = 2 * (base + height);
        System.out.println("O perímetro do retângulo com base " + base + " e altura " + height + " é: " + perimeterRectangle);

        // b) Perímetro de um quadrado de lado aleatório.
        int sideSquare = random.nextInt(10) + 1; // lado aleatório entre 1 e 10
        int perimeterSquare = 4 * sideSquare;
        System.out.println("O perímetro de um quadrado com lado " + sideSquare + " é: " + perimeterSquare);

        // c) Área de um quadrado de lado aleatório.
        int sideSquare7 = random.nextInt(10) + 1; // lado aleatório entre 1 e 10
        int areaSquare = sideSquare7 * sideSquare7;
        System.out.println("A área de um quadrado com lado " + sideSquare7 + " é: " + areaSquare);

        // d) Área de um círculo de raio aleatório.
        float radiusCircle1 = random.nextFloat() * 10; // raio aleatório entre 0 e 10
        double areaCircle1 = Math.PI * radiusCircle1 * radiusCircle1;
        System.out.println("A área de um círculo com raio " + radiusCircle1 + " é: " + areaCircle1);

        // e) Perímetro de um círculo de raio aleatório.
        float radiusCircle5 = random.nextFloat() * 10; // raio aleatório entre 0 e 10
        double perimeterCircle5 = 2 * Math.PI * radiusCircle5;
        System.out.println("O perímetro de um círculo com raio " + radiusCircle5 + " é: " + perimeterCircle5);
    }



    public static void main(String[] args) {
        //Menu para voce escolher qual atividade deseja consultar
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Exercicio 1");
            System.out.println("2. Exercicio 2");
            System.out.println("3. Exercicio 3");
            System.out.println("4. Exercicio 4");
            System.out.println("5. Exercicio 5");
            System.out.println("6. Exercicio 6");
            System.out.println("7. Exercicio 7");
            System.out.println("8. Exercicio 8");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
            case 1:
                //Começo da declaração de atributos do valor da base retangular	
                float base = (float) 3.5;
                //Começo da declaração de atributos do valor da altura retangular
                float altura = (float) 4.5;
                //Começo da declaração de atributos do valor da area retangular
                float area = base * altura;
                //Escrita na tela 
                System.out.println("A area do retangulo é: " + area);
                break;
            case 2:
                resolveProblemas();
                break;
            case 3:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("digite o número para n: ");
                int n = scanner1.nextInt();
                int n2 =+ 1 ;
                System.out.println("O valor de n é: " + n);
                scanner1.close();
                break;
            case 4:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("digite o número para nota 1: ");
                float nota1 = scanner2.nextFloat();
                System.out.println("digite o número para nota 2: ");
                float nota2 = scanner2.nextFloat();
                System.out.println("digite o número para nota 3: ");
                float nota3 = scanner2.nextFloat();
                System.out.println("Soma: " + (nota1 + nota2 + nota3));
                System.out.println("Média: " + (nota1 + nota2 + nota3) / 3);
                System.out.println("Produto: " + (nota1 * nota2 * nota3));
                scanner2.close();
                scanner.close();
                break;

            case 5:
                calcularIMC();
                break;

            case 6:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Digite o a temperatura em graus Celsius: ");
                float celsius = scanner3.nextFloat();
                float fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                scanner3.close();
                break;

            case 7:
                calcularSalario();
                break;

            case 8:
                calcularInvestimento();
                break;
                
            default:
                System.out.println("Invalid option. Please try again.");

            case 0:
                System.out.println("Exiting...");
                scanner.close();
                return;
            }
        }
    }
}