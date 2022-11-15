package com.example.industrialstructurecasestudy.ui.board

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ViewBoardsFragmentArgs(
  public val id: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("id", this.id)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ViewBoardsFragmentArgs {
      bundle.setClassLoader(ViewBoardsFragmentArgs::class.java.classLoader)
      val __id : String?
      if (bundle.containsKey("id")) {
        __id = bundle.getString("id")
        if (__id == null) {
          throw IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
      }
      return ViewBoardsFragmentArgs(__id)
    }
  }
}
