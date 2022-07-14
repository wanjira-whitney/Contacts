package dev.wanjira.mycontact

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.wanjira.mycontact.databinding.ContactListItemBinding

class ContactRvAdapter(var contactList: List<Contacts>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val context = holder.itemView.context
        var currentContacts = contactList.get(position)
        with(holder.binding){
            tvEmail.text = currentContacts.email
            tvName.text = currentContacts.name
            tvAddress.text = currentContacts.address
            tvContact.text = currentContacts.phone
            Picasso.get()
                .load(currentContacts.image)
                .resize(250,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_person_24)
                .into(imgContact)

            cvContact.setOnClickListener {
                val intent = Intent(context, ViewContactActivity::class.java)
                intent.putExtra("NAME", currentContacts.name)
                intent.putExtra("PHONE_NUMBER", currentContacts.phone)
                intent.putExtra("EMAIL_ADDRESS",currentContacts.email)
                intent.putExtra("LOCATION",currentContacts.address)
                intent.putExtra("IMAGE",currentContacts.image)

                context.startActivity(intent)
            }
            holder.binding.imgContact.setOnClickListener {
                Toast
                    .makeText(context, "You have clicked on my face", Toast.LENGTH_LONG)
                    .show()
            }
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
//class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    var tvContact = itemView.findViewById<TextView>(R.id.tvContact)
//    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
//    var imgContact = itemView.findViewById<ImageView>(R.id.imgContact)
//}
class ContactsViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){

}