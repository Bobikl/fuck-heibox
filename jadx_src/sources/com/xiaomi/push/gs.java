package com.xiaomi.push;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes4.dex */
public class gs {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gx f493a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private InputStream f494a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile boolean f497a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f498a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ByteBuffer f495a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f107230b = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Adler32 f496a = new Adler32();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gv f107229a = new gv();

    gs(InputStream inputStream, gx gxVar) {
        this.f494a = new BufferedInputStream(inputStream);
        this.f493a = gxVar;
    }

    private ByteBuffer a() throws IOException {
        this.f495a.clear();
        a(this.f495a, 8);
        short s10 = this.f495a.getShort(0);
        short s11 = this.f495a.getShort(2);
        if (s10 != -15618 || s11 != 5) {
            throw new IOException("Malformed Input");
        }
        int i10 = this.f495a.getInt(4);
        int iPosition = this.f495a.position();
        if (i10 > 32768) {
            throw new IOException("Blob size too large");
        }
        if (i10 + 4 > this.f495a.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 + 2048);
            byteBufferAllocate.put(this.f495a.array(), 0, this.f495a.arrayOffset() + this.f495a.position());
            this.f495a = byteBufferAllocate;
        } else if (this.f495a.capacity() > 4096 && i10 < 2048) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.put(this.f495a.array(), 0, this.f495a.arrayOffset() + this.f495a.position());
            this.f495a = byteBufferAllocate2;
        }
        a(this.f495a, i10);
        this.f107230b.clear();
        a(this.f107230b, 4);
        this.f107230b.position(0);
        int i11 = this.f107230b.getInt();
        this.f496a.reset();
        this.f496a.update(this.f495a.array(), 0, this.f495a.position());
        if (i11 == ((int) this.f496a.getValue())) {
            byte[] bArr = this.f498a;
            if (bArr != null) {
                com.xiaomi.push.service.bo.a(bArr, this.f495a.array(), true, iPosition, i10);
            }
            return this.f495a;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("CRC = " + ((int) this.f496a.getValue()) + " and " + i11);
        throw new IOException("Corrupted Blob bad CRC");
    }

    private void a(ByteBuffer byteBuffer, int i10) throws IOException {
        int iPosition = byteBuffer.position();
        do {
            int i11 = this.f494a.read(byteBuffer.array(), iPosition, i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 -= i11;
            iPosition += i11;
        } while (i10 > 0);
        byteBuffer.position(iPosition);
    }

    private void c() throws IOException {
        boolean z10 = false;
        this.f497a = false;
        gq gqVarM426a = m426a();
        if ("CONN".equals(gqVarM426a.m415a())) {
            ex.f fVarA = ex.f.a(gqVarM426a.m419a());
            if (fVarA.m346a()) {
                this.f493a.a(fVarA.m345a());
                z10 = true;
            }
            if (fVarA.c()) {
                ex.b bVarM344a = fVarA.m344a();
                gq gqVar = new gq();
                gqVar.a("SYNC", "CONF");
                gqVar.a(bVarM344a.m274a(), (String) null);
                this.f493a.a(gqVar);
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] CONN: host = " + fVarA.m347b());
        }
        if (!z10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        this.f498a = this.f493a.m433a();
        while (!this.f497a) {
            gq gqVarM426a2 = m426a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f493a.c();
            short sM417a = gqVarM426a2.m417a();
            if (sM417a == 1) {
                this.f493a.a(gqVarM426a2);
            } else if (sM417a != 2) {
                if (sM417a != 3) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] unknow blob type " + ((int) gqVarM426a2.m417a()));
                } else {
                    try {
                        this.f493a.b(this.f107229a.a(gqVarM426a2.m419a(), this.f493a));
                    } catch (Exception e10) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] Parse packet from Blob chid=" + gqVarM426a2.a() + "; Id=" + gqVarM426a2.e() + " failure:" + e10.getMessage());
                    }
                }
            } else if ("SECMSG".equals(gqVarM426a2.m415a()) && ((gqVarM426a2.a() == 2 || gqVarM426a2.a() == 3) && TextUtils.isEmpty(gqVarM426a2.m422b()))) {
                try {
                    hs hsVarA = this.f107229a.a(gqVarM426a2.m420a(com.xiaomi.push.service.bf.a().a(Integer.valueOf(gqVarM426a2.a()).toString(), gqVarM426a2.g()).f107918h), this.f493a);
                    hsVarA.f554a = jCurrentTimeMillis;
                    this.f493a.b(hsVarA);
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("[Slim] Parse packet from Blob chid=" + gqVarM426a2.a() + "; Id=" + gqVarM426a2.e() + " failure:" + e11.getMessage());
                }
            } else {
                this.f493a.a(gqVarM426a2);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    gq m426a() throws IOException {
        int iPosition;
        try {
            ByteBuffer byteBufferA = a();
            iPosition = byteBufferA.position();
            try {
                byteBufferA.flip();
                byteBufferA.position(8);
                gq gwVar = iPosition == 8 ? new gw() : gq.a(byteBufferA.slice());
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] Read {cmd=" + gwVar.m415a() + ";chid=" + gwVar.a() + ";len=" + iPosition + z5.g.f141884d);
                return gwVar;
            } catch (IOException e10) {
                e = e10;
                if (iPosition == 0) {
                    iPosition = this.f495a.position();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[Slim] read Blob [");
                byte[] bArrArray = this.f495a.array();
                if (iPosition > 128) {
                    iPosition = 128;
                }
                sb2.append(ae.a(bArrArray, 0, iPosition));
                sb2.append("] Err:");
                sb2.append(e.getMessage());
                com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            iPosition = 0;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    void m427a() throws IOException {
        try {
            c();
        } catch (IOException e10) {
            if (!this.f497a) {
                throw e10;
            }
        }
    }

    void b() {
        this.f497a = true;
    }
}
