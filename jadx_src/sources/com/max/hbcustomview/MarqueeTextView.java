package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class MarqueeTextView extends TextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.W7, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MarqueeTextView.this.setSelected(true);
        }
    }

    public MarqueeTextView(Context context) {
        super(context);
        a();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.V7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        postDelayed(new a(), 3000L);
    }
}
