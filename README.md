# Molecule Master

Welcome to Molecule Master, a SMILES (Simplified Molecular Input Line Entry System) library designed to provide Java developers with easy creation and manipulation of molecular substances.

## Installation

### Using JAR from GitHub releases
1. Go to the Releases page of the Molecule Master repository on GitHub.
2. Download the latest JAR file attached to the most recent release.

### Building from Source
To use Molecule Master by building from the source code, follow these steps:

1. Clone the repository onto your local machine: 
    ```bash
    git clone https://github.com/flo456123/MoleculeMaster.git
    ```
   
2. Navigate to the root directory of the project:
    ```bash
    cd Molecule-Master
    ```
   
3. Package the application into a JAR using maven:
    ```bash
    mvn clean package
    ```

After you complete the steps for either of those methods,
make sure to include the JAR file as an external library or dependency to your project.
The process may vary depending on your IDE or build system.

## Usage
Here's an example of how to use Molecule Master:

```java
import com.github.flo456123.MoleculeMaster.common.element.Element;
import com.github.flo456123.MoleculeMaster.common.element.ElementFactory;

public class Main {
   public static void main(String[] args) {
      // declare an element object and initialize it using the element factory
      Element element = ElementFactory.createElement("Na", 5);

      // now print the data for the element
      System.out.println(element);
   }
}
```

When you run the program, you'll get the following output:

```
Element{data=ElementData{symbol='Na', name='Sodium', atomicNumber=11, atomicMass=22.99, elementType=IONIC}, atoms=5}
```

## Conclusion

I hope you enjoy using Molecule Master as much as I enjoyed making it. Feel free to fork and modify the code to meet your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue under the repository.