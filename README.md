# Sistema de Mercado com Controle de Estoque

Projeto desenvolvido em Java como parte do Projeto Integrador (PI), com foco na refatoração de um sistema desktop para separação de responsabilidades e preparação para futura integração com sistema web.

## 🧾 Descrição do Projeto

O sistema tem como objetivo gerenciar produtos de um mercado, permitindo:
- Cadastro de produtos
- Consulta de produtos
- Atualização de produtos
- Exclusão de produtos
- Controle de estoque

Nesta etapa, o projeto foi refatorado para remover dependências da interface gráfica (Java Swing) e organizar o código em camadas bem definidas.

## 🛠️ Tecnologias Utilizadas
- Java
- MySQL
- JDBC
- NetBeans
- GitHub

## 🧱 Arquitetura do Projeto

O projeto segue uma arquitetura baseada no padrão MVC com camadas adicionais:

- **Model**: Representação das entidades do sistema
- **Repository**: Acesso a dados (MySQL)
- **Service**: Regras de negócio
- **Controller**: Controle do fluxo da aplicação
- **Util**: Utilitários, como a ConnectionFactory

## 📐 Princípios SOLID Aplicados

- **SRP (Single Responsibility Principle)**:  
Cada classe possui uma única responsabilidade, facilitando manutenção e reutilização do código.

## 🔄 Refatorações Realizadas

- Separação da lógica de negócio da interface gráfica
- Criação da classe ConnectionFactory para centralizar a conexão com o banco
- Eliminação de código duplicado
- Organização do projeto em camadas

## 🧪 Testes

Os testes foram realizados diretamente no método `main`, validando o cadastro e persistência dos produtos no banco de dados.

## 🚀 Como Executar

1. Clone o repositório
2. Crie o banco de dados `mercado_estoque` no MySQL
3. Crie a tabela `produto`
4. Configure usuário e senha no arquivo `ConnectionFactory`
5. Execute a classe `Main`

## 📂 Estrutura do Projeto

```
src/
 ├── controller
 ├── model
 ├── repository
 ├── service
 ├── util
 └── main
```

## 📌 Observações

Este projeto está preparado para futura migração para um sistema web, reaproveitando as regras de negócio já implementadas.
