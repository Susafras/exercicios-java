1 - Escreva um algoritmo para ler uma temperatura em graus Celsius, calcular e escrever o valor 
correspondente em graus Fahrenheit.
package temperature;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
double celsius = scanner.nextDouble();
double fahrenheit = (celsius * 9/5)+32;
System.out.print(fahrenheit);
}
}

2 - Elabore um algoritmo que leia a idade de um nadador classifique-o em uma das seguintes 
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 int idade = scanner.nextInt();
 if (idade >= 5 && idade <= 7) {
 System.out.println("Infantil A");
 } 
 else
 if (idade >= 8 && idade <= 11) {
 System.out.println("Infantil B");
 } 
 else
 if (idade >= 12 && idade <= 13) {
 System.out.println("Juvenil A");
 } 
 else
 if (idade >= 14 && idade <= 17) {
 System.out.println("Juvenil B");
 } 
 else
 if (idade >= 18) {
 System.out.println("Adultos");
 } 
 else
 System.out.println("Idade fora das categorias.");
 
}
}

3 - Faça um algoritmo que leia o ano e verifique se é bissexto. Faça também o algoritmo na forma 
narrativa
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 int ano = scanner.nextInt();
 if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
 System.out.println("Ano bissexto");
 } 
 else
 System.out.println("Ano não é bissexto");
 
 
}
}

4 - Escreva algoritmo que leia as coordenadas (X,Y) de um ponto no sistema cartesiano e informe a 
qual quadrante ele pertence. Faça também o algoritmo na forma de fluxograma.
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int x = scanner.nextInt();
 int y = scanner.nextInt();
if (x > 0 && y > 0) {
 System.out.println("Primeiro quadrante");
 } else
 if (x < 0 && y > 0) {
 System.out.println("Segundo quadrante");
 } 
 else
 if (x < 0 && y < 0) {
 System.out.println("Terceiro quadrante");
 } else
 if (x > 0 && y < 0) {
 System.out.println("Quarto quadrante");
 } else
 if (x == 0 && y != 0) {
 System.out.println("Está sobre o eixo Y");
 } else
 if (y == 0 && x != 0) {
 System.out.println("Está sobre o eixo X");
 } else
 System.out.println("Está na origem");
 
}
}

5 - Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o 
preço do combustível é de R$ 3,99 escreva um programa para ler: a marcação do odômetro(Km) no 
início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor 
total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro 
(líquido) do dia.
Scanner scanner = new Scanner(System.in);
 
 double precoCombustivel = 3.99;
 double odometroInicial = scanner.nextDouble();
 double odometroFinal = scanner.nextDouble();
 double litrosGastos = scanner.nextDouble();
 double valorRecebido = scanner.nextDouble();
 double distanciaPercorrida = odometroFinal - odometroInicial;
 double consumoMedio = distanciaPercorrida / litrosGastos;
 double custoCombustivel = litrosGastos * precoCombustivel;
 double lucroLiquido = valorRecebido - custoCombustivel;
 System.out.println("Média de consumo (Km/L): " + consumoMedio);
 System.out.println("Lucro líquido do dia (R$): " + lucroLiquido);
}
}

6 - Faça um programa que receba dez números e usando laços de repetição calcule e mostre a 
quantidade de números entre 30 e 90.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 int contador = 0;
 for (int i = 0; i < 10; i++) {
 int numero = scanner.nextInt();
 if (numero >= 30 && numero <= 90) {
 contador++;
 }
 }
 System.out.println("Quantidade de números entre 30 e 90: " + contador);
 }
}

7 - Faça uma algoritmo que receba duas datas e retorne a diferença entre elas em dias
public static void main(String[] args) {
Scanner scanner;
 SimpleDateFormat formato;
 String data1Str, data2Str;
 Date data1, data2;
 long diferencaMillis;
 long diferencaDias; 
 scanner = new Scanner(System.in);
 formato = new SimpleDateFormat("dd/MM/yyyy"); 
 try {
 data1Str = scanner.next();
 data2Str = scanner.next();
 
 data1 = formato.parse(data1Str);
 data2 = formato.parse(data2Str);
 
 diferencaMillis = Math.abs(data2.getTime() - data1.getTime());
 diferencaDias = diferencaMillis / (24 * 60 * 60 * 1000);
 
 System.out.println("Diferença entre as datas em dias: "+ diferencaDias);
 } catch (ParseException e) {
 System.out.println("Formato de data inválido.Use dd/MM/yyyy.");
 }
}

8 - Faça um programa que peça ao usuário para informar o salário inicial e apresente o menu de 
opções a seguir. Permita ao usuário escolher a opção desejada, recebendo os dados necessários 
para executar a operação e mostre o salário do mês (soma de todos os valores informados). 
Verificar a possibilidade de opção inválida e não se preocupar com as restrições, como salário 
inválido.
Menu de opções:
1. Informar novo salário
2. Informar valor referente a Férias
3. Informar Décimo terceiro
4. Sair
Digite a opção desejada :
Scanner scanner;
 double salarioInicial, salarioAtual, valorFerias, decimoTerceiro;
 int opcao;
 scanner = new Scanner(System.in);
 salarioInicial = scanner.nextDouble();
 salarioAtual = salarioInicial;
 do {
 System.out.println("Menu de opções:");
 System.out.println("1. Informar novo salário");
 System.out.println("2. Informar valor referente a Férias");
 System.out.println("3. Informar Décimo terceiro");
 System.out.println("4. Sair");
 System.out.println("Digite a opção desejada:");
 opcao = scanner.nextInt();
 switch (opcao) {
 case 1:
 salarioInicial = scanner.nextDouble();
 salarioAtual = salarioInicial;
 break;
 case 2:
 valorFerias = scanner.nextDouble();
 salarioAtual += valorFerias;
 break;
 case 3:
 decimoTerceiro = scanner.nextDouble();
 salarioAtual += decimoTerceiro;
 break;
 case 4:
 System.out.println("Saindo...");
 break;
 default:
 System.out.println("Opção inválida. Tente novamente.");
 break;
 }
 if (opcao != 4) {
 System.out.println("Salário atual do mês: " + salarioAtual);
 }
 } while (opcao != 4);
 
}
}

9 - Um teatro deseja saber qual o preço ideal dos ingressos, de acordo com a cidade que visitam. 
Para tanto, eles descobriram que em média 120 pessoas comparecem em cada sessão, quando o 
preço do ingresso é R$ 5,00. A partir disso, a cada redução de R$ 0,50 há um aumento de público, 
que difere em cada cidade. Cada sessão tem um custo de R$ 200,00 ao circo. Faça um programa 
que, dado o número adicional de pessoas a cada redução de R$ 0,50 no preço do ingresso, imprima 
a tabela de lucro de cada sessão. Considere a variação de preço entre R$ 5,00 e R$ 1,00. Informe 
também ao usuário, qual é o valor de ingresso que gera o maior lucro.
public static void main(String[] args) {
Scanner scanner;
 int aumentoPublico, publicoInicial, publicoAtual;
 double precoInicial, precoAtual, lucro, maiorLucro, melhorPreco;
 double custoSessao;
 scanner = new Scanner(System.in);
 precoInicial = 5.00;
 publicoInicial = 120;
 custoSessao = 200.00;
 maiorLucro = 0.00;
 melhorPreco = precoInicial;
 aumentoPublico = scanner.nextInt();
 System.out.println("Preço\tPúblico\tLucro");
 for (precoAtual = precoInicial; precoAtual >= 1.00; precoAtual -= 0.50) {
 publicoAtual = publicoInicial + (int)((precoInicial - precoAtual) * 2 
* aumentoPublico);
 lucro = (precoAtual * publicoAtual) - custoSessao;
 System.out.println(String.format("R$ %.2f\t%d\tR$ %.2f", precoAtual, 
publicoAtual, lucro));
 if (lucro > maiorLucro) {
 maiorLucro = lucro;
 melhorPreco = precoAtual;
 }
 }
 System.out.println(String.format("O valor de ingresso que gera o maior 
lucro é R$ %.2f, com lucro de R$ %.2f.", melhorPreco, maiorLucro));
 }
}

10 - Uma loja tem 150 clientes cadastrados e deseja mandar uma correspondência a cada um deles 
anunciando um bônus especial. Escreva um algoritmo que leia o nome do cliente e o valor das suas 
compras no ano passado e calcule um bônus de 10% se o valor das compras for menor que 500 e de 
15%, caso contrário.
public static void main(String[] args) {
String nome;
 double valorCompras;
 double bonus;
 
 Scanner scanner = new Scanner(System.in);
 
 for (int i = 0; i < 150; i++) {
 System.out.print("Digite o nome do cliente: ");
 nome = scanner.nextLine();
 
 System.out.print("Digite o valor das compras do ano passado: ");
 valorCompras = scanner.nextDouble();
 scanner.nextLine();
 
 if (valorCompras < 500) {
 bonus = valorCompras * 0.10;
 } else {
 bonus = valorCompras * 0.15;
 }
 
 System.out.println("Cliente: " + nome);
 System.out.printf("Valor das compras: R$%.2f%n", valorCompras);
 System.out.printf("Bônus: R$%.2f%n", bonus);
 System.out.println("------------------------------");
 }
 
 scanner.close();
 }
}

11 - Elabore um algoritmo que gera e escreve os números ímpares dentro de um intervalo 
informado pelo usuário.
int inicio;
 int fim;
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor inicial do intervalo: ");
 inicio = scanner.nextInt();
 System.out.print("Digite o valor final do intervalo: ");
 fim = scanner.nextInt();
 System.out.println("Números ímpares no intervalo:");
 for (int i = inicio; i <= fim; i++) {
 if (i % 2 != 0) {
 System.out.println(i);
 }
 }
 scanner.close();
 }
}

12 - Dado um valor n, exiba uma contagem regressiva
public static void main(String[] args) {
 int n;
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor de n: ");
 n = scanner.nextInt();
 for (int i = n; i > 0; i--) {
 System.out.println(i);
 }
 System.out.println("Fim");
 scanner.close();
 }
}

13 - Dados um número real de um natural n, exiba a potência x n. Utilize apenas multiplicação para 
calcular.
 double x;
 int n;
 double resultado = 1;
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o número real x: ");
 x = scanner.nextDouble();
 System.out.print("Digite o número natural n: ");
 n = scanner.nextInt();
 for (int i = 1; i <= n; i++) {
 resultado *= x;
 }
 System.out.printf("O valor de %.2f elevado a %d é %.2f%n", x, n, 
resultado);
 scanner.close();
 }
}

14 - Exiba uma tabela de conversão de polegadas em centímetros. variando as polegadas de 0 a 10 
de meio em meio. 1 polegada = 2,54cm
public static void main(String[] args) {
 double polegadas;
 double centimetros;
 double conversao = 2.54;
 
 System.out.println("Tabela de Conversão de Polegadas para Centímetros");
 System.out.println("Polegadas\tCentímetros");
 System.out.println("------------------------------");
 
 for (polegadas = 0; polegadas <= 10; polegadas += 0.5) {
 centimetros = polegadas * conversao;
 System.out.printf("%.1f\t\t%.2f%n", polegadas, centimetros);
 }
 }
}

15 - Escreva um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar 
um deter- minado cômodo de uma residência. Dados de entrada:
Informação Unidade de medida
A potência da lâmpada utilizada (em watts)
Dimensões do cômodo (largura e comprimento em metros).
Considere que a potência necessária é de 18 watts por metro quadrado.
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite a potência da lâmpada (em watts): ");
 double potenciaLampada = scanner.nextDouble();
 System.out.print("Digite a largura do cômodo (em metros): ");
 double largura = scanner.nextDouble();
 System.out.print("Digite o comprimento do cômodo (em metros): ");
 double comprimento = scanner.nextDouble();
 double potenciaPorMetroQuadrado = 18;
 double area = largura * comprimento;
 double potenciaTotalNecessaria = area * potenciaPorMetroQuadrado;
 double numeroLampadas = potenciaTotalNecessaria / potenciaLampada;
 numeroLampadas = Math.ceil(numeroLampadas);
 System.out.println("Número de lâmpadas necessárias: " + (int) 
numeroLampadas);
}
}

16 - Construa um algoritmo que leia 100 valores inteiros e positivos e:
a) Encontre o maior valor
b) Encontre o menor valor
c) Calcule a média dos números lidos
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 int quantidade = 100;
 int maior = Integer.MIN_VALUE;
 int menor = Integer.MAX_VALUE;
 long soma = 0;
 for (int i = 0; i < quantidade; i++) {
 System.out.print("Digite um valor inteiro positivo: ");
 int valor = scanner.nextInt();
 while (valor <= 0) {
 System.out.print("Valor inválido. Digite um valor inteiro 
positivo: ");
 valor = scanner.nextInt();
 }
 if (valor > maior) {
 maior = valor;
 }
 if (valor < menor) {
 menor = valor;
 }
 soma += valor;
 }
 double media = (double) soma / quantidade;
 System.out.println("Maior valor: " + maior);
 System.out.println("Menor valor: " + menor);
 System.out.println("Média dos valores: " + media);
}
}

17 - Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa 
que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:
a) O valor total das compras à vista
b) O valor total das compras a prazo
c) O valor total das compras efetuadas
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 double totalVista = 0.0;
 double totalPrazo = 0.0;
 double totalCompras = 0.0;
 int quantidadeTransacoes = 15;
 for (int i = 0; i < quantidadeTransacoes; i++) {
 System.out.print("Digite o código da transação (V para à vista, 
P para a prazo): ");
 char codigo = scanner.next().charAt(0);
 System.out.print("Digite o valor da transação: ");
 double valor = scanner.nextDouble();
 while (valor < 0) {
 System.out.print("Valor inválido. Digite um valor positivo: 
");
 valor = scanner.nextDouble();
 }
 if (codigo == 'V' || codigo == 'v') {
 totalVista += valor;
 } else if (codigo == 'P' || codigo == 'p') {
 totalPrazo += valor;
 } else {
 System.out.println("Código inválido. Transação ignorada.");
 continue;
 }
 totalCompras += valor;
 }
 System.out.println("Valor total das compras à vista: " + 
totalVista);
 System.out.println("Valor total das compras a prazo: " + 
totalPrazo);
 System.out.println("Valor total das compras efetuadas: " + 
totalCompras);
 
}
}

18 - Faça um algoritmo que leia uma string e a imprima em ordem inversa
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
 System.out.print("Digite uma string: ");
 String input = scanner.nextLine();
 
 String reversed = new StringBuilder(input).reverse().toString();
 
 System.out.println("String em ordem inversa: " + reversed);
}
}

19 - Faça um algoritmo que leia uma string e informe se ela é palíndromo. Ex. ovo, arara, ele
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite uma string: ");
 String input = scanner.nextLine();
 String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
 String reversedInput = new
StringBuilder(cleanedInput).reverse().toString();
 if (cleanedInput.equals(reversedInput)) {
 System.out.println("A string é um palíndromo.");
 } else {
 System.out.println("A string não é um palíndromo.");
 }
}
}

20 - Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o 
valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o 
valor lido e a relação de notas necessárias.
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor a ser decompondo: ");
 int valor = scanner.nextInt();
 int[] notas = {100, 50, 20, 10, 5, 2, 1};
 int[] quantidadeNotas = new int[notas.length];
 int valorOriginal = valor;
 for (int i = 0; i < notas.length; i++) {
 quantidadeNotas[i] = valor / notas[i];
 valor %= notas[i];
 }
 System.out.println("Valor original: " + valorOriginal);
 for (int i = 0; i < notas.length; i++) {
 if (quantidadeNotas[i] > 0) {
 System.out.println(notas[i] + " : " + quantidadeNotas[i] + " 
nota(s)");
 }
 }
}
}

21 - Leia um valor de ponto flutuante que representa um valor monetário. A seguir, calcule o menor 
número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas 
são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir 
mostre a relação de notas necessárias.
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite um valor monetário: ");
 double valor = scanner.nextDouble();
 int[] notas = {100, 50, 20, 10, 5, 2};
 double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
 int[] quantidadeNotas = new int[notas.length];
 int[] quantidadeMoedas = new int[moedas.length];
 int valorInteiro = (int) valor;
 for (int i = 0; i < notas.length; i++) {
 quantidadeNotas[i] = valorInteiro / notas[i];
 valorInteiro %= notas[i];
 }
 double valorRestante = valor - (int) valor;
 for (int i = 0; i < moedas.length; i++) {
 quantidadeMoedas[i] = (int) (valorRestante / moedas[i]);
 valorRestante %= moedas[i];
 valorRestante = Math.round(valorRestante * 100.0) / 100.0;
 }
 System.out.println("NOTAS:");
 for (int i = 0; i < notas.length; i++) {
 if (quantidadeNotas[i] > 0) {
 System.out.println(notas[i] + " : " + quantidadeNotas[i] + " 
nota(s)");
 }
 }
 System.out.println("MOEDAS:");
 for (int i = 0; i < moedas.length; i++) {
 if (quantidadeMoedas[i] > 0) {
 System.out.println(String.format("%.2f", moedas[i]) + " : " + 
quantidadeMoedas[i] + " moeda(s)");
 }
 }
}
}

22 - Dois amigos pedem ao atendente de uma lanchonete que proponha um desafio, de modo que 
se acertas- sem, não precisariam pagar a conta. Então foi proposto o seguinte: Dado o seguinte 
somatório abaixo, informar o resultado, com uma quantidade de termos no mesmo:
S = 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 ...
Escreva um algoritmo que, dada uma quantidade de termos, informar o resultado do somatório 
acima.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite a quantidade de termos: ");
 int termos = scanner.nextInt();
 int resultado = (termos % 2 == 0) ? 0 : 1;
 System.out.println("Resultado do somatório: " + resultado);
}
}

23 - Depois de capturar muitos Pomekons, Dabriel e Guarte resolveram batalhar. A forma de duelo 
é simples, cada treinador coloca um Pomekon na batalha e vence quem tem o Pomekon com maior 
valor de golpe, que é definido da seguinte maneira:V alorGolpe = Ataque + Defesa 2 + Bonus (1)
O Bônus será dado ao Pomekon do treinador que estiver em um level de valor par. Neste problema 
será dado a você o valor do bônus aplicado, os valores de ataque e defesa do Pomekon de Dabriel e 
Guarte e seus respectivos níveis, cabe a você informar o ganhador da batalha.
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o ataque do Pomekon de Ash: ");
 int ataqueDabriel = scanner.nextInt();
 System.out.print("Digite a defesa do Pomekon de Ash: ");
 int defesaDabriel = scanner.nextInt();
 System.out.print("Digite o nível do Pomekon de Ash: ");
 int nivelDabriel = scanner.nextInt();
 System.out.print("Digite o ataque do Pomekon de Guarte: ");
 int ataqueGuarte = scanner.nextInt();
 System.out.print("Digite a defesa do Pomekon de Guarte: ");
 int defesaGuarte = scanner.nextInt();
 System.out.print("Digite o nível do Pomekon de Guarte: ");
 int nivelGuarte = scanner.nextInt();
 System.out.print("Digite o valor do bônus: ");
 int bonus = scanner.nextInt();
 int valorGolpeDabriel = calcularValorGolpe(ataqueDabriel, 
defesaDabriel, nivelDabriel, bonus);
 int valorGolpeGuarte = calcularValorGolpe(ataqueGuarte, 
defesaGuarte, nivelGuarte, bonus);
 if (valorGolpeDabriel > valorGolpeGuarte) {
 System.out.println("Dabriel vence a batalha.");
 } else if (valorGolpeGuarte > valorGolpeDabriel) {
 System.out.println("Guarte vence a batalha.");
 } else {
 System.out.println("A batalha terminou em empate.");
 }
 scanner.close();
 }
 private static int calcularValorGolpe(int ataque, int defesa, int
nivel, int bonus) {
 int valorGolpe = ataque + defesa / 2;
 if (nivel % 2 == 0) {
 valorGolpe += bonus;
 }
 return valorGolpe;
}
}

