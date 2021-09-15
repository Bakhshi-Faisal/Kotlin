package dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.base.model.LocalDataObjetSample

@Dao
interface AndroidVersionDao {


    @Query("SELECT * FROM android_version_object_table ORDER BY name ASC")
    fun selectAll(): LiveData<List<LocalDataObjetSample>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(androidVersion: LocalDataObjetSample)


    @Query("DELETE FROM android_version_object_table")
    fun deleteAll()
}
