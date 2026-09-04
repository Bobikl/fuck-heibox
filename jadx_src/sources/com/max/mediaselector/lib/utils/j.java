package com.max.mediaselector.lib.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: DownloadFileUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DownloadFileUtils.java */
    public class a extends PictureThreadUtils.d<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f75545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Context f75546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f75547r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ oe.c f75548s;

        a(String str, Context context, String str2, oe.c cVar) {
            this.f75545p = str;
            this.f75546q = context;
            this.f75547r = str2;
            this.f75548s = cVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.E8, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.D8, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((String) obj);
        }

        public String r() throws Throwable {
            Uri uriInsert;
            InputStream inputStreamA;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.B8, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            ContentValues contentValues = new ContentValues();
            String strL = u.l(Long.valueOf(System.currentTimeMillis()));
            if (com.max.mediaselector.lib.config.f.e(this.f75545p)) {
                contentValues.put("_display_name", g.e("AUD_"));
                contentValues.put("mime_type", (TextUtils.isEmpty(this.f75545p) || this.f75545p.startsWith("video") || this.f75545p.startsWith("image")) ? "audio/mpeg" : this.f75545p);
                if (o.e()) {
                    contentValues.put("datetaken", strL);
                    contentValues.put("relative_path", Environment.DIRECTORY_MUSIC);
                } else {
                    contentValues.put("_data", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath() + File.separator + g.e("AUD_") + ".amr");
                }
                uriInsert = this.f75546q.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else if (com.max.mediaselector.lib.config.f.i(this.f75545p)) {
                contentValues.put("_display_name", g.e("VID_"));
                contentValues.put("mime_type", (TextUtils.isEmpty(this.f75545p) || this.f75545p.startsWith("audio") || this.f75545p.startsWith("image")) ? "video/mp4" : this.f75545p);
                if (o.e()) {
                    contentValues.put("datetaken", strL);
                    contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
                } else {
                    contentValues.put("_data", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath() + File.separator + g.e("VID_") + ".mp4");
                }
                uriInsert = this.f75546q.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                contentValues.put("_display_name", g.e("IMG_"));
                contentValues.put("mime_type", (TextUtils.isEmpty(this.f75545p) || this.f75545p.startsWith("audio") || this.f75545p.startsWith("video")) ? "image/jpeg" : this.f75545p);
                if (o.e()) {
                    contentValues.put("datetaken", strL);
                    contentValues.put("relative_path", com.max.mediaselector.lib.config.f.J);
                } else if (com.max.mediaselector.lib.config.f.f(this.f75545p) || com.max.mediaselector.lib.config.f.o(this.f75547r)) {
                    contentValues.put("_data", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + g.e("IMG_") + com.max.mediaselector.lib.config.f.f75143v);
                }
                uriInsert = this.f75546q.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            }
            if (uriInsert == null) {
                return null;
            }
            if (com.max.mediaselector.lib.config.f.g(this.f75547r)) {
                inputStreamA = new URL(this.f75547r).openStream();
            } else {
                inputStreamA = com.max.mediaselector.lib.config.f.c(this.f75547r) ? com.max.mediaselector.lib.basic.h.a(this.f75546q, Uri.parse(this.f75547r)) : new FileInputStream(this.f75547r);
            }
            if (n.x(inputStreamA, com.max.mediaselector.lib.basic.h.b(this.f75546q, uriInsert))) {
                return n.m(this.f75546q, uriInsert);
            }
            return null;
        }

        public void s(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.C8, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            oe.c cVar = this.f75548s;
            if (cVar != null) {
                cVar.a(str);
            }
        }
    }

    public static void a(Context context, String str, String str2, oe.c<String> cVar) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, cVar}, null, changeQuickRedirect, true, bb.c.m.A8, new Class[]{Context.class, String.class, String.class, oe.c.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new a(str2, context, str, cVar));
    }
}
