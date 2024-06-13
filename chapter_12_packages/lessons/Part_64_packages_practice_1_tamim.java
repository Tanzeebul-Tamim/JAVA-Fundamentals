package tamim;

//! Compiling without packages 
//* Run "javac .\Part_64_packages.java" to compile and create a byte code (.class) file (javac is java compiler)
//* Run "java Part_64_packages" to execute the byte code (.class) file

/*
    ! If you have compiled a .java file that contains user-defined (custom) package and then try to execute the byte code using the above command, it will throw an error:
    * Error: Could not find or load main class Part_64_package
    * Caused by: java.lang.NoClassDefFoundError: tamim/Part_64_packages (wrong name: Part_64_packages)

    ! Rather you should user this command to compile the .java file, if you have user-defined (custom) packages in your file:
    * javac -d .\bin Part_64_packages_practice_1_tamim.java
    * (.\bin mean it will create a bin folder inside the current directory and then create the packages of the "Part_64_packages_practice_1_tamim" file inside it)

    ! If you want to create the packages inside the current directory and compile all the files at once, use this command:
    * javac -d . *.java
    * (. means it will create the packages inside the current directory and put the byte code files in their corresponding packages)
 */

public class Part_64_packages_practice_1_tamim {
    public static void main(String[] args) {
        System.out.println("I am tamim");
    }
}
