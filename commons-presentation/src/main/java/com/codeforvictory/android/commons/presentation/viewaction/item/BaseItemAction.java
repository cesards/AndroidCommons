package com.codeforvictory.android.commons.presentation.viewaction.item;

import android.support.annotation.NonNull;

public abstract class BaseItemAction<C, V extends ItemView<C>> {

  protected final V itemView;

  public BaseItemAction(V itemView) {
    this.itemView = itemView;
  }

  public void showContent(@NonNull C content, int position, int totalItems) {
    itemView.showContent(content, position, totalItems);
  }
}
