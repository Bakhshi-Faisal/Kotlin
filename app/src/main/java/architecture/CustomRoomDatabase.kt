package architecture

import chuckNorris.model.ChuckNorrisRoom
import androidx.room.Database
import androidx.room.RoomDatabase
import chuckNorris.dao.ChuckNorrisDao
import oldFeatures.com.example.base.model.LocalDataObjetSample
import oldFeatures.dao.AndroidVersionDao

@Database(
    entities = [
        LocalDataObjetSample::class,
        ChuckNorrisRoom::class
    ],
    version = 2,
    exportSchema = false
)
abstract class  CustomRoomDatabase : RoomDatabase() {

    abstract fun mAndroidVersionDao() : AndroidVersionDao
    abstract fun chuckNorrisDao() : ChuckNorrisDao
}

