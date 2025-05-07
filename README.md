# 🎯 Jogo de Adivinhação em Java

Este projeto é um simples **jogo de adivinhação** desenvolvido em Java, onde o usuário deve tentar adivinhar um número aleatório gerado pelo sistema entre 1 e 10. O jogo fornece dicas após cada tentativa, informando se o número correto é maior ou menor do que o informado.

---

## 📜 Sumário

- [🎯 Objetivo](#🎯-objetivo)
- [🚀 Tecnologias Utilizadas](#🚀-tecnologias-utilizadas)
- [📦 Como Executar](#📦-como-executar)
- [⚙️ Funcionamento do Sistema](#⚙️-funcionamento-do-sistema)
- [📈 Exemplos de Uso](#📈-exemplos-de-uso)
- [📌 Melhorias Futuras](#📌-melhorias-futuras)
- [👨‍💻 Autor](#👨‍💻-autor)

---

## 🎯 Objetivo

Criar um jogo simples que:

- Gere um número aleatório de 1 a 10.
- Solicite ao usuário que adivinhe esse número.
- Dê feedback se o número é maior ou menor que o correto.
- Finalize o jogo quando o usuário acertar, mostrando o total de tentativas.

---

## 🚀 Tecnologias Utilizadas

- [Java](https://www.oracle.com/java/) (versão 8 ou superior)
- `java.util.Scanner` – para entrada de dados do usuário
- `java.util.Random` – para geração do número aleatório

---

## 📦 Como Executar

1. **Clone o repositório:**

   ```bash
   git clone git@github.com:wesleyestraiz/game.git
   cd game


Compile o código:

javac Main.java


⚙️ Funcionamento do Sistema
O sistema gera um número aleatório entre 1 e 10.

O usuário insere um número via terminal.

O programa compara a entrada com o número sorteado:

Se for maior: informa que o número correto é menor.

Se for menor: informa que o número correto é maior.

Se estiver fora do intervalo (≤0 ou ≥11): avisa e pede nova tentativa.

O processo se repete até o número correto ser adivinhado.

Ao final, o sistema exibe a quantidade de tentativas realizadas.


📌 Melhorias Futuras
Adicionar contagem regressiva ou limite de tentativas.

Criar interface gráfica (GUI) com JavaFX ou Swing.

Permitir escolha do intervalo (ex: 1 a 100).

Registrar histórico de tentativas.

Adicionar testes automatizados.


👨‍💻 Autor
Desenvolvido por Wesley Estraiz

GitHub: @wesleyestraiz

