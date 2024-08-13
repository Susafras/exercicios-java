1 - Faça um programa que descubra qual é o animal, por meio de perguntas e respostas. Exemplo: É mamífero? Sim
É quadrúpede? Sim
É carnívoro? Não
É herbívoro? Sim
Então o animal escolhido é o cavalo
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean isMamifero;
boolean isQuadrupede;
boolean isCarnivoro;
boolean isHerbivoro;
System.out.println("É mamífero? (sim/não)");
isMamifero = scanner.nextLine().equalsIgnoreCase("sim");
if (isMamifero) {
System.out.println("É quadrúpede? (sim/não)");
isQuadrupede = scanner.nextLine().equalsIgnoreCase("sim");
if (isQuadrupede) {
System.out.println("É carnívoro? (sim/não)");
isCarnivoro = scanner.nextLine().equalsIgnoreCase("sim");
if (isCarnivoro) {
System.out.println("Então o animal escolhido é o leão");
} else {
System.out.println("É herbívoro? (sim/não)");
isHerbivoro = scanner.nextLine().equalsIgnoreCase("sim");
if (isHerbivoro) {
System.out.println("Então o animal escolhido é o cavalo");
} else {
System.out.println("O animal escolhido não foi identificado");
}
}
} else {
System.out.println("O animal escolhido não foi identificado");
}
} else {
System.out.println("O animal escolhido não foi identificado");
}
scanner.close();;
}
}

2 - Elabore um programa que leia a idade de um nadador classifique-o em uma das seguintes categorias, seu
programa deve fazer isso repetidamente até que o usuário digite um valor negativo para a idade, e ao sair,
imprima a mensagem "Tenha um bom dia!":
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
Scanner scanner = new Scanner(System.in);
int idade;
while (true) {
System.out.println("Digite a idade do nadador:");
idade = scanner.nextInt();
if (idade < 0) {
break;
} else if (idade >= 5 && idade <= 7) {
System.out.println("Categoria: Infantil A");
} else if (idade >= 8 && idade <= 11) {
System.out.println("Categoria: Infantil B");
} else if (idade >= 12 && idade <= 13) {
System.out.println("Categoria: Juvenil A");
} else if (idade >= 14 && idade <= 17) {
System.out.println("Categoria: Juvenil B");
} else if (idade >= 18) {
System.out.println("Categoria: Adultos");
} else {
System.out.println("Idade fora das categorias classificáveis.");
}
}
System.out.println("Tenha um bom dia!");
scanner.close();
}
}

3 - Faça um programa que conta quantas letras A existem em uma frase digitada pelo
usuário
Scanner scanner = new Scanner(System.in);
String frase;
int contadorA = 0;
System.out.println("Digite uma frase:");
frase = scanner.nextLine();
for (int i = 0; i < frase.length(); i++) {
if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a') {
contadorA++;
}
}
System.out.println("A quantidade de letras 'A' na frase é: " + contadorA);
scanner.close();
}
}

4 - Faça um programa que conta quantas vogais existem em uma palavra.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String palavra;
int contadorVogais = 0;
System.out.println("Digite uma palavra:");
palavra = scanner.nextLine();
for (int i = 0; i < palavra.length(); i++) {
char letra = Character.toLowerCase(palavra.charAt(i));
if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
contadorVogais++;
}
}
System.out.println("A quantidade de vogais na palavra é: " + contadorVogais);
scanner.close();
}
}

5 - Faça um programa que compara duas palavras e informa se são iguais ou não
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String palavra1;
String palavra2;
System.out.println("Digite a primeira palavra:");
palavra1 = scanner.nextLine();
System.out.println("Digite a segunda palavra:");
palavra2 = scanner.nextLine();
if (palavra1.equals(palavra2)) {
System.out.println("As palavras são iguais.");
} else {
System.out.println("As palavras são diferentes.");
}
scanner.close();
}
}

6 - Faça um programa que receba uma subpalavra e uma palavra e busque a subpalavra dentro da palavra,
se encontrar deverá retornar a posição em que encontrar a primeira letra, se não encontrar deverá imprimir
o valor -1
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String palavra;
String subpalavra;
int posicao;
System.out.println("Digite a palavra:");
palavra = scanner.nextLine();
System.out.println("Digite a subpalavra:");
subpalavra = scanner.nextLine();
posicao = palavra.indexOf(subpalavra);
if (posicao != -1) {
System.out.println("A subpalavra foi encontrada na posição: " + posicao);
} else {
System.out.println("-1");
}
scanner.close();
}
}

7 - Faça um programa que imprima somente as consoantes de uma palavra
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String palavra;
System.out.println("Digite uma palavra:");
palavra = scanner.nextLine();
System.out.print("As consoantes na palavra são: ");
for (int i = 0; i < palavra.length(); i++) {
char letra = Character.toLowerCase(palavra.charAt(i));
if (letra >= 'a' && letra <= 'z' && letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
System.out.print(palavra.charAt(i));
}
}
scanner.close();
}
}

