package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DeviceProfileWriter.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final AssetManager f26735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Executor f26736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final i.d f26737c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final File f26739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final String f26740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final String f26741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final String f26742h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private d[] f26744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private byte[] f26745k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26743i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final byte[] f26738d = d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c(@n0 AssetManager assetManager, @n0 Executor executor, @n0 i.d dVar, @n0 String str, @n0 String str2, @n0 String str3, @n0 File file) {
        this.f26735a = assetManager;
        this.f26736b = executor;
        this.f26737c = dVar;
        this.f26740f = str;
        this.f26741g = str2;
        this.f26742h = str3;
        this.f26739e = file;
    }

    @p0
    private c b(d[] dVarArr, byte[] bArr) {
        try {
            InputStream inputStreamH = h(this.f26735a, this.f26742h);
            if (inputStreamH == null) {
                if (inputStreamH != null) {
                    inputStreamH.close();
                }
                return null;
            }
            try {
                this.f26744j = n.q(inputStreamH, n.o(inputStreamH, n.f26803g), bArr, dVarArr);
                inputStreamH.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamH.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            this.f26737c.a(9, e10);
        } catch (IOException e11) {
            this.f26737c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f26744j = null;
            this.f26737c.a(8, e12);
        }
    }

    private void c() {
        if (!this.f26743i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @p0
    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return p.f26833e;
            case 26:
                return p.f26832d;
            case 27:
                return p.f26831c;
            case 28:
            case 29:
            case 30:
                return p.f26830b;
            case 31:
            case 32:
            case 33:
            case 34:
                return p.f26829a;
            default:
                return null;
        }
    }

    @p0
    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f26741g);
        } catch (FileNotFoundException e10) {
            this.f26737c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f26737c.a(7, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f26737c.a(i10, obj);
    }

    @p0
    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f26737c.b(5, null);
            return null;
        }
    }

    @p0
    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    d[] dVarArrW = n.w(inputStream, n.o(inputStream, n.f26802f), this.f26740f);
                    try {
                        inputStream.close();
                        return dVarArrW;
                    } catch (IOException e10) {
                        this.f26737c.a(7, e10);
                        return dVarArrW;
                    }
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        this.f26737c.a(7, e11);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                this.f26737c.a(7, e12);
                inputStream.close();
                return null;
            } catch (IllegalStateException e13) {
                this.f26737c.a(8, e13);
                inputStream.close();
                return null;
            }
        } catch (IOException e14) {
            this.f26737c.a(7, e14);
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i10, @p0 final Object obj) {
        this.f26736b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f26732b.g(i10, obj);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean e() {
        if (this.f26738d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f26739e.exists()) {
            try {
                this.f26739e.createNewFile();
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f26739e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f26743i = true;
        return true;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c i() {
        c cVarB;
        c();
        if (this.f26738d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f26735a);
        if (inputStreamF != null) {
            this.f26744j = j(inputStreamF);
        }
        d[] dVarArr = this.f26744j;
        return (dVarArr == null || !k() || (cVarB = b(dVarArr, this.f26738d)) == null) ? this : cVarB;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c m() {
        d[] dVarArr = this.f26744j;
        byte[] bArr = this.f26738d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    n.E(byteArrayOutputStream, bArr);
                    if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                        this.f26737c.a(5, null);
                        this.f26744j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f26745k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f26744j = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f26737c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f26737c.a(8, e11);
            }
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean n() {
        byte[] bArr = this.f26745k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f26739e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        this.f26745k = null;
                        this.f26744j = null;
                        return true;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                this.f26745k = null;
                this.f26744j = null;
                throw th6;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f26745k = null;
            this.f26744j = null;
            return false;
        } catch (IOException e11) {
            l(7, e11);
            this.f26745k = null;
            this.f26744j = null;
            return false;
        }
    }
}
