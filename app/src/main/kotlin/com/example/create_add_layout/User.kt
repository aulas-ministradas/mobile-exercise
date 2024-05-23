package com.example.create_add_layout

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var uid: String? = null,
    val name: String,
    val email: String,
    var phone: String? = null,
    val contactList: ArrayList<Person> = arrayListOf()
): Parcelable