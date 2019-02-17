# Java Singleton

- Singleton Pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the JVM.

- ---

- The singleton class must provide a global access point to get the instance of the class.

- ---

- Singleton Pattern is used for logging, driver objects, caching and thread pool.

- ---

- Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Faced etc.

###### There are several approaches to implement Singleton Pattern but these three concepts are common for all.

- [ ] Private constructor to restrict instantaition of the class from other classes.

- [ ] Private static variable of the same class that is the only instance of the class.

- [ ] Public static method to get the instance of the singleton class.

###### Eight Different approaches of Singleton Pattern Implementation

1. [Eager Initialization]()

2. Static Block Initialization

3. Lazy Initialization

4. Thread Safe Singleton

5. Bill Pugh Singleton Implementation

6. Using Reflection to Destroy Singleton Pattern

7. Enum Singleton

8. Serialization and Singleton

### [Eager Initialization]()

    In eager initialization, the instance of Singleton Class is created at the time of class loading, this is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it.

    If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections etc. We should avoid the instantiation until unless client calls the`getInstance`method. Also, this method doesn’t provide any options for exception handling.
