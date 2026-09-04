package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.p0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class MarqueeTextView extends MediumBoldTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), rect}, this, changeQuickRedirect, false, c.m.f34930oa, new Class[]{Boolean.TYPE, Integer.TYPE, Rect.class}, Void.TYPE).isSupported && z10) {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.f34953pa, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            super.onWindowFocusChanged(true);
        }
    }
}
