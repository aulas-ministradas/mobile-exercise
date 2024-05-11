package com.example.create_add_layout

import androidx.recyclerview.widget.RecyclerView
import com.example.create_add_layout.databinding.ContactItemBinding

class PersonViewHolder(private val contactItemBinding: ContactItemBinding) :
    RecyclerView.ViewHolder(contactItemBinding.root) {
    fun bind(person: Person) {
        contactItemBinding.apply {
            txtName.text = person.name
            txtPhone.text = person.phone
            txtAge.text = person.age.toString()
            txtHobby.text = person.hobby
            txtSex.text = person.sex
        }
    }
}