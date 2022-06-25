import java.util.Scanner;

class Person{

    String name;
    String phone;
    String email;

    //metodo contrutor
    public Person(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    //metodo setters para alterar dados
    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void displayPerson(){
        System.out.println("Nome:" + name);
        System.out.println("Email:" + email);
        System.out.println("Telefone:" + phone);
    }
}


public class ContactList {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //array de pessoas
        Person persons[] = new Person[2];

        for (int i = 0; i < persons.length; i ++){
            System.out.println("Nome da pessoa:" + i + ":");
            String name = scanner.nextLine();

            System.out.println("telefone da pessoa" + i + ":");
            String phoneNumber = scanner.nextLine();

            System.out.println("Email da pessoa:" + i + ":");
            String email = scanner.nextLine();

            persons[i] = new Person(name, phoneNumber, email);

            System.out.println();
        }

        for (Person person : persons ){

            person.displayPerson();
            System.out.println();
        }

        //variavael que recebe um objeto da classe Person

        Person p = persons[1];

        //chamando métodos do objeto para alterar o valor do telefone
        p.setPhone("9922365456");

        System.out.println();
        System.out.println("Pessoa alterada");
        System.out.println();

        p.displayPerson();

        scanner.close();
    }
    
}
