package com.efs.sdk.base.core.d;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f42520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f42521b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f42522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f42523d;

    public b(String str, byte b10) {
        this.f42520a = new a(str, b10);
    }

    public static b a(ILogProtocol iLogProtocol) {
        b bVar = null;
        try {
            b bVar2 = new b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
            try {
                int bodyType = iLogProtocol.getBodyType();
                if (bodyType == 0) {
                    bVar2.b(0);
                    bVar2.a(iLogProtocol.generate());
                } else if (bodyType != 1) {
                    Log.w("efs.base", "Can not support body type: " + iLogProtocol.getBodyType());
                } else {
                    bVar2.b(1);
                    bVar2.f42523d = new File(iLogProtocol.getFilePath());
                }
                return bVar2;
            } catch (Exception e10) {
                e = e10;
                bVar = bVar2;
                Log.e("efs.base", "log send error", e);
                return bVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private void d() {
        byte[] bArr;
        a aVar = this.f42520a;
        int i10 = aVar.f42515c;
        if (i10 == 0 && (bArr = this.f42522c) != null) {
            aVar.f42518f = bArr.length;
        } else if (i10 == 1 && this.f42523d.exists()) {
            this.f42520a.f42518f = this.f42523d.length();
        }
    }

    public final long a() {
        d();
        return this.f42520a.f42518f;
    }

    public final void a(int i10) {
        this.f42520a.f42517e = i10;
        d();
    }

    public final void a(String str) {
        this.f42520a.f42516d = str;
    }

    public final void a(byte[] bArr) {
        this.f42522c = bArr;
        d();
    }

    public final void b(int i10) {
        this.f42520a.f42515c = i10;
    }

    public final boolean b() {
        return !"none".equals(this.f42520a.f42516d);
    }

    public final void c() {
        this.f42521b.f42524a = true;
    }
}
