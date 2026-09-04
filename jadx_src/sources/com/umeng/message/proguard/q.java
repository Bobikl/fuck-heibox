package com.umeng.message.proguard;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.umeng.message.common.UPLog;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends Service {
    private static final String TAG = "BaseService";
    private static final int jobIndex = 21000;
    final ArrayList<d> mCompatQueue;
    h mCompatWorkEnqueuer;
    a mCurProcessor;
    b mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, h> sClassWorkEnqueuer = new HashMap<>();
    private static final HashMap<Class<?>, Integer> jobMap = new HashMap<>();
    private static final Object mRealTimeModeLock = new Object();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f105852a;

        a(q qVar) {
            this.f105852a = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    e eVarDequeueWork = this.f105852a.dequeueWork();
                    if (eVarDequeueWork == null) {
                        break;
                    }
                    this.f105852a.onHandleWork(eVarDequeueWork.a());
                    eVarDequeueWork.b();
                } catch (Throwable th2) {
                    UPLog.e(q.TAG, th2);
                }
            }
            this.f105852a.processorFinished();
            this.f105852a = null;
            try {
                this.f105852a.processorFinished();
            } catch (Throwable th3) {
                UPLog.e(q.TAG, th3);
            }
            this.f105852a = null;
        }
    }

    public interface b {
        IBinder a();

        e b();
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f105853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f105854b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Context f105855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final PowerManager.WakeLock f105856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final PowerManager.WakeLock f105857h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f105855f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f105856g = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f105857h = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // com.umeng.message.proguard.q.h
        public final void a() {
            synchronized (this) {
                this.f105853a = false;
            }
        }

        @Override // com.umeng.message.proguard.q.h
        final void a(Intent intent) {
            try {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(this.f105868c);
                if (this.f105855f.startService(intent2) != null) {
                    synchronized (this) {
                        if (!this.f105853a) {
                            this.f105853a = true;
                            if (!this.f105854b) {
                                this.f105856g.acquire(60000L);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
            }
        }

        @Override // com.umeng.message.proguard.q.h
        public final void b() {
            try {
                synchronized (this) {
                    if (!this.f105854b) {
                        this.f105854b = true;
                        this.f105857h.acquire(600000L);
                        this.f105856g.release();
                    }
                }
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
            }
        }

        @Override // com.umeng.message.proguard.q.h
        public final void c() {
            try {
                synchronized (this) {
                    if (this.f105854b) {
                        if (this.f105853a) {
                            this.f105856g.acquire(60000L);
                        }
                        this.f105854b = false;
                        this.f105857h.release();
                    }
                }
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
            }
        }
    }

    public final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f105858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f105859b;

        d(Intent intent, int i10) {
            this.f105858a = intent;
            this.f105859b = i10;
        }

        @Override // com.umeng.message.proguard.q.e
        public final Intent a() {
            return this.f105858a;
        }

        @Override // com.umeng.message.proguard.q.e
        public final void b() {
            try {
                q.this.stopSelf(this.f105859b);
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
            }
        }
    }

    public interface e {
        Intent a();

        void b();
    }

    @TargetApi(26)
    public static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f105861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f105862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        JobParameters f105863c;

        public final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final JobWorkItem f105864a;

            a(JobWorkItem jobWorkItem) {
                this.f105864a = jobWorkItem;
            }

            @Override // com.umeng.message.proguard.q.e
            public final Intent a() {
                return this.f105864a.getIntent();
            }

            @Override // com.umeng.message.proguard.q.e
            public final void b() {
                try {
                    synchronized (f.this.f105862b) {
                        JobParameters jobParameters = f.this.f105863c;
                        if (jobParameters != null) {
                            try {
                                jobParameters.completeWork(this.f105864a);
                            } catch (Throwable th2) {
                                UPLog.e(q.TAG, th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    UPLog.e(q.TAG, th3);
                }
            }
        }

        f(q qVar) {
            super(qVar);
            this.f105862b = new Object();
            this.f105861a = qVar;
        }

        @Override // com.umeng.message.proguard.q.b
        public final IBinder a() {
            return getBinder();
        }

        @Override // com.umeng.message.proguard.q.b
        public final e b() {
            try {
                synchronized (this.f105862b) {
                    JobParameters jobParameters = this.f105863c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f105861a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                }
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
                return null;
            }
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f105863c = jobParameters;
            this.f105861a.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean zDoStopCurrentWork = this.f105861a.doStopCurrentWork();
            synchronized (this.f105862b) {
                this.f105863c = null;
            }
            return zDoStopCurrentWork;
        }
    }

    @TargetApi(21)
    public static final class g extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JobInfo f105866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JobScheduler f105867b;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            a(i10);
            this.f105866a = new JobInfo.Builder(i10, this.f105868c).setOverrideDeadline(0L).build();
            try {
                this.f105867b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
            }
        }

        @Override // com.umeng.message.proguard.q.h
        final void a(Intent intent) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f105867b.enqueue(this.f105866a, new JobWorkItem(intent));
                }
            } catch (Throwable th2) {
                UPLog.e(q.TAG, th2);
            }
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ComponentName f105868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f105869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105870e;

        h(ComponentName componentName) {
            this.f105868c = componentName;
        }

        public void a() {
        }

        final void a(int i10) {
            if (!this.f105869d) {
                this.f105869d = true;
                this.f105870e = i10;
            } else {
                if (this.f105870e == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f105870e);
            }
        }

        abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }
    }

    public q() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    private static void enqueueWork(Context context, ComponentName componentName, int i10, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        if (context == null || componentName == null) {
            return;
        }
        synchronized (sLock) {
            h workEnqueuer = getWorkEnqueuer(context, componentName, true, i10);
            workEnqueuer.a(i10);
            workEnqueuer.a(intent);
        }
    }

    private static void enqueueWork(Context context, Class<?> cls, int i10, Intent intent) {
        if (context == null || cls == null || intent == null) {
            return;
        }
        try {
            enqueueWork(context, new ComponentName(context, cls), i10, intent);
        } catch (Throwable th2) {
            UPLog.e(TAG, "jobId:", Integer.valueOf(i10), "failed:", th2.getMessage());
        }
    }

    public static <T extends q> void enqueueWork(Context context, Class<T> cls, Intent intent) {
        int iIntValue;
        synchronized (mRealTimeModeLock) {
            try {
                if (context == null || cls == null || intent == null) {
                    return;
                }
                UPLog.i(TAG, "enqueue cls:", cls.getSimpleName());
                HashMap<Class<?>, Integer> map = jobMap;
                if (map.containsKey(cls)) {
                    Integer num = map.get(cls);
                    if (num == null) {
                        return;
                    } else {
                        iIntValue = num.intValue();
                    }
                } else {
                    iIntValue = map.size() + jobIndex;
                    map.put(cls, Integer.valueOf(iIntValue));
                }
                UPLog.i(TAG, "jobId:", Integer.valueOf(iIntValue));
                enqueueWork(context, (Class<?>) cls, iIntValue, intent);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static h getWorkEnqueuer(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> map = sClassWorkEnqueuer;
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

    private void init() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJobImpl = new f(this);
                this.mCompatWorkEnqueuer = null;
            } else {
                this.mJobImpl = null;
                this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
            }
        } catch (Throwable th2) {
            UPLog.e(TAG, th2);
        }
    }

    e dequeueWork() {
        d dVarRemove;
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.b();
        }
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList == null) {
            return null;
        }
        synchronized (arrayList) {
            dVarRemove = this.mCompatQueue.size() > 0 ? this.mCompatQueue.remove(0) : null;
        }
        return dVarRemove;
    }

    boolean doStopCurrentWork() {
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z10) {
        try {
            if (this.mCurProcessor == null) {
                this.mCurProcessor = new a(this);
                h hVar = this.mCompatWorkEnqueuer;
                if (hVar != null && z10) {
                    hVar.b();
                }
                com.umeng.message.proguard.b.a(this.mCurProcessor);
            }
        } catch (Throwable th2) {
            UPLog.e(TAG, th2);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent != null) {
            try {
                b bVar = this.mJobImpl;
                if (bVar != null) {
                    return bVar.a();
                }
                return null;
            } catch (Throwable th2) {
                UPLog.e(TAG, th2);
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        init();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            super.onDestroy();
            ArrayList<d> arrayList = this.mCompatQueue;
            if (arrayList != null) {
                synchronized (arrayList) {
                    this.mDestroyed = true;
                    this.mCompatWorkEnqueuer.c();
                }
            }
        } catch (Throwable th2) {
            UPLog.e(TAG, th2);
        }
    }

    protected void onHandleWork(Intent intent) {
        UPLog.i(TAG, "onHandleWork");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null) {
            try {
                if (this.mCompatQueue == null) {
                    return 2;
                }
                if (this.mCompatWorkEnqueuer == null) {
                    init();
                }
                this.mCompatWorkEnqueuer.a();
                synchronized (this.mCompatQueue) {
                    this.mCompatQueue.add(new d(intent, i11));
                    ensureProcessorRunningLocked(true);
                }
                return 3;
            } catch (Throwable th2) {
                UPLog.e(TAG, th2);
            }
        }
        return 2;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    void processorFinished() {
        try {
            ArrayList<d> arrayList = this.mCompatQueue;
            if (arrayList != null) {
                synchronized (arrayList) {
                    this.mCurProcessor = null;
                    if (this.mCompatQueue.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.c();
                    }
                }
            }
        } catch (Throwable th2) {
            UPLog.e(TAG, th2);
        }
    }

    public void setInterruptIfStopped(boolean z10) {
        this.mInterruptIfStopped = z10;
    }
}
