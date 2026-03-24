public class MiniParkingSystem{
public static void main(String[] args){

Totalparking spaces = 20;
Availablespaces = Totalspaces;

for(int count=1; count<=20; count++){
Totalparking spaces[count]=0; 
}

while (true){ 
System.out.println("1. Park Car");
System.out.println("2. Remove Car");
System.out.println("3. Check Available Spaces");
System.out.println("4. Exit");
}
   
if(choice == 1){
    if Availablespaces > 0{
        Availablespaces = Availablespaces -1;
       System.out.println("Enter slot number (1-20):");
}
else{
    System.out.println("Parking Full")
}
}
if(slot == 1){
for count=1 to 20;
    if Totalparking spaces[count]==0;
        Totalparking spaces[count]=1;
System.out.println("Car parked at slot:", i+1);
}

if choice == 2{
    if availablespaces < totalspaces{
        availablespaces = availablespaces + 1;
        System.out.println("Car removed successfully");
}
else{
System.out.println("Parking is already empty");
}
}
if choice == 3{
    System.out.println("Available Spaces: " available spaces);
}
else{
    System.out.println("none");

}

if choice == 4{
    System.out.println("Exit");
}
}
}
