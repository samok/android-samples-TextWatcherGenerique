package com.example.lr35337n.textwatchergenerique;

import android.app.DatePickerDialog;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lr35337n.textwatchergenerique.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    /**
     * Met en place un binding et change la valeur de l'objet sur laquelle la vue est binder.
     * Attention, on ne peux pas changer la variable directement. Il faut changer l'objet qui
     * contient la variable
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User();
        user.setMaman("maman");
        user.setPapa("papa");
        user.setWatcher1(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.setUser(user);
        final User use2 = new User();
        use2.setMaman("tata");
        use2.setPapa("tonton");
        boolean test = binding.setVariable(BR.user, use2);
        binding.executePendingBindings();

    }


    /**
     * Creer un watcher avec un comportement predéfinit.
     */
    public void returnWatcher1(){
        TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

    }


}



