package Repository

import com.example.base.model.MyObjectForRecyclerView
import com.example.base.model.ObjectDataHeaderSample
import com.example.base.model.ObjectDataSample

class AndroidVersionRepository {
    fun generateFakeData(): MutableList<MyObjectForRecyclerView> {
        val result = mutableListOf<MyObjectForRecyclerView>()
        // Create data raw
        mutableListOf(
            ObjectDataSample("Android Lollipop", 5,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android Marshmallow", 4,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android Nougat", 7,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android Oreo", 8,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android Pie", 9,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android Q", 10,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android R", 11,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg"),
            ObjectDataSample("Android S", 12,"https://ih1.redbubble.net/image.545342841.2376/flat,1000x1000,075,f.u2.jpg")
        ).groupBy {
            // Split in 2 list, modulo and not
            it.versionCode % 2 == 0
        }.forEach { (isModulo, items) ->
            // For each mean for each list split
            // Here we have a map (key = isModulo) and each key have a list of it's items
            result.add(ObjectDataHeaderSample("Is modulo : $isModulo"))
            result.addAll(items)
        }
        return result
    }

}