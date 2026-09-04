package com.tencent.beacon.base.net.b;

import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackage;
import com.tencent.beacon.pack.ResponsePackage;

/* JADX INFO: compiled from: ByteConverterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c.a<byte[], AbstractJceStruct> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0950a f98912a = new C0950a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f98913b = new b();

    /* JADX INFO: renamed from: com.tencent.beacon.base.net.b.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteConverterFactory.java */
    public static final class C0950a implements c<RequestPackage, byte[]> {
        C0950a() {
        }

        private byte[] a(byte[] bArr) {
            g gVarB = g.b();
            return gVarB != null ? com.tencent.beacon.base.util.b.b(bArr, 2, 3, gVarB.a()) : bArr;
        }

        private byte[] b(RequestPackage requestPackage) {
            com.tencent.beacon.pack.c cVar = new com.tencent.beacon.pack.c();
            cVar.a(1);
            cVar.b("test");
            cVar.a("test");
            cVar.b("detail", requestPackage);
            return cVar.a();
        }

        @Override // com.tencent.beacon.base.net.b.c
        public byte[] a(RequestPackage requestPackage) {
            if (requestPackage == null) {
                return null;
            }
            com.tencent.beacon.base.util.c.a("[BeaconNet]", "RequestPackage: " + requestPackage.toString(), new Object[0]);
            byte[] bArrA = a(b(requestPackage));
            if (bArrA != null) {
                com.tencent.beacon.base.util.c.a("[BeaconNet]", "request package after processing size: " + bArrA.length, new Object[0]);
            }
            return bArrA;
        }
    }

    /* JADX INFO: compiled from: ByteConverterFactory.java */
    public static final class b implements c<byte[], ResponsePackage> {
        b() {
        }

        private ResponsePackage b(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            try {
                if (bArr.length <= 0) {
                    return null;
                }
                com.tencent.beacon.pack.c cVar = new com.tencent.beacon.pack.c();
                cVar.a(bArr);
                return (ResponsePackage) cVar.a("detail", new ResponsePackage());
            } catch (Throwable unused) {
                return null;
            }
        }

        private byte[] c(byte[] bArr) {
            return com.tencent.beacon.base.util.b.a(bArr, 2, 3, g.b().a());
        }

        @Override // com.tencent.beacon.base.net.b.c
        public ResponsePackage a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            return b(c(bArr));
        }
    }

    public static a a() {
        return new a();
    }

    public c<byte[], ResponsePackage> b() {
        return this.f98913b;
    }

    public c<RequestPackage, byte[]> c() {
        return this.f98912a;
    }
}
