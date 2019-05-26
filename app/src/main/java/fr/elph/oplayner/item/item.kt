package fr.elph.oplayner.item

import com.mikepenz.fastadapter.FastAdapter

class viewHolder : FastAdapter.ViewHolder<Item>{
    val
    init{

    }

    override fun bindView(item: Item, payloads: MutableList<Any>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unbindView(item: Item) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Item(val name : ) : abstractItem<Item, viewHolder>(){
    override fun getType() =0

    override fun getViewHolder(v:View) = viewHolder(v)
    override fun getLayoutRes() = R.layout.row_content
}