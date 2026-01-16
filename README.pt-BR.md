🇺🇸 [English version](README.md)

# 💱 Conversor de Moedas em Java

![Java](https://img.shields.io/badge/Java-17+-orange)
![API](https://img.shields.io/badge/API-ExchangeRate-blue)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![Alura](https://img.shields.io/badge/Alura-Programa%20ONE-blueviolet)

![GitHub linguagem](https://img.shields.io/github/languages/top/Giscelmo/conversor-de-moedas)
![GitHub último commit](https://img.shields.io/github/last-commit/Giscelmo/conversor-de-moedas)
![GitHub tamanho do repo](https://img.shields.io/github/repo-size/Giscelmo/conversor-de-moedas)
![Plataforma](https://img.shields.io/badge/Plataforma-CLI-lightgrey)

---

Este projeto é um **Conversor de Moedas desenvolvido em Java**, criado como parte do **Programa ONE (Oracle Next Education)** em parceria com a **Alura**.

A aplicação funciona via **linha de comando (CLI)** e consome uma **API externa de câmbio em tempo real**, permitindo conversões entre diferentes moedas e um **histórico de conversões com data e hora**.

---

## 📌 Funcionalidades

* Conversão entre moedas:

    * USD ⇄ ARS
    * USD ⇄ BRL
    * USD ⇄ COP
* Menu interativo no terminal
* Aceita valores com **vírgula ou ponto**
* Histórico de conversões
* Registro de data e hora no formato brasileiro
* Consumo de API externa

---

## 🧱 Estrutura do Projeto

```text
br.com.giscelmo
 ├── principal
 │   └── Principal.java          # Interação com o usuário
 ├── service
 │   └── ConversorMoedasService  # Consumo da API
 ├── modelo
 │   └── ConversorMoedas         # Domínio
 └── dto
     └── ConversorMoedaDTO       # Mapeamento da resposta da API
```

---

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **HttpClient (java.net.http)**
* **Gson**
* **java.time**
* **ExchangeRate API**

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
  git clone https://github.com/Giscelmo/conversor-de-moedas.git
```

2. Abra em sua IDE de preferência

3. Configure a chave da API no arquivo:

```
ConversorMoedasService.java
```

4. Execute:

```
Principal.java
```

---

## 👨‍💻 Autor

**Giscelmo Costa**
🔗 GitHub: [https://github.com/Giscelmo](https://github.com/Giscelmo)
📦 Repositório: [https://github.com/Giscelmo/conversor-de-moedas](https://github.com/Giscelmo/conversor-de-moedas)

Projeto desenvolvido como parte do **Programa ONE – Oracle Next Education**,
em parceria com a **Alura**.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais.
