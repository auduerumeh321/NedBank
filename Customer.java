class Customer{
String name;
int age;
long phoneNumber;


Customer(){}

Customer(String name,int age,long phoneNumber){
this.name=name;
this.age=age;
this.phoneNumber=phoneNumber;

}


void displayCashAmount(){
System.out.print(name);
System.out.print(age);
System.out.print(phoneNumber);

}

}

