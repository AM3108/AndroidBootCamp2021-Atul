package com.example.androidbootcamp2021_atul

import android.content.Context
import com.example.androidbootcamp2021_atul.ItemDataClass
import com.example.androidbootcamp2021_atul.ItemModel

// Declared this class as open to test with mockito
open class ItemRepository(context: Context) {

    private val itemModel: ItemModel = ItemModel(context)

    fun getFavoriteItem() = itemModel.getFavoriteItems()

    fun saveFavoriteItem(favItem: ItemDataClass) = itemModel.saveFavoriteItems(favItem)

    fun removeFavoriteItem() = itemModel.removeFavoriteItems()
}