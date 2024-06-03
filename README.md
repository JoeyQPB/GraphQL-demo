GraphQL Commands

	CREATE CATEGORY
 mutation {
   addCategory(categoryInput: {name: "Informática"}) {
     name
     id
   }
 }

	GET CATEGORY BY ID
 query {
   categoryById(id: "UUID") {
     name
   }
 }

	GET ALL CATEGORIES
 query {
   allCategories {
     id
     name
   }
 }

 
 	CREATE Product
 mutation {
   addProduct(productInput: {name: "Mouse", price: 30, categoryId: "627df1bf-c61d-42f2-9b08-44a143d269b8"}) {
     id
     name
     price
     categoryId
   }
 }

	GET PRODUCT BY ID
 query {
   productById(id: "UUID") {
     name
     price
   }
 }

	GET ALL PRODUCTS
 query {
   allProducts {
     name
     price
     category {
       name
     }
   }
}
