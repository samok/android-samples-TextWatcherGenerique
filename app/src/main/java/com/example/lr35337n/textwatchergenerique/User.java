package com.example.lr35337n.textwatchergenerique;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;
import android.text.TextWatcher;

import org.w3c.dom.Text;


/**
 * Created by LR35337N on 08/08/2017.
 */

public class User extends BaseObservable {

    public User() {}

    private String papa;
    private String maman;

    private TextWatcher watcher1= new TextWatcher() {
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


    @Bindable
    public String getPapa() {
        return papa;
    }

    public void setPapa(String papa) {
        this.papa = papa;
        notifyPropertyChanged(BR.papa);
    }
    @Bindable
    public String getMaman() {
        return maman;
    }

    public void setMaman(String maman) {
        this.maman = maman;
        notifyPropertyChanged(BR.maman);
    }


    @Bindable
    public TextWatcher getWatcher1() {
        return watcher1;
    }

    public void setWatcher1(TextWatcher watcher1) {
        this.watcher1 = watcher1;
        notifyPropertyChanged(BR.watcher1);
    }
}
