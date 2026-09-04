package com.taobao.accs.utl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.agoo.TaobaoRegister;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class l implements Application.ActivityLifecycleCallbacks {
    public static final int STATE_BACK = 0;
    public static final int STATE_FORE = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f98503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<a> f98504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<b> f98505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Application f98506e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f98509g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f98502a = l.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f98507j = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f98508f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f98510h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f98511i = 1;

    /* JADX INFO: compiled from: Taobao */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f98512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f98513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f98514c = t.a(l.f98506e);

        public a(String str, int i10) {
            this.f98512a = str;
            this.f98513b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ALog.e(l.f98502a, "click report", "lastActiveTime", Long.valueOf(this.f98514c), "currentActiveTime", Long.valueOf(jCurrentTimeMillis));
            long j10 = this.f98514c;
            if (j10 == 0 || UtilityImpl.a(j10, jCurrentTimeMillis)) {
                this.f98513b |= 8;
            }
            TaobaoRegister.clickMessage(l.f98506e, this.f98512a, null, this.f98513b, this.f98514c);
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public interface b {
        void a();

        void b();
    }

    private l() {
        f98504c = new ArrayList<>();
        f98505d = new ArrayList<>();
    }

    public static l a() {
        if (f98503b == null) {
            synchronized (l.class) {
                if (f98503b == null) {
                    f98503b = new l();
                }
            }
        }
        return f98503b;
    }

    public void a(b bVar) {
        if (bVar != null) {
            f98505d.add(bVar);
        }
    }

    public void b() {
        ArrayList<a> arrayList = f98504c;
        if (arrayList != null) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(it.next());
            }
            f98504c.clear();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i10 = this.f98508f;
        if ((i10 & 1) != 1) {
            this.f98508f = i10 | 1 | 2;
        } else if ((i10 & 2) == 2) {
            this.f98508f = i10 & (-3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.f98509g) {
            t.a(f98506e, System.currentTimeMillis());
            if (!f98507j) {
                f98507j = true;
            }
        }
        this.f98509g = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i10 = this.f98510h;
        this.f98510h = i10 + 1;
        if (i10 == 0) {
            ALog.i(f98502a, "onActivityStarted back to force", new Object[0]);
            this.f98509g = true;
            this.f98511i = 1;
            ThreadPoolExecutorFactory.execute(new m(this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.f98510h - 1;
        this.f98510h = i10;
        if (i10 == 0) {
            this.f98511i = 0;
            ThreadPoolExecutorFactory.execute(new n(this));
        }
    }
}
