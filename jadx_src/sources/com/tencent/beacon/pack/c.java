package com.tencent.beacon.pack;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PacketUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, byte[]> f99260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestPacket f99261b = new RequestPacket();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, byte[]> f99262c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f99263d = "GBK";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f99264e = new a();

    static {
        HashMap<String, byte[]> map = new HashMap<>();
        f99260a = map;
        map.put("", new byte[0]);
    }

    private Object a(byte[] bArr, Object obj) {
        this.f99264e.a(bArr);
        this.f99264e.a(this.f99263d);
        return this.f99264e.a(obj, 0, true);
    }

    private byte[] a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }

    private void b() {
        a aVar = new a(this.f99261b.sBuffer);
        aVar.a(this.f99263d);
        this.f99262c = aVar.a((Map) f99260a, 0, false);
    }

    public <T> T a(String str, T t10) throws Exception {
        if (!this.f99262c.containsKey(str)) {
            return null;
        }
        try {
            return (T) a(this.f99262c.get(str), t10);
        } catch (Exception e10) {
            throw new Exception(e10);
        }
    }

    public void a(int i10) {
        this.f99261b.iRequestId = i10;
    }

    public void a(String str) {
        this.f99261b.sFuncName = str;
    }

    public void a(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        try {
            a aVar = new a(bArr, 4);
            aVar.a(this.f99263d);
            this.f99261b.readFrom(aVar);
            b();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public byte[] a() {
        b bVar = new b(0);
        bVar.a(this.f99263d);
        bVar.a((Map) this.f99262c, 0);
        RequestPacket requestPacket = this.f99261b;
        requestPacket.iVersion = (short) 3;
        requestPacket.sBuffer = a(bVar.a());
        b bVar2 = new b(0);
        bVar2.a(this.f99263d);
        this.f99261b.writeTo(bVar2);
        byte[] bArrA = a(bVar2.a());
        int length = bArrA.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrA).flip();
        return byteBufferAllocate.array();
    }

    public void b(String str) {
        this.f99261b.sServantName = str;
    }

    public <T> void b(String str, T t10) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t10 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        b bVar = new b();
        bVar.a(this.f99263d);
        bVar.a(t10, 0);
        this.f99262c.put(str, a(bVar.a()));
    }
}
