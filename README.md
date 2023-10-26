# Molecule Master

Welcome to Molecule Master, a SMILES (Simplified Molecular Input Line Entry System) library designed to provide Java 
developers with easy creation and manipulation of molecular substances.

This project was made for fun with the inspiration of chemistry in mind, I thought that parsing elements and substances
from the command line would be a interesting challenge to implement in a programmatic way. 

## Installation

After you complete the steps for either of these methods,
make sure to include the JAR file as an external library or dependency to your project.
The process may vary depending on your IDE or build system.


### Using JAR from GitHub releases
1. Go to the Releases page of the Molecule Master repository on GitHub.
2. Download the latest JAR file attached to the most recent release.

### Building from Source
To use Molecule Master by building from the source code, follow these steps:

1. Clone the repository onto your local machine: 
    ```bash
    git clone https://github.com/floington500/MoleculeMaster.git
    ```
   
2. Navigate to the root directory of the project:
    ```bash
    cd MoleculeMaster
    ```
   
3. Package the application into a JAR using maven:
    ```bash
    mvn clean package
    ```

## Usage

Molecule Master is extremely simple to use and is built on a simple object-oriented hierarchy which is used along with
inheritance to create a robust and efficient design.

## Substance Parser

Here's an example of how to parse a substance:

```java
import com.github.floington500.MoleculeMaster.Element;
import com.github.floington500.MoleculeMaster.Substance;
import com.github.floington500.MoleculeMaster.SubstanceParser;

public class Main {
   public static void main(String[] args) {
      Substance water = SubstanceParser.parseSubstanceString("Na_5H");

      int moles = water.n();

      System.out.printf("This element has %d moles and the elements are:%n", moles);
      for (Element element : water.elements()) {
         System.out.println(element);
      }

      System.out.println("That's all!");
   }
}

```

When you run the program, you'll get the following output:

```
Element{data=ElementData{symbol='Na', name='Sodium', atomicNumber=11, atomicMass=22.99, elementType=IONIC}, atoms=5}
```

Any property of an element is able to be accessed by just calling the getters, the above is a simple example which 
calls the build-in `toString()` method which does all the work behind the scenes.

## Factory Method

To illustrate flow of data and structure of the program, I will use the factory method directly instead of going through
the parser which acts as a simplified interface, or facade:

```java
import com.github.floington500.MoleculeMaster.Element;
import com.github.floington500.MoleculeMaster.ElementFactory;

public class Main {
   public static void main(String[] args) {
      Element lithium = ElementFactory.createElement("Li", 5);

      System.out.printf("This is a %s molecule with %d atoms.", lithium.data().name(), lithium.atoms());
   }
}
```

This code would give the following output:

```
This is a Lithium molecule with 5 atoms.
```

The factory can provide an easier approach when working with only a few elements in contrast to a whole compound or 
substance.

## Conclusion

I hope you enjoy using Molecule Master as much as I enjoyed making it. Feel free to fork and modify the code to meet 
your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue under the 
repository.