24 - Faça um detector de picos, supondo a entrada de N valores inteiros
Um loop musical é um trecho de música que foi composto para repetir continuamente (ou seja, o 
trecho ini-cia novamente toda vez que chega ao final), sem que se note descontinuidade. Loops são 
muito usados na sonorização de jogos, especialmente jogos casuais pela internet. Loops podem ser 
digitalizados por exemplo utilizando PCM. PCM, do inglês Pulse Code Modulation, é uma técnica 
para representação de sinais analógi-cos, muito utilizada em áudio digital. Nessa técnica, a 
magnitude do sinal é amostrada a intervalos regulares de tempo, e os valores amostrados são 
armazenados em sequência. Para reproduzir a forma de onda amostrada, o processo é invertido 
(demodulação). Fernandinha trabalha para uma empresa que desenvolve jogos e compôs um bonito 
loopmusical, codificando-o em PCM. Analisando a forma de onda do seu loop em um software de 
edição de áudio, Fernandinha ficou curiosa ao notar a quantidade de picos existentes. Um pico em 
uma forma de onda é um valor de uma amostra que representa um máximo ou mínimo local, ou 
seja, um ponto de inflexão da forma de onda. A figura abaixo ilustra (a) um exemplo de forma de 
onda e (b) o loop formado com essa forma de onda, contendo 48 picos.
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o número de valores: ");
 int n = scanner.nextInt();
 if (n < 3) {
 System.out.println("Número insuficiente de valores para detectar 
picos.");
 return;
 }
 int[] valores = new int[n];
 System.out.println("Digite os valores:");
 for (int i = 0; i < n; i++) {
 valores[i] = scanner.nextInt();
 }
 List<Integer> picos = detectarPicos(valores);
 System.out.println("Picos detectados: " + picos);
 scanner.close();
 }
 private static List<Integer> detectarPicos(int[] valores) {
 List<Integer> picos = new ArrayList<>();
 for (int i = 1; i < valores.length - 1; i++) {
 if (valores[i] > valores[i - 1] && valores[i] > valores[i + 1]) {
 picos.add(valores[i]);
 }
 else if (valores[i] < valores[i - 1] && valores[i] < valores[i + 1]) 
{
 picos.add(valores[i]);
 }
 }
 return picos;
}
}

25 - Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus 
divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o 
número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um algoritmo que imprima se um 
determinado número é perfeito ou não.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite um número para verificar se é perfeito: ");
 int numero = scanner.nextInt();
 if (eNumeroPerfeito(numero)) {
 System.out.println(numero + " é um número perfeito.");
 } else {
 System.out.println(numero + " não é um número perfeito.");
 }
 scanner.close();
 }
 private static boolean eNumeroPerfeito(int numero) {
 if (numero <= 1) {
 return false;
 }
 int somaDivisores = 0;
 for (int i = 1; i <= numero / 2; i++) {
 if (numero % i == 0) {
 somaDivisores += i;
 }
 }
 return somaDivisores == numero;
}
}

26 - No oitavo episódio da segunda temporada do seriado The Big Bang Theory, The Lizard-Spock 
Expansion, Sheldon e Raj discutem qual dos dois é o melhor: o filme Saturn 3 ou a série Deep Space 
9. A sugestão de Raj para a resolução do impasse é uma disputa de Pedra-Papel-Tesoura. Contudo, 
Sheldon argumenta que, se as partes envolvidas se conhecem, entre 75% e 80% das disputas de 
Pedra-Papel-Tesoura termi- nam empatadas, e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.
As regras do jogo proposto são:
a tesoura corta o papel;
o papel embrulha a pedra;
a pedra esmaga o lagarto;
o lagarto envenena Spock;
Spock destrói a tesoura;
a tesoura decapita o lagarto;
o lagarto come o papel;
o papel contesta Spock;
Spock vaporiza a pedra;
a pedra quebra a tesoura.
Caso Sheldon vença, ele se deleitaria com a vitória, exclamando ’Bazinga!’; caso Raj vença, ele 
concluiria que ’Raj trapaceou!’; caso o resultado seja empate, ele exigiria nova partida: ’De novo!’. 
Faça um algoritmo que receba a escolha dos dois jogadores e imprima a provável reação de 
Sheldon.
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Entrada das escolhas dos jogadores
 System.out.print("Digite a escolha de Sheldon (Pedra, Papel, Tesoura, 
Lagarto, Spock): ");
 String escolhaSheldon = scanner.nextLine().trim().toLowerCase();
 System.out.print("Digite a escolha de Raj (Pedra, Papel, Tesoura, 
Lagarto, Spock): ");
 String escolhaRaj = scanner.nextLine().trim().toLowerCase();
 // Determinar a reação de Sheldon
 String resultado = determinarResultado(escolhaSheldon, escolhaRaj);
 System.out.println(resultado);
 scanner.close();
 }
 private static String determinarResultado(String escolhaSheldon, String 
escolhaRaj) {
 if (escolhaSheldon.equals(escolhaRaj)) {
 return "De novo!";
 }
 if (vitoriaSheldon(escolhaSheldon, escolhaRaj)) {
 return "Bazinga!";
 }
 return "Raj trapaceou!";
 }
 private static boolean vitoriaSheldon(String sheldon, String raj) {
 String[][] regras = {
 {"tesoura", "papel"}, // Tesoura corta papel
 {"papel", "pedra"}, // Papel embrulha pedra
 {"pedra", "lagarto"}, // Pedra esmaga lagarto
 {"lagarto", "spock"}, // Lagarto envenena Spock
 {"spock", "tesoura"}, // Spock destrói tesoura
 {"tesoura", "lagarto"}, // Tesoura decapita lagarto
 {"lagarto", "papel"}, // Lagarto come papel
 {"papel", "spock"}, // Papel contesta Spock
 {"spock", "pedra"}, // Spock vaporiza pedra
 {"pedra", "tesoura"} // Pedra quebra tesoura
 };
 for (String[] regra : regras) {
 if (sheldon.equals(regra[0]) && raj.equals(regra[1])) {
 return true;
 }
 }
 return false;
}
}

