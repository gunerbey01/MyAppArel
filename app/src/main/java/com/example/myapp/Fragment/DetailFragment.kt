package com.example.myapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myapp.R
import com.example.myapp.model.User
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    private val args: DetailFragmentArgs by navArgs()

    private lateinit var userItem: User
    private lateinit var avatar: String
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var id: String

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userItem = args.userItemDetail
        if (userItem != null) {
            avatar = userItem.avatar
            id = userItem.id
            name = userItem.name
            email = userItem.email
        } else {
            avatar = "https://anonim.chat/images/avatar-anonymous.png"
            id = "0535 265 3636"
            name = "Emir Güner"
            email = "emir@gmail.com"
        }

        Glide.with(requireContext()).load(avatar).into(frDetailImageViewProfilePicture)
        frDetailTextViewId.text = id
        frDetailTextViewName.text = name
        frDetailTextViewEmail.text = email

    }

}