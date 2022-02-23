package com.example.assignment6arcfox;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.BaseColumns;

public class PersonContract extends AppCompatActivity {

    public PersonContract() {
    }

    public static abstract class PersonEntry implements BaseColumns {
        public static final String TABLE_NAME = "person";
        public static final String COLUMN_NAME_FIRST = "firstName";
        public static final String COLUMN_NAME_LAST = "lastName";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_EMAIL = "email";
    }
}