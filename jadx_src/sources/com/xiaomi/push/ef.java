package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.taobao.accs.common.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ef f107025a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f315a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ConcurrentLinkedQueue<b> f316a;

    public class a extends b {
        a() {
            super();
        }

        @Override // com.xiaomi.push.ef.b, com.xiaomi.push.ak.b
        public void b() {
            ef.this.b();
        }
    }

    public class b extends ak.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f107027a = System.currentTimeMillis();

        b() {
        }

        public boolean a() {
            return true;
        }

        @Override // com.xiaomi.push.ak.b
        public void b() {
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        final boolean m278b() {
            return System.currentTimeMillis() - this.f107027a > 172800000;
        }
    }

    public class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f107029a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        File f318a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f319a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        boolean f320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f107030b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        boolean f321b;

        c(String str, String str2, File file, boolean z10) {
            super();
            this.f319a = str;
            this.f107030b = str2;
            this.f318a = file;
            this.f321b = z10;
        }

        private boolean c() {
            int i10;
            int i11 = 0;
            SharedPreferences sharedPreferences = ef.this.f315a.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                jCurrentTimeMillis = jSONObject.getLong("time");
                i10 = jSONObject.getInt(Constants.KEY_TIMES);
            } catch (JSONException unused) {
                i10 = 0;
            }
            if (System.currentTimeMillis() - jCurrentTimeMillis >= 86400000) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                if (i10 > 10) {
                    return false;
                }
                i11 = i10;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", jCurrentTimeMillis);
                jSONObject2.put(Constants.KEY_TIMES, i11 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e10) {
                com.xiaomi.channel.commonutils.logger.b.c("JSONException on put " + e10.getMessage());
            }
            return true;
        }

        @Override // com.xiaomi.push.ef.b
        public boolean a() {
            return bg.e(ef.this.f315a) || (this.f321b && bg.b(ef.this.f315a));
        }

        @Override // com.xiaomi.push.ef.b, com.xiaomi.push.ak.b
        public void b() {
            try {
                if (c()) {
                    HashMap map = new HashMap();
                    map.put("uid", com.xiaomi.push.service.bw.m738a());
                    map.put("token", this.f107030b);
                    map.put(h5.b.f119111k, bg.m175a(ef.this.f315a));
                    bg.a(this.f319a, map, this.f318a, "file");
                }
                this.f320a = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.ak.b
        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public void mo279c() {
            if (!this.f320a) {
                int i10 = this.f107029a + 1;
                this.f107029a = i10;
                if (i10 < 3) {
                    ef.this.f316a.add(this);
                }
            }
            if (this.f320a || this.f107029a >= 3) {
                this.f318a.delete();
            }
            ef.this.a((1 << this.f107029a) * 1000);
        }
    }

    private ef(Context context) {
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f316a = concurrentLinkedQueue;
        this.f315a = context;
        concurrentLinkedQueue.add(new a());
        b(0L);
    }

    public static ef a(Context context) {
        if (f107025a == null) {
            synchronized (ef.class) {
                if (f107025a == null) {
                    f107025a = new ef(context);
                }
            }
        }
        f107025a.f315a = context;
        return f107025a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        b bVarPeek = this.f316a.peek();
        if (bVarPeek == null || !bVarPeek.a()) {
            return;
        }
        b(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (z.b() || z.m781a()) {
            return;
        }
        try {
            File file = new File(this.f315a.getExternalFilesDir(null) + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    private void b(long j10) {
        if (this.f316a.isEmpty()) {
            return;
        }
        ie.a(new eh(this), j10);
    }

    private void c() {
        while (!this.f316a.isEmpty()) {
            b bVarPeek = this.f316a.peek();
            if (bVarPeek != null) {
                if (!bVarPeek.m278b() && this.f316a.size() <= 6) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.c("remove Expired task");
                this.f316a.remove(bVarPeek);
            }
        }
    }

    public void a() {
        c();
        a(0L);
    }

    public void a(String str, String str2, Date date, Date date2, int i10, boolean z10) {
        this.f316a.add(new eg(this, i10, date, date2, str, str2, z10));
        b(0L);
    }
}
