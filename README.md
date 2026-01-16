🇧🇷 [Versão em Português](README.pt-BR.md)

# 💱 Currency Converter in Java

![Java](https://img.shields.io/badge/Java-17+-orange)
![API](https://img.shields.io/badge/API-ExchangeRate-blue)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Alura](https://img.shields.io/badge/Alura-ONE%20Program-blueviolet)

![GitHub top language](https://img.shields.io/github/languages/top/Giscelmo/conversor-de-moedas)
![GitHub last commit](https://img.shields.io/github/last-commit/Giscelmo/conversor-de-moedas)
![GitHub repo size](https://img.shields.io/github/repo-size/Giscelmo/conversor-de-moedas)
![Platform](https://img.shields.io/badge/Platform-CLI-lightgrey)

---

This project is a **Currency Converter developed in Java**, created as part of the **ONE Program (Oracle Next Education)** in partnership with **Alura**.

The application runs via **command line interface (CLI)** and consumes an **external real-time exchange rate API**, allowing currency conversions and tracking a **conversion history with date and time**.

---

## 📌 Features

* Currency conversion:

    * USD ⇄ ARS
    * USD ⇄ BRL
    * USD ⇄ COP
* Interactive terminal menu
* Accepts decimal values with **comma or dot**
* Conversion history
* Date and time logging (Brazilian format)
* Real-time exchange rates via external API

---

## 🧱 Project Structure

```text
br.com.giscelmo
 ├── principal
 │   └── Principal.java          # User interaction and menu
 ├── service
 │   └── ConversorMoedasService  # API consumption
 ├── modelo
 │   └── ConversorMoedas         # Domain model
 └── dto
     └── ConversorMoedaDTO       # API response mapping
```

---

## 🚀 Technologies Used

* **Java 17+**
* **HttpClient (java.net.http)**
* **Gson**
* **java.time (LocalDateTime, DateTimeFormatter)**
* **ExchangeRate API**

---

## 🔗 API Used

* **ExchangeRate API**
* Endpoint format:

```
https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/{BASE}/{TARGET}/{AMOUNT}
```

---

## ▶️ How to Run the Project

1. Clone the repository:

```bash
  git clone https://github.com/Giscelmo/conversor-de-moedas.git
```

2. Open the project in your preferred IDE
   (IntelliJ IDEA, Eclipse, or VS Code)

3. Configure your API key in:

```
ConversorMoedasService.java
```

4. Run:

```
Principal.java
```

---

## 🖥 Example Output

```text
Welcome to the Currency Converter!

1) Dollar        =>> Brazilian Real
2) Brazilian Real =>> Dollar
7) History
8) Exit

Choose an option: 3
Enter the amount to convert: 10,5

[16/01/2026 09:33:58] Amount 10.50 [USD] equals 52.34 [BRL]
```

---

## 🕒 Conversion History

```text
[16/01/2026 09:33:58] Amount 10.50 [USD] equals 52.34 [BRL]
[16/01/2026 09:40:12] Amount 100.00 [BRL] equals 18.91 [USD]
```

---

## 🧠 Concepts and Best Practices

* Separation of concerns (domain, service, DTO)
* Proper use of `toString()`
* User input handling
* Modern `java.time` API
* Object-oriented design
* REST API consumption in Java

---

## 📈 Future Improvements

* Persist history to file or database
* Unit tests
* Use `enum` for currencies
* Graphical user interface (GUI)
* Internationalization (i18n)

---

## 👨‍💻 Author

**Giscelmo Costa**
🔗 GitHub: [https://github.com/Giscelmo](https://github.com/Giscelmo)
📦 Repository: [https://github.com/Giscelmo/conversor-de-moedas](https://github.com/Giscelmo/conversor-de-moedas)

Developed as part of the **ONE Program – Oracle Next Education**,
in partnership with **Alura**.

---

## 📄 License

This project was developed for educational purposes.
