# Project AfricanCooking

With the aim of promoting African cooking culture, this application will aim to list African restaurants and their menus. This information will be made available to users who, depending on their location, will receive a list of the nearest African restaurants.

## Resources

### Abstract Class User

### Abstract Class LegalPerson (GmBH, UG,...)
	1. attribut
		* CompanyName
		* CompanyAdresse
		* DateOfCreation

### Abstract Class NaturalPerson (Einzelunternehmen)
	1. attribut
		

### Class Restaurant
	The restaurant user represents the account of a restaurant. This user must have an account in order for his profile to be visible to potential customers.
	1. attribut	
		* RestaurantOwner from typ User (can be NaturalPerson or LegalPerson)
		* Address
		* HoursOfopening	
		* ListOfMenu
		* Rating (Bewertung)
	The restaurant user represents the account of a restaurant. This user must have an account in order for his profile to be visible to potential customers.
	1. attribut	
		* Address
		* HoursOfopening	
		* ListOfMenu
		* Rating (Bewertung)

### Class Starter (Vorspeise)
	1. attribut
		* StarterName
		* StarterIngredient --> List of Ingredients (List<String>)
		* StarterPicture
		* StarterPrice

### Class MainDish (Hauptgericht)
	1. attribut	
		* MainDishName
		* MainDishIngredient --> List of Ingredients (List<String>)
		* MainDishPicture
		* MainDishPrice

### Class Dessert (Nachtisch)
	1. attribut
		* DessertName
		* DessertIngredient --> List of Ingredients (List<String>)
		* DessertPicture
		* DessertPrice

### Class Boisson
	1. attribut
		* BoissonName
		* BoissonPicture
		* BoissonPrice

### Class Menu
	1. attribut
		* MenuName
		* MenuPicture
	
	2. Constructor
		* Menu(List<Starter> starterList, MainDish mainDish, Dessert dessert)

### Class Customer
	CustomerName
	CustomerLocation

