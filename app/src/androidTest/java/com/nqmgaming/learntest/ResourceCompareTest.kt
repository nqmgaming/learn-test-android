package com.nqmgaming.learntest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before

class ResourceCompareTest {
    private lateinit var resourceCompare: ResourceCompare

    @Before
    fun setup() {
        resourceCompare = ResourceCompare()
    }

    @After
    fun teardown() {
        // Clean up
    }

    @Test
    fun testStringResourceNameSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val resId = R.string.app_name
        val string = "LearnTest"
        assertThat(resourceCompare.isEqual(context, resId, string)).isTrue()
    }

    @Test
    fun testStringResourceNameSameAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val resId = R.string.app_name
        val string = "Learn Test"
        assertThat(resourceCompare.isEqual(context, resId, string)).isFalse()
    }
}