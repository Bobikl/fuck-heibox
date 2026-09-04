package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.a.m;

/* JADX INFO: compiled from: AbstractNetAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    protected static final int CONNECT_TIMEOUT = 30000;
    protected static final int READ_TIMEOUT = 10000;

    public abstract void request(com.tencent.beacon.base.net.a.f fVar, com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> bVar);

    public abstract void request(m mVar, com.tencent.beacon.base.net.a.b<byte[]> bVar);
}
