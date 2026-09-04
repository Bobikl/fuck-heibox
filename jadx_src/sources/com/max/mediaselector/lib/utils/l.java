package com.max.mediaselector.lib.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ao;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;

/* JADX INFO: compiled from: MediaUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f75549a = "android:query-arg-sql-limit";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MediaUtils.java */
    public class a extends PictureThreadUtils.d<com.max.mediaselector.lib.entity.b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f75550p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f75551q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ oe.c f75552r;

        a(Context context, String str, oe.c cVar) {
            this.f75550p = context;
            this.f75551q = str;
            this.f75552r = cVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34745g9, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34722f9, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((com.max.mediaselector.lib.entity.b) obj);
        }

        public com.max.mediaselector.lib.entity.b r() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34676d9, new Class[0], com.max.mediaselector.lib.entity.b.class);
            return patchProxyResultProxy.isSupported ? (com.max.mediaselector.lib.entity.b) patchProxyResultProxy.result : l.q(this.f75550p, this.f75551q);
        }

        public void s(com.max.mediaselector.lib.entity.b bVar) {
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.m.f34699e9, new Class[]{com.max.mediaselector.lib.entity.b.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            oe.c cVar = this.f75552r;
            if (cVar != null) {
                cVar.a(bVar);
            }
        }
    }

    public static Bundle a(String str, String[] strArr, int i10, int i11) {
        Object[] objArr = {str, strArr, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Z8, new Class[]{String.class, String[].class, cls, cls}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            if (o.f()) {
                bundle.putString(f75549a, i10 + " offset " + i11);
            }
        }
        return bundle;
    }

    public static void b(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.f34652c9, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (com.max.mediaselector.lib.config.f.c(str)) {
                context.getContentResolver().delete(Uri.parse(str), null, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static long c(Context context, File file, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, file, str}, null, changeQuickRedirect, true, bb.c.m.O8, new Class[]{Context.class, File.class, String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (!TextUtils.isEmpty(str) && file.getParentFile() != null) {
            return file.getParentFile().getName().hashCode();
        }
        return h(context);
    }

    public static String d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Q8, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        File file = new File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : com.max.mediaselector.lib.config.f.K;
    }

    public static long e(Context context, File file, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, file, str}, null, changeQuickRedirect, true, bb.c.m.P8, new Class[]{Context.class, File.class, String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (!TextUtils.isEmpty(str) && file.getParentFile() != null) {
            return file.getParentFile().getName().hashCode();
        }
        return o(context);
    }

    public static void f(Context context, String str, oe.c<com.max.mediaselector.lib.entity.b> cVar) {
        if (PatchProxy.proxy(new Object[]{context, str, cVar}, null, changeQuickRedirect, true, bb.c.m.f34606a9, new Class[]{Context.class, String.class, oe.c.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new a(context, str, cVar));
    }

    public static com.max.mediaselector.lib.entity.b g(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.U8, new Class[]{Context.class, String.class}, com.max.mediaselector.lib.entity.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.entity.b) patchProxyResultProxy.result;
        }
        com.max.mediaselector.lib.entity.b bVar = new com.max.mediaselector.lib.entity.b();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (com.max.mediaselector.lib.config.f.c(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    bVar.f(u.j(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                throw th2;
            }
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        return bVar;
    }

    public static long h(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.X8, new Class[]{Context.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {n.j() + "%"};
                cursorQuery = o.f() ? context.getApplicationContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), null, a("_data like ?", strArr, 1, 0), null) : context.getApplicationContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                if (cursorQuery != null && cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id"));
                    cursorQuery.close();
                    return j10;
                }
                if (cursorQuery == null) {
                    return -1L;
                }
                cursorQuery.close();
                return -1L;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery == null) {
                    return -1L;
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public static int i(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.W8, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {n.j() + "%"};
                cursorQuery = o.f() ? context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, a("_data like ?", strArr, 1, 0), null) : context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                if (cursorQuery == null || cursorQuery.getCount() <= 0 || !cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                int i10 = g.b(cursorQuery.getLong(cursorQuery.getColumnIndex("date_added"))) <= 1 ? cursorQuery.getInt(cursorQuery.getColumnIndex(ao.f104522d)) : -1;
                cursorQuery.close();
                return i10;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return -1;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public static com.max.mediaselector.lib.entity.b j(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.R8, new Class[]{Context.class, String.class}, com.max.mediaselector.lib.entity.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.entity.b) patchProxyResultProxy.result;
        }
        com.max.mediaselector.lib.entity.b bVar = new com.max.mediaselector.lib.entity.b();
        try {
            androidx.exifinterface.media.a aVar = com.max.mediaselector.lib.config.f.c(str) ? new androidx.exifinterface.media.a(com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str))) : new androidx.exifinterface.media.a(str);
            bVar.j(aVar.l(androidx.exifinterface.media.a.f23401x, 1));
            bVar.g(aVar.l(androidx.exifinterface.media.a.f23410y, 1));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bVar;
    }

    public static com.max.mediaselector.lib.entity.b k(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.S8, new Class[]{String.class}, com.max.mediaselector.lib.entity.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.entity.b) patchProxyResultProxy.result;
        }
        com.max.mediaselector.lib.entity.b bVar = new com.max.mediaselector.lib.entity.b();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(com.max.mediaselector.lib.config.f.c(str) ? com.max.mediaselector.lib.basic.h.a(ke.b.d().b(), Uri.parse(str)) : new FileInputStream(str), null, options);
            bVar.j(options.outWidth);
            bVar.g(options.outHeight);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bVar;
    }

    private static String l(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.m.N8, new Class[]{File.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    public static String m(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.M8, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = l(new File(str));
        }
        return TextUtils.isEmpty(mimeTypeFromExtension) ? "image/jpeg" : mimeTypeFromExtension;
    }

    public static String n(long j10, String str) {
        Uri contentUri;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), str}, null, changeQuickRedirect, true, bb.c.m.L8, new Class[]{Long.TYPE, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.mediaselector.lib.config.f.h(str)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (com.max.mediaselector.lib.config.f.i(str)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = com.max.mediaselector.lib.config.f.e(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j10).toString();
    }

    public static long o(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.Y8, new Class[]{Context.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {n.o() + "%"};
                cursorQuery = o.f() ? context.getApplicationContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), null, a("_data like ?", strArr, 1, 0), null) : context.getApplicationContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                if (cursorQuery != null && cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id"));
                    cursorQuery.close();
                    return j10;
                }
                if (cursorQuery == null) {
                    return -1L;
                }
                cursorQuery.close();
                return -1L;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery == null) {
                    return -1L;
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public static com.max.mediaselector.lib.entity.b p(Context context, String str) {
        int iH;
        int iH2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.T8, new Class[]{Context.class, String.class}, com.max.mediaselector.lib.entity.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.entity.b) patchProxyResultProxy.result;
        }
        com.max.mediaselector.lib.entity.b bVar = new com.max.mediaselector.lib.entity.b();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (com.max.mediaselector.lib.config.f.c(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (TextUtils.equals("90", strExtractMetadata) || TextUtils.equals("270", strExtractMetadata)) {
                        iH = u.h(mediaMetadataRetriever.extractMetadata(18));
                        iH2 = u.h(mediaMetadataRetriever.extractMetadata(19));
                    } else {
                        iH2 = u.h(mediaMetadataRetriever.extractMetadata(18));
                        iH = u.h(mediaMetadataRetriever.extractMetadata(19));
                    }
                    bVar.j(iH2);
                    bVar.g(iH);
                    bVar.h(strExtractMetadata);
                    bVar.f(u.j(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            return bVar;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static com.max.mediaselector.lib.entity.b q(android.content.Context r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.mediaselector.lib.utils.l.q(android.content.Context, java.lang.String):com.max.mediaselector.lib.entity.b");
    }

    public static boolean r(int i10, int i11) {
        return i10 > 0 && i11 > 0 && i11 > i10 * 3;
    }

    public static void s(Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.V8, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            context.getApplicationContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{Long.toString(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
