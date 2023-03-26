# stoicmd

<p>Welcome to the Stoicmd project, a CLI application that allows you to create your own chemical equations and perform chemistry stoichiometry on them. Although I didn't achieve the initial goal I had set for my project, I made significant progress within the time given.</p>

<p>This project was developed for BH6 and I chose the SPEED theme with the intention of speeding up my chemistry stoichiometry homework. I aimed to create a fully functional chemical equation parser, and I'm excited to share what I've accomplished so far!</p>

## Installation

<p>To use Stoicmd, simply clone this repository onto your local machine and navigate to the root directory of the project.</p>

```bash
git clone https://github.com/username/stoicmd.git
cd stoicmd
```

## Usage
<p>Here's an example of how to use the Stoicmd program:</p>

```java
import me.flo456123.substance.Substance;
import me.flo456123.utils.ChemicalEquation;

public class Main {
public static void main(String[] args) {
ChemicalEquation equation = new ChemicalEquation("NaH_2 -> 6O_3Cl_4 + H_2");

        for (Substance s : equation.getReactants()) {
            System.out.println(s);
        }

        for (Substance s : equation.getProducts()) {
            System.out.println(s);
        }

    }
}
```

<p>When you run the program, you'll get the following output:</p>

```
Moles: 1.0
Element data: 
Atomic number: 11	Element symbol: Na	Atomic mass: 22.99	Element type: IONIC	Atoms: 1
Atomic number: 1	Element symbol: H	Atomic mass: 1.01	Element type: IONIC	Atoms: 2

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

<p>I hope you enjoy using Stoicmd as much as I enjoyed building it. Feel free to fork and modify the code to meet your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue in my repository. Thank you for hosting the fun event!</p>