import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import chuckNorris.model.ChuckNorrisUi
import com.bumptech.glide.Glide
import com.example.base.databinding.ItemChuckNorrisBinding

val diffUtils = object : DiffUtil.ItemCallback<ChuckNorrisUi>() {
    override fun areItemsTheSame(oldItem: ChuckNorrisUi, newItem: ChuckNorrisUi): Boolean {
        return oldItem == newItem
    }


    override fun areContentsTheSame(oldItem: ChuckNorrisUi, newItem: ChuckNorrisUi): Boolean {
        return oldItem == newItem
    }

}
class ChuckNorrisQuoteViewHolder(
    val binding: ItemChuckNorrisBinding
) : RecyclerView.ViewHolder(binding.root) {


    private lateinit var ui: ChuckNorrisUi


    fun bind(chuckNorrisUi: ChuckNorrisUi) {
        ui = chuckNorrisUi
        Glide.with(itemView.context)
            .load(chuckNorrisUi.iconUrl)
            .into(binding.itemChuckNorrisIcon)


        binding.itemChuckNorrisQuote.text = chuckNorrisUi.quote
    }
}
class ChuckNorrisAdapter : ListAdapter<ChuckNorrisUi, ChuckNorrisQuoteViewHolder>(diffUtils) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChuckNorrisQuoteViewHolder {
        return ChuckNorrisQuoteViewHolder(
            ItemChuckNorrisBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: ChuckNorrisQuoteViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}





