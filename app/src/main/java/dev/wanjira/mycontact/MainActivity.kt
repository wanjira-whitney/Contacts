package dev.wanjira.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wanjira.mycontact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact  = Contacts("Wanji", "0703370627", "wanjirawhitney@gmail.com","Statehouse avenue","https://i.pinimg.com/236x/c1/1e/b2/c11eb2d151d7e88a35579f7dff86d3ea.jpg")
        var contact1  = Contacts("Kavosii", "0703389667", "ashakavosii@gmail.com","Kileleshwa", "https://i.pinimg.com/236x/cf/ff/96/cfff96ea81a5689e34d48123cd93baba.jpg")
        var contact2  = Contacts("Moh", "0703370627", "kamaurenee@gmail.com","Lavignton", "https://i.pinimg.com/236x/29/3f/d1/293fd1ef48f9048c79e6c20362e7c6e0.jpg")
        var contact3  = Contacts("Sasha", "0703370627", "Sashhhrubo@gmail.com","Kilimani", "https://i.pinimg.com/236x/4e/c5/8a/4ec58af82672ed679b90377d81f60143.jpg")
        var contact4  = Contacts("Minime", "0703370627", "albunus@gmail.com","phase1", "https://i.pinimg.com/564x/f8/c6/cc/f8c6cca65a77474189fc4217b2aeaa6d.jpg")
        var contact5  = Contacts("Bazzney", "0703370627", "bazzneynjiru@gmail.com","kasarani", "https://i.pinimg.com/564x/a4/44/e2/a444e207cb32749a5e7db455f3c066c6.jpg")
        var contact6  = Contacts("Greybami", "0703370627", "bamibami@gmail.com","ngumba", "https://i.pinimg.com/236x/4b/9a/b0/4b9ab09a8ce61eed736b19aa707a9129.jpg")


        var contactList = listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6)
        var contactAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }

}