# Project-Stock Market Charting
## Read Instructions for deployment on localhost

##IMPORTANT

Please Make sure you have created the database with the name "stock_exchange"

##FRONTEND

-Change directory to frontend
>ng serve
-Navigate to http://localhost:4200/.

-if error : Could not find module “@angular-devkit/build-angular”
>npm install --save-dev @angular-devkit/build-angular
-if error : found 91 vulnerabilities (87 low, 1 moderate, 3 high)
  run `npm audit fix` to fix them, or `npm audit` for details
>npm audit fix

-Now run 
>ng serve
-Navigate to http://localhost:4200/.


##BACKEND

Deploy backend from sts or intellij after building from maven 
Start Service one after another in the order :

1. Admin-Server
2. Config-Server
3. EurekaApplication
4. ZullApplication
5. AuthApplication
6. UserApplication
7. CompanyApplication
8. StockExchangeApplication
9. UploadexcelApplication




