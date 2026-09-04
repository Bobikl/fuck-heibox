package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PicturePostFromCommentBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83021b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final WeakReference<Context> f83022a;

    public n(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.f83022a = new WeakReference<>(context);
    }

    private final Bitmap a(String str, Context context, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context, str2}, this, changeQuickRedirect, false, 30126, new Class[]{String.class, Context.class, String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        com.max.commentimagepainter.b bVar = com.max.commentimagepainter.b.f65242a;
        int iD = ic.a.f119343a.d(context);
        Resources resources = context.getResources();
        kotlin.jvm.internal.f0.o(resources, "context.resources");
        return bVar.e(iD, resources, str, str2);
    }

    private final File d(Context context, Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bitmap}, this, changeQuickRedirect, false, 30127, new Class[]{Context.class, Bitmap.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File fileQ0 = com.max.hbimage.b.q0(bitmap, PictureVideoEditPostFragment.g7(context));
        kotlin.jvm.internal.f0.o(fileQ0, "saveBitmap(\n            …hePath(context)\n        )");
        return fileQ0;
    }

    @dl.e
    public final Bitmap b(@dl.e String str, @dl.d String colorString) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, colorString}, this, changeQuickRedirect, false, 30124, new Class[]{String.class, String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(colorString, "colorString");
        Context context = this.f83022a.get();
        if (context == null) {
            return null;
        }
        if (str == null || kotlin.text.u.V1(str)) {
            return null;
        }
        return a(str, context, colorString);
    }

    @dl.e
    public final String c(@dl.d Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 30125, new Class[]{Bitmap.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        Context context = this.f83022a.get();
        if (context == null) {
            return null;
        }
        return d(context, bitmap).getPath();
    }
}
