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
> ````java
>double salMedio = 1500; // abreviado
>String emails = "nome@gmail.com" // [plural] confuso, pois a variável só possui o valor de um único email
>````

#### Métodos

Os métodos deverão ser nomeados como **verbos**, através de uma mistura de letras minúsculas e maiúsculas. Em princípio, todas as letras que compõe o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

  >[!TIP] Exemplos sugeridos
  >```java
  >somar(int n1, int n2){}
  >abrirConexao(){}
  >concluirProcessamento(){}
  >findById(){}
  >´´´

  >[!CAUTION] calcularImprimir(){} 
  > O exemplo acima não está bom, pois não sabemos se o método calcula ou imprime.