package view

import Repository.AndroidVersionRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.base.model.MyObjectForRecyclerView
import com.example.base.model.ObjectDataHeaderSample
import com.example.base.model.ObjectDataSample

class AndroidVersionViewModel : ViewModel() {

    private val androidVersionRepository: AndroidVersionRepository by lazy { AndroidVersionRepository() }

    private val _androidVersionList = MutableLiveData<List<MyObjectForRecyclerView>>()


    val androidVersionList: LiveData<List<MyObjectForRecyclerView>> get() = _androidVersionList


    init {
        _androidVersionList.postValue(androidVersionRepository.generateFakeData())
    }




}