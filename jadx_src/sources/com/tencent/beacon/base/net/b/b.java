package com.tencent.beacon.base.net.b;

import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackageV2;
import com.tencent.beacon.pack.ResponsePackageV2;

/* JADX INFO: compiled from: ByteV2ConverterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends c.a<byte[], AbstractJceStruct> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f98914a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0951b f98915b = new C0951b();

    /* JADX INFO: compiled from: ByteV2ConverterFactory.java */
    public static final class a implements c<RequestPackageV2, byte[]> {
        a() {
        }

        private byte[] a(byte[] bArr) {
            g gVarB = g.b();
            return gVarB != null ? com.tencent.beacon.base.util.b.b(bArr, 2, 3, gVarB.a()) : bArr;
        }

        @Override // com.tencent.beacon.base.net.b.c
        public byte[] a(RequestPackageV2 requestPackageV2) {
            if (requestPackageV2 == null) {
                return null;
            }
            com.tencent.beacon.base.util.c.a("[BeaconNet]", "RequestPackageV2: " + requestPackageV2.toString(), new Object[0]);
            com.tencent.beacon.pack.b bVar = new com.tencent.beacon.pack.b();
            requestPackageV2.writeTo(bVar);
            byte[] bArrA = a(bVar.b());
            if (bArrA != null) {
                com.tencent.beacon.base.util.c.a("[BeaconNet]", "request package after processing size: " + bArrA.length, new Object[0]);
            }
            return bArrA;
        }
    }

    /* JADX INFO: renamed from: com.tencent.beacon.base.net.b.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteV2ConverterFactory.java */
    public static final class C0951b implements c<byte[], ResponsePackageV2> {
        C0951b() {
        }

        private byte[] b(byte[] bArr) {
            return com.tencent.beacon.base.util.b.a(bArr, 2, 3, g.b().a());
        }

        @Override // com.tencent.beacon.base.net.b.c
        public ResponsePackageV2 a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            byte[] bArrB = b(bArr);
            ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
            responsePackageV2.readFrom(new com.tencent.beacon.pack.a(bArrB));
            return responsePackageV2;
        }
    }

    public static b a() {
        return new b();
    }

    public c<byte[], ResponsePackageV2> b() {
        return this.f98915b;
    }

    public c<RequestPackageV2, byte[]> c() {
        return this.f98914a;
    }
}
