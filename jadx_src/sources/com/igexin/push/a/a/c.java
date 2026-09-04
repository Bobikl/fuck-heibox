package com.igexin.push.a.a;

import com.igexin.push.config.l;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.igexin.push.f.b.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f63316c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f63317a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f63318b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63319d = false;

    private c() {
    }

    public static c c() {
        if (f63316c == null) {
            f63316c = new c();
        }
        return f63316c;
    }

    @Override // com.igexin.push.f.b.c
    public void a() {
        d();
    }

    @Override // com.igexin.push.f.b.c
    public void a(long j10) {
        this.f63317a = j10;
    }

    @Override // com.igexin.push.f.b.c
    public boolean b() {
        return System.currentTimeMillis() - this.f63317a > this.f63318b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    public void d() {
        this.f63318b = 3600000L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l.f63424b != 0) {
            Calendar calendar = Calendar.getInstance();
            if (com.igexin.push.util.a.a(jCurrentTimeMillis)) {
                if (!this.f63319d) {
                    this.f63319d = true;
                    com.igexin.push.core.c.a().i().c();
                }
                calendar.set(11, l.f63423a + l.f63424b > 24 ? (l.f63423a + l.f63424b) - 24 : l.f63423a + l.f63424b);
                calendar.set(12, 0);
                calendar.set(13, 0);
                if (calendar.getTimeInMillis() < jCurrentTimeMillis) {
                    calendar.add(5, 1);
                }
            } else {
                if (this.f63319d) {
                    this.f63319d = false;
                    com.igexin.push.core.c.a().i().b();
                }
                calendar.set(11, l.f63423a);
                calendar.set(12, 0);
                calendar.set(13, 0);
                if (calendar.getTimeInMillis() < jCurrentTimeMillis) {
                    calendar.add(5, 1);
                }
            }
            this.f63318b = calendar.getTimeInMillis() - jCurrentTimeMillis;
        } else if (this.f63319d) {
            this.f63319d = false;
            com.igexin.push.core.c.a().i().b();
        }
        long j10 = l.f63425c;
        if (j10 > this.f63318b + jCurrentTimeMillis) {
            this.f63318b = j10 - jCurrentTimeMillis;
            if (this.f63319d) {
                return;
            }
            this.f63319d = true;
            com.igexin.push.core.c.a().i().c();
        }
    }
}
