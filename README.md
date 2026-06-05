# Conta Bancária em Java

Projeto simples desenvolvido em Java para simular operações básicas de uma conta bancária através do terminal.

## Funcionalidades

O sistema permite:

- Consultar saldo atual
- Receber depósitos
- Realizar transferências
- Encerrar o programa

Além disso, o sistema realiza validações para impedir:

- Depósitos com valores negativos ou nulos
- Transferências com valores negativos ou nulos
- Transferências superiores ao saldo disponível
- Seleção de opções inexistentes no menu

## Tecnologias Utilizadas

- Java
- Scanner (entrada de dados)
- Estruturas de repetição (`while`)
- Estruturas de decisão (`if/else`)
- Estruturas de seleção (`switch`)

## Como Executar

### Compilar

```bash
javac src/Banco.java
```

### Executar

```bash
java -cp src Banco
```

## Exemplo de Uso

```text
Dados iniciais do cliente:

Nome:            Jeovane Peralez
Tipo conta:      Corrente
Saldo inicial:   R$ 2500,00

Operações:

1 - Consultar saldo atual
2 - Receber valor
3 - Transferir valor
4 - Sair

Digite a opção desejada:
```

## Conceitos Praticados

Este projeto foi desenvolvido com o objetivo de praticar:

- Variáveis e tipos primitivos
- Entrada e saída de dados
- Laços de repetição
- Estruturas condicionais
- Manipulação de valores monetários
- Lógica de programação

## Melhorias Futuras

- Cadastro dinâmico de clientes
- Histórico de transações
- Múltiplas contas bancárias
- Persistência de dados em arquivos
- Interface gráfica
- Integração com banco de dados

## Autor

Jeovane Da Silva
