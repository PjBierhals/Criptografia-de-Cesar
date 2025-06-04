# 🔐 Criptografia César em Java

Este é um projeto simples e didático de criptografia que implementa a **Cifra de César** em **Java**. Ideal para quem está aprendendo lógica de programação, vetores e manipulação de strings no Java.

---

## 📌 Sobre o Projeto

A **Cifra de César** é uma das técnicas mais antigas de criptografia. Neste projeto:

- Cada letra da mensagem é substituída por outra, deslocada por uma **letra-chave** no alfabeto.
- O espaço (`' '`) também é considerado como um caractere válido, totalizando **27 caracteres**.
- O programa permite **criptografar** e **descriptografar** frases.

---

## 🧠 Fórmulas utilizadas

- **Criptografar:**  
  `En(x) = (x + n) mod 27`

- **Descriptografar:**  
  `Dn(x) = (x - n) mod 27`

---

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio

##🛠️ Tecnologias
Java SE

Entrada e saída via Scanner

Vetores e manipulação de caracteres

##📁 Estrutura
alfabeto[]: Alfabeto de A-Z + espaço

letraChave: Letra base para o deslocamento

alfaAux[]: Frase original, caractere por caractere

numerosLetras[]: Posição numérica de cada letra

numerosLetrasEncriptados[]: Letras criptografadas (como números)

numerosLetrasDesencriptados[]: Letras restauradas