8 - Faça um programa que imprima uma palavra digitada pelo usuário substituindo o A pelo 4, o B pelo 8, O
pelo 0 (zero) e o I pelo 1
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String palavra;
String palavraModificada;
System.out.println("Digite uma palavra:");
palavra = scanner.nextLine();
palavraModificada = palavra
.replace('A', '4')
.replace('a', '4')
.replace('B', '8')
.replace('b', '8')
.replace('O', '0')
.replace('o', '0')
.replace('I', '1')
.replace('i', '1');
System.out.println("Palavra modificada: " + palavraModificada);
scanner.close();
}
}

9 - Faça um programa que receba um numero de telefone e verifique se é de Goiás
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String telefone;
System.out.println("Digite o número de telefone (com DDD):");
telefone = scanner.nextLine();
if (telefone.startsWith("62") || telefone.startsWith("64")) {
System.out.println("O número de telefone é de Goiás.");
} else {
System.out.println("O número de telefone não é de Goiás.");
}
scanner.close();
}
}

10 - Faça um programa que receba um email e verifique se contem o @. Se não conter, informe que o email
está incorreto
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String email;
System.out.println("Digite o email:");
email = scanner.nextLine();
if (email.contains("@")) {
System.out.println("O email está correto.");
} else {
System.out.println("O email está incorreto.");
}
scanner.close();
}
}

11 - Faça uma programa que receba uma data inicial e uma data final e imprima todos os dias entre as duas
datas. Considere que o mês tem 30 dias.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println("Digite a data inicial (dd/MM/yyyy):");
String dataInicialStr = scanner.nextLine();
System.out.println("Digite a data final (dd/MM/yyyy):");
String dataFinalStr = scanner.nextLine();
LocalDate dataInicial = LocalDate.parse(dataInicialStr, formatter);
LocalDate dataFinal = LocalDate.parse(dataFinalStr, formatter);
if (dataFinal.isBefore(dataInicial)) {
System.out.println("A data final deve ser posterior à data inicial.");
} else {
LocalDate dataAtual = dataInicial;
while (!dataAtual.isAfter(dataFinal)) {
System.out.println(dataAtual.format(formatter));
dataAtual = dataAtual.plusDays(1);
}
}
scanner.close();
}
}

12 - Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que
receba o código e o valor da transação, perguntando ao usuário se deseja parar a execução a cada transação
informada, caso o usuário opte por interromper, devem ser impressas as informações:
a) O valor total das compras à vista
b) O valor total das compras a prazo
c) O valor total das compras efetuadas
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double totalAVista = 0.0;
double totalAPrazo = 0.0;
double totalGeral = 0.0;
while (true) {
System.out.println("Digite o código da transação (V para à vista, P para a prazo):");
String codigo = scanner.nextLine().trim().toUpperCase();
if (!codigo.equals("V") && !codigo.equals("P")) {
System.out.println("Código inválido. Por favor, digite 'V' ou 'P'.");
continue;
}
System.out.println("Digite o valor da transação:");
double valor = scanner.nextDouble();
scanner.nextLine(); // Consumir a nova linha após o valor
if (codigo.equals("V")) {
totalAVista += valor;
} else if (codigo.equals("P")) {
totalAPrazo += valor;
}
totalGeral += valor;
System.out.println("Deseja parar a execução? (sim/não):");
String resposta = scanner.nextLine().trim().toLowerCase();
if (resposta.equals("sim")) {
break;
}
}
System.out.println("Valor total das compras à vista: R$ " + String.format("%.2f", totalAVista));
System.out.println("Valor total das compras a prazo: R$ " + String.format("%.2f", totalAPrazo));
System.out.println("Valor total das compras efetuadas: R$ " + String.format("%.2f", totalGeral));
scanner.close();
}
}

13 - Faça um programa que leia uma string e a imprima em ordem inversa
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite uma string:");
String input = scanner.nextLine();
StringBuilder inversa = new StringBuilder(input);
inversa.reverse();
System.out.println("A string em ordem inversa é: " + inversa.toString());
scanner.close();
}
}

14 - Faça um programa que leia uma string e informe se ela é palíndromo. Ex. ovo, arara, ele
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite uma string:");
String input = scanner.nextLine();
String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
StringBuilder reverso = new StringBuilder(cleanedInput);
reverso.reverse();
if (cleanedInput.equals(reverso.toString())) {
System.out.println("A string é um palíndromo.");
} else {
System.out.println("A string não é um palíndromo.");
}
scanner.close();
}
}

