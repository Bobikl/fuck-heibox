package com.umeng.socialize.c.b;

import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: FileUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f106179a = new b();

    private b() {
    }

    public static b a() {
        return f106179a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: IOException -> 0x0047, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {IOException -> 0x0047, blocks: (B:24:0x0043, B:28:0x004b), top: B:42:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0060 A[Catch: IOException -> 0x005c, FINALLY_INSNS, TRY_LEAVE, TryCatch #5 {IOException -> 0x005c, blocks: (B:34:0x0058, B:38:0x0060), top: B:52:0x0058 }] */
    public byte[] a(File file) {
        FileInputStream fileInputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        fileInputStream.close();
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        SLog.error(UmengText.IMAGE.CLOSE, e10);
                    }
                    return byteArray;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        SLog.error(UmengText.IMAGE.READ_IMAGE_ERROR, th2);
                        if (fileInputStream != null) {
                            try {
                            } catch (IOException e11) {
                                return DefaultClass.getBytes();
                            }
                        }
                        return DefaultClass.getBytes();
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } catch (IOException e12) {
                                SLog.error(UmengText.IMAGE.CLOSE, e12);
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
            byteArrayOutputStream = null;
        }
    }

    public File b() throws IOException {
        File file = new File(c(), d());
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        return file;
    }

    public File c() {
        File file = new File(ContextUtil.getContext().getExternalFilesDir(null), c.f106180a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public String d() {
        return SocializeUtils.hexdigest(String.valueOf(System.currentTimeMillis())) + ".jpg";
    }
}
