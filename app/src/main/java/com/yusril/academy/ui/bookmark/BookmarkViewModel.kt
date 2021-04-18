package com.yusril.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.yusril.academy.data.CourseEntity
import com.yusril.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourse()

}