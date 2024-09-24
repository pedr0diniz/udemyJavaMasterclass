package sec10listarraylistlinkedlistiteratorautoboxing.sec10136mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) > -1) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactPosition = findContact(oldContact);
        if (oldContactPosition > -1) {
            myContacts.set(oldContactPosition, newContact);
            return true;
        }

        return false;
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);

        if (contactIndex == -1) {
            return false;
        }

        myContacts.remove(contactIndex);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact curr = myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i+1, curr.getName(), curr.getPhoneNumber());
        }
    }
}
