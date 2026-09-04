package com.max.hbcustomview.bannerview.provider;

import android.view.View;
import androidx.annotation.w0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ViewStyleSetter.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @w0(api = 21)
    public static void a(View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.f32674xh, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        view.setClipToOutline(true);
        view.setOutlineProvider(new b(f10));
    }
}