15 - Faça um programa que leia as notas referentes às avaliações de um aluno, pode haver qualquer quanti
dade de avaliações, em seguida calcule e imprima a média semestral. Em seguida, faça com que seu
programa repita o processo para um número indeterminado de alunos.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (true) {
List<Double> notas = new ArrayList<>();
double somaNotas = 0.0;
int quantidadeNotas = 0;
String input;
System.out.println("Digite as notas do aluno (digite 'fim' para terminar):");
while (true) {
input = scanner.nextLine().trim();
if (input.equalsIgnoreCase("fim")) {
break;
}
try {
double nota = Double.parseDouble(input);
notas.add(nota);
somaNotas += nota;
quantidadeNotas++;
} catch (NumberFormatException e) {
System.out.println("Entrada inválida. Por favor, digite um número válido ou 'fim' para terminar.");
}
}
if (quantidadeNotas > 0) {
double media = somaNotas / quantidadeNotas;
System.out.println("A média semestral do aluno é: " + String.format("%.2f", media));
} else {
System.out.println("Nenhuma nota foi digitada.");
}
System.out.println("Deseja calcular a média de outro aluno? (sim/não):");
String resposta = scanner.nextLine().trim().toLowerCase();
if (resposta.equals("não")) {
break;
}
}
scanner.close();
}
}

16 - Faça um programa que receba o código do pedido e a quantidade, em seguida
deverá: a) Informar o total do pedido
b) Perguntar a forma de pagamento (dinheiro, cartão ou pix)
c) Se o pagamento for em dinheiro, o troco deverá ser calculado, se for pix, imprimir a chave 123456789. Se
for cartão, perguntar o número de parcelas (de 1 a 4 parcelas) e informar o valor de cada parcela O cardápio
de uma lanchonete é o seguinte:
Código Item preço
100 Cachorro quente 11,00
101 Bauru simples 5,30
102 Bauru c/ovo 6,50
103 Hamburger 21,10
104 Cheeseburger 22,30
105 Refrigerante 6,00
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Map<Integer, Double> cardapio = new HashMap<>();
cardapio.put(100, 11.00);
cardapio.put(101, 5.30);
cardapio.put(102, 6.50);
cardapio.put(103, 21.10);
cardapio.put(104, 22.30);
cardapio.put(105, 6.00);
while (true) {
System.out.println("Digite o código do pedido (ou '0' para sair):");
int codigo = scanner.nextInt();
if (codigo == 0) {
break;
}
if (!cardapio.containsKey(codigo)) {
System.out.println("Código inválido. Tente novamente.");
continue;
}
System.out.println("Digite a quantidade:");
int quantidade = scanner.nextInt();
double precoUnitario = cardapio.get(codigo);
double totalPedido = precoUnitario * quantidade;
System.out.printf("Total do pedido: R$ %.2f%n", totalPedido);
System.out.println("Forma de pagamento (dinheiro, cartão, pix):");
scanner.nextLine();
String pagamento = scanner.nextLine().trim().toLowerCase();
switch (pagamento) {
case "dinheiro":
System.out.println("Digite o valor recebido:");
double valorRecebido = scanner.nextDouble();
double troco = valorRecebido - totalPedido;
if (troco < 0) {
System.out.println("Valor recebido insuficiente.");
} else {
System.out.printf("Troco: R$ %.2f%n", troco);
}
break;
case "pix":
System.out.println("Chave PIX: 123456789");
break;
case "cartão":
System.out.println("Digite o número de parcelas (1 a 4):");
int parcelas = scanner.nextInt();
if (parcelas < 1 || parcelas > 4) {
System.out.println("Número de parcelas inválido. O valor deve ser entre 1 e 4.");
} else {
double valorParcela = totalPedido / parcelas;
System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
}
break;
default:
System.out.println("Forma de pagamento inválida. Tente novamente.");
break;
}
}
scanner.close();
}
}

