package co.hitcompany.cvjosegiraldo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.navigation_view_item.view.*
import org.jetbrains.anko.find

/**
 * Created by Jose on 15/03/2018.
 */
class AdapterRvNavigation(val data: List<ItemNavigationView>) : RecyclerView.Adapter<AdapterRvNavigation.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindView(data[position])
        if (position == 0) {
            holder?.txtTitle2?.visibility = View.GONE
            holder?.txtDesc2?.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(parent?.inflate(R.layout.navigation_view_item))

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val imgIcono by lazy {
            itemView?.find<ImageView>(R.id.ivIconItemNavigation)
        }
        val txtTitle by lazy {
            itemView?.find<TextView>(R.id.tvTitleItemNavigation)
        }
        val txtDesc by lazy {
            itemView?.find<TextView>(R.id.tvDescItemNavigation)
        }
        val txtTitle2 by lazy {
            itemView?.find<TextView>(R.id.tvTitleItemNavigation2)
        }
        val txtDesc2 by lazy {
            itemView?.find<TextView>(R.id.tvDescItemNavigation2)
        }

        fun bindView(itemNavigationView: ItemNavigationView) {
            with(itemNavigationView) {
                imgIcono?.setImageResource(itemNavigationView.imgDrawable)
                txtTitle?.text = itemNavigationView.title
                txtDesc?.text = itemNavigationView.desc
                txtTitle2?.text = itemNavigationView.title2
                txtDesc2?.text = itemNavigationView.desc2
            }
        }
    }
}