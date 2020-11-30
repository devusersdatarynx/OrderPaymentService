# OrderPaymentService


# Database Schema
create database order_database;
use order_database;
create database payment_database;
use payment_database;


# for API GATEWAY start the cloud-gateway service use corresponding port   

 # for individual service test use below payload
 
 http://localhost:9192/order/bookOdrer

{
    "id": 103,
    "name": "mobile",
    "qty": 1,
    "price": 8000.0
}

http://localhost:9191/payment/doPayment

{
	"paymentstatus":"success"
}

response 

{
    "paymentId": 1,
    "paymentStatus": "success",
    "transactionId": "dc842688-9325-48d8-b5c7-27f9ec307041"
}

# Order-service calling  Payment service

http://localhost:9192/order/bookOdrer

{
   "order":{
              "id":120,
              "name":"mobile",
              "qty" : 3,
              "price": 8000			  
           },
		   
     "payment":{
	            
	           }
	 
   
}


# using API Gateway
-===================

API-GateWay
URL : http://localhost:8989/order/bookOrder
HTTP Method : POST
Json Request :

{
	"order":{
		"id":103,
		"name":"Mobile",
		"qty":1,
		"price":8000
		
	},
	"payment":{}
}
Json Response :

{
    "order": {
        "id": 26,
        "name": "ear-phone",
        "qty": 5,
        "price": 4000
    },
    "amount": 4000,
    "transactionId": "9a021fa6-2061-4332-bdb7-b1358b3430c2",
    "message": "payment processing successful and order placed"
}
URL : http://localhost:8989/payment/26
HTTP Method : GET
Json Response :

{
    "paymentId": 1,
    "transactionId": "d86cfeca-0b26-455e-a1a2-ac3e53707829",
    "orderId": 103,
    "paymentStatus": "SUCCESS",
    "amount":4000
}