17 - Faça com que o programado exercício anterior permita escolher qualquer quantidade de itens 18 - Faça
com que o programado exercício anterior apresente um menu prévio para o funcionário da lanchonete: 1
Registrar pedido
2 Informar total de vendas
3 Informar a maior venda do dia
3 Sair
Se registrar pedido for selecionado, o menu deve ser exibido e o pedido registrado conforme o exercício
anterior.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Map<Integer, Double> cardapio = new HashMap<>();
cardapio.put(100, 11.00);
cardapio.put(101, 5.30);
cardapio.put(102, 6.50);
cardapio.put(103, 21.10);
cardapio.put(104, 22.30);
cardapio.put(105, 6.00);
double totalVendas = 0.0;
double maiorVenda = 0.0;
while (true) {
System.out.println("Menu:");
System.out.println("1. Registrar pedido");
System.out.println("2. Informar total de vendas");
System.out.println("3. Informar a maior venda do dia");
System.out.println("4. Sair");
System.out.println("Escolha uma opção:");
int opcao = scanner.nextInt();
scanner.nextLine();
switch (opcao) {
case 1:
List<Double> pedidos = new ArrayList<>();
double totalPedido = 0.0;
while (true) {
System.out.println("Digite o código do pedido (ou '0' para finalizar o pedido):");
int codigo = scanner.nextInt();
scanner.nextLine();
if (codigo == 0) {
break;
}
if (!cardapio.containsKey(codigo)) {
System.out.println("Código inválido. Tente novamente.");
continue;
}
System.out.println("Digite a quantidade:");
int quantidade = scanner.nextInt();
scanner.nextLine();
double precoUnitario = cardapio.get(codigo);
double valorItem = precoUnitario * quantidade;
totalPedido += valorItem;
pedidos.add(valorItem);
}
System.out.printf("Total do pedido: R$ %.2f%n", totalPedido);
System.out.println("Forma de pagamento (dinheiro, cartão, pix):");
String pagamento = scanner.nextLine().trim().toLowerCase();
switch (pagamento) {
case "dinheiro":
System.out.println("Digite o valor recebido:");
double valorRecebido = scanner.nextDouble();
scanner.nextLine();
double troco = valorRecebido - totalPedido;
if (troco < 0) {
System.out.println("Valor recebido insuficiente.");
} else {
System.out.printf("Troco: R$ %.2f%n", troco);
}
break;
case "pix":
System.out.println("Chave PIX: 123456789");
break;
case "cartão":
System.out.println("Digite o número de parcelas (1 a 4):");
int parcelas = scanner.nextInt();
scanner.nextLine();
if (parcelas < 1 || parcelas > 4) {
System.out.println("Número de parcelas inválido. O valor deve ser entre 1 e 4.");
} else {
double valorParcela = totalPedido / parcelas;
System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
}
break;
default:
System.out.println("Forma de pagamento inválida. Tente novamente.");
break;
}
totalVendas += totalPedido;
if (totalPedido > maiorVenda) {
maiorVenda = totalPedido;
}
break;
case 2:
System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
break;
case 3:
System.out.printf("A maior venda do dia foi: R$ %.2f%n", maiorVenda);
break;
case 4:
System.out.println("Saindo...");
scanner.close();
return;
default:
System.out.println("Opção inválida. Tente novamente.");
break;
}
}
}
}

19 - Faça um programapara auxiliar o atendimento a clientes de um salão (ou se preferir, barbearia). Crie um
menu de serviços, permita ao funcionário selecionar o serviço, calcule o preço total a ser pago pelo
cliente etc.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Preços dos serviços
Map<Integer, Double> menuServiços = new HashMap<>();
menuServiços.put(1, 25.00); // Corte de cabelo
menuServiços.put(2, 15.00); // Lavagem
menuServiços.put(3, 30.00); // Barba
menuServiços.put(4, 20.00); // Sobrancelha
menuServiços.put(5, 50.00); // Pacote completo
while (true) {
System.out.println("Menu de Serviços:");
System.out.println("1. Corte de cabelo - R$ 25.00");
System.out.println("2. Lavagem - R$ 15.00");
System.out.println("3. Barba - R$ 30.00");
System.out.println("4. Sobrancelha - R$ 20.00");
System.out.println("5. Pacote completo - R$ 50.00");
System.out.println("0. Finalizar atendimento");
System.out.println("Escolha um serviço ou 0 para finalizar:");
int opcao = scanner.nextInt();
scanner.nextLine(); // Limpar o buffer do scanner
if (opcao == 0) {
break;
}
if (!menuServiços.containsKey(opcao)) {
System.out.println("Serviço inválido. Tente novamente.");
continue;
}
double preço = menuServiços.get(opcao);
System.out.println("Digite a quantidade do serviço selecionado:");
int quantidade = scanner.nextInt();
scanner.nextLine(); // Limpar o buffer do scanner
double total = preço * quantidade;
System.out.printf("Serviço selecionado: %d\n", opcao);
System.out.printf("Preço unitário: R$ %.2f\n", preço);
System.out.printf("Quantidade: %d\n", quantidade);
System.out.printf("Total do serviço: R$ %.2f\n", total);
System.out.println("Deseja adicionar outro serviço? (sim/não):");
String resposta = scanner.nextLine().trim().toLowerCase();
if (resposta.equals("não")) {
break;
}
}
System.out.println("Finalizando o atendimento...");
scanner.close();
}
}

20 - Faça um programa que leia um vetor de 10 posições e, em seguida, leia também dois valores X e Y
quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos
valores encontrados nas respectivas posições X e Y .
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] vetor = new int[10];
// Lê os valores para o vetor
System.out.println("Digite 10 números para preencher o vetor:");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: ", i);
vetor[i] = scanner.nextInt();
}
// Lê os valores X e Y correspondentes às posições no vetor
System.out.println("Digite a posição X (entre 0 e 9):");
int x = scanner.nextInt();
System.out.println("Digite a posição Y (entre 0 e 9):");
int y = scanner.nextInt();
// Verifica se as posições X e Y estão dentro dos limites do vetor
if (x < 0 || x >= 10 || y < 0 || y >= 10) {
System.out.println("Posições inválidas. As posições devem estar entre 0 e 9.");
} else {
// Calcula a soma dos valores nas posições X e Y
int soma = vetor[x] + vetor[y];
System.out.printf("A soma dos valores nas posições %d e %d é: %d%n", x, y, soma);
}
scanner.close();
}
}

21 - Faça um programa que leia um vetor de 10 posições e atribua valor 0 para todos os elementos que
possuírem valores negativos, imprimindo o vetor em seguida
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] vetor = new int[10];
System.out.println("Digite 10 números para preencher o vetor:");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: ", i);
vetor[i] = scanner.nextInt();
}
for (int i = 0; i < 10; i++) {
if (vetor[i] < 0) {
vetor[i] = 0;
}
}
System.out.println("Vetor modificado:");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: %d%n", i, vetor[i]);
}
scanner.close();
}
}

22 - Faça um programa que receba do usuário dois vetores, A e B, com 10 números inteiros cada. Crie um
novo vetor denominado C calculando C = A - B. Mostre na tela os dados do vetor C 23 - Faça um programa
que receba uma sequencia numérica qualquer. A entrada dessa sequencia deverá ser interrompida quando o
valor zero for inserido. Então deverá ser exibido:
a) a quantidade de números maiores que zero
b) a quantidade de números menores que zero
c) o maior número
d) o menor número
e) todos os números em ordem inversa da entrada
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] vetorA = new int[10];
int[] vetorB = new int[10];
int[] vetorC = new int[10];
System.out.println("Digite 10 números para o vetor A:");
for (int i = 0; i < 10; i++) {
System.out.printf("Vetor A - Posição %d: ", i);
vetorA[i] = scanner.nextInt();
}
System.out.println("Digite 10 números para o vetor B:");
for (int i = 0; i < 10; i++) {
System.out.printf("Vetor B - Posição %d: ", i);
vetorB[i] = scanner.nextInt();
}
for (int i = 0; i < 10; i++) {
vetorC[i] = vetorA[i] - vetorB[i];
}
System.out.println("Vetor C (A - B):");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: %d%n", i, vetorC[i]);
}
int quantidadeMaiores = 0;
int quantidadeMenores = 0;
int maior = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;
StringBuilder inversa = new StringBuilder();
System.out.println("Digite uma sequência numérica (zero para terminar):");
while (true) {
int numero = scanner.nextInt();
if (numero == 0) {
break;
}
if (numero > 0) {
quantidadeMaiores++;
} else if (numero < 0) {
quantidadeMenores++;
}
if (numero > maior) {
maior = numero;
}
if (numero < menor) {
menor = numero;
}
inversa.insert(0, numero + " ");
}
System.out.printf("a) Quantidade de números maiores que zero: %d%n", quantidadeMaiores);
System.out.printf("b) Quantidade de números menores que zero: %d%n", quantidadeMenores);
System.out.printf("c) Maior número: %d%n", maior);
System.out.printf("d) Menor número: %d%n", menor);
System.out.println("e) Sequência em ordem inversa: " + inversa.toString().trim());
scanner.close();
}
}

24 - Faça um programa que leia um vetor de 10 números. Leia um número x. Conte os múltiplos de um
número inteiro x, e imprima o total.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] vetor = new int[10];
int contador = 0;
System.out.println("Digite 10 números para preencher o vetor:");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: ", i);
vetor[i] = scanner.nextInt();
}
System.out.println("Digite um número x:");
int x = scanner.nextInt();
for (int i = 0; i < 10; i++) {
if (vetor[i] % x == 0) {
contador++;
}
}
System.out.printf("O total de múltiplos de %d no vetor é: %d%n", x, contador);
scanner.close();
}
}

25 - Faça um programa que armazene números digitados pelo usuário e em seguida calcule o somatório da
raiz quadrada dos números
Scanner scanner = new Scanner(System.in);
ArrayList<Double> numeros = new ArrayList<>();
double somaRaizes = 0;
System.out.println("Digite números para armazenar (digite um número negativo para parar):");
while (true) {
double numero = scanner.nextDouble();
if (numero < 0) {
break;
}
numeros.add(numero);
}
for (double numero : numeros) {
somaRaizes += Math.sqrt(numero);
}
System.out.printf("O somatório das raízes quadradas dos números é: %.2f%n", somaRaizes);
scanner.close();
}
}

26 - Faça um programa que guarde números em um vetor e imprima somente aqueles que forem divisíveis por
um valor informado pelo usuário
Scanner scanner = new Scanner(System.in);
int[] numeros = new int[10];
System.out.println("Digite 10 números para preencher o vetor:");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: ", i);
numeros[i] = scanner.nextInt();
}
System.out.println("Digite um valor para verificar os divisíveis:");
int x = scanner.nextInt();
System.out.println("Números divisíveis por " + x + ":");
for (int i = 0; i < 10; i++) {
if (numeros[i] % x == 0) {
System.out.println(numeros[i]);
}
}
scanner.close();
}
}

27 - Faça um programa que armazene as temperaturas máximas e mínimas de cada mês ao longo do ano, em
seguida:
a. Informe o mês mais quente
b. Informe o mês mais frio
c. Informe o mês com temperatura mais estável
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double[] temperaturasMaximas = new double[12];
double[] temperaturasMinimas = new double[12];
String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
"Outubro", "Novembro", "Dezembro"};
for (int i = 0; i < 12; i++) {
System.out.printf("Digite a temperatura máxima de %s: ", meses[i]);
temperaturasMaximas[i] = scanner.nextDouble();
System.out.printf("Digite a temperatura mínima de %s: ", meses[i]);
temperaturasMinimas[i] = scanner.nextDouble();
}
int mesMaisQuente = 0;
int mesMaisFrio = 0;
int mesMaisEstavel = 0;
double menorDiferenca = Double.MAX_VALUE;
for (int i = 0; i < 12; i++) {
if (temperaturasMaximas[i] > temperaturasMaximas[mesMaisQuente]) {
mesMaisQuente = i;
}
if (temperaturasMinimas[i] < temperaturasMinimas[mesMaisFrio]) {
mesMaisFrio = i;
}
double diferenca = temperaturasMaximas[i] - temperaturasMinimas[i];
if (diferenca < menorDiferenca) {
menorDiferenca = diferenca;
mesMaisEstavel = i;
}
}
System.out.println("Mês mais quente: " + meses[mesMaisQuente] + " com temperatura máxima de " +
temperaturasMaximas[mesMaisQuente] + "°C");
System.out.println("Mês mais frio: " + meses[mesMaisFrio] + " com temperatura mínima de " +
temperaturasMinimas[mesMaisFrio] + "°C");
System.out.println("Mês com temperatura mais estável: " + meses[mesMaisEstavel] + " com diferença de
" + menorDiferenca + "°C entre máxima e mínima");
scanner.close();
}
}

28 - Fazer um programa para ler 10 valores e, em seguida, mostrar a posição onde se encontram maior e o
menor valor.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] valores = new int[10];
System.out.println("Digite 10 valores:");
for (int i = 0; i < 10; i++) {
System.out.printf("Valor %d: ", i);
valores[i] = scanner.nextInt();
}
int maior = valores[0];
int menor = valores[0];
int posicaoMaior = 0;
int posicaoMenor = 0;
for (int i = 1; i < 10; i++) {
if (valores[i] > maior) {
maior = valores[i];
posicaoMaior = i;
}
if (valores[i] < menor) {
menor = valores[i];
posicaoMenor = i;
}
}
System.out.printf("O maior valor é %d e está na posição %d.%n", maior, posicaoMaior);
System.out.printf("O menor valor é %d e está na posição %d.%n", menor, posicaoMenor);
scanner.close();
}
}

29 - Faça um programa que leia dois vetores de 10 posições e calcule outro vetor contendo: nas posi ções
pares os valores do primeiro e nas posições ímpares os valores do segundo. 30 - Ler dois conjuntos de
números reais contendo 5 elementos cada, armazenando-os em vetores e calcular o produto escalar entre
eles. Imprimir os dois conjuntos e o produto escalar, sendo que o produto escalar é dado por:
p = x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] vetor1 = new int[10];
int[] vetor2 = new int[10];
int[] vetorResultado = new int[10];
System.out.println("Digite 10 valores para o primeiro vetor:");
for (int i = 0; i < 10; i++) {
System.out.printf("Vetor 1 - Posição %d: ", i);
vetor1[i] = scanner.nextInt();
}
System.out.println("Digite 10 valores para o segundo vetor:");
for (int i = 0; i < 10; i++) {
System.out.printf("Vetor 2 - Posição %d: ", i);
vetor2[i] = scanner.nextInt();
}
for (int i = 0; i < 10; i++) {
if (i % 2 == 0) {
vetorResultado[i] = vetor1[i];
} else {
vetorResultado[i] = vetor2[i];
}
}
System.out.println("Vetor resultado:");
for (int i = 0; i < 10; i++) {
System.out.printf("Posição %d: %d%n", i, vetorResultado[i]);
}
scanner.close();
}
}

31 - Faça um programa que calcule o desvio padrão de um vetor v contendo n = 10 números, onde m é a
media do vetor
Desvio
=
vuu
t1
n − 1
X
n
i=1
(v[i] −
m)
2
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
final int n = 10;
double[] vetor = new double[n];
double soma = 0;
double media;
double somaQuadrados = 0;
double desvioPadrao;
System.out.println("Digite 10 valores:");
for (int i = 0; i < n; i++) {
System.out.printf("Valor %d: ", i);
vetor[i] = scanner.nextDouble();
soma += vetor[i];
}
media = soma / n;
for (int i = 0; i < n; i++) {
somaQuadrados += Math.pow(vetor[i] - media, 2);
}
desvioPadrao = Math.sqrt(somaQuadrados / (n - 1));
System.out.printf("A média dos valores é: %.2f%n", media);
System.out.printf("O desvio padrão é: %.2f%n", desvioPadrao);
scanner.close();
}
}

32 - Faça um programa que leia um vetor de 15 posições e o compacte, ou seja, elimine as posições com
valor zero. Para isso, todos os elementos à frente do valor zero, devem ser movidos uma posição para
trás no vetor.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
final int tamanhoOriginal = 15;
int[] vetor = new int[tamanhoOriginal];
int[] vetorCompactado = new int[tamanhoOriginal];
int tamanhoCompactado = 0;
System.out.println("Digite 15 valores:");
for (int i = 0; i < tamanhoOriginal; i++) {
System.out.printf("Valor %d: ", i);
vetor[i] = scanner.nextInt();
}
for (int i = 0; i < tamanhoOriginal; i++) {
if (vetor[i] != 0) {
vetorCompactado[tamanhoCompactado] = vetor[i];
tamanhoCompactado++;
}
}
System.out.println("Vetor compactado:");
for (int i = 0; i < tamanhoCompactado; i++) {
System.out.printf("Posição %d: %d%n", i, vetorCompactado[i]);
}
scanner.close();
}
}

33 - Faça um programa que receba 10 valores e os imprima em ordem crescente. 34 - Uma sentença é
chamada de dançante se sua primeira letra for maiúscula e cada letra subsequente for o oposto da letra
anterior. Por exemplo, "A b Cd"é uma sentença dançante. Faça um programa que transforme a sentença de
entrada em uma sentença dançante.
Observe que todos os espaços da sentença original deverão ser preservados, ou seja, “ sent ence” deverá ser
convertido para “ SeNt EnCe”.
Scanner scanner = new Scanner(System.in);
int[] valores = new int[10];
System.out.println("Digite 10 valores:");
for (int i = 0; i < 10; i++) {
System.out.printf("Valor %d: ", i);
valores[i] = scanner.nextInt();
}
Arrays.sort(valores);
System.out.println("Valores em ordem crescente:");
for (int i = 0; i < 10; i++) {
System.out.printf("Valor %d: %d%n", i, valores[i]);
}
scanner.close();
}
}

35 - Faça um programa que leia um vetor de 10 posições e verifique se existem valores iguais e os escreva na
tela, caso haja.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
final int tamanho = 10;
int[] vetor = new int[tamanho];
Set<Integer> valores = new HashSet<>();
Set<Integer> valoresDuplicados = new HashSet<>();
System.out.println("Digite 10 valores:");
for (int i = 0; i < tamanho; i++) {
System.out.printf("Valor %d: ", i);
vetor[i] = scanner.nextInt();
}
for (int i = 0; i < tamanho; i++) {
if (!valores.add(vetor[i])) {
valoresDuplicados.add(vetor[i]);
}
}
if (valoresDuplicados.isEmpty()) {
System.out.println("Não há valores iguais no vetor.");
} else {
System.out.println("Valores iguais encontrados:");
for (int valor : valoresDuplicados) {
System.out.println(valor);
}
}
scanner.close();
}
}

36 - Faça um verificador de tautogramas - frases em que todas as palavras começam com a mesma letra Por
exemplo, as seguintes sentenças são tautogramas:
Flowers Flourish from France
Sam Simmonds speaks softly
Peter pIckEd pePPers
truly tautograms triumph
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite uma frase para verificar se é um tautograma:");
String frase = scanner.nextLine();
boolean éTautograma = verificarTautograma(frase);
if (éTautograma) {
System.out.println("A frase é um tautograma.");
} else {
System.out.println("A frase não é um tautograma.");
}
scanner.close();
}
public static boolean verificarTautograma(String frase) {
String[] palavras = frase.split("\\s+");
if (palavras.length == 0) {
return false;
}
char primeiraLetra = Character.toLowerCase(palavras[0].charAt(0));
for (String palavra : palavras) {
if (palavra.isEmpty()) {
continue;
}
char letraAtual = Character.toLowerCase(palavra.charAt(0));
if (letraAtual != primeiraLetra) {
return false;
}
}
return true;
}
}

37 - Faça um programa que crie uma matriz 4x4 de inteiros, que o usuário deverá preencher, em seguida: a)
Imprima o maior valor
b) Imprima o menor valor
c) Imprima a média dos valores
d) Imprima a matriz na tela
e) Imprima a diagonal principal
f) Imprima os elementos acima da diagonal principal
g) Imprima os elementos abaixo da diagonal secundária
h) Imprima a matriz transposta
Na transposta a primeira linha se torna a primeira coluna, a segunda linha se torna a segunda coluna e
assim por diante.
Scanner scanner = new Scanner(System.in);
final int tamanho = 4;
int[][] matriz = new int[tamanho][tamanho];
int maior = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;
int soma = 0;
System.out.println("Preencha a matriz 4x4:");
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
System.out.printf("Elemento [%d][%d]: ", i, j);
matriz[i][j] = scanner.nextInt();
if (matriz[i][j] > maior) maior = matriz[i][j];
if (matriz[i][j] < menor) menor = matriz[i][j];
soma += matriz[i][j];
}
}
double media = (double) soma / (tamanho * tamanho);
System.out.println("Maior valor: " + maior);
System.out.println("Menor valor: " + menor);
System.out.printf("Média dos valores: %.2f%n", media);
System.out.println("Matriz:");
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
System.out.printf("%4d", matriz[i][j]);
}
System.out.println();
}
System.out.println("Diagonal principal:");
for (int i = 0; i < tamanho; i++) {
System.out.println(matriz[i][i]);
}
System.out.println("Elementos acima da diagonal principal:");
for (int i = 0; i < tamanho; i++) {
for (int j = i + 1; j < tamanho; j++) {
System.out.printf("%4d", matriz[i][j]);
}
}
System.out.println();
System.out.println("Elementos abaixo da diagonal secundária:");
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho - 1 - i; j++) {
System.out.printf("%4d", matriz[i][j]);
}
}
System.out.println();
System.out.println("Matriz transposta:");
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
System.out.printf("%4d", matriz[j][i]);
}
System.out.println();
}
scanner.close();
}
}

38 - Faça um programa que crie duas matrizes 4x4 de inteiros, preencha com números aleatórios, em seguida:
b) Imprima a matriz resultante da soma dos elementos das duas matrizes em suas respectivas posições. b)
Imprima a matriz resultante da multiplicação dos elementos das duas matrizes em suas respectivas posições.
c) Imprima a matriz resultante da subtração dos elementos das duas matrizes em suas respectivas posições
public static void main(String[] args) {
int tamanho = 4;
int[][] matriz1 = criarMatrizAleatoria(tamanho);
int[][] matriz2 = criarMatrizAleatoria(tamanho);
System.out.println("Matriz 1:");
imprimirMatriz(matriz1);
System.out.println("\nMatriz 2:");
imprimirMatriz(matriz2);
int[][] matrizSoma = somaMatrizes(matriz1, matriz2);
System.out.println("\nMatriz Soma:");
imprimirMatriz(matrizSoma);
int[][] matrizMultiplicacao = multiplicacaoMatrizes(matriz1, matriz2);
System.out.println("\nMatriz Multiplicação:");
imprimirMatriz(matrizMultiplicacao);
int[][] matrizSubtracao = subtracaoMatrizes(matriz1, matriz2);
System.out.println("\nMatriz Subtração:");
imprimirMatriz(matrizSubtracao);
}
public static int[][] criarMatrizAleatoria(int tamanho) {
Random random = new Random();
int[][] matriz = new int[tamanho][tamanho];
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
matriz[i][j] = random.nextInt(10);
}
}
return matriz;
}
public static void imprimirMatriz(int[][] matriz) {
for (int[] linha : matriz) {
for (int valor : linha) {
System.out.printf("%4d", valor);
}
System.out.println();
}
}
public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
int tamanho = m1.length;
int[][] resultado = new int[tamanho][tamanho];
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
resultado[i][j] = m1[i][j] + m2[i][j];
}
}
return resultado;
}
public static int[][] multiplicacaoMatrizes(int[][] m1, int[][] m2) {
int tamanho = m1.length;
int[][] resultado = new int[tamanho][tamanho];
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
resultado[i][j] = m1[i][j] * m2[i][j];
}
}
return resultado;
}
public static int[][] subtracaoMatrizes(int[][] m1, int[][] m2) {
int tamanho = m1.length;
int[][] resultado = new int[tamanho][tamanho];
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
resultado[i][j] = m1[i][j] - m2[i][j];
}
}
return resultado;
}
}

39 - Faça um programa que realize a multiplicação de duas matrizes 3x3
public static void main(String[] args) {
int tamanho = 3;
int[][] matriz1 = criarMatrizAleatoria(tamanho);
int[][] matriz2 = criarMatrizAleatoria(tamanho);
System.out.println("Matriz 1:");
imprimirMatriz(matriz1);
System.out.println("\nMatriz 2:");
imprimirMatriz(matriz2);
int[][] matrizResultado = multiplicarMatrizes(matriz1, matriz2);
System.out.println("\nMatriz Resultado (Multiplicação):");
imprimirMatriz(matrizResultado);
}
public static int[][] criarMatrizAleatoria(int tamanho) {
Random random = new Random();
int[][] matriz = new int[tamanho][tamanho];
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
matriz[i][j] = random.nextInt(10);
}
}
return matriz;
}
public static void imprimirMatriz(int[][] matriz) {
for (int[] linha : matriz) {
for (int valor : linha) {
System.out.printf("%4d", valor);
}
System.out.println();
}
}
public static int[][] multiplicarMatrizes(int[][] m1, int[][] m2) {
int tamanho = m1.length;
int[][] resultado = new int[tamanho][tamanho];
for (int i = 0; i < tamanho; i++) {
for (int j = 0; j < tamanho; j++) {
resultado[i][j] = 0;
for (int k = 0; k < tamanho; k++) {
resultado[i][j] += m1[i][k] * m2[k][j];
}
}
}
return resultado;
}
}