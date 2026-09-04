package com.max.xiaoheihe.module.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.max.xiaoheihe.bean.RectObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: DrawableListenerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class a implements com.max.hbimage.b.q {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f94564h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final String f94565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final WebProtocolObj f94566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final List<Bitmap> f94567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final String f94568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final Bitmap f94569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final RectObj f94570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final WeakReference<Context> f94571g;

    public a(@dl.d Context context, @dl.e String str, @dl.e WebProtocolObj webProtocolObj, @dl.e List<Bitmap> list, @dl.e String str2, @dl.e Bitmap bitmap, @dl.e RectObj rectObj) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.f94565a = str;
        this.f94566b = webProtocolObj;
        this.f94567c = list;
        this.f94568d = str2;
        this.f94569e = bitmap;
        this.f94570f = rectObj;
        this.f94571g = new WeakReference<>(context);
    }

    @Override // com.max.hbimage.b.q
    public void a(@dl.e Drawable drawable) {
        String left;
        String top;
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 46864, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        Bitmap bitmapB = com.max.hbimage.image.a.f70419a.b(drawable);
        RectObj rectObj = this.f94570f;
        String width = rectObj != null ? rectObj.getWidth() : null;
        if (width == null || (left = this.f94570f.getLeft()) == null || (top = this.f94570f.getTop()) == null) {
            return;
        }
        Bitmap bitmapQ = com.max.xiaoheihe.utils.d.q(this.f94565a, com.max.hbutils.utils.n.q(width));
        if (bitmapB == null || bitmapQ == null) {
            c(this.f94566b, this.f94567c, null, this.f94568d, this.f94569e);
            return;
        }
        Bitmap bitmapQ2 = com.max.mediaselector.lib.utils.c.q(bitmapB.getHeight(), bitmapB.getWidth(), bitmapB, 0.0f, 0.0f, bitmapQ, com.max.hbutils.utils.n.p(left), com.max.hbutils.utils.n.p(top));
        Log.d("showShareScreenDialog", "bitmap: " + bitmapB.getWidth() + " x " + bitmapB.getHeight() + "qrImage: " + bitmapQ.getWidth() + " x " + bitmapQ.getHeight() + "merge: " + bitmapQ2.getWidth() + " x " + bitmapQ2.getHeight());
        WebProtocolObj webProtocolObj = this.f94566b;
        List<Bitmap> list = this.f94567c;
        kotlin.jvm.internal.f0.n(bitmapQ2, "null cannot be cast to non-null type android.graphics.Bitmap");
        c(webProtocolObj, list, bitmapQ2, this.f94568d, this.f94569e);
    }

    @Override // com.max.hbimage.b.q
    public /* synthetic */ void b(Drawable drawable) {
        com.max.hbimage.d.a(this, drawable);
    }

    public void c(@dl.e WebProtocolObj webProtocolObj, @dl.e List<Bitmap> list, @dl.e Bitmap bitmap, @dl.e String str, @dl.e Bitmap bitmap2) {
    }

    @Override // com.max.hbimage.b.q
    public void onLoadFailed(@dl.e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 46865, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        c(this.f94566b, this.f94567c, null, this.f94568d, this.f94569e);
    }
}
