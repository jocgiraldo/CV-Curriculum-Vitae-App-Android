package co.hitcompany.cvjosegiraldo

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * Created by Jose on 15/03/2018.
 */

fun Activity.toastShort(mensaje:String){
    Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show()
}

fun Activity.toastLong(mensaje:String){
    Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
}

fun ViewGroup.inflate(layoutId:Int): View {
    return LayoutInflater.from(context).inflate(layoutId,this,false)
}