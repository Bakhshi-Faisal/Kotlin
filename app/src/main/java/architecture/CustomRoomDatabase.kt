package architecture

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.base.model.LocalDataObjetSample
import dao.AndroidVersionDao

@Database(
    entities = [
        LocalDataObjetSample::class
    ],
    version = 1,
    exportSchema = false
)
abstract class CustomRoomDatabase : RoomDatabase() {

    abstract fun mAndroidVersionDao() : AndroidVersionDao
}

