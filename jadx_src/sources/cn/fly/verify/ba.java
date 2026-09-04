package cn.fly.verify;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ba f35813a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f35815c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile long f35818f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<ea> f35814b = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35816d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f35817e = -1;

    public class a implements fy.b {
        a() {
        }

        @Override // cn.fly.verify.fy.b
        public void a(Activity activity) {
        }

        @Override // cn.fly.verify.fy.b
        public void a(Activity activity, Bundle bundle) {
        }

        @Override // cn.fly.verify.fy.b
        public void b(Activity activity) {
            try {
                ba.this.f35818f = SystemClock.elapsedRealtime();
                if (ba.this.f35817e == 0) {
                    ba.this.f35817e = SystemClock.elapsedRealtime();
                    if (ba.this.f35815c != null) {
                        ba.this.f35815c.sendEmptyMessage(1);
                    }
                }
                ba.this.f35816d = activity == null ? null : activity.toString();
            } catch (Throwable unused) {
            }
        }

        @Override // cn.fly.verify.fy.b
        public void b(Activity activity, Bundle bundle) {
        }

        @Override // cn.fly.verify.fy.b
        public void c(Activity activity) {
        }

        @Override // cn.fly.verify.fy.b
        public void d(Activity activity) {
            try {
                if (ba.this.f35816d != null) {
                    if (!ba.this.f35816d.equals(activity == null ? null : activity.toString())) {
                        return;
                    }
                }
                if (ba.this.f35815c != null) {
                    long jElapsedRealtime = ba.this.f35817e > 0 ? SystemClock.elapsedRealtime() - ba.this.f35817e : 0L;
                    Message message = new Message();
                    message.what = 2;
                    message.obj = Long.valueOf(jElapsedRealtime);
                    ba.this.f35815c.sendMessage(message);
                }
                ba.this.f35817e = 0L;
                ba.this.f35816d = null;
            } catch (Throwable unused) {
            }
        }

        @Override // cn.fly.verify.fy.b
        public void e(Activity activity) {
            if (ba.this.f35817e > 0) {
                d(activity);
            }
        }
    }

    private ba() {
        String str = null;
        this.f35818f = 0L;
        this.f35818f = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty("M-")) {
            str = ep.f36338a + a("004Viehljmjh");
        }
        this.f35815c = er.a(str, new Handler.Callback() { // from class: cn.fly.verify.ba.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 0) {
                    ba.this.f35817e = SystemClock.elapsedRealtime();
                    ba.this.a(false);
                    ba.this.d();
                } else if (i10 == 1) {
                    ba.this.a(true);
                } else if (i10 == 2) {
                    ba.this.a(((Long) message.obj).longValue(), true);
                } else if (i10 == 3) {
                    try {
                        ea eaVar = (ea) message.obj;
                        if (eaVar != null) {
                            ba.this.f35814b.add(eaVar);
                            eaVar.a(ba.this.f35817e > 0, true, 0L);
                        }
                    } catch (Throwable th2) {
                        es.a().a(th2);
                    }
                }
                return false;
            }
        });
    }

    public static synchronized ba a() {
        if (f35813a == null) {
            ba baVar = new ba();
            f35813a = baVar;
            if (baVar.f35815c != null) {
                f35813a.f35815c.sendEmptyMessage(0);
            }
        }
        return f35813a;
    }

    public static String a(String str) {
        return el.a(str, 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, boolean z10) {
        if (z10) {
            a(false, false, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (z10) {
            a(true, false, 0L);
        }
    }

    private void a(boolean z10, boolean z11, long j10) {
        synchronized (this.f35814b) {
            Iterator<ea> it = this.f35814b.iterator();
            while (it.hasNext()) {
                it.next().a(z10, z11, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        fy.a(ax.g()).a(new a());
    }

    public void a(ea eaVar) {
        if (eaVar == null) {
            return;
        }
        synchronized (this.f35814b) {
            if (this.f35814b.contains(eaVar)) {
                return;
            }
            if (this.f35815c != null) {
                Message message = new Message();
                message.what = 3;
                message.obj = eaVar;
                this.f35815c.sendMessage(message);
            }
        }
    }

    public boolean b() {
        return this.f35817e == 0;
    }

    public long c() {
        return this.f35818f;
    }
}
