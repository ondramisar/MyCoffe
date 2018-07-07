package fluffy.android.com.mycoffe.adapters.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class DefaultViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindViewHolder(data: Any)
}