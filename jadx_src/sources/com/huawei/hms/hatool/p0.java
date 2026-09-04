package com.huawei.hms.hatool;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f61010a = 1800000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f61011b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f61012c = null;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61013a = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f61014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f61015c;

        a(long j10) {
            this.f61013a += lg.a.f131412e + j10;
            this.f61015c = j10;
            this.f61014b = true;
            p0.this.f61011b = false;
        }

        private boolean a(long j10, long j11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private void b(long j10) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String string = UUID.randomUUID().toString();
            this.f61013a = string;
            this.f61013a = string.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            this.f61013a += lg.a.f131412e + j10;
            this.f61015c = j10;
            this.f61014b = true;
        }

        private boolean b(long j10, long j11) {
            return j11 - j10 >= p0.this.f61010a;
        }

        void a(long j10) {
            if (p0.this.f61011b) {
                p0.this.f61011b = false;
                b(j10);
            } else if (b(this.f61015c, j10) || a(this.f61015c, j10)) {
                b(j10);
            } else {
                this.f61015c = j10;
                this.f61014b = false;
            }
        }
    }

    public String a() {
        a aVar = this.f61012c;
        if (aVar != null) {
            return aVar.f61013a;
        }
        v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    void a(long j10) {
        a aVar = this.f61012c;
        if (aVar != null) {
            aVar.a(j10);
        } else {
            v.c("hmsSdk", "Session is first flush");
            this.f61012c = new a(j10);
        }
    }

    public boolean b() {
        a aVar = this.f61012c;
        if (aVar != null) {
            return aVar.f61014b;
        }
        v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
