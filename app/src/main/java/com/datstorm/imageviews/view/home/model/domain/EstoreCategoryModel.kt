package com.datstorm.estore.view.categories.model.domain

data class EstoreCategoryModel(
    val Code: Int,
    val Message: String,
    val Result: Result,
    val Success: Boolean
)