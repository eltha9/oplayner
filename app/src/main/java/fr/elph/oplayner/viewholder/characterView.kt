package fr.elph.oplayner.viewholder

import android.view.View
import androidx.appcompat.view.menu.ActionMenuItemView
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import fr.elph.oplayner.R

class characterViewHolder(itemView: View) : FastAdapter.ViewHolder<charcterItem>(itemView){
    init {

    }

    override fun bindView(item: charcterItem, payloads: MutableList<Any>) {

    }

    override fun unbindView(item: charcterItem) {

    }
}

class charcterItem(val character) : AbstractItem<charcterItem, characterViewHolder>(){
    override fun getType()= 0

    override fun getViewHolder(v: View): characterViewHolder {

    }

    override fun getLayoutRes(): Int {

    }
}