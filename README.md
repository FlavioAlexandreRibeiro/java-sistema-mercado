# 🛒 Sistema de Mercado

<img width="1774" height="887" alt="mercado" src="https://github.com/user-attachments/assets/8cb03681-3ac5-4fa1-b9dd-0d7fdad21091" />

---

## 📖 Sobre o projeto

Projeto desenvolvido em **Java** para gerenciamento de produtos, carrinho de compras e finalização de pedidos.

O **Sistema de Mercado** é uma aplicação desenvolvida em Java para simular as principais operações de um pequeno sistema de compras.

O programa permite visualizar produtos disponíveis, adicionar itens ao carrinho, consultar os produtos selecionados, calcular o valor total da compra e finalizar o pedido.

O projeto foi desenvolvido com foco na prática de **lógica de programação, arrays, métodos, estruturas de repetição e estruturas condicionais**.

---


## 🎯 Objetivo

Este projeto faz parte da minha jornada de estudos em **Java Backend**, sendo desenvolvido para consolidar fundamentos importantes da linguagem antes da evolução para projetos utilizando **Programação Orientada a Objetos (POO)** e **Spring Boot**.

O principal objetivo foi praticar a divisão do sistema em métodos com responsabilidades específicas, como:

```text
exibirMenu()
listarProdutos()
adicionarAoCarrinho()
visualizarCarrinho()
finalizarCompra()
calcularTotal()
limparCarrinho()
```

Essa organização ajuda a tornar o código mais legível, modular e fácil de manter.

---

## ✨ Funcionalidades

* 🛍️ Listagem de produtos disponíveis
* ➕ Adição de produtos ao carrinho
* 🔢 Definição da quantidade de cada produto
* 🛒 Visualização do carrinho
* 🧮 Cálculo de subtotal por produto
* 💰 Cálculo do valor total da compra
* ✅ Finalização da compra
* 🧹 Limpeza automática do carrinho após a compra
* 🔄 Menu interativo com execução contínua
* ⚠️ Validação de opções e quantidades

---

## 📂 Estrutura do Projeto

```text
SistemaDeMercado
│
├── SistemaDeMercado.java
├── images/
│   └── banner.png
└── README.md
```

---

## 🛍️ Produtos disponíveis

O sistema possui inicialmente três produtos:

| Código | Produto   |    Preço |
| -----: | --------- | -------: |
|      0 | 🍚 Arroz  | R$ 30,00 |
|      1 | 🫘 Feijão | R$ 15,00 |
|      2 | 🥛 Leite  |  R$ 5,00 |

---

## 📋 Menu do Sistema

```text
===== SISTEMA DE MERCADO =====

1 - Listar produtos
2 - Adicionar ao carrinho
3 - Ver carrinho
4 - Finalizar compra
5 - Sair
```

---

## 🔄 Fluxo da aplicação

```text
              SISTEMA DE MERCADO
                      │
                      ▼
               Exibir Menu
                      │
        ┌─────────────┼─────────────┐
        ▼             ▼             ▼
  Listar Produtos  Adicionar     Ver Carrinho
                      │
                      ▼
                Selecionar
                  Produto
                      │
                      ▼
                 Informar
                Quantidade
                      │
                      ▼
              Produto no Carrinho
                      │
                      ▼
              Calcular Subtotal
                      │
                      ▼
              Finalizar Compra
                      │
                      ▼
               Calcular Total
                      │
                      ▼
              Limpar Carrinho
```

---

## 🧮 Cálculo da compra

O subtotal de cada produto é calculado através da multiplicação da quantidade pelo preço:

```java
subtotal = quantidade * preco;
```

O valor total da compra é obtido somando os subtotais de todos os produtos selecionados.

```java
total += quantidadesCarrinho[i] * precosProdutos[i];
```

---

## ▶ Exemplo de execução

```text
===== SISTEMA DE MERCADO =====
1 - Listar produtos
2 - Adicionar ao carrinho
3 - Ver carrinho
4 - Finalizar compra
5 - Sair

Escolha uma opção: 1

=== PRODUTOS DISPONÍVEIS ===

0 - Arroz | R$ 30,00
1 - Feijão | R$ 15,00
2 - Leite | R$ 5,00
```

### Adicionando produtos

```text
Escolha uma opção: 2

Digite o código do produto: 0
Digite a quantidade: 2

Produto adicionado ao carrinho!
```

### Visualizando o carrinho

```text
Escolha uma opção: 3

=== CARRINHO ===

Arroz | Qtd: 2 | Subtotal: R$ 60,00
Feijão | Qtd: 1 | Subtotal: R$ 15,00

---------------------------
TOTAL: R$ 75,00
```

### Finalizando a compra

```text
Escolha uma opção: 4

=== COMPRA FINALIZADA ===

TOTAL A PAGAR: R$ 75,00

Obrigado pela compra!
```

---

## 📚 Conceitos praticados

* ☕ Java
* 📦 Arrays
* 🔢 Variáveis
* 🔄 Estrutura `do while`
* 🔀 Estrutura `switch`
* 🔀 Estruturas condicionais `if / else`
* 🔁 Estrutura `for`
* 🧩 Métodos
* 📥 Entrada de dados com `Scanner`
* 🧮 Operações matemáticas
* 🛒 Controle de carrinho
* 🧹 Manipulação de arrays
* 📋 Organização de código

---



## 📸 Preview

```text
=============================
      SISTEMA DE MERCADO
=============================

1 - Listar produtos
2 - Adicionar ao carrinho
3 - Ver carrinho
4 - Finalizar compra
5 - Sair

Escolha uma opção: 3

=== CARRINHO ===

Arroz | Qtd: 2 | Subtotal: R$ 60,00
Leite | Qtd: 3 | Subtotal: R$ 15,00

---------------------------
TOTAL: R$ 75,00
```


## 🛠️ Tecnologias utilizadas

* ☕ **Java 17**
* 💻 **IntelliJ IDEA**
* 🔧 **Git**
* 🐙 **GitHub**

---

---

## 🚀 Como executar

Clone o repositório:

```bash
git clone https://github.com/SEU_USUARIO/SistemaDeMercado.git
```

Entre na pasta:

```bash
cd SistemaDeMercado
```

Compile o projeto:

```bash
javac SistemaDeMercado.java
```

Execute:

```bash
java SistemaDeMercado
```

---

## 🔮 Possíveis melhorias futuras

Este projeto pode evoluir futuramente com:

* [ ] Cadastro de novos produtos
* [ ] Estoque de produtos
* [ ] Remoção de produtos do carrinho
* [ ] Atualização da quantidade
* [ ] Descontos e cupons
* [ ] Diferentes formas de pagamento
* [ ] Cadastro de clientes
* [ ] Persistência de dados
* [ ] Programação Orientada a Objetos
* [ ] Banco de dados
* [ ] API REST com Spring Boot

---

## 👨‍💻 Autor

**Flavio Alexandre Ribeiro**

Estudante de **Java e Desenvolvimento Backend**, com foco em construção de projetos práticos para consolidação dos fundamentos da linguagem e evolução para **Spring Boot e desenvolvimento de APIs REST**.

---

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório!
