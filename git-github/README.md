# DIO | Git e Github
### Tipos de Sistemas de Controle de Versão (VCS)

- ### VCS Centralizado (CVCS)
    #### Pontos negativos ❌  
    - Caso o servidor saia do ar, não é possível criar versionamentos.
    - Se o servidor corromper os dados e não houver um backup, poderá perder o projeto.

- ### VCS Distribuído (DVCS)
  Contorna o problema do versionamento centralizado pois possui um backup local com cada usuário do repositório, sendo também possível a edição off-line, em caso de problemas de conexão com o servidor.
 
## Prmeiros passos com Git e Github

### Formas de obter Repositório Git na máquina 💻
- Transformando um diretório local num repositório Git (git Init)
- Clonando um repositório Git existente. (git clone)

### Clonar repositório alterando o nome: 
git clone {url} {novo_nome_repositorio}

##### Exemplo:

```shell
git clone https://github.com/exemplo/projeto-original.git meu-novo-repositorio
```

### Conectando a um repositório remoto:
git remote add origin {url}

```shell
git remote add origin https://github.com/exemplo/meu-novo-repositorio.git

```

### Verificando status dos arquivos:
```
git status
```

### Verificando log dos commits:
```
git log
```

### Git ignore:
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

### Diretório Vazio:
O git **NÃO** reconhece diretórios vazios. 
Há uma convenção onde cria-se um arquivo chamado .gitkeep que pode ser utilizado quando se quer “commitar” um diretório vazio.

## Desfazendo alterações no repositório

### Remover versionamento da pasta
Caso tenha criado um repositório git na pasta errada e queira desfazer, basta excluir o diretório oculto .git/

Pode ser feito pelo terminal:
````
rm -rf .git
````
#### O que faz este comando?
##### rm -rf .git:

rm: Comando para remover arquivos ou diretórios.

-r: Opção que indica a remoção recursiva, ou seja, remove todos os arquivos e subdiretórios dentro do diretório especificado.

-f: Força a remoção sem perguntar por confirmações.

.git: Diretório oculto onde o Git armazena todos os dados e metadados do repositório.

#### Efeitos do comando:
Este comando remove o diretório .git e todo o seu conteúdo. Como o .git é o diretório que contém todas as informações de versionamento do Git, isso efetivamente "desfaz" o repositório Git, removendo todo o histórico de commits, branches, e outras informações de controle de versão. Após executar este comando, o diretório atual não será mais um repositório Git.

#### Uso Típico:
Você pode querer usar este comando se precisar desconectar um diretório de um repositório Git, transformando-o em um diretório simples sem controle de versão. Isso é útil, por exemplo, se você clonou um repositório apenas para usar os arquivos como base e não deseja manter o histórico do Git. 

### Restaurar arquivo 
 ````
git restore nome-do-arquivo
````
Este comando é usado para restaurar arquivos no repositório Git para o estado em que estavam em um commit anterior, ou para desfazer mudanças feitas nos arquivos na working directory (diretório de trabalho) que ainda não foram adicionadas ao stage (área de preparação).

Podemos usar este comando quando deseja descartar mudanças feitas em um arquivo específico e **retornar ao estado original que o arquivo tinha no último commit ou no último stage**. Isso é útil, por exemplo, quando você começou a modificar um arquivo mas decide que não quer mais aplicar essas mudanças.

### Modificando última mensagem do commit
````
git commit --amend -m "nova mensagem aqui"   
````
### Cuidado 🚨🚨
***O Git substituirá o commit mais recente pelo novo commit***

A opção --amend é frequentemente usada para corrigir a mensagem do commit ou adicionar novos arquivos que foram esquecidos no commit anterior. O commit anterior é substituído por um novo commit com a nova mensagem fornecida.

***Atenção:***  Como este comando reescreve o histórico de commits, ele deve ser usado com cuidado, especialmente em repositórios compartilhados. Se o commit já foi enviado para um repositório remoto, alterar o commit pode causar problemas de sincronização para outros colaboradores.

### Voltar para um commit anterior
````shell
# Resetar o HEAD para um commit específico
git reset <opções> <commit>
````
O comando git reset é uma poderosa ferramenta no Git usada para desfazer mudanças no histórico de commits ou na área de staging (área de preparação). Dependendo das opções usadas, ele pode alterar o ponteiro do HEAD para um commit específico, modificar a área de staging e até mesmo mudar o conteúdo do diretório de trabalho.

#### Parâmetros:
**commit:** Pode ser um identificador de commit (SHA-1 hash), uma referência como HEAD, HEAD~1, branch_name, ou um outro ponto do histórico.

#### Efeitos:
- **--soft:** Mantém as mudanças no diretório de trabalho e na área de staging.

- **--mixed (PADRÃO):** Mantém as mudanças no diretório de trabalho, mas remove-as da área de staging.

- **--hard:** Desfaz todas as mudanças no diretório de trabalho e na área de staging, sincronizando tudo com o commit especificado.

#### Atenção 🚨🚨
Usar git reset --hard pode resultar na perda de trabalho não salvo. Deve ser usado com cautela.
git reset altera o histórico de commits locais, portanto, não deve ser usado em branches compartilhados sem coordenação com outros desenvolvedores.

## Enviando e Baixando Alterações com o Repositório Remoto

