To tackle this problem we need to come up with the design pattern. 
Requirements: 
•	Individual garment objects such as tops, pants, and shoes. They need to match other objects of the same family. 
•	Avoid changing existing code when adding new products or family of products.
•	Because vendors update their catalogs frequently, need flexible solutions.
Solution:
1.	Define Abstract Interfaces - allows us to have different pieces of clothes such as Top, Pants, and Shoes without making them specific to the “family” type.
2.	Specific or concrete product classes – such as professional tops or pants and shoes. Gives the necessary functionality to each type.
3.	Abstract Factory Interface: creates an interface for an abstract factory with methods for different types of garments.
4.	Actual Factory Classes: casual Factory, professional, and party for example. Each factory should be able to create instances of the corresponding garment products. 
5.	Driver Class(main) – uses the abstract factory to create garments, and switches between factories such as Professional or Casual based on the preferences. 
Summary: this way we have a flexible way to create new pieces of clothes of different styles without changing our previously written code and updating as we go. The solution implements a flexible way to update and expand the catalog through utilization of Interfaces with abstract methods that are not specifically defined and can be changed in the actual classes. This saves us time in the future in case something needs to be adjusted. 

