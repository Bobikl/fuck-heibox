package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private q() {
    }

    static void a(@n0 Context context, @e1 int i10) {
        Resources.Theme themeB;
        context.getTheme().applyStyle(i10, true);
        if (!(context instanceof Activity) || (themeB = b((Activity) context)) == null) {
            return;
        }
        themeB.applyStyle(i10, true);
    }

    @p0
    private static Resources.Theme b(@n0 Activity activity) {
        View viewPeekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
