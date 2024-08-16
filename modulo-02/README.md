# Resumo do módulo 2

## Anatomia das Classes 1

Toda classe deve estar dentro da pasta `src`

Nome da classe com a primeira letra de cada palavra em maiúsculo.

**Exemplo:**
MinhaClasse;
CarrosUsados;
MinhasComprasNaShopee

````java
public class MinhaClasse {
    
}
````

Se minha classe é executável, ou seja, tem capacidade de inicializar o projeto, ela precisa ter o método principal (main).

````java
public class MinhaClasse {
    public static void main(String[] args) {
        
    }
}
````

```java
// System é uma classe
System.out.print("Sejam bem-vindos");
```

## Anatomia das Classes 2

### Padrão de Nomenclatura

- Todo Arquivo deve começar em letra Maiúscula.
**Exemplo:**
MinhaClasse.java;
CarrosUsados.java;
MinhasComprasNaShopee.java.
- **Nome da Classe no arquivo:** A classe deve possuir o mesmo nome do arquivo.
- **Nome de variáveis:** As variáveis deverão ser escritas com letras minúsculas, caso seja nome composto, usar camelCase.

>[!IMPORTANT]
>Existe uma regra adicional para variáveis quando queremos identificar que ela não sofrerá alterações de valor, exemplo: queremos que a variável `br` receba o valor "brasil" e nunca será mudado. Neste caso declaramos a variável em MAIUSCULO.

````java
String BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIROS = 27;
int ANO_2000 = 2000;
````

Em conformidade com a idéia anterior, podemos adicionar a palavra reservada `final` para não permitir a mudança do valor da variável.

````java
final String BR = "Brasil";
final double PI = 3.14;
final int ESTADOS_BRASILEIROS = 27;
final int ANO_2000 = 2000;
````

>[!CAUTION]
>Para declarar uma variável, nós podemos utilizar caracteres,números e símbolos, porém, devemos seguir algumas regras da linguagem.
>
> - Deve conter apenas letras, _(underline), $ ou números de 0 a 9.
> - Deve obrigatóriamente se iniciar por uma letra, _ ou $, jamais número. (preferencialmente letra).
> - Deve iniciar com uma letra minúscula (boa pratica - ver abaixo).
> - Não pode conter espaços
> - Não podemos usar palavras-chave da linguagem.
> - O nome deve ser único dentro de um escopo.

`````java
// Declaração inválida de variáveis.

int numero&um = 1; // Só aceita o simbulo $
int 1numero = 1; // Não pode começar em número
int numero um = 1 // Não pode conter espaços
int long = 1; // Não pode ser uma palavra reservada
`````

## Anatomia das Classes 3

### Declarando variáveis e métodos

#### Declarando variáveis

````java
// Estrutura
Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; // observe que aqui a variável spike não tem valor, Dog é a Classe.
````

#### Declarando métodos

````java
// Estrutura
TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

// Exemplo

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
````

## Anatomia de Classes 4

### Identação

Basicamente, identar é um termo utilizado para escrever o código do programa de forma hierárquica.

>[!TIP] IDENTAÇÃO JAVA
No JAVA a identação não é fundamental para a compilação, sendo recomendada apenas por boa prática.

## Anatomia de Classes 5

### Organizando arquivos

A medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

#### Convenções de nome

Ao desenvolver um projeto, as empresas normalmente possúi uma finalidade `comercial`, `organizacional`, `open-source`

nesse sentido, poderemos ver como prefixo de um package os seguinte nomes:

- com.exemplo > comercial;
- org.exemplo > organizacional
- opensource.exemplo > open-source

Supondo o nome da empresa como `HyperTech` e o nome da aplicação como `notification`:

- `com.hypertech.notification.app`
- `com.hypertech.notification.model`
- `com.hypertech.notification.util`
- `com.hypertech.notification.service`

Supondo que vou organizar meus estudos:

- `edu.lucas.tema.logica`
- `edu.lucas.tema.controleFluxo`

ou então

- `edu.lucas.primeiraSemana`
- `edu.lucas.segundaSemana`

>[!NOTE] No VsCode
>
> 1. Crie uma pasta edu (dentro do `src`)
> 2. Crie uma pasta lucas (dentro de `edu`)
> 3. Crie uma pasta primeiraSemana (dentro de `lucas`)
>
> No arquivo adicionado na pasta primeiraSemana, deve conter uma declaração de `package` na primeira linha.
> Algo como:
>
> ````java
> package edu.lucas.segundaSemana;
>
>public class MinhaClasse {
>    
>}
>````

