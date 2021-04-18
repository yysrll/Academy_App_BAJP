package com.yusril.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.yusril.academy.data.CourseEntity
import com.yusril.academy.utils.DataDummy

class AcademyViewModel : ViewModel(){

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourse()
}