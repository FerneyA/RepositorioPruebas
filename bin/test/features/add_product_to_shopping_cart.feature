Feature: Buy Product
	As a web user
	I want to find a product
	to add to shopping cart
	
Scenario: Add a product to the shopping cart
	Given that Peter wants to find the product Bicicleta GOLIAT BM1679NGR Wascar Negro
	When he adds the product to the shopping cart
	Then the product Bicicleta GOLIAT BM1679NGR Wascar Negro should be added to the shopping cart successfully
