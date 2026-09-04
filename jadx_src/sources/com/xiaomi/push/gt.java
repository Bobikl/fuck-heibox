package com.xiaomi.push;

import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes4.dex */
public class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107231a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gx f499a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private OutputStream f500a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107232b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    ByteBuffer f501a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private ByteBuffer f504b = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Adler32 f502a = new Adler32();

    gt(OutputStream outputStream, gx gxVar) {
        this.f500a = new BufferedOutputStream(outputStream);
        this.f499a = gxVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f107231a = timeZone.getRawOffset() / 3600000;
        this.f107232b = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(gq gqVar) {
        int iC = gqVar.c();
        if (iC > 32768) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Blob size=" + iC + " should be less than 32768 Drop blob chid=" + gqVar.a() + " id=" + gqVar.e());
            return 0;
        }
        this.f501a.clear();
        int i10 = iC + 8 + 4;
        if (i10 > this.f501a.capacity() || this.f501a.capacity() > 4096) {
            this.f501a = ByteBuffer.allocate(i10);
        }
        this.f501a.putShort((short) -15618);
        this.f501a.putShort((short) 5);
        this.f501a.putInt(iC);
        int iPosition = this.f501a.position();
        this.f501a = gqVar.mo416a(this.f501a);
        if (!"CONN".equals(gqVar.m415a())) {
            if (this.f503a == null) {
                this.f503a = this.f499a.m433a();
            }
            com.xiaomi.push.service.bo.a(this.f503a, this.f501a.array(), true, iPosition, iC);
        }
        this.f502a.reset();
        this.f502a.update(this.f501a.array(), 0, this.f501a.position());
        this.f504b.putInt(0, (int) this.f502a.getValue());
        this.f500a.write(this.f501a.array(), 0, this.f501a.position());
        this.f500a.write(this.f504b.array(), 0, 4);
        this.f500a.flush();
        int iPosition2 = this.f501a.position() + 4;
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] Wrote {cmd=" + gqVar.m415a() + ";chid=" + gqVar.a() + ";len=" + iPosition2 + z5.g.f141884d);
        return iPosition2;
    }

    public void a() {
        ex.e eVar = new ex.e();
        eVar.a(106);
        String str = Build.MODEL;
        eVar.a(str);
        eVar.b(C1339r.m656a());
        eVar.c(com.xiaomi.push.service.bw.m738a());
        eVar.b(48);
        eVar.d(this.f499a.m441b());
        eVar.e(this.f499a.mo439a());
        eVar.f(Locale.getDefault().toString());
        int i10 = Build.VERSION.SDK_INT;
        eVar.c(i10);
        eVar.d(g.a(this.f499a.a(), "com.xiaomi.xmsf"));
        byte[] bArrMo447a = this.f499a.m438a().mo447a();
        if (bArrMo447a != null) {
            eVar.a(ex.b.a(bArrMo447a));
        }
        gq gqVar = new gq();
        gqVar.a(0);
        gqVar.a("CONN", (String) null);
        gqVar.a(0L, "xiaomi.com", null);
        gqVar.a(eVar.m274a(), (String) null);
        a(gqVar);
        com.xiaomi.channel.commonutils.logger.b.m62a("[slim] open conn: andver=" + i10 + " sdk=48 tz=" + this.f107231a + ":" + this.f107232b + " Model=" + str + " os=" + Build.VERSION.INCREMENTAL);
    }

    public void b() throws IOException {
        gq gqVar = new gq();
        gqVar.a("CLOSE", (String) null);
        a(gqVar);
        this.f500a.close();
    }
}
