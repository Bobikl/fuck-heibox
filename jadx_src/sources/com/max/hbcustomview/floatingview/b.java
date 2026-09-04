package com.max.hbcustomview.floatingview;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.v;

/* JADX INFO: compiled from: IFloatingView.java */
/* JADX INFO: loaded from: classes10.dex */
public interface b {
    a a(@v int i10);

    a b(FrameLayout frameLayout);

    a c(Context context);

    a d(Activity activity);

    a e(ViewGroup.LayoutParams layoutParams);

    a f(Activity activity);

    a g(FrameLayout frameLayout);

    EnFloatingView getView();

    a h(c cVar);

    a remove();
}
