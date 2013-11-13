package de.tu_dresden.gettogether.view;

import java.util.ArrayList;

import de.tu_dresden.gettogether.R;
import de.tu_dresden.gettogether.R.layout;
import de.tu_dresden.gettogether.R.menu;
import de.tu_dresden.gettogether.domain.Contact;
import de.tu_dresden.gettogether.services.PhoneBookReader;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayList<Contact> contacts = PhoneBookReader.readAllContacts(getApplicationContext());
		System.out.println(contacts.get(0).getFirstname());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
