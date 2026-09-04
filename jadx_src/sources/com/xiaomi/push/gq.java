package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class gq {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f487a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ex.a f488a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    String f489a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private short f490a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final long f491b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private byte[] f492b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f107227b = id.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f107226a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final byte[] f486a = new byte[0];

    public gq() {
        this.f490a = (short) 2;
        this.f492b = f486a;
        this.f489a = null;
        this.f491b = System.currentTimeMillis();
        this.f488a = new ex.a();
        this.f487a = 1;
    }

    gq(ex.a aVar, short s10, byte[] bArr) {
        this.f490a = (short) 2;
        this.f492b = f486a;
        this.f489a = null;
        this.f491b = System.currentTimeMillis();
        this.f488a = aVar;
        this.f490a = s10;
        this.f492b = bArr;
        this.f487a = 2;
    }

    @Deprecated
    public static gq a(hs hsVar, String str) {
        int i10;
        gq gqVar = new gq();
        try {
            i10 = Integer.parseInt(hsVar.k());
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Blob parse chid err " + e10.getMessage());
            i10 = 1;
        }
        gqVar.a(i10);
        gqVar.a(hsVar.j());
        gqVar.c(hsVar.m());
        gqVar.b(hsVar.n());
        gqVar.a("XMLMSG", (String) null);
        try {
            gqVar.a(hsVar.mo456a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                gqVar.a((short) 3);
            } else {
                gqVar.a((short) 2);
                gqVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e11) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Blob setPayload err： " + e11.getMessage());
        }
        return gqVar;
    }

    static gq a(ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            short s10 = byteBufferSlice.getShort(0);
            short s11 = byteBufferSlice.getShort(2);
            int i10 = byteBufferSlice.getInt(4);
            ex.a aVar = new ex.a();
            aVar.a(byteBufferSlice.array(), byteBufferSlice.arrayOffset() + 8, (int) s11);
            byte[] bArr = new byte[i10];
            byteBufferSlice.position(s11 + 8);
            byteBufferSlice.get(bArr, 0, i10);
            return new gq(aVar, s10, bArr);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("read Blob err :" + e10.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public static synchronized String d() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        sb2.append(f107227b);
        long j10 = f107226a;
        f107226a = 1 + j10;
        sb2.append(Long.toString(j10));
        return sb2.toString();
    }

    public int a() {
        return this.f488a.c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m414a() {
        return this.f491b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m415a() {
        return this.f488a.m303c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    ByteBuffer mo416a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f490a);
        byteBuffer.putShort((short) this.f488a.a());
        byteBuffer.putInt(this.f492b.length);
        int iPosition = byteBuffer.position();
        this.f488a.m273a(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, this.f488a.a());
        byteBuffer.position(iPosition + this.f488a.a());
        byteBuffer.put(this.f492b);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public short m417a() {
        return this.f490a;
    }

    public void a(int i10) {
        this.f488a.a(i10);
    }

    public void a(long j10) {
        this.f488a.a(j10);
    }

    public void a(long j10, String str, String str2) {
        if (j10 != 0) {
            this.f488a.a(j10);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f488a.a(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f488a.b(str2);
    }

    public void a(String str) {
        this.f488a.e(str);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f488a.c(str);
        this.f488a.m296a();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f488a.d(str2);
    }

    public void a(short s10) {
        this.f490a = s10;
    }

    public void a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f488a.c(0);
            this.f492b = bArr;
        } else {
            this.f488a.c(1);
            this.f492b = com.xiaomi.push.service.bo.a(com.xiaomi.push.service.bo.a(str, e()), bArr);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m418a() {
        return this.f488a.j();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m419a() {
        return gr.a(this, this.f492b);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m420a(String str) {
        if (this.f488a.e() == 1) {
            return gr.a(this, com.xiaomi.push.service.bo.a(com.xiaomi.push.service.bo.a(str, e()), this.f492b));
        }
        if (this.f488a.e() == 0) {
            return gr.a(this, this.f492b);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("unknow cipher = " + this.f488a.e());
        return gr.a(this, this.f492b);
    }

    public int b() {
        return this.f488a.f();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public long m421b() {
        return this.f488a.m299b();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m422b() {
        return this.f488a.m305d();
    }

    public void b(long j10) {
        this.f488a.b(j10);
    }

    public void b(String str) {
        this.f489a = str;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m423b() {
        return this.f488a.l();
    }

    public int c() {
        return this.f488a.b() + 8 + this.f492b.length;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public long m424c() {
        return this.f488a.m295a();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public String m425c() {
        return this.f488a.m309f();
    }

    public void c(long j10) {
        this.f488a.c(j10);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("@");
        try {
            long j10 = Long.parseLong(str.substring(0, iIndexOf));
            int iIndexOf2 = str.indexOf("/", iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 1);
            this.f488a.a(j10);
            this.f488a.a(strSubstring);
            this.f488a.b(strSubstring2);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Blob parse user err " + e10.getMessage());
        }
    }

    public String e() {
        String strM307e = this.f488a.m307e();
        if ("ID_NOT_AVAILABLE".equals(strM307e)) {
            return null;
        }
        if (this.f488a.g()) {
            return strM307e;
        }
        String strD = d();
        this.f488a.e(strD);
        return strD;
    }

    public String f() {
        return this.f489a;
    }

    public String g() {
        if (!this.f488a.m301b()) {
            return null;
        }
        return Long.toString(this.f488a.m295a()) + "@" + this.f488a.m297a() + "/" + this.f488a.m300b();
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + com.xiaomi.push.service.bc.a(e()) + "; cmd=" + m415a() + "; type=" + ((int) m417a()) + "; from=" + g() + " ]";
    }
}
