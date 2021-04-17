package com.yusril.academy.data

data class ModuleEntity(
    var moduleId: String,
    var CourseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
) {
    var contentEntity: ContentEntity? = null
}
