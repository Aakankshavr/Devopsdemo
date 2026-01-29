
package com.addressbook;
import java.util.*;

public class AddressBook {
    private List<String> contacts = new ArrayList<>();

    public void addContact(String name) {
        contacts.add(name);
    }

    public List<String> getContacts() {
        return contacts;
    }

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addContact("Aakanksha");
        System.out.println("Contacts: " + ab.getContacts());
    }
}