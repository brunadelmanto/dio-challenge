## JAVA Methods

Characteristics of a method:

- It must be inside a class

- It must be named as a verb
- It must be follow the camelCase pattern



### Method definition criteria

1. **What is the main purpose of the method?**

   You must ask yourself constantly until you understand its real purpose.

2. **What type of return is expected after executing the method?**

   You must analyze whether the method will be responsible for returning some value or not.

If the method does not return any value, it will be represented by the *void* keyword.



3. **Which parameters will be needed to execute the method?**

   Methods will sometimes need arguments as criteria for execution.

2. **Does the method have the risk of throwing an exception?**

    Exceptions are common in method execution, sometimes it is necessary to predict and handle the possible existence of an exception.

3. **What is the visibility of the method?**

    Evaluate whether it is necessary for the method to be visible to the entire application, only in packages, through inheritance or only at the level of the class itself.



Below is an example of a class with two methods and their respective considerations:

```
public class MyClass {

	public double sum(int num1, int num2){
		//LOGIC - PURPOSE OF THE METHOD
		return ... ;
	}

	public void print(String text){
        //LOGIC - PURPOSE OF THE METHOD
        // HERE THE RETURN IS NOT NEEDED
        // BECAUSE NO RESULTS WILL BE RETURNED
	}
	
	public double dividir(int dividendo, int divisor) throws Exception{}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	
	private void metodoPrivado(){}
	// este método não pode ser visto por outras classes no projeto
	
}
```





____

Reference: https://glysns.gitbook.io/java-basico/sintaxe/metodos

