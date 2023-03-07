## Data Types

The eight primitive types in Java are:

1. int
2. byte
3. short
4. long
5. float
6. double
7. boolean
8. char



**Table of Primitive Types and their values:**

| Type  | Memory  | Minimum Value              | Maximum Value             |
| ----- | ------- | -------------------------- | ------------------------- |
| byte  | 1 byte  | -128                       | 127                       |
| short | 2 byte  | -32,768                    | 32,767                    |
| int   | 4 bytes | -2,147,483,648             | 2,147,483,647             |
| long  | 8 bytes | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |



Primitive types, which can contain fractional parts, can be represented by two types:

| Type   | Memory  | Minimum        | Maximum       | Accuracy     |
| ------ | ------- | -------------- | ------------- | ------------ |
| float  | 4 bytes | -3.4028E + 38  | 3.4028E + 38  | 6 – 7 digits |
| double | 8 bytes | -1.7976E + 308 | 1.7976E + 308 | 15 digits    |



Observation: *The long type must end with an L, the float type must end with an F.*



## Declaration of Variables

The standard structure for declaring a variable is always:

```
<Type> <VariableName> <optionalValueAssignment>
```



## Constants

To declare a variable as a constant, we use the word `final` and this variable must be written in all caps:

```
final <Type> <CONSTANT_NAME> <ValueAssignment>
```



----

Reference: https://glysns.gitbook.io/java-basico/sintax/variables
