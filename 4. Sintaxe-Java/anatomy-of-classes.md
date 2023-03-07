# Anatomy of classes

Syntax of declaring a new class:

```
public class MyClass {
	//CLASS BODY
	public static void main (String [] args){
		//MAIN METHOD HERE
	}
}
```



## Naming pattern

**.java file**: Every .java file must start with an UPPERCASE letter. If the word is compound, the second word must also be capitalized, example:

```
calculator.java
```

```
Scientific Calculator.java
```



### Classes

**Class name in the file**: The class must have the same name as the.java file, example:

```
// file CalculadoraCientifica.java
public class ScientificCalculator {
}
```

- name of the .java files with initial capital letters: MyClass

- need to be in the src folder

  

### Variable

**Variable name**: all variables must be written with lowercase letter, however if the word is compound, the first letter of the second word must be UPPERCASE, example: `ano` and `anoFabricacao`. The name of this practice for naming variables this way is called "camelCase".



Examples of valid variables: use of letters, $, _ and number.

```
String myName = "Bruna1"
String my_name = "Bruna2"
String my$name = "Bruna3"
```



### Declare a variable

To declare a variable we can use characters, numbers and symbols, however, we must follow some rules of the language.



### Variable structure:

```
Type NomeBemDefinido = Attribution (optional in some cases)
```



1. It must contain only letters, _ (underscore), $ or the numbers 0 to 9;
2. It must start with a letter (preferably), _ or $, never with a number;
3. Must start with a lowercase letter (good practice – see below);
4. It cannot contain spaces;
5. We cannot use language keywords;
6. The name must be unique within a scope.
7. Directory name separated by dashes: java-anatomia-classes



### Constant

It's capitalized and initial with "final"

```
final String BR = "Brazil"
```

```
end int YEAR_2000 = 2000
```



### Methods

- Written with lowercase letter, but if it is composed, the next ones start with uppercase = camelCase

   ```
   Return type nameObjetivoNoInfinitivo (parameter is optional)
   ```

    

   Examples:

```
String fullName = fullName(firstName, secondName);
int sum(int numberOne, int number2)
String formatTip (long zip)
```



## Indentation

**Indenting** is writing the code in a hierarchical way, thus facilitating the visualization and understanding of the program. See the example:

```
public class Student Bulletin {
public static void main(String[] args) {
int mediaFinal = 6;
if (averageFinal < 6)
System.out.println("FAILED");
else if (averageFinal == 6)
System.out.println("PROVA MINERVA");
else
System.out.println("APPROVED");
}
}
```



## Organizing files with Packages

**Package Name**: Package name + file name, example: `com.suaempresa.Banco Account`.



The Packages are subdirectories to organize classes (.java).

Start with the project proposal: commercial (com), organizational (org), opensource (open), study/education (edu).

Package name syntax: proposal.companyname.application.subpurposes



Examples:

- com.hypertech.notification.service

- edu.bruna.firstweek

  

   *The.java file needs to have written the package the package name at the beginning of the code*

  

## Java Beans

Universal Writing Conventions.





----------

Reference: https://glysns.gitbook.io/java-basico/sintax/anatomia-das-classes
