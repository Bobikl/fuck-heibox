package com.max.mediaselector.lib.basic;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: PictureMediaScannerConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public class j implements MediaScannerConnection.MediaScannerConnectionClient {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaScannerConnection f74953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f74955c;

    /* JADX INFO: compiled from: PictureMediaScannerConnection.java */
    public interface a {
        void a();
    }

    public j(Context context, String str) {
        this.f74954b = str;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context.getApplicationContext(), this);
        this.f74953a = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    public j(Context context, String str, a aVar) {
        this.f74955c = aVar;
        this.f74954b = str;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context.getApplicationContext(), this);
        this.f74953a = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public void onMediaScannerConnected() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Zj, new Class[0], Void.TYPE).isSupported || TextUtils.isEmpty(this.f74954b)) {
            return;
        }
        this.f74953a.scanFile(this.f74954b, null);
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        if (PatchProxy.proxy(new Object[]{str, uri}, this, changeQuickRedirect, false, bb.c.l.f34030ak, new Class[]{String.class, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f74953a.disconnect();
        a aVar = this.f74955c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
