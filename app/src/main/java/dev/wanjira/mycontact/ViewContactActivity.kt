package dev.wanjira.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.wanjira.mycontact.databinding.ActivityViewContactBinding
import dev.wanjira.mycontact.databinding.ContactListItemBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        var name = extras?.getString("NAME", "")
        var phone = extras?.getString("PHONE_NUMBER", "")
        var email = extras?.getString("EMAIL", "")
        var address = extras?.getString("LOCATION", "")
        var image = binding.imgProfile


        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()

        binding.tvNamee.text =name
        binding.tvPhone.text =phone
        binding.tvLocation.text =email
        binding.tvPlaceview.text= address

        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)
    }
}