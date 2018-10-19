package com.elazaro.contactlist.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.elazaro.contactlist.R;
import com.elazaro.contactlist.adapters.ContactsAdapter;
import com.elazaro.contactlist.models.Person;
import com.elazaro.contactlist.repositories.PersonRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsList = (RecyclerView) findViewById(R.id.contact_list);

        contactsList.setLayoutManager(new LinearLayoutManager(this));

        ContactsAdapter adapter = new ContactsAdapter();

        List<Person> persons = PersonRepository.getPersons();
        adapter.setPersons(persons);

        contactsList.setAdapter(adapter);
    }
}

