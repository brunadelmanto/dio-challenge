## JAVA Operators

```
String nome = "GLEYSON";
int idade = 22;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
Date dataNascimento = new Date();
```



## Arithmetic

```
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);
```

*The addition operator (+), when used in text type variables, will perform “**text concatenation**”.*



## Unary

These operators are applied together with another arithmetic operator. They perform some basic work like incrementing, decrementing, inverting numerical and boolean values.



- (+) Unary positive value operator – numbers are positive without this operator explicitly;
- (-) Negative value unary operator – negates a number or arithmetic expression;
- (++) Unary value increment operator – increments the value by 1 unit;
- (--) Unary decrement value operator – decrements the value by 1 unit;
- (!) Negative unary logical operator – negates the value of a boolean expression.



## Ternary

The ternary condition operator is a shorthand way to define a condition and choose one of two values. 

```
<Conditional Expression>`` ?``<If condition is true>``: ``<If condition is false>
```



Examples below:

```
int a, b;

a = 5;
b = 6;

/* CONDITIONAL EXAMPLE USING AN IF/ELSE STRUCTURE
if(a==b)
    result = "true";
else
    result = "false";
*/

// THE SAME CONDITIONAL, BUT THIS TIME, USING THE TERNARY CONDITIONAL OPERATOR
String result = (a==b) ? "true" : "false";

System.out.println(value);
```



## Relational

Relational operators evaluate the relationship between two variables or expressions (for numbers). 

- == When we want to check if a variable is EQUAL to another.
- != When we want to check if a variable is DIFFERENT from the other.
- '>' When we want to check if a variable is GREATER THAN the other.
- = When we want to check if a variable is GREATER OR EQUAL to another.
- < When we want to check if a variable is LESS THAN another.
- <= When we want to check if a variable is LESS OR EQUAL to another.



For Strings we use "equals":

```
 System.out.println(nome1.equals(nome2));
```



## Logical

And: &&
OR: ||

```
if (condition1 && condition2){
	System.out.println("Both conditions are true.")
}
```

```
if (condition1 || condition2){
	System.out.println("One of the conditions is true.")
}
```



____

Reference: https://glysns.gitbook.io/java-basico/sintaxe/operadores
