# CONTROLE DE FLUXO

## ESTRUTURAS CONDICIONAIS

As estruturas condicionais em Java permitem que o programa tome decisões e execute diferentes blocos de código com base em condições específicas.

### 1. if

A estrutura `if` é usada para executar um bloco de código se uma condição específica for verdadeira.

```java
if (condicao) {
    // Bloco de código a ser executado se a condição for verdadeira
}
```

### 2. if-else

A estrutura if-else permite que o programa execute um bloco de código se a condição for verdadeira e outro bloco se a condição for falsa.

````java
if (condicao) {
    // Bloco de código a ser executado se a condição for verdadeira
} else {
    // Bloco de código a ser executado se a condição for falsa
}
````

### 3. if-else if-else

Quando há várias condições para verificar, a estrutura if-else if-else pode ser usada. Ela permite que você verifique múltiplas condições em sequência.

````java

if (condicao1) {
    // Bloco de código a ser executado se a condição1 for verdadeira
} else if (condicao2) {
    // Bloco de código a ser executado se a condição2 for verdadeira
} else {
    // Bloco de código a ser executado se nenhuma condição anterior for verdadeira
}
````

### 5. Operador Ternário

O operador ternário é uma forma compacta de escrever uma condição if-else. Ele avalia uma expressão e retorna um valor com base em uma condição.

````java
variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
````

### 4. switch

A estrutura switch é usada quando você deseja comparar uma variável com múltiplos valores possíveis e executar diferentes blocos de código com base no valor correspondente.

````java
switch (variavel) {
    case valor1:
        // Bloco de código a ser executado se variavel == valor1
        break;
    case valor2:
        // Bloco de código a ser executado se variavel == valor2
        break;
    // ...
    default:
        // Bloco de código a ser executado se nenhum dos casos anteriores for satisfeito
        break;
}
````

>[!NOTE] Notas sobre switch:
>
> O uso de break é importante para evitar a execução em cascata dos casos.
O bloco default é opcional, mas útil para tratar valores inesperados.
>[!WARNING]
Observe que a nível de sintaxe não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação em informar a palavra `break` em cada alternativa.

Porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme ilustração abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

* O sistema terá 03 planos: BASIC, MIDIA , TURBO
* BASIC: 100 minutos de ligação
* MIDIA: 100 minutos de ligação + Whats e Intagram grátis
* TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube

```java
// Modo condicional convencional
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
        }else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
            System.out.println("5Gb Youtube");
        }
    }
}

```

```java
// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
```

>[!WARNING]
Se optarem por usar **`switch`** / **`case`**, estudem um  pouco mais sobre os conceitos de **`continue`**, **`break`** e **`default`**

## ESTRUTURAS DE REPETIÇÃO

>Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.
https://diegomariano.com/lacos-de-repeticao-2/

Laços ou repetições são representados pelas seguintes estruturas:

* For (para)
* While (enquanto)
* Do While (faça enquanto)

### 1. for

A estrutura for é usada quando você sabe o número específico de vezes que deseja repetir um bloco de código.

```java
for (inicializacao; condicao; incremento) {
    // Bloco de código a ser executado
}
```

EXEMPLO:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i: " + i);
}
```

#### O que acontece

O for é composto de três partes:

1. **Inicialização**: int i = 0; - Executa uma vez no início do loop.
2. **Condição**: i < 5; - Verifica se a condição é verdadeira antes de cada iteração.
3. **Incremento**: i++; - Executa após cada iteração para atualizar o contador.

#### for-each

O for-each é usado para iterar sobre elementos de uma coleção (como arrays ou listas) sem a necessidade de um índice.

```java
// ExemploFor.java
public class ExemploFor {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

            //Forma abreviada
        for(String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
```

1. `String aluno : alunos` -> De forma abreviada é criada uma variável `nome` obtendo um elemento do vetor a cada ocorrência.
2. A impressão de cada aluno é realizada.

### break e continue

**Break** significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **`break`** interrompe o laço, já o **`continue`** interrompe somente a iteração atual.

### While

O laço **`while`** (na tradução literal para a língua portuguesa “enquanto”) determina que enquanto uma condição for válida, o bloco de código será executado. O laço **`while`** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe do controle de repetição **`while`** é exibida abaixo:

```
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
```

### Do While

O laço **`do / while`** (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto, **`do / while`** testa a condição após executar o código,sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição **`do / while`** é exibida abaixo:

```

//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);
```
