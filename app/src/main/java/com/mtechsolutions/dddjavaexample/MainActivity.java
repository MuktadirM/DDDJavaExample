package com.mtechsolutions.dddjavaexample;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mtechsolutions.dddjavaexample.databinding.ActivityMainBinding;
import com.mtechsolutions.dddjavaexample.domain.auth.AuthValueObject;

import static com.mtechsolutions.dddjavaexample.domain.auth.AuthValueObject.EmailAddress.EmailAddress;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main Activity";
    private ActivityMainBinding binding;

    DatabaseReference mFriendsDatabase;

    FirebaseAuth mAuth;

    String mCurrent_user_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.d(TAG, "onCreate: ");

       AuthValueObject.EmailAddress  emailAddress=  EmailAddress("");

        AuthValueObject.EmailAddress  ee = EmailAddress("");

        ee.getValue();

        mAuth = FirebaseAuth.getInstance();
      //  mAuth.signInAnonymously();

        mCurrent_user_id = mAuth.getCurrentUser().getUid();

        Log.d(TAG, "onCreate: "+mCurrent_user_id);

        mFriendsDatabase = FirebaseDatabase.getInstance().getReference().child("Friends").child(mCurrent_user_id);


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStar0t: "+mFriendsDatabase);
    }
}