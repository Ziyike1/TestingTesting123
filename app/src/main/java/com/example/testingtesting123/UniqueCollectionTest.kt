package com.example.testingtesting123

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    private lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }

    @Test
    fun remove_removesExistingItem() {
        val item = Item("TestItem")
        collection.addItem(item)
        collection.remove(item)
        assertEquals(0, collection.size())
    }
}