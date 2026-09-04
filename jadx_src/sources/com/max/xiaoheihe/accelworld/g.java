package com.max.xiaoheihe.accelworld;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldContext.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d Context context, @dl.d File file) {
        if (PatchProxy.proxy(new Object[]{context, file}, null, changeQuickRedirect, true, bb.c.m.Ov, new Class[]{Context.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<this>");
        f0.p(file, "file");
        com.max.hbimage.b.l0(context, file.getAbsolutePath());
    }

    public static final void b(@dl.d Context context, @dl.d String absolutePath) {
        if (PatchProxy.proxy(new Object[]{context, absolutePath}, null, changeQuickRedirect, true, bb.c.m.Pv, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<this>");
        f0.p(absolutePath, "absolutePath");
        com.max.hbimage.b.l0(context, absolutePath);
    }
}
