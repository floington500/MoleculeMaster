# stoicmd

<p>Welcome to the Stoicmd project, an application that has a parser for chemical equations along with framework for period 1-3 elements.</p>

## Installation

<p>To use Stoicmd, simply clone this repository onto your local machine and navigate to the root directory of the project. From there, you are free to use the program however you see fit.</p>

```bash
git clone https://github.com/username/stoicmd.git
cd stoicmd
```

## Usage
<p>Here's an example of how to use the Stoicmd program:</p>

```java
import me.flo456123.common.substance.Substance;
import me.flo456123.common.equation.ChemicalEquation;

public class Main {
    public static void main(String[] args) {
        ChemicalEquation equation = new ChemicalEquation("NaH_2 -> 6O_3Cl_4 + H_2");

        System.out.println("Reactants:\n");
        for (Substance s : equation.getReactants()) {
            System.out.println(s);
        }

        System.out.println("Products:\n");
        for (Substance s : equation.getProducts()) {
            System.out.println(s);
        }

    }
}
```

<p>When you run the program, you'll get the following output:</p>

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
<p>The parser in Stoicmd interprets chemical equations in the following way:</p>

<ul>• The numbers seen before the compounds/molecule represent the number of moles</ul>
<ul>• The numbers seen after underscores represent the number of atoms of the individual element.</ul>

## Conclusion

<p>I hope you enjoy using Stoicmd as much as I enjoyed building it. Feel free to fork and modify the code to meet your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue in my repository.</p>