27 - Faça um algoritmo que repita a leitura de uma senha até que ela seja válida. Para cada leitura 
de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for 
informada corretamente deve ser impressa a mensagem "Acesso Permitido"e o algoritmo 
encerrado. Considere que a senha correta é o valor 2002.
public static void main(String[] args) {
 final int SENHA_CORRETA = 2002;
 Scanner scanner = new Scanner(System.in);
 
 int senha;
 
 while (true) {
 System.out.print("Digite a senha: ");
 senha = scanner.nextInt();
 if (senha == SENHA_CORRETA) {
 System.out.println("Acesso Permitido");
 break;
 } else {
 System.out.println("Senha Invalida");
 }
 }
 scanner.close();
}
}

28 - Faça um algoritmo que leia as notas referentes às duas avaliações de um aluno. Calcule e 
imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve 
pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 double nota1, nota2;
 while (true) {
 System.out.print("Digite a primeira nota (0 a 10): ");
 nota1 = scanner.nextDouble();
 
 if (nota1 >= 0 && nota1 <= 10) {
 break;
 } else {
 System.out.println("Nota inválida! A nota deve estar no intervalo 
[0, 10].");
 }
 }
 
 while (true) {
 System.out.print("Digite a segunda nota (0 a 10): ");
 nota2 = scanner.nextDouble();
 
 if (nota2 >= 0 && nota2 <= 10) {
 break;
 } else {
 System.out.println("Nota inválida! A nota deve estar no intervalo 
[0, 10].");
 }
 }
 
 double media = (nota1 + nota2) / 2;
 
 System.out.printf("A média semestral é: %.2f%n", media);
 
 scanner.close();
}
}

29 - Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua 
ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Este laboratório 
utiliza três tipos de cobaias: sapos, ratos e coelhos.
Entrada
A primeira linha de entrada contém um valor inteiro N que indica a quantidade de testes que vem a 
seguir. Cada caso de teste contém um inteiro Q (1 ≤ Q ≤ 15) que representa a quantidade de 
cobaias utilizadas e um caractere Tipo (’C’, ’R’ ou ’S’), indicando o tipo de cobaia (R:Rato S:Sapo 
C:Coelho). Ex 5 R
Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de 
cada uma em relação ao total de cobaias utilizadas.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
 int totalCobaias = 0;
 int totalRatos = 0;
 int totalSapos = 0;
 int totalCoelhos = 0;
 int N = scanner.nextInt();
 for (int i = 0; i < N; i++) {
 int Q = scanner.nextInt();
 char tipo = scanner.next().charAt(0);
 totalCobaias += Q;
 switch (tipo) {
 case 'R':
 totalRatos += Q;
 break;
 case 'S':
 totalSapos += Q;
 break;
 case 'C':
 totalCoelhos += Q;
 break;
 }
 }
 
 double percentualRatos = (totalRatos * 100.0) / totalCobaias;
 double percentualSapos = (totalSapos * 100.0) / totalCobaias;
 double percentualCoelhos = (totalCoelhos * 100.0) / totalCobaias;
 System.out.println("Total de cobaias: " + totalCobaias);
 System.out.println("Total de ratos: " + totalRatos);
 System.out.println("Total de sapos: " + totalSapos);
 System.out.println("Total de coelhos: " + totalCoelhos);
 System.out.printf("Percentual de ratos: %.2f%%%n", percentualRatos);
 System.out.printf("Percentual de sapos: %.2f%%%n", percentualSapos);
 System.out.printf("Percentual de coelhos: %.2f%%%n", percentualCoelhos);
 scanner.close();
}
}

30 - Explique as diferenças entre os laços de repetição: para, enquanto e faça-enquanto
for (inicialização; condição; incremento) {
 // Código a ser executado
}
while (condição) {
 // Código a ser executado
}
do {
 // Código a ser executado
} while (condição);
for: Mais adequado quando o número de iterações é conhecido ou quando se usa uma variável 
de controle com um valor inicial e um incremento.
while: Mais adequado quando o número de iterações não é conhecido e depende de uma 
condição que pode mudar durante a execução do loop.
do-while: Garantia de execução pelo menos uma vez e é adequado para situações em que o 
código deve ser executado antes de verificar a condição.

31 - Faça um algoritmo que:
a) Leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, 
incluindo ambos.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor de X: ");
 int X = scanner.nextInt();
 System.out.print("Digite o valor de Y: ");
 int Y = scanner.nextInt();
 if (X > Y) {
 int temp = X;
 X = Y;
 Y = temp;
 }
 int soma = 0;
 for (int i = X; i <= Y; i++) {
 if (i % 13 != 0) {
 soma += i;
 }
 }
 System.out.println("A soma dos números que não são múltiplos de 13 é: " + 
soma);
 scanner.close();
}
}
b) Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão 
resto igual a 2.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor de N: ");
 int N = scanner.nextInt();
 System.out.println("Números entre 1 e 10000 que divididos por " + N + " 
dão resto 2:");
 for (int i = 1; i <= 10000; i++) {
 if (i % N == 2) {
 System.out.println(i);
 }
 }
 scanner.close();
}
}
c) Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores 
lidos.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 int maiorValor = Integer.MIN_VALUE;
 int posicaoMaior = -1;
 System.out.println("Digite 100 valores inteiros:");
 for (int i = 1; i <= 100; i++) {
 int valor = scanner.nextInt();
 if (valor > maiorValor) {
 maiorValor = valor;
 posicaoMaior = i;
 }
 }
 System.out.println("O maior valor é: " + maiorValor);
 System.out.println("A posição do maior valor é: " + posicaoMaior);
 scanner.close();
}
}

32 - Os dados armazenados no computador estão em binário. Uma forma econômica de ver estes 
números é usar a base 16 (hexadecimal). Sua tarefa consiste em escrever um algoritmo que, dado 
um número natural na base 10, mostre sua representação em hexadecimal.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite um número natural na base 10: ");
 int numeroDecimal = scanner.nextInt();
 if (numeroDecimal < 0) {
 System.out.println("Número inválido! O número deve ser natural (nãonegativo).");
 } else {
 String numeroHexadecimal = converterParaHexadecimal(numeroDecimal);
 System.out.println("O número na base hexadecimal é: " + 
numeroHexadecimal);
 }
 scanner.close();
 }
 private static String converterParaHexadecimal(int numeroDecimal) {
 return Integer.toHexString(numeroDecimal).toUpperCase();
}
}

33 - Faça um algoritmo que dê o resultado do somatório das séries até o N-ésimo termo:
a)s = N + N − 1X+N − 2X2+ ... +1XN−1
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor de N: ");
 int N = scanner.nextInt();
 System.out.print("Digite o valor de X: ");
 double X = scanner.nextDouble();
 if (X == 0) {
 System.out.println("O valor de X não pode ser zero.");
 return;
 }
 double soma = 0.0;
 for (int i = 0; i < N; i++) {
 double termo = (N - i) / Math.pow(X, i);
 soma += termo;
 }
 System.out.printf("O resultado do somatório da série é: %.2f%n", soma);
 scanner.close();
}
}
b)s = 1 + X +X22! +X33! + ... +XN N!
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor de N: ");
 int N = scanner.nextInt();
 System.out.print("Digite o valor de X: ");
 double X = scanner.nextDouble();
 double soma = 0.0;
 double fatorial = 1.0; 
 
 for (int i = 0; i <= N; i++) {
 if (i > 0) {
 fatorial *= i; 
 }
 double termo = Math.pow(X, i) / fatorial;
 soma += termo;
 }
 System.out.printf("O resultado do somatório da série é: %.2f%n", soma);
 scanner.close();
}
}