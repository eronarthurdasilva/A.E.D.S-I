#include <iostream>
#include <fstream>
#include <vector>
#include <ctime>
#include <locale.h>

using namespace std;

// Classe Data
class Data {
public:
    int dia;
    int mes;
    int ano;
    int hora;
    int minuto;

    Data() {
        time_t now = time(0);
        tm* localTime = localtime(&now);

        dia = localTime->tm_mday;
        mes = localTime->tm_mon + 1;
        ano = localTime->tm_year + 1900;
        hora = localTime->tm_hour;
        minuto = localTime->tm_min;
    }

    Data(int dia, int mes, int ano, int hora, int minuto) : dia(dia), mes(mes), ano(ano), hora(hora), minuto(minuto) {}
};

// Classe Cliente
class Cliente {
public:
    string cpf;
    string nome;
    Data dataCadastro;

    Cliente() {}

    Cliente(string cpf, string nome, Data dataCadastro) : cpf(cpf), nome(nome), dataCadastro(dataCadastro) {}
};

// Classe Veiculo
class Veiculo {
public:
    int codigo;
    string placa;
    string modelo;
    Data entrada;
    Data saida;
    float valorPago;
    Cliente* cliente;

    static int proximoCodigo;

    Veiculo(string placa, string modelo, Data entrada, Cliente* cliente) : placa(placa), modelo(modelo), entrada(entrada), cliente(cliente) {
        codigo = proximoCodigo++;
        saida = Data();
        valorPago = 0.0;
    }

    void registrarSaida() {
        saida = Data();
        valorPago = calcularValorPago();
    }

private:
    float calcularValorPago() {
        float horasEstacionado = calcularHorasEstacionado();
        return horasEstacionado * 1.0; // R$1 por hora estacionada
    }

    float calcularHorasEstacionado() {
        int minutosEntrada = entrada.hora * 60 + entrada.minuto;
        int minutosSaida = saida.hora * 60 + saida.minuto;
        int minutosTotal = minutosSaida - minutosEntrada;
        return minutosTotal / 60.0;
    }
};

int Veiculo::proximoCodigo = 1;

// Função para adicionar um cliente
void adicionarCliente(vector<Cliente>& clientes) {
    string cpf, nome;
    cout << "CPF do cliente: ";
    cin >> cpf;
    cout << "Nome do cliente: ";
    cin.ignore();
    getline(cin, nome);

    Data dataCadastro;
    Cliente cliente(cpf, nome, dataCadastro);
    clientes.push_back(cliente);

    cout << "Cliente adicionado com sucesso!" << endl;
}

// Função para pesquisar um cliente por CPF
void pesquisarClientePorCPF(const vector<Cliente>& clientes, const string& cpf) {
    for (const auto& cliente : clientes) {
        if (cliente.cpf == cpf) {
            cout << "CPF: " << cliente.cpf << endl;
            cout << "Nome: " << cliente.nome << endl;
            cout << "Data de Cadastro: " << cliente.dataCadastro.dia << "/" << cliente.dataCadastro.mes << "/" << cliente.dataCadastro.ano << endl;
            return;
        }
    }

    cout << "Cliente não encontrado." << endl;
}

// Função para pesquisar clientes por nome
void pesquisarClientesPorNome(const vector<Cliente>& clientes, const string& nome) {
    bool encontrou = false;
    for (const auto& cliente : clientes) {
        if (cliente.nome == nome) {
            cout << "CPF: " << cliente.cpf << endl;
            cout << "Nome: " << cliente.nome << endl;
            cout << "Data de Cadastro: " << cliente.dataCadastro.dia << "/" << cliente.dataCadastro.mes << "/" << cliente.dataCadastro.ano << endl;
            cout << "--------" << endl;
            encontrou = true;
        }
    }

    if (!encontrou) {
        cout << "Clientes não encontrados." << endl;
    }
}

// Função para excluir um cliente
void excluirCliente(vector<Cliente>& clientes, const string& cpf) {
    for (auto it = clientes.begin(); it != clientes.end(); ++it) {
        if (it->cpf == cpf) {
            clientes.erase(it);
            cout << "Cliente excluído com sucesso!" << endl;
            return;
        }
    }

    cout << "Cliente não encontrado." << endl;
}

// Função para registrar a entrada de um veículo
void registrarEntradaVeiculo(vector<Veiculo>& veiculos, const vector<Cliente>& clientes) {
    string placa, modelo, cpf;
    cout << "Placa do veículo: ";
    cin >> placa;
    cout << "Modelo do veículo: ";
    cin.ignore();
    getline(cin, modelo);
    cout << "CPF do cliente (ou deixe em branco): ";
    cin >> cpf;

    Cliente* cliente = nullptr;
    if (!cpf.empty()) {
        for (const auto& c : clientes) {
            if (c.cpf == cpf) {
                cliente = new Cliente(c);
                break;
            }
        }
    }

    Data entrada;
    Veiculo veiculo(placa, modelo, entrada, cliente);
    veiculos.push_back(veiculo);

    cout << "Veículo registrado com sucesso!" << endl;
}

