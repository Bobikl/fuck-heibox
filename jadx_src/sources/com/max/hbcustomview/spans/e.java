package com.max.hbcustomview.spans;

import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: ClickableImageSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e extends ImageSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    public e(Drawable drawable) {
        super(drawable);
    }

    public abstract void a(View view);
}
