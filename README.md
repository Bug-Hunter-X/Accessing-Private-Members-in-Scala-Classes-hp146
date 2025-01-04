# Accessing Private Members in Scala Classes

This repository demonstrates a common Scala issue related to accessing private class members.  The `bug.scala` file shows how, although private members are properly hidden, they can be accessed through methods for demonstration purposes. This is not generally recommended in production as it obscures the encapsulation benefits and can lead to maintainability issues. The `bugSolution.scala` file shows a refined design with immutable data and clear public APIs.