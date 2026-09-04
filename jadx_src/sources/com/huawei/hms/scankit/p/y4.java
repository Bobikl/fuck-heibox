package com.huawei.hms.scankit.p;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: MsModel.java */
/* JADX INFO: loaded from: classes7.dex */
public class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f62590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f62591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f62592c;

    public static void a(Context context, String str) {
        o4.d("MsModel", "load angle model...." + str);
        if (f62591b != null) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    o4.d("MsModel", "3inputStream" + inputStreamOpen);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    f62591b = bArr;
                    inputStreamOpen.close();
                } catch (IOException unused) {
                    o4.b("MsModel", "loadAngleModel inputStream.close() IOException");
                }
            } catch (IOException unused2) {
                o4.b("MsModel", "loadAngleModel IOException");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Exception unused3) {
                o4.b("MsModel", "loadAngleModel Exception");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                    o4.b("MsModel", "loadAngleModel inputStream.close() IOException");
                }
            }
            throw th2;
        }
    }

    public static byte[] a() {
        return f62591b;
    }

    public static void b(Context context, String str) {
        o4.d("MsModel", "load corner model...." + str);
        if (f62592c != null) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    o4.d("MsModel", "4inputStream" + inputStreamOpen);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    f62592c = bArr;
                    inputStreamOpen.close();
                } catch (IOException unused) {
                    o4.b("MsModel", "loadConerModel inputStream.close() IOException");
                }
            } catch (IOException unused2) {
                o4.b("MsModel", "loadConerModel IOException");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Exception unused3) {
                o4.b("MsModel", "loadConerModel Exception");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                    o4.b("MsModel", "loadConerModel inputStream.close() IOException");
                }
            }
            throw th2;
        }
    }

    public static byte[] b() {
        return f62592c;
    }

    public static void c(Context context, String str) {
        o4.d("MsModel", "load model...." + str);
        if (f62590a != null) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    o4.d("MsModel", "inputStream" + inputStreamOpen);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    f62590a = bArr;
                    inputStreamOpen.close();
                } catch (IOException unused) {
                    o4.b("MsModel", "loadModel inputStream.close() IOException");
                }
            } catch (IOException unused2) {
                o4.b("MsModel", "loadModel IOException");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Exception unused3) {
                o4.b("MsModel", "loadModel Exception");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                    o4.b("MsModel", "loadModel inputStream.close() IOException");
                }
            }
            throw th2;
        }
    }

    public static byte[] c() {
        return f62590a;
    }
}
