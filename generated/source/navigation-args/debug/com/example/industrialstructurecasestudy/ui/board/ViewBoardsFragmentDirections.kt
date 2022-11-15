package com.example.industrialstructurecasestudy.ui.board

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.industrialstructurecasestudy.R

public class ViewBoardsFragmentDirections private constructor() {
  public companion object {
    public fun actionViewBoardsFragmentToViewListsAndCardsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_viewBoardsFragment_to_viewListsAndCardsFragment)
  }
}
