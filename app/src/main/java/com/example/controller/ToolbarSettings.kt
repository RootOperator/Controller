package com.example.controller

import android.content.Intent
import android.media.Image
import android.view.View
import android.widget.ImageButton

fun toolbarSetup(toolbar: View, intent: Intent, startActivity: (Intent) -> Unit) {
    val addButton = toolbar.findViewById<ImageButton>(R.id.btn_toolbar_add)

    addButton.setOnClickListener {
        startActivity(intent)
    }
}

fun removeToolbarButton(toolbar: View) {
    val button = toolbar.findViewById<ImageButton>(R.id.btn_toolbar_add)
    button.setImageResource(0)
}