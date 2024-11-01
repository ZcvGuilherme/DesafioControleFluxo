#Trilha de Evolução BootCamp DIO

# Resolução do Desafio de Controle de Fluxo - Trilha Java Básico

Este repositório documenta minha solução para o desafio de controle de fluxo na trilha de Java básico da Digital Innovation One. A proposta foi explorar estruturas de decisão e repetição em Java para resolver problemas de controle de fluxo.

## Descrição do Desafio

O desafio consiste em implementar um contador que recebe dois parâmetros e exibe uma sequência numérica com base neles. Os requisitos do desafio incluem:

- Receber dois números como entrada.
- Validar se o primeiro número é menor que o segundo.
- Exibir uma contagem sequencial a partir do primeiro até o segundo número.
- Utilizar uma exceção personalizada para casos de erro.

## Solução

Na solução, implementei as seguintes funcionalidades:

1. **Entradas do Usuário:** Recebi dois números inteiros usando a classe `Scanner`.
2. **Validação de Parâmetros:** Verifiquei se o primeiro número é menor que o segundo usando uma exceção personalizada (`ParametrosInvalidosException`).
3. **Contador:** Implementei uma contagem sequencial usando um loop `for` que imprime os números na sequência definida pelos parâmetros.
