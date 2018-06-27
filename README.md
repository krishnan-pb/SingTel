# SingTel
I have created seperate package for each section.
Section A
1a. Add sing() method inside Bird Class.
 You can unit test Solution class and ensure when sing() method is called it prints "I am Singing".  Alternately you can write JUNIT testcases and use assertion for testing sample code SolutionTest
1b. The first approach is not scalable/maintainable if we have a new animal that cannot walk it wont fit into inheritance hierarchy.
To solve this create Animal abstract calss remove its behaviour walk(),sing(),fly() and add it to an interface so that a concrete class ex. Bird can extend Animal(Inheritance is a) and implement behavious walkIF, singIF, FlyIF(Coding to interface which decouples behaviour) - Test class TestSecA1B

2. Added new interface SwimIF with method swim, re organise Bird to extend Animal and implement walkIF, singIF since all birds can walk and sing but may not fly or swim.
Create a subcalss Duck which extends Bird and implements SwimIF and FlyIF interface where as Chicken(extends Bird) will just override the sing method. Test class TestSecA2

3. A Rooster is a male Chicken, We can add an enum Sex in Animal class with setter getter as all animals have sex(Assume MALE, FEMALE).
Depending on sex the sing() method will sing Cluck, cluck if FEMALE or Cock-a-doodle-doo if MALE - Test class TestSecA3

4. We can use a decorator pattern to produce different sing() depending on which animal does the Parrot live with. ParrotDecorator is the base decorator class and all other decorators extend this to produce different output for sing method. To add different behaviour for the same class during runtine we can use decorator pattern. If we need to add new parrot living near phone or duck we need to add a new decorator rather than changing the Parrot class. Test class TestSecA4

Section B
1. SwimmingAnimals extends Animals and implements SwimIF. Fish extends SwimmingAnimals.

2. Fish has size and color property. SharkFish extends Fish has eat() method as only sharks eat other fish and ClownFish extends Fish and can makeJokes.

3. Dolphin can direct extend SwimmingAnimals as they are not fish and can swim as SwimmingAnimals implements SwimIF, one way to re use code is to keep the common functionality in the Base class or implemnt common behaviour (Interface SwimIF) in base class itself as all aquatic animals can swim.
Test class TestSecB

Section D
1. Create an Insects class which extends Animal, and Butterfly extends Insects and implements FlyIF.

2. Create an Catterpillar class which extends Insects, we can add an Metamorphosis (Adaptor Class) which has a trnaform method that transforms the catterpillar ro butterfly.

Section E
You can implement factory pattern AnimalFactory which is object creational pattern then add the objects to the list and then count the naimals that can fly, sing, swim, walk (Not all ducks can fly) Test Class TestSecE

BONUS.
1. We can consider this as localisation, we can have a map of languages and its translation and depending on native language we can print the corresponding sounf for EX Rooster sound in tamil is Kokorokooko. Test Class TestSecBonus

2. REST webservice get List of animals, similarly we can have specific api for counts.
Sample code is written using SPRING. AnimalController is the Controller which returns the list of animals for GET request. 
