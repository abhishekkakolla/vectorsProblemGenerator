# vectorsProblemGenerator
Program that generates vector problems and allows step-by-step solution tracing

The IB Vectors Assistant program is written in Java. Since the program requires an interactive
user interface, is object-oriented, and involves problem generation, Java was chosen as the
programming language. As the program was developed, focus was placed on incorporating a
comfortable user interface, multiple types of problem generation, and a useful problem step
tracer.

Program Structure

Classes were grouped according to their use into packages. These included components and
pages for the user interface, problem types for each type of problem, objects used in the
problems (such as the Vector and Line classes), and structures used in solution tracing
(LinkedList). Packages were useful in the organization of the program and provided extensibility.

Vector and Line Classes

Encapsulation was heavily used in the program since multiple problems have to be
generated--and each problem has specific vectors, components, and associated structures.
Thus, these components were kept either private or protected to deal with security issues and
improve organization. Getter and setter methods were also implemented. The screenshots
below show the constructors for the Vector class as well as multiple methods that were used by
problems


Step-by-step solution tracing

To trace the solution to each problem, a doubly LinkedList data structure was implemented.
Each problem has a SolutionList that consists of steps (nodes) that lead to the next step or the
previous step (null if it is the head). Each problem instance comes with its own StepButtons that
can be used to traverse through the LinkedList solution

Libraries

The Java Swing library was used for the graphical user interface of the program. To render the
math formulas for each of the steps, an additional library was used. This library was the
open-source JLaTeXMath (JLaTeXMath Github: A Java API to Render LaTeX, 2020). Strings that
contained mathematical latex code were fed as input to create TeXFormula objects. These
objects were then rendered using a JLabel.
