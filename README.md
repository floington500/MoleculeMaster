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
import com.github.flo456123.common.parser.Parser;
import com.github.flo456123.common.types.Substance;

public class Main {
    public static void main(String[] args) {
        Substance substance = Parser.parseSubstanceString("H_2O");

        System.out.println(substance);
    }
}
```

When you run the program, you'll get the following output:

```
Substance {
    n = 1.0,
    elements = [
        Element {
            data = ElementData {
                symbol = 'H',
                name = 'Hydrogen',
                atomicNumber = 1,
                atomicMass = 1.008,
                elementType = COVALENT
            },
            atoms = 2
        },
        Element {
            data = ElementData {
                symbol = 'O',
                name = 'Oxygen',
                atomicNumber = 8,
                atomicMass = 15.999,
                elementType = COVALENT
            },
            atoms = 1
        }
    ]
}
```

## How it works
The parser in Molecule Master interprets substance strings in the following ways:
- The numbers seen before the substances represents the number of moles
- The numbers seen after underscores represent a subscript for a corresponding molecule

## Conclusion

I hope you enjoy using Molecule Master as much as I enjoyed making it. Feel free to fork and modify the code to meet your needs. If you encounter any issues or have any suggestions, please let me know by raising an issue in my repository.