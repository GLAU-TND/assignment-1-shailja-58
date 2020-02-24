package definition;

import definition.MyLinkedList;
import Helper.Node;
import Helper.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    private MyLinkedList<Person> linkedList;
    private Scanner scan;

    public Menu() {                     //constructor
        scan = new Scanner(System.in);
        linkedList = new MyLinkedList<>();
    }
