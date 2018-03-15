package co.hitcompany.cvjosegiraldo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by Jose on 15/03/2018.
 */
class AdapterRvNavigation(val data:List<ItemNavigationView>): RecyclerView.Adapter<AdapterRvNavigation.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(parent?.inflate(R.layout.navigation_view_item))

    class Holder(itemView: View?):RecyclerView.ViewHolder(itemView){
        fun bindView(itemNavigationView:ItemNavigationView){

        }
    }
}