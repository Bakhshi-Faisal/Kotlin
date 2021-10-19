package chuckNorris.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import chuckNorris.model.ChuckNorrisRoom

@Dao
interface ChuckNorrisDao {


    @Query("SELECT * FROM chuck_norris_quote")
    fun selectAll() : LiveData<List<ChuckNorrisRoom>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(chuckNorrisRoom: ChuckNorrisRoom)


    @Query("DELETE FROM chuck_norris_quote")
    fun deleteAll()
}
