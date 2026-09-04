package cn.fly.verify;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class fy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fy f36617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<b> f36618b = new HashSet<>();

    public interface a {
        void a(b bVar);
    }

    public interface b {
        void a(Activity activity);

        void a(Activity activity, Bundle bundle);

        void b(Activity activity);

        void b(Activity activity, Bundle bundle);

        void c(Activity activity);

        void d(Activity activity);

        void e(Activity activity);
    }

    private fy(Context context) {
        b(context);
    }

    public static synchronized fy a(Context context) {
        if (f36617a == null) {
            f36617a = new fy(context);
        }
        return f36617a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Activity activity) {
        a(new a() { // from class: cn.fly.verify.fy.3
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Activity activity, final Bundle bundle) {
        a(new a() { // from class: cn.fly.verify.fy.2
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.a(activity, bundle);
            }
        });
    }

    private void a(a aVar) {
        b[] bVarArr;
        try {
            synchronized (this.f36618b) {
                HashSet<b> hashSet = this.f36618b;
                bVarArr = (b[]) hashSet.toArray(new b[hashSet.size()]);
            }
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    aVar.a(bVar);
                }
            }
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Activity activity) {
        a(new a() { // from class: cn.fly.verify.fy.4
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.b(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Activity activity, final Bundle bundle) {
        a(new a() { // from class: cn.fly.verify.fy.8
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.b(activity, bundle);
            }
        });
    }

    private void b(Context context) {
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: cn.fly.verify.fy.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    fy.this.a(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    fy.this.e(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    fy.this.c(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    fy.this.b(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    fy.this.b(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    fy.this.a(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    fy.this.d(activity);
                }
            });
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Activity activity) {
        a(new a() { // from class: cn.fly.verify.fy.5
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.c(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Activity activity) {
        a(new a() { // from class: cn.fly.verify.fy.6
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.d(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final Activity activity) {
        a(new a() { // from class: cn.fly.verify.fy.7
            @Override // cn.fly.verify.fy.a
            public void a(b bVar) {
                bVar.e(activity);
            }
        });
    }

    public void a(b bVar) {
        synchronized (this.f36618b) {
            this.f36618b.add(bVar);
        }
    }
}