## Anatomia de Classes 6

### Java Beans

Uma das maiores dificuldades da programação é escrever algoritimos legíveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

#### Variáveis

- Uma variável deve ser **clara**, sem abreviações ou definições sem sentido;
- Uma variável é **sempre no singular**, exceto quando se tratar de um array ou coleção.
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.
  
>[!CAUTION]Não recomendado
>
> ````java
>double salMedio = 1500; // abreviado
>String emails = "nome@gmail.com" // [plural] confuso, pois a variável só possui o valor de um único email
>````

#### Métodos

Os métodos deverão ser nomeados como **verbos**, através de uma mistura de letras minúsculas e maiúsculas. Em princípio, todas as letras que compõe o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

  >[!TIP] Exemplos sugeridos
  >
  >```java
  >somar(int n1, int n2){}
  >abrirConexao(){}
  >concluirProcessamento(){}
  >findById(){}
  >´´´
  >[!CAUTION] calcularImprimir(){} 
  > O exemplo acima não está bom, pois não sabemos se o método calcula ou imprime.
  
## Tipos Primitivos

>[!NOTE] Os oito tipos primitivos em java são:
int, byte, short, long, float, double, boolean e char - esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (Memory stack).

| **Tipo**  | **Memória** | **Valor Mínimo**           | **Valor Máximo**            |
|-----------|-------------|----------------------------|-----------------------------|
| `byte`    | 8 bits      | -128                       | 127                         |
| `short`   | 16 bits     | -32.768                    | 32.767                      |
| `int`     | 32 bits     | -2^31 (-2.147.483.648)     | 2^31 - 1 (2.147.483.647)    |
| `long`    | 64 bits     | -2^63 (-9.223.372.036.854.775.808) | 2^63 - 1 (9.223.372.036.854.775.807) |
| `float`   | 32 bits     | ~-3.4 * 10^38              | ~3.4 * 10^38                |
| `double`  | 64 bits     | ~-1.7 * 10^308             | ~1.7 * 10^308               |
| `char`    | 16 bits     | '\u0000' (0)               | '\uffff' (65.535)           |
| `boolean` | 1 bit       | `false` (0)                | `true` (1)                  |
---

````java
// byte: Um número inteiro de 8 bits (1 byte). Valores vão de -128 a 127.
byte idade = 25;

// short: Um número inteiro de 16 bits (2 bytes). Valores vão de -32.768 a 32.767.
short ano = 2024;

// int: Um número inteiro de 32 bits (4 bytes). Valores vão de -2^31 a 2^31 - 1.
int populacao = 1_000_000;

// long: Um número inteiro de 64 bits (8 bytes). Valores vão de -2^63 a 2^63 - 1.
long distancia = 123_456_789L;

// float: Um número de ponto flutuante de precisão simples (32 bits). Utilizado para números decimais.
float preco = 19.99f;

// double: Um número de ponto flutuante de precisão dupla (64 bits). Utilizado para números decimais com maior precisão que float.
double pi = 3.14159;

// char: Um caractere de 16 bits. Representa um único caractere Unicode.
char letra = 'A';

// boolean: Um valor lógico que pode ser true (verdadeiro) ou false (falso).
boolean ativo = true;

````
>[!CAUTION] Long e Float
tipo `long` e `float` precisam ser terminado com sua letra inicial.
>
>- `long distancia = 123_456_789L;`
>
>- `float preco = 19.99f;`

Apesar de o tipo float ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente, com os computadores modernoss, se tornou desnecessário utilizar os tipos `short` e `byte`, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo `long`, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria da vezes utilizaremos `int` para inteiros e `float` para números fracionados.

>[!TIP] Curiosidade sobre o int
Mesmo que tenhamos 4 tipos inteiros, a maior parte das vezes usamos o int por conta da compatibilidade da JVM.
>
>Literais inteiros em Java, como 10, são automaticamente tratados como int pela JVM, a menos que especificado de outra forma com um sufixo L para long.
>
>Exemplo:
>
>```java
>int valor = 100; // Literal 100 é um int por padrão
>```
>
>*Um número literal é um valor numérico diretamente representado no código-fonte de um programa, sem a necessidade de ser calculado ou derivado de variáveis. Em outras palavras, é um valor numérico escrito explicitamente no código.*

### Números começando com zero

Em Java, um número inteiro que começa com 0 é interpretado como um literal octal (base 8), e isso pode causar comportamentos inesperados se você não estiver ciente disso.

Exemplos:
Literal octal:

````java
int numero = 012;  // 012 é um literal octal, equivalente a 10 em decimal
````

Nesse exemplo, 012 não é interpretado como 12 em decimal, mas sim como 10 porque 012 é um número octal. No sistema octal, 012 significa `1 * 8 + 2 = 10` em decimal.

**Problemas Potenciais:**
Se você pretende usar um número decimal que começa com 0, como 012, mas não quer que ele seja interpretado como octal, isso pode levar a resultados incorretos.

**Como Evitar:**
Para garantir que um número seja interpretado como decimal, basta não começar com 0. Se você precisa trabalhar com números que poderiam ser confundidos com octais, ou você deve remover o zero inicial, ou usar uma representação adequada.

**Nota sobre outros literais:**

- Números que começam com 0x ou 0X são interpretados como literais hexadecimais (base 16).

- Números que começam com 0b ou 0B são interpretados como literais binários (base 2).

Esses prefixos indicam diferentes bases numéricas, mas apenas o prefixo 0 sem uma letra é interpretado como octal.

### Tipagem

>[!CAUTION] Java é fortemente tipado
Veja o cenário abaixo:
>
>````java
>// Declaração e >inicialização de um short
>short numeroCurto = 1;
>
>// Conversão >implícita de short para int (permitido)
>int numeroNormal = numeroCurto;
>
>// Tentativa de >conversão de int para short (erro de compilação)
>short numeroCurto2 = numeroNormal;
>````

#### Explicação:

- **Conversão de `short` para `int`:**
A linha `int numeroNormal = numeroCurto;` está correta porque há uma promoção automática de tipos menores (`short`) para tipos maiores (`int`). Essa conversão é feita de forma implícita pela JVM, sem necessidade de casting, pois não há risco de perda de dados.

- **Conversão de `int` para `short`:**
A linha `short numeroCurto2 = numeroNormal;` gera um erro de compilação. Isso ocorre porque `int` tem um intervalo maior do que `short`, então essa conversão não é permitida implicitamente. Em Java, o tipo `int` pode armazenar valores que excedem a capacidade de um `short`. Portanto, ao tentar atribuir um `int` a um `short`, a conversão precisa ser feita explicitamente com casting para indicar ao compilador que você está ciente dos riscos de possível perda de dados.

#### Solução:

Para corrigir o problema, é necessário fazer um casting explícito de `int` para `short`:

```java
short numeroCurto2 = (short) numeroNormal;
```

#### Considerações:

- Casting explícito pode resultar em perda de dados se o valor de int exceder o intervalo que short pode armazenar (de -32.768 a 32.767).

- Sempre que converter tipos maiores para menores, verifique se o valor está dentro do intervalo do tipo menor para evitar resultados inesperados.
  
## Variáveis e constantes

### Variável

 Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

 No java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esa a causa do nome "variável", pois o valor pode variar.

````java
int numero = 27;
````

### Constante

 Já as constantes são valores armazenados em memória que não podem ser modificados depois de declarados. Em java, esses valores são representados pela palavra `final`, seguida do tipo.

 >[!TIP] Identificador
 Por convenção, constantes são sempre escritas em CAIXA_ALTA.

````java
final int ANO_NASCIMENTO = 1998;
````

## Operadores em Java

### Operadores Aritméticos

Os operadores aritméticos são usados para realizar operações matemáticas básicas, como adição, subtração, multiplicação, e divisão.

| Operador | Descrição             | Exemplo            |
|----------|-----------------------|--------------------|
| `+`      | Adição                | `a + b`            |
| `-`      | Subtração             | `a - b`            |
| `*`      | Multiplicação         | `a * b`            |
| `/`      | Divisão               | `a / b`            |
| `%`      | Módulo (Resto)        | `a % b`            |

>[!NOTE] CONCATENADOR
O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".

.

>[!WARNING] ATENÇÃO!
>A partir do momento em que é utilizado o (+) como concatenação, o java não reconhece mais como operador aritmético, apenas como concatenador.
>
>`Variavel = 1+1+1+"1"` = 31, sendo 3 da soma e concatenou o 1
>
>`Variavel = "1"+1+1+"1"` = 1111, sendo que concatenou todos os valores, pois após concatenar uma vez, não será mais possível fazer a conta.
>
>**Como burlar esse problema:**
>
> Utilizando parênteses para priorizar a conta antes de concatenar:
>
>`variavel = "1"+(1+1+1)` = 13, onde a soma foi feita primeiro e só depois foi concatenado.

### Operadores Unários

Os operadores unários realizam operações em apenas um operando. Eles incluem operações como incremento, decremento e mudança de sinal.

| Operador | Descrição                                 | Exemplo              |
|----------|-------------------------------------------|----------------------|
| `+`      | Indica valor positivo (normalmente implícito) | `+a`                 |
| `-`      | Negação do valor                          | `-a`                 |
| `++`     | Incremento (incrementa em 1)              | `a++` ou `++a`       |
| `--`     | Decremento (decrementa em 1)              | `a--` ou `--a`       |
| `!`      | Negação lógica (inverte valor booleano)   | `!true` (resulta em `false`) |

### Operadores Relacionais

Os operadores relacionais são usados para comparar dois valores e retornar um valor booleano (`true` ou `false`).

| Operador | Descrição              | Exemplo            |
|----------|------------------------|--------------------|
| `==`     | Igual a                | `a == b`           |
| `!=`     | Diferente de           | `a != b`           |
| `>`      | Maior que              | `a > b`            |
| `<`      | Menor que              | `a < b`            |
| `>=`     | Maior ou igual a       | `a >= b`           |
| `<=`     | Menor ou igual a       | `a <= b`           |

### Operadores Lógicos

Os operadores lógicos são usados para combinar duas ou mais expressões booleanas.

| Operador | Descrição              | Exemplo            |
|----------|------------------------|--------------------|
| `&&`     | E lógico (AND)         | `a && b`           |
| `\|\|`   | OU lógico (OR)         | `a \|\| b`         |
| `!`      | Negação lógica (NOT)   | `!a`               |

### Operador Ternário

O operador ternário é uma forma concisa de representar uma expressão condicional.

| Operador | Descrição                               | Exemplo                        |
|----------|-----------------------------------------|--------------------------------|
| `?:`     | Expressão condicional (if-else simplificado) | `condição ? valor1 : valor2` |

#### Exemplo de uso do operador ternário:

```java
int resultado = (a > b) ? a : b;

```

### Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis. O operador de atribuição mais básico é o `=`, mas existem versões combinadas com operadores aritméticos para facilitar a manipulação de valores.

| Operador | Descrição                                 | Exemplo            |
|----------|-------------------------------------------|--------------------|
| `=`      | Atribuição simples                        | `a = b`            |
| `+=`     | Atribuição com adição                     | `a += b` (equivale a `a = a + b`) |
| `-=`     | Atribuição com subtração                  | `a -= b` (equivale a `a = a - b`) |
| `*=`     | Atribuição com multiplicação              | `a *= b` (equivale a `a = a * b`) |
| `/=`     | Atribuição com divisão                    | `a /= b` (equivale a `a = a / b`) |
| `%=`     | Atribuição com módulo                     | `a %= b` (equivale a `a = a % b`) |

### Operadores Bitwise

Os operadores bitwise permitem manipular os bits individuais de um valor inteiro. Eles são frequentemente usados em operações de baixo nível, como na programação de sistemas embarcados.

| Operador | Descrição                                 | Exemplo            |
|----------|-------------------------------------------|--------------------|
| `&`      | E bit a bit (AND)                         | `a & b`            |
| `\|`      | OU bit a bit (OR)                         | `a \| b`            |
| `^`      | OU exclusivo bit a bit (XOR)              | `a ^ b`            |
| `~`      | Negação bit a bit (NOT)                   | `~a`               |
| `<<`     | Deslocamento de bits à esquerda           | `a << 2`           |
| `>>`     | Deslocamento de bits à direita            | `a >> 2`           |
| `>>>`    | Deslocamento de bits à direita sem sinal  | `a >>> 2`          |

### Operadores de Referência

Os operadores de referência são usados principalmente para manipular objetos e arrays em Java.

| Operador | Descrição                                 | Exemplo            |
|----------|-------------------------------------------|--------------------|
| `.`      | Acesso a membro de objeto                 | `objeto.metodo()`  |
| `[]`     | Acesso a elementos de array               | `array[0]`         |
| `instanceof` | Verifica se um objeto é uma instância de uma classe | `objeto instanceof Classe` |

#### Exemplo de uso de operadores de referência:

```java
String nome = "Java";
System.out.println(nome.length());  // Usa o operador `.` para acessar o método `length`
```