// Função para registrar a saída de um veículo
void registrarSaidaVeiculo(vector<Veiculo>& veiculos) {
    string placa;
    cout << "Placa do veículo: ";
    cin >> placa;

    bool encontrado = false;
    for (auto& veiculo : veiculos) {
        if (veiculo.placa == placa && veiculo.saida.dia == 0) {
            veiculo.registrarSaida();
            encontrado = true;
            cout << "Saída registrada com sucesso!" << endl;
            break;
        }
    }

    if (!encontrado) {
        cout << "Veículo não encontrado ou já teve a saída registrada." << endl;
    }
}

// Função para gerar um arquivo com os veículos no estacionamento
void gerarArquivoVeiculos(const vector<Veiculo>& veiculos) {
    ofstream arquivo("veiculos.txt");
    if (arquivo.is_open()) {
        for (const auto& veiculo : veiculos) {
            if (veiculo.saida.dia == 0) {
                arquivo << "Código: " << veiculo.codigo << endl;
                arquivo << "Placa: " << veiculo.placa << endl;
                arquivo << "Modelo: " << veiculo.modelo << endl;
                arquivo << "Entrada: " << veiculo.entrada.dia << "/" << veiculo.entrada.mes << "/" << veiculo.entrada.ano << " " << veiculo.entrada.hora << ":" << veiculo.entrada.minuto << endl;
                arquivo << "--------" << endl;
            }
        }
        arquivo.close();
        cout << "Arquivo gerado com sucesso!" << endl;
    } else {
        cout << "Erro ao criar o arquivo." << endl;
    }
}

// Função para gerar um arquivo com o valor total pago pelos clientes em um determinado mês
void gerarArquivoValorTotal(const vector<Veiculo>& veiculos) {
    int mes;
    cout << "Informe o mês (1-12): ";
    cin >> mes;

    float valorTotal = 0.0;
    for (const auto& veiculo : veiculos) {
        if (veiculo.saida.mes == mes) {
            valorTotal += veiculo.valorPago;
        }
    }

    ofstream arquivo("valor_total.txt");
    if (arquivo.is_open()) {
        arquivo << "Valor total pago no mês " << mes << ": R$" << valorTotal << endl;
        arquivo.close();
        cout << "Arquivo gerado com sucesso!" << endl;
    } else {
        cout << "Erro ao criar o arquivo." << endl;
    }
}

int main() {
    vector<Cliente> clientes;
    vector<Veiculo> veiculos;
    setlocale(LC_ALL, "Portuguese");

    int opcao;
    while (true) {
        cout << "----- Menu -----" << endl;
        cout << "1. Adicionar Cliente" << endl;
        cout << "2. Pesquisar Cliente por CPF" << endl;
        cout << "3. Pesquisar Clientes por Nome" << endl;
        cout << "4. Excluir Cliente" << endl;
        cout << "5. Registrar Entrada de Veículo" << endl;
        cout << "6. Registrar Saída de Veículo" << endl;
        cout << "7. Gerar arquivo com os veículos no estacionamento" << endl;
        cout << "8. Gerar arquivo com o valor total pago pelos clientes em um mês" << endl;
        cout << "9. Sair" << endl;
        cout << "Opção: ";
        cin >> opcao;

        switch (opcao) {
            case 1:
                adicionarCliente(clientes);
                break;
            case 2: {
                string cpf;
                cout << "CPF do cliente: ";
                cin >> cpf;
                pesquisarClientePorCPF(clientes, cpf);
                break;
            }
            case 3: {
                string nome;
                cout << "Nome do cliente: ";
                cin.ignore();
                getline(cin, nome);
                pesquisarClientesPorNome(clientes, nome);
                break;
            }
            case 4: {
                string cpf;
                cout << "CPF do cliente: ";
                cin >> cpf;
                excluirCliente(clientes, cpf);
                break;
            }
            case 5:
                registrarEntradaVeiculo(veiculos, clientes);
                break;
            case 6:
                registrarSaidaVeiculo(veiculos);
                break;
            case 7:
                gerarArquivoVeiculos(veiculos);
                break;
            case 8:
                gerarArquivoValorTotal(veiculos);
                break;
            case 9:
                cout << "Saindo..." << endl;
                return 0;
            default:
                cout << "Opção inválida." << endl;
                break;
        }
    }

    return 0;
}
