# 🧮 Calculadora em Java

Bem-vindo ao projeto **Calculadora em Java**! Este é um projeto simples que utiliza o padrão **MVC** (Model-View-Controller) e segue práticas de **TDD** (Test-Driven Development). 🚀

---

## ✨ Funcionalidades Atuais

- ✅ **Adição** de dois números.
- ✅ **Subtração** de dois números.
- 🚧 **Multiplicação** e **Divisão** (em desenvolvimento).
- 🚧 Tratamento de erros para divisão por zero.

---

## 🗂️ Arquitetura MVC

O projeto segue o padrão **MVC** para organizar o código:

- **View**: Responsável pela interação com o usuário (ex.: entrada e saída no console).
- **Controller**: Faz a ponte entre a View e o Model, processando as entradas e retornando os resultados.
- **Model**: Contém a lógica de negócios (ex.: operações matemáticas).

### 📊 Diagrama MVC

```plaintext
+------------------+       +----------------------+       +---------------------+
|  CalculatorView  |       | CalculatorController |       |     Calculator      |
|      View        | <-->  |      Controller      | <-->  |        Model        |
|   (Interface)    |       |       (Ponte)        |       | (Lógica de Negócio) |
+------------------+       +----------------------+       +---------------------+
```

### 📊 Diagrama de Classes

![Diagrama de Classes](assets/diagrama-classes.svg)


Para mais detalhes sobre o padrão **MVC**, confira este <a href="https://medium.com/@robson.trasel/desvendando-o-padr%C3%A3o-mvc-em-java-um-guia-did%C3%A1tico-com-exemplos-ca1ba487f5fb" target="_blank">artigo explicativo</a>. 📖


---
## 🧪 Como Rodar os Testes Unitários

1. Para executar os testes,  use o comando:
   ```bash
   mvn test
   ```
2. Os testes seguem os padrões **Given-When-Then** e **Arrange-Act-Assert**. Para mais informações, confira:  
   - <a href="https://www.youtube.com/watch?v=o_C_qxhPws4" target="_blank">TDD: O que é e como funciona</a>  
   - <a href="https://medium.com/@matheus.saraujo/testes-give-when-then-3bf3fef55f5e" target="_blank">Given-When-Then e Arrange-Act-Assert</a>

---
## 🚀 Evento para testar Função Lambda na AWS
Para testar a função Lambda na AWS, você pode usar o seguinte evento de teste JSON:

```json
{
  "operation": "add",
  "a": 5,
  "b": 3
}
```

---

## 🛠️ Próximos Passos

- 🔄 **Implementar**:
    - Multiplicação e divisão.
    - Tratamento de erro para divisão por zero.
- ✅ **Testes** para as novas funcionalidades.
- 📈 **Observabilidade**:
    - Integração com Datadog para monitoramento.

---

💡 **Dica**: Este projeto é uma ótima oportunidade para aprender sobre **MVC**, **TDD** e boas práticas de desenvolvimento em Java.  
😄   Fique à vontade para contribuir! Pull requests são bem-vindos. 