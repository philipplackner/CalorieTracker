package com.plcoding.core.util

import android.content.Context
import androidx.annotation.StringRes

sealed class UiText {
    data class DynamicString(val text: String): UiText()
    data class StringResource(val resId: Int): UiText()

    fun asString(context: Context): String {
        return when(this) {
            is DynamicString -> text
            is StringResource -> context.getString(resId)
        }
    }
}
