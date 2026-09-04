package com.tencent.beacon.base.net.a;

import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.pack.ResponsePackage;

/* JADX INFO: compiled from: JceCall.java */
/* JADX INFO: loaded from: classes4.dex */
public class j implements b<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f98874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f98875b;

    j(k kVar, b bVar) {
        this.f98875b = kVar;
        this.f98874a = bVar;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
        b bVar = this.f98874a;
        if (bVar != null) {
            bVar.a(eVar);
        }
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(byte[] bArr) throws NetException {
        ResponsePackage responsePackageA;
        byte[] bArr2;
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "raw response size: " + bArr.length, new Object[0]);
        if (this.f98875b.f98876a.g() == RequestType.EVENT) {
            responsePackageA = com.tencent.beacon.base.net.d.c().f98934f.b().a(bArr);
            if (responsePackageA == null) {
                throw new NetException("ResponsePackageV2 == null");
            }
            bArr2 = null;
        } else {
            responsePackageA = com.tencent.beacon.base.net.d.c().f98933e.b().a(bArr);
            if (responsePackageA == null) {
                throw new NetException("responsePackage == null");
            }
            ResponsePackage responsePackage = responsePackageA;
            if (responsePackage.cmd != this.f98875b.f98876a.f()) {
                throw new NetException("responsePackage.cmd != requestEntity.responseCmd");
            }
            if (responsePackage.result != 0) {
                throw new NetException("responsePackage.result != OK(0)");
            }
            bArr2 = responsePackage.sBuffer;
            if (bArr2 == null || bArr2.length <= 0) {
                throw new NetException("responsePackage.buffer == null");
            }
        }
        com.tencent.beacon.base.net.c.d.a(this.f98875b.f98877b, responsePackageA.serverTime, responsePackageA.srcGatewayIp);
        b bVar = this.f98874a;
        if (bVar != null) {
            bVar.a(bArr2);
        }
    }
}
