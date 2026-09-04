package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f107886a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f107887a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        byte[] f1020a;

        public a(byte[] bArr, int i10) {
            this.f1020a = bArr;
            this.f107887a = i10;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f107888a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public Bitmap f1021a;

        public b(Bitmap bitmap, long j10) {
            this.f1021a = bitmap;
            this.f107888a = j10;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        int i10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.b.m62a("decode dimension failed for bitmap.");
            return 1;
        }
        int iRound = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        int i11 = options.outWidth;
        if (i11 <= iRound || (i10 = options.outHeight) <= iRound) {
            return 1;
        }
        return Math.min(i11 / iRound, i10 / iRound);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap a(Context context, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        Uri uri = Uri.parse(str);
        ?? r10 = 0;
        r10 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    int iA = a(context, inputStreamOpenInputStream);
                    inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = iA;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                        com.xiaomi.push.x.a((Closeable) inputStreamOpenInputStream2);
                        com.xiaomi.push.x.a((Closeable) inputStreamOpenInputStream);
                        return bitmapDecodeStream;
                    } catch (IOException e10) {
                        e = e10;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        com.xiaomi.push.x.a((Closeable) inputStreamOpenInputStream2);
                        com.xiaomi.push.x.a((Closeable) inputStreamOpenInputStream);
                        return null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    inputStreamOpenInputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    com.xiaomi.push.x.a((Closeable) r10);
                    com.xiaomi.push.x.a((Closeable) inputStreamOpenInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = context;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamOpenInputStream2 = null;
            inputStreamOpenInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[PHI: r1
  0x00d5: PHI (r1v5 java.net.HttpURLConnection) = (r1v4 java.net.HttpURLConnection), (r1v6 java.net.HttpURLConnection) binds: [B:47:0x00d3, B:52:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f7: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:56:0x00f7 */
    private static a a(String str, boolean z10) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0 (Linux; U;) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/71.0.3578.141 Mobile Safari/537.36 XiaoMi/MiuiBrowser");
                    httpURLConnection.connect();
                    int contentLength = httpURLConnection.getContentLength();
                    if (z10 && contentLength > 102400) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("Bitmap size is too big, max size is 102400  contentLen size is " + contentLength + " from url " + str);
                        com.xiaomi.push.x.a((Closeable) null);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("Invalid Http Response Code " + responseCode + " received");
                        com.xiaomi.push.x.a((Closeable) null);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i10 = z10 ? 102400 : 2048000;
                        byte[] bArr = new byte[1024];
                        while (i10 > 0) {
                            int i11 = inputStream.read(bArr, 0, 1024);
                            if (i11 == -1) {
                                break;
                            }
                            i10 -= i11;
                            byteArrayOutputStream.write(bArr, 0, i11);
                        }
                        if (i10 <= 0) {
                            com.xiaomi.channel.commonutils.logger.b.m62a("length 102400 exhausted.");
                            a aVar = new a(null, 102400);
                            com.xiaomi.push.x.a((Closeable) inputStream);
                            httpURLConnection.disconnect();
                            return aVar;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a aVar2 = new a(byteArray, byteArray.length);
                        com.xiaomi.push.x.a((Closeable) inputStream);
                        httpURLConnection.disconnect();
                        return aVar2;
                    } catch (SocketTimeoutException unused) {
                        com.xiaomi.channel.commonutils.logger.b.d("Connect timeout to " + str);
                        com.xiaomi.push.x.a((Closeable) inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    } catch (IOException e10) {
                        e = e10;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        com.xiaomi.push.x.a((Closeable) inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (SocketTimeoutException unused2) {
                    inputStream = null;
                } catch (IOException e11) {
                    e = e11;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    com.xiaomi.push.x.a(closeable2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
            }
        } catch (SocketTimeoutException unused3) {
            httpURLConnection = null;
            inputStream = null;
        } catch (IOException e12) {
            e = e12;
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    public static b a(Context context, String str, boolean z10) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        Bitmap bitmapB = b(context, str);
        try {
            if (bitmapB != null) {
                bVar.f1021a = bitmapB;
                return bVar;
            }
            try {
                a aVarA = a(str, z10);
                if (aVarA == null) {
                    com.xiaomi.push.x.a((Closeable) null);
                    return bVar;
                }
                bVar.f107888a = aVarA.f107887a;
                byte[] bArr = aVarA.f1020a;
                if (bArr != null) {
                    if (z10) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int iA = a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = iA;
                            bVar.f1021a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e10) {
                            e = e10;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.push.x.a((Closeable) byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f1021a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                a(context, aVarA.f1020a, str);
                com.xiaomi.push.x.a((Closeable) byteArrayInputStream);
                return bVar;
            } catch (Exception e11) {
                e = e11;
            }
            com.xiaomi.channel.commonutils.logger.b.a(e);
            com.xiaomi.push.x.a((Closeable) byteArrayInputStream);
            return bVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f107886a == 0) {
                f107886a = com.xiaomi.push.w.a(file);
            }
            if (f107886a > 15728640) {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                        if (!fileArrListFiles[i10].isDirectory() && Math.abs(System.currentTimeMillis() - fileArrListFiles[i10].lastModified()) > 1209600) {
                            fileArrListFiles[i10].delete();
                        }
                    }
                } catch (Exception e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                }
                f107886a = 0L;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    private static void a(Context context, byte[] bArr, String str) throws Throwable {
        if (bArr == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("cannot save small icon cause bitmap is null");
            return;
        }
        a(context);
        ?? file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File((File) file, com.xiaomi.push.bp.a(str));
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                file = new FileOutputStream(file2);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(file);
                    try {
                        bufferedOutputStream2.write(bArr);
                        bufferedOutputStream2.flush();
                        com.xiaomi.push.x.a(bufferedOutputStream2);
                        file = file;
                    } catch (Exception e10) {
                        e = e10;
                        bufferedOutputStream = bufferedOutputStream2;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        com.xiaomi.push.x.a(bufferedOutputStream);
                        file = file;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        com.xiaomi.push.x.a(bufferedOutputStream);
                        com.xiaomi.push.x.a((Closeable) file);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
            file = 0;
        } catch (Throwable th4) {
            th = th4;
            file = 0;
        }
        com.xiaomi.push.x.a((Closeable) file);
        if (f107886a == 0) {
            f107886a = com.xiaomi.push.w.a(new File(context.getCacheDir().getPath() + File.separator + "mipush_icon")) + file2.length();
        }
    }

    private static Bitmap b(Context context, String str) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", com.xiaomi.push.bp.a(str));
        FileInputStream fileInputStream2 = null;
        Bitmap bitmapDecodeStream = null;
        fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    file.setLastModified(System.currentTimeMillis());
                    com.xiaomi.push.x.a((Closeable) fileInputStream);
                    return bitmapDecodeStream;
                } catch (Exception e10) {
                    e = e10;
                    Bitmap bitmap2 = bitmapDecodeStream;
                    fileInputStream2 = fileInputStream;
                    bitmap = bitmap2;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    com.xiaomi.push.x.a((Closeable) fileInputStream2);
                    return bitmap;
                } catch (Throwable th3) {
                    th2 = th3;
                    com.xiaomi.push.x.a((Closeable) fileInputStream);
                    throw th2;
                }
            } catch (Exception e11) {
                e = e11;
                bitmap = null;
            }
        } catch (Throwable th4) {
            FileInputStream fileInputStream3 = fileInputStream2;
            th2 = th4;
            fileInputStream = fileInputStream3;
        }
    }
}
