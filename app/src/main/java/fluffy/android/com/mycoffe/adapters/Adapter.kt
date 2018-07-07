package fluffy.android.com.mycoffe.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import fluffy.android.com.mycoffe.adapters.viewholders.CoffeeItemViewHolder
import fluffy.android.com.mycoffe.adapters.viewholders.DefaultViewHolder
import fluffy.android.com.mycoffe.R

class Adapter(val items : List<Any>, val context: Context) : RecyclerView.Adapter<DefaultViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefaultViewHolder {
        return CoffeeItemViewHolder(LayoutInflater.from(context).inflate(R.layout.coffee_item_view_holder, parent, false))
    }

    override fun onBindViewHolder(holder: DefaultViewHolder, position: Int) {
        holder.bindViewHolder(items[position])
    }
}