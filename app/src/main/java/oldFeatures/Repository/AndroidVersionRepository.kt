package oldFeatures.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.map

import architecture.CustomApplication
import oldFeatures.com.example.base.model.LocalDataObjetSample
import oldFeatures.com.example.base.model.ObjectDataSample

class AndroidVersionRepository {
    private val mAndroidVersionDao =
        CustomApplication.instance.mApplicationDatabase.mAndroidVersionDao()


    fun selectAllAndroidVersion(): LiveData<List<ObjectDataSample>> {
        return mAndroidVersionDao.selectAll().map { list ->
            list.toObjectDataSample()
        }
    }


    fun insertAndroidVersion(objectDataSample: ObjectDataSample) {
        mAndroidVersionDao.insert(objectDataSample.toRoomObject())
    }


    fun deleteAllAndroidVersion() {
        mAndroidVersionDao.deleteAll()
    }

    private fun ObjectDataSample.toRoomObject(): LocalDataObjetSample {
        return LocalDataObjetSample(
            name = versionName,
            code = versionCode,
            image = versionImage
        )
    }


    private fun List<LocalDataObjetSample>.toObjectDataSample(): List<ObjectDataSample> {
        return map { eachItem ->
            ObjectDataSample(
                versionCode = eachItem.code,
                versionName = eachItem.name,
                versionImage = eachItem.image
            )
        }
    }



}