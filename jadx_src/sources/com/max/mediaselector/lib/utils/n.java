package com.max.mediaselector.lib.utils;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.content.FileProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: PictureFileUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f75554a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f75555b = ".jpg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f75556c = ".mp4";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f75557d = ".amr";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f75558e = "PictureFileUtils";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75559f = 1024;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75560g = 1048576;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75561h = 1073741824;

    private n() {
    }

    public static void a(@p0 Closeable closeable) {
        if (!PatchProxy.proxy(new Object[]{closeable}, null, changeQuickRedirect, true, bb.c.m.H9, new Class[]{Closeable.class}, Void.TYPE).isSupported && (closeable instanceof Closeable)) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(@n0 String str, @n0 String str2) throws Throwable {
        FileChannel fileChannel;
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.f35063u9, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel channel = null;
        try {
            FileChannel channel2 = new FileInputStream(str).getChannel();
            try {
                channel = new FileOutputStream(str2).getChannel();
                channel2.transferTo(0L, channel2.size(), channel);
                a(channel2);
                a(channel);
            } catch (Exception e10) {
                e = e10;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                try {
                    e.printStackTrace();
                    a(channel);
                    a(fileChannel);
                } catch (Throwable th2) {
                    th = th2;
                    a(channel);
                    a(fileChannel);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                FileChannel fileChannel3 = channel;
                channel = channel2;
                fileChannel = fileChannel3;
                a(channel);
                a(fileChannel);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileChannel = null;
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }

    public static File c(Context context, int i10, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.f34837k9, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class}, File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : e(context, i10, str, str2, str3);
    }

    public static String d(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.D9, new Class[]{Context.class, String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strA = com.max.mediaselector.lib.config.f.a(str2);
        if (com.max.mediaselector.lib.config.f.i(str2)) {
            String str4 = p(context) + File.separator;
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = g.e("VID_") + strA;
                }
                return str4 + str3;
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "VID_" + str.toUpperCase() + strA;
            }
            return str4 + str3;
        }
        if (com.max.mediaselector.lib.config.f.e(str2)) {
            String str5 = i(context) + File.separator;
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = g.e("AUD_") + strA;
                }
                return str5 + str3;
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "AUD_" + str.toUpperCase() + strA;
            }
            return str5 + str3;
        }
        String str6 = l(context) + File.separator;
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = g.e("IMG_") + strA;
            }
            return str6 + str3;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "IMG_" + str.toUpperCase() + strA;
        }
        return str6 + str3;
    }

    private static File e(Context context, int i10, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.f34860l9, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class}, File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : f(context, i10, str, str2, str3);
    }

    private static File f(Context context, int i10, String str, String str2, String str3) {
        File file;
        File fileN;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.f34883m9, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.equals("mounted", Environment.getExternalStorageState())) {
                fileN = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileN.getAbsolutePath());
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(com.max.mediaselector.lib.config.f.K);
                sb2.append(str4);
                file = new File(sb2.toString());
            } else {
                fileN = n(applicationContext, i10);
                file = new File(fileN.getAbsolutePath() + File.separator);
            }
            if (!fileN.exists()) {
                fileN.mkdirs();
            }
        } else {
            File file2 = new File(str3);
            File parentFile = file2.getParentFile();
            Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file2.getParentFile().mkdirs();
            }
            file = file2;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (i10 == 2) {
            if (zIsEmpty) {
                str = g.e("VID_") + ".mp4";
            }
            return new File(file, str);
        }
        if (i10 == 3) {
            if (zIsEmpty) {
                str = g.e("AUD_") + ".amr";
            }
            return new File(file, str);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ".jpg";
        }
        if (zIsEmpty) {
            str = g.e("IMG_") + str2;
        }
        return new File(file, str);
    }

    @SuppressLint({"DefaultLocale"})
    public static String g(long j10) {
        double d10;
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.G9, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j10 < 1000) {
            d10 = j10;
            str = "";
        } else if (j10 < 1000000) {
            d10 = j10 / 1000.0d;
            str = "KB";
        } else if (j10 < com.google.android.exoplayer2.j.f46409j) {
            d10 = j10 / 1000000.0d;
            str = "MB";
        } else {
            d10 = j10 / 1.0E9d;
            str = "GB";
        }
        Object objValueOf = String.format(new Locale("zh"), "%.2f", Double.valueOf(d10));
        StringBuilder sb2 = new StringBuilder();
        if (Math.round(u.d(objValueOf)) - u.d(objValueOf) == 0.0d) {
            objValueOf = Long.valueOf(Math.round(u.d(objValueOf)));
        }
        sb2.append(objValueOf);
        sb2.append(str);
        return sb2.toString();
    }

    @SuppressLint({"DefaultLocale"})
    public static String h(long j10, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.F9, new Class[]{Long.TYPE, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("precision shouldn't be less than zero!");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j10 < 1024) {
            return String.format("%." + i10 + "fB", Double.valueOf(j10));
        }
        if (j10 < 1048576) {
            return String.format("%." + i10 + "fKB", Double.valueOf(j10 / 1024.0d));
        }
        if (j10 < 1073741824) {
            return String.format("%." + i10 + "fMB", Double.valueOf(j10 / 1048576.0d));
        }
        return String.format("%." + i10 + "fGB", Double.valueOf(j10 / 1.073741824E9d));
    }

    public static String i(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.B9, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        return externalFilesDir == null ? "" : externalFilesDir.getPath();
    }

    public static String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35107w9, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return "%" + Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath() + "/Camera";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String k(Context context, Uri uri, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri, str, strArr}, null, changeQuickRedirect, true, bb.c.m.f35019s9, new Class[]{Context.class, Uri.class, String.class, String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    cursorQuery.close();
                    return string;
                }
                if (cursorQuery == null) {
                    return "";
                }
                cursorQuery.close();
                return "";
            } catch (IllegalArgumentException e10) {
                Log.i(f75558e, String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", e10.getMessage()));
                if (cursorQuery == null) {
                    return "";
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public static String l(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.f35173z9, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        return externalFilesDir == null ? "" : externalFilesDir.getPath();
    }

    @SuppressLint({"NewApi"})
    public static String m(Context context, Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, bb.c.m.f35041t9, new Class[]{Context.class, Uri.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Context applicationContext = context.getApplicationContext();
        Uri uri2 = null;
        if (!DocumentsContract.isDocumentUri(applicationContext, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return u(uri) ? uri.getLastPathSegment() : k(applicationContext, uri, null, null);
            }
            return "file".equalsIgnoreCase(uri.getScheme()) ? uri.getPath() : "";
        }
        if (!s(uri)) {
            if (r(uri)) {
                return k(applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), u.j(DocumentsContract.getDocumentId(uri))), null, null);
            }
            if (!v(uri)) {
                return "";
            }
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            if ("image".equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return k(applicationContext, uri2, "_id=?", new String[]{strArrSplit[1]});
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
        if (!"primary".equalsIgnoreCase(strArrSplit2[0])) {
            return "";
        }
        if (o.e()) {
            return applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + strArrSplit2[1];
        }
        return Environment.getExternalStorageDirectory() + "/" + strArrSplit2[1];
    }

    private static File n(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.f34906n9, new Class[]{Context.class, Integer.TYPE}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        if (i10 != 2) {
            return i10 != 3 ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : context.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        }
        return context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
    }

    public static String o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35129x9, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return "%" + Environment.getExternalStoragePublicDirectory("").getAbsolutePath() + "/Sounds";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String p(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.A9, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        return externalFilesDir == null ? "" : externalFilesDir.getPath();
    }

    public static String q(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.f35151y9, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        File file = new File(context.getExternalFilesDir("").getAbsolutePath(), "VideoThumbnail");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public static boolean r(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, bb.c.m.f34952p9, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean s(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, bb.c.m.f34929o9, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean t(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.E9, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return TextUtils.isEmpty(str) || new File(str).exists();
    }

    public static boolean u(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, bb.c.m.f34997r9, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean v(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, bb.c.m.f34975q9, new Class[]{Uri.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static Uri w(Context context, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, file}, null, changeQuickRedirect, true, bb.c.m.C9, new Class[]{Context.class, File.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        return Build.VERSION.SDK_INT > 23 ? FileProvider.f(context, context.getPackageName() + ".luckProvider", file) : Uri.fromFile(file);
    }

    public static boolean x(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, outputStream}, null, changeQuickRedirect, true, bb.c.m.f35085v9, new Class[]{InputStream.class, OutputStream.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArr);
                        if (i10 == -1) {
                            outputStream.flush();
                            a(bufferedInputStream2);
                            a(bufferedOutputStream);
                            return true;
                        }
                        outputStream.write(bArr, 0, i10);
                    }
                } catch (Exception e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        a(bufferedInputStream);
                        a(bufferedOutputStream);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        a(bufferedInputStream);
                        a(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    a(bufferedInputStream);
                    a(bufferedOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
    }
}
