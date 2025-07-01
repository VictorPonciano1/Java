# 📦 cliente-app

> Desenvolvido por: Victor Ponciano 👨‍💻

Aplicação Java simples para cadastro de clientes, desenvolvida com foco na **arquitetura hexagonal (Ports and Adapters)**. O projeto roda no console e armazena os dados em memória.

---

## 🚀 Funcionalidades

- Cadastrar cliente com nome e e-mail
- Armazenar clientes em memória
- Estrutura baseada em portas e adaptadores (hexagonal)

---

## 🧱 Arquitetura Hexagonal

```
cliente-app/
├── domain/            -> Núcleo da aplicação (regras e interfaces)
│   ├── model/         -> Entidades (ex: Cliente)
│   ├── ports/         -> Interfaces (ex: ClienteRepository)
│   └── usecases/      -> Casos de uso (ex: CadastrarCliente)
├── adapters/          -> Implementações concretas das interfaces
│   ├── in/            -> Entrada (ex: console)
│   └── out/           -> Saída (ex: repositório em memória)
└── application/       -> Configuração e ponto de entrada (Main)
```

---

## 🛠️ Tecnologias

- Java 11+
- Eclipse (ou qualquer IDE compatível com Java)
- Console (entrada e saída via `Scanner`)

---

## 📂 Estrutura de Pacotes

| Pacote               | Descrição |
|----------------------|-----------|
| `domain.model`       | Entidades do domínio (ex: `Cliente`) |
| `domain.ports`       | Interfaces (ex: `ClienteRepository`) |
| `domain.usecases`    | Casos de uso (ex: `CadastrarCliente`) |
| `adapters.in`        | Entrada de dados (ex: `ConsoleAdapter`) |
| `adapters.out`       | Saída de dados (ex: `ClienteRepositoryEmMemoria`) |
| `application`        | Configuração e classe `Main` |

---

## ▶️ Como Executar

1. Clone o repositório ou copie os arquivos.
2. Importe no Eclipse como um **Java Project**.
3. Crie os pacotes conforme o modelo acima.
4. Compile e execute a classe `application.Main`.
5. Use o console para cadastrar clientes.

---

## 💡 Possíveis Evoluções

- Criar interface gráfica com **Swing** ou **JavaFX**
- Transformar em uma **API REST** com **Spring Boot**
- Persistir dados em **banco de dados real** (ex: H2, PostgreSQL)
- Adicionar **validações**, **listagem** e **remoção** de clientes

---

## 🧠 Conceitos Aprendidos

- Separação de responsabilidades
- Inversão de dependência com interfaces
- Facilidade de testes e manutenção
- Princípios da **arquitetura hexagonal**

---

## 📄 Licença

Este projeto é de uso livre para fins de estudo e experimentação.

---