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
   ```bash
   git clone https://github.com/usuario/repo.git
   cd repo
Instale as dependências:

bash
Copiar código
mvn install
Rode os testes:

bash
Copiar código
mvn clean test
Para gerar o relatório Allure:

bash
Copiar código
mvn allure:serve
GitHub Actions
Este repositório possui um workflow configurado no GitHub Actions para rodar os testes automaticamente. Quando um push ou pull request for feito na branch main, os testes serão executados automaticamente.

Como visualizar o relatório de testes no GitHub Actions:
Após a execução dos testes, você pode acessar o relatório Allure gerado nos artefatos do workflow.
