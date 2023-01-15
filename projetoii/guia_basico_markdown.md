# Guia básico de Markdown

##### O que é Markdown?

Markdown Syntax é uma sintaxe usada para padronizar e facilitar formatação de texto na web, utilizada em aplicativos como Slack e GitHub.

##### Comandos Markdown
>O Markdown funciona como um conversor de texto para HTML: os caracteres não-alfabéticos são traduzidos como <b>, <i> e <a href>, etc. Já os textos sem formatação entram como parágrafo simples <p>.

**Titulação:** O símbolo usado para formatar um título em Markdown é a cequilha #. Na construção do título formate o código colocando uma cerquilha no inicio da linha, demarcando o cabeçalho.

Quando falamos de nível, falamos dos títulos convertidos para HTML. No HTML os níveis de títulos vão de 1 à 6, denotados pelas tags h1, h2, h3, h4, h5 e h6. A quantidade de cerquilhas que você utiliza no inicio da linha indica o nível do título, sendo assim, a formatação ### Meu título cria um cabeçalho de nível 3 e assim sucessivamente até o nível 6.

**Ênfase:**
1. Negrito: adicione dois asteriscos ** texto ** ou dois traços-baixos __ texto __ no início e no fim do conteúdo.
2. Itálico: adicione apenas um asterisco *texto* ou um traço-baixo _ texto _ no início e no fim do conteúdo.

**Links:**
1. Texto-âncora: utilize os caracteres [] (), adicionando entre chaves o texto que você quer que apareça, e entre os parênteses, o endereço de destino, no formato [exemplo] (https://exemplo.com/).
2. Link direto: envolva o endereço da web em chaves <>. O endereço ficará visível e será clicável pelo usuário. O endereço em forma de link direto tem o formato < https://exemplo.com/>.

**Listas de itens:** Para listas não ordenadas, utilize um asterisco * na frente to item da lista. Para listas ordenadas, utilize o número do item seguido de ponto .

**Imagens:** O código para inserir uma imagem no conteúdo é semelhante ao código de inserir links-âncora, adicionando um ponto de exclamação ! no início do código.

**Citação (Quote):** Para transformar um texto em uma citação ou comentário, semelhante ao código HTML <blockquote>, utilize o sinal > no início da linha que será formatada.

**Código (Code Highlight):**
1. Código em linha (inline): adicione um acento grave ˋ no início e no final do código.
2. Múltiplas linhas de código: envolva as linhas de código com três acentos graves ˋˋˋ ou três tils ~~~

**Tabela:** Escolha os títulos das colunas e use | para delimitar as colunas. Depois, utilize hífen - na segunda linha para indicar que acima estão os títulos das colunas, usando novamente o | para delimitar colunas.