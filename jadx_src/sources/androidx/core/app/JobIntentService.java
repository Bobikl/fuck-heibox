package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f19849i = "JobIntentService";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final boolean f19850j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f19851k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final HashMap<ComponentName, h> f19852l = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f19853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h f19854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a f19855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f19856e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f19857f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f19858g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ArrayList<d> f19859h;

    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = JobIntentService.this.a();
                if (eVarA == null) {
                    return null;
                }
                JobIntentService.this.h(eVarA.getIntent());
                eVarA.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r10) {
            JobIntentService.this.j();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            JobIntentService.this.j();
        }
    }

    public interface b {
        IBinder a();

        e b();
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f19861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f19862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f19863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f19864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f19865h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f19861d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f19862e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f19863f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f19878a);
            if (this.f19861d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f19864g) {
                        this.f19864g = true;
                        if (!this.f19865h) {
                            this.f19862e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void c() {
            synchronized (this) {
                if (this.f19865h) {
                    if (this.f19864g) {
                        this.f19862e.acquire(60000L);
                    }
                    this.f19865h = false;
                    this.f19863f.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void d() {
            synchronized (this) {
                if (!this.f19865h) {
                    this.f19865h = true;
                    this.f19863f.acquire(600000L);
                    this.f19862e.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void e() {
            synchronized (this) {
                this.f19864g = false;
            }
        }
    }

    public final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f19866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f19867b;

        d(Intent intent, int i10) {
            this.f19866a = intent;
            this.f19867b = i10;
        }

        @Override // androidx.core.app.JobIntentService.e
        public void a() {
            JobIntentService.this.stopSelf(this.f19867b);
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
            return this.f19866a;
        }
    }

    public interface e {
        void a();

        Intent getIntent();
    }

    @androidx.annotation.w0(26)
    public static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f19869d = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final boolean f19870e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final JobIntentService f19871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f19872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        JobParameters f19873c;

        public final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final JobWorkItem f19874a;

            a(JobWorkItem jobWorkItem) {
                this.f19874a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.e
            public void a() {
                synchronized (f.this.f19872b) {
                    JobParameters jobParameters = f.this.f19873c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f19874a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
                return this.f19874a.getIntent();
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f19872b = new Object();
            this.f19871a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public e b() {
            synchronized (this.f19872b) {
                JobParameters jobParameters = this.f19873c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f19871a.getClassLoader());
                return new a(jobWorkItemDequeueWork);
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f19873c = jobParameters;
            this.f19871a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f19871a.b();
            synchronized (this.f19872b) {
                this.f19873c = null;
            }
            return zB;
        }
    }

    @androidx.annotation.w0(26)
    public static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JobInfo f19876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final JobScheduler f19877e;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f19876d = new JobInfo.Builder(i10, this.f19878a).setOverrideDeadline(0L).build();
            this.f19877e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.h
        void a(Intent intent) {
            this.f19877e.enqueue(this.f19876d, new JobWorkItem(intent));
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f19878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f19879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19880c;

        h(ComponentName componentName) {
            this.f19878a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i10) {
            if (!this.f19879b) {
                this.f19879b = true;
                this.f19880c = i10;
            } else {
                if (this.f19880c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f19880c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19859h = null;
        } else {
            this.f19859h = new ArrayList<>();
        }
    }

    public static void c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 ComponentName componentName, int i10, @androidx.annotation.n0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f19851k) {
            h hVarF = f(context, componentName, true, i10);
            hVarF.b(i10);
            hVarF.a(intent);
        }
    }

    public static void d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Class<?> cls, int i10, @androidx.annotation.n0 Intent intent) {
        c(context, new ComponentName(context, cls), i10, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> map = f19852l;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i10);
        }
        h hVar2 = cVar;
        map.put(componentName, hVar2);
        return hVar2;
    }

    e a() {
        b bVar = this.f19853b;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f19859h) {
            if (this.f19859h.size() <= 0) {
                return null;
            }
            return this.f19859h.remove(0);
        }
    }

    boolean b() {
        a aVar = this.f19855d;
        if (aVar != null) {
            aVar.cancel(this.f19856e);
        }
        this.f19857f = true;
        return i();
    }

    void e(boolean z10) {
        if (this.f19855d == null) {
            this.f19855d = new a();
            h hVar = this.f19854c;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.f19855d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f19857f;
    }

    protected abstract void h(@androidx.annotation.n0 Intent intent);

    public boolean i() {
        return true;
    }

    void j() {
        ArrayList<d> arrayList = this.f19859h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f19855d = null;
                ArrayList<d> arrayList2 = this.f19859h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f19858g) {
                    this.f19854c.c();
                }
            }
        }
    }

    public void k(boolean z10) {
        this.f19856e = z10;
    }

    @Override // android.app.Service
    public IBinder onBind(@androidx.annotation.n0 Intent intent) {
        b bVar = this.f19853b;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19853b = new f(this);
            this.f19854c = null;
        } else {
            this.f19853b = null;
            this.f19854c = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f19859h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f19858g = true;
                this.f19854c.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.p0 Intent intent, int i10, int i11) {
        if (this.f19859h == null) {
            return 2;
        }
        this.f19854c.e();
        synchronized (this.f19859h) {
            ArrayList<d> arrayList = this.f19859h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }
}
