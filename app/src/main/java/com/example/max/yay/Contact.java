package com.example.max.yay;

/**
 * Created by Max on 2015-01-18.
 */

public class Contact {

    //private variables
    int _id;
    String _name;



    // Empty constructor
    public Contact() {

    }

    // constructor
    public Contact(int id, String name) {
        this._id = id;
        this._name = name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

}