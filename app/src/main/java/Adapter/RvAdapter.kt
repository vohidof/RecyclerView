package Adapter

import Models.User
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import kotlinx.android.synthetic.main.item_rv.view.*

class RvAdapter(val context:Context, var list: List<User>)
    :RecyclerView.Adapter<RvAdapter.MyViewHolder>(){
    inner class MyViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView){
        fun onBind(user: User, position: Int){
            itemView.txt_item_rv.text = user.name
            itemView.img_rv.setImageResource(user.imageAddress!!)
            itemView.animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}