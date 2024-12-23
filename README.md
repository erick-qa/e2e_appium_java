# E2E Appium Test Automation

Este projeto contém testes de automação para um aplicativo móvel usando **Appium**, **JUnit 5** e **Allure** para relatórios.

## Tecnologias Utilizadas

- **Appium**: Ferramenta para automação de testes em dispositivos móveis.
- **JUnit 5**: Framework de testes utilizado para escrever e rodar os testes.
- **Maven**: Gerenciador de dependências e construção do projeto.
- **Allure**: Gerador de relatórios para testes.

## Requisitos

Antes de rodar os testes localmente, você precisa garantir que o ambiente esteja configurado corretamente:

- JDK 11 ou superior
- Maven
- Appium Server (com o Docker configurado para o Appium)

## Como Rodar os Testes Localmente

1. Clone o repositório:

   ```git clone https://github.com/erick-qa/e2e_appium_java

Instale as dependências:

`mvn install`

Rode os testes:

`mvn clean test`

GitHub Actions
Este repositório possui um workflow configurado no GitHub Actions para rodar os testes automaticamente. Quando um push ou pull request for feito na branch main, os testes serão executados automaticamente.


