package dev.wanjira.mycontact

import android.provider.ContactsContract

data class Contacts(
    var name: String,
    var phone: String,
    var email: String,
    var address: String,
    var image: String,
)
