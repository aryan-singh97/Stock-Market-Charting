# Project-Stock Market Charting
## Read Instructions for deployment on localhost

 ## IMPORTANT

Please Make sure you have created the database with the name "stock_exchange"

## FRONTEND

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

### NOTE
-Change directory to frontend

-if error : Could not find module “@angular-devkit/build-angular”

>npm install --save-dev @angular-devkit/build-angular

-if error : found 91 vulnerabilities (87 low, 1 moderate, 3 high)
  run `npm audit fix` to fix them, or `npm audit` for details
  
>npm audit fix

-Then Run

>ng serve

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).



## #BACKEND


To Deploy build from maven 

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

