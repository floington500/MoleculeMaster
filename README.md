# Molecule Master

Welcome to Molecule Master, a framework designed for easy creation of elements on the periodic table.

## Installation

To use Molecule Master, simply clone this repository onto your local machine and navigate to the root directory of the project. From there, you are free to use the program however you see fit.

```bash
git clone https://github.com/username/stoicmd.git
cd stoicmd
```

## Usage
Here's an example of how to use the Molecule Master framework:

```java
import me.flo456123.common.substance.Substance;
import me.flo456123.common.equation.ChemicalEquation;

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
The parser in Molecule Master interprets chemical equation strings in the following way:
- The numbers seen before the compounds/molecule represent the number of moles
- The numbers seen after underscores represent a subscript for a corresponding substance

## Conclusion

I hope you enjoy using Molecule Master as much as I enjoyed building it. Feel free to fork and modify the code to meet your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue in my repository.