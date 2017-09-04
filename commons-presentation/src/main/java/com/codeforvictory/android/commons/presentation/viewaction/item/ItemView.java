package com.codeforvictory.android.commons.presentation.viewaction.item;

import android.support.annotation.NonNull;

/**
 * All the List views to be rendered should implement this interface in order to provide a common
 * way to show the model information associated to the list.
 */
public interface ItemView<C> {
  void showContent(@NonNull C content, int position, int totalItems);
}



