package com.max.xiaoheihe.module.bbs;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.max.hbimage.preview.PreviewInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: QRCodeParseTask.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a0 extends AsyncTask<String, Integer, String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80266c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Bitmap f80267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private PreviewInfo f80268b;

    public a0(@dl.d Bitmap bitmap, @dl.e PreviewInfo previewInfo) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        this.f80267a = bitmap;
        this.f80268b = previewInfo;
    }

    @dl.e
    public String a(@dl.d String... strings) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strings}, this, changeQuickRedirect, false, 26751, new Class[]{String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(strings, "strings");
        return com.max.hbqrcode.b.k(this.f80267a);
    }

    public void b(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26752, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onPostExecute(str);
        com.max.heybox.hblog.g.f74531b.q("QRCodeParseTask, onPostExecute, s = " + str);
        PreviewInfo previewInfo = this.f80268b;
        if (previewInfo != null) {
            previewInfo.l(str);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ String doInBackground(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 26753, new Class[]{Object[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(strArr);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26754, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        b(str);
    }
}
