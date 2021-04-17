package com.yusril.academy.ui.bookmark

import com.yusril.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
