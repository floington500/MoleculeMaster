# Molecule Master

Welcome to Molecule Master, a library designed to provide Java developers with easy creation of molecular substances.

## Installation

### Using JAR from GitHub releases
1. Go to the Releases page of the Molecule Master repository on GitHub.
2. Download the latest JAR file attached to the most recent release.
3. Add the JAR file as an external library or dependency to your project. The process may vary depending on your IDE or build system.

### Building from Source
To use Molecule Master by building from the source code, follow these steps:

1. Clone the repository onto your local machine:
```bash
git clone https://github.com/flo456123/Molecule-Master.git
```
2. Navigate to the root directory of the project:
```bash
cd Molecule-Master
```

From there, you are free to use the program however you see fit. Make sure to include the necessary dependencies, such as SnakeYAML, in your build configuration.

## Usage
Here's an example of how to use Molecule Master:

```java
import com.github.flo456123.common.types.Substance;
import com.github.flo456123.common.equation.ChemicalEquation;

public class Main {
    public static void main(String[] args) {
        ChemicalEquation equation = new ChemicalEquation("NaH_2 -> 6O_3Cl_4 + H_2");

        System.out.println("Reactants:\n");
        for (Substance r : equation.getReactants()) {
            System.out.println(r);
        }

        System.out.println("Products:\n");
        for (Substance p : equation.getProducts()) {
            System.out.println(p);
        }

    }
}
```

When you run the program, you'll get the following output:

```
Reactants:

Moles: 1.0
Element data: 
Atomic number: 11	Element symbol: Na	Atomic mass: 22.99	Element type: IONIC	Atoms: 1
Atomic number: 1	Element symbol: H	Atomic mass: 1.01	Element type: IONIC	Atoms: 2

Products:

Moles: 6.0
Element data: 
Atomic number: 8	Element symbol: O	Atomic mass: 16.0	Element type: COVALENT	Atoms: 3
Atomic number: 17	Element symbol: Cl	Atomic mass: 35.45	Element type: COVALENT	Atoms: 4

Moles: 1.0
Element data: 
Atomic number: 1	Element symbol: H	Atomic mass: 1.01	Element type: IONIC	Atoms: 2
```

## How it works
The parser in Molecule Master interprets substance strings in the following ways:
- The numbers seen before the substances represents the number of moles
- The numbers seen after underscores represent a subscript for a corresponding molecule

## Conclusion

I hope you enjoy using Molecule Master as much as I enjoyed making it. Feel free to fork and modify the code to meet your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue in my repository.