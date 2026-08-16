# Journal
Phase 1-
Created attributes with private access modifier so only can be changed by the class itself.
Made the getters protected to make sure only subclasses and other packages can access, 
the toString override is public because so is the original version it's overriding. 
controlling the flow of data down to only what's necessary prevents data from unintentionally or maliciously changed.

Phase 2-
Set Attributes in the superclass by using the super() and pass in the values used by the superclass constructor. 
You could probably do the same by creating setters inside the superclass and call them inside the subclass constuctor.

Phase 3-
It wouldn't compile without either specifing that it throws the exception or handling in the subclass due to the super call in the constuctor. 
It would probably be better to be handled before the object creation, like upon input from user to make it smoother.
