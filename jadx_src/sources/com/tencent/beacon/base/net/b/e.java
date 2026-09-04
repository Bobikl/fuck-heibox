package com.tencent.beacon.base.net.b;

import com.tencent.beacon.pack.SocketResponsePackage;

/* JADX INFO: compiled from: SocketResponseConverter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements c<byte[], SocketResponsePackage> {
    @Override // com.tencent.beacon.base.net.b.c
    public SocketResponsePackage a(byte[] bArr) {
        SocketResponsePackage socketResponsePackage = new SocketResponsePackage();
        socketResponsePackage.readFrom(new com.tencent.beacon.pack.a(bArr));
        com.tencent.beacon.base.net.c.d.c(socketResponsePackage.header);
        return socketResponsePackage;
    }
}
