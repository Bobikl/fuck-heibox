package com.max.hbcustomview.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: TopLinearSmoothScroller.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends LinearSmoothScroller {
    public static ChangeQuickRedirect changeQuickRedirect;

    public b(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        return -1;
    }
}
