package de.tu_dresden.gettogether.services;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.provider.ContactsContract.PhoneLookup;

import de.tu_dresden.gettogether.domain.Contact;

/**
 * @author Markus Frank
 * 
 * Service class that reads the users Contact list.
 *
 */
public class PhoneBookReader {
	
	
	
	/**
	 * Reads the phonebook and returns all contacts
	 * @return Arraylist of contacts
	 */
	public static ArrayList<Contact> readAllContacts(Context c){
		ArrayList<Contact> phonebook = new ArrayList<Contact>();
		
		// get list of all contacts
		Cursor people = c.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
		// Column indexs for the requiered fields
		int nameFieldColumnIndex = people.getColumnIndex(PhoneLookup.DISPLAY_NAME);
		int numberFieldColumnIndex = people.getColumnIndex(PhoneLookup.NUMBER);
		
		// interate throw the contacts
		String name, number;
		while(people.moveToNext()) {
		   name = people.getString(nameFieldColumnIndex);
		   number = people.getString(numberFieldColumnIndex);
		   
		   phonebook.add(new Contact(name, "", number));
		}

		people.close();
		
		return phonebook;
	}

}
