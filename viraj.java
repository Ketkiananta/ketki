
class Animal{
void makeSound(){
System.out.println("Animal sound");
}}
class cat extends Animal{
void makeSound(){
System.out.println("cat sound");
}}
public class viraj{
public static void main(String[]args){
cat c= new cat();
c.makeSound();
}}
