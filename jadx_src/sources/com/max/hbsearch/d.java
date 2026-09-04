package com.max.hbsearch;

import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: HotSearchSliceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ void a(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.H1, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b(textView, z10);
    }

    private static final void b(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.G1, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setTextColor(textView.getContext().getColor(R.color.text_primary_1_color));
        } else {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            textView.setTextColor(textView.getContext().getColor(R.color.text_primary_2_color));
        }
    }
}
