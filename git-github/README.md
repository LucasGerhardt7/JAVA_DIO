# DIO | Git e Github
## Tipos de Sistemas de Controle de Versão (VCS)

- ### VCS Centralizado (CVCS)
    #### Pontos negativos ❌  
    - Caso o servidor saia do ar, não é possível criar versionamentos.
    - Se o servidor corromper os dados e não houver um backup, poderá perder o projeto.

- ### VCS Distribuído (DVCS)
  Contorna o problema do versionamento centralizado pois possui um backup local com cada usuário do repositório, sendo também possível a edição off-line, em caso de problemas de conexão com o servidor.
 
 

## Formas de obter Repositório Git na máquina 💻
- Transformando um diretório local num repositório Git (git Init)
- Clonando um repositório Git existente. (git clone)

## Clonar repositório alterando o nome: 
git clone {url} {novo_nome_repositorio}

##### Exemplo:

```shell
git clone https://github.com/exemplo/projeto-original.git meu-novo-repositorio
```

## Conectando a um repositório remoto:
git remote add origin {url}

```shell
git remote add origin https://github.com/exemplo/meu-novo-repositorio.git

```

## Verificando status dos arquivos:
```
git status
```

## Verificando log dos commits:
```
git log
```

## Git ignore:
O arquivo .gitignore nos da o direito de ignorar, como o nome sugere, um arquivo ou diretório na hora de fazer um commit. Para isso, basta digitar em seu interior o nome do arquivo/diretório a ser deixado de commitar. Para auxiliar o processo, podemos usar o comando “echo” do terminal, que nos possibilita inserir um texto no arquivo.

#### Escrever texto em um arquivo:
##### Terminal:
```shell
echo "Essa frase será adicionada ao arquivo" > arquivo.txt
```

#### Adicionar texto ao FINAL de um arquivo

```shell
echo "Esta frase será adicionada ao final" >> arquivo.txt
```

## Diretório Vazio:
O git **NÃO** reconhece diretórios vazios. 
Há uma convenção onde cria-se um arquivo chamado .gitkeep que pode ser utilizado quando se quer “commitar” um diretório vazio.
