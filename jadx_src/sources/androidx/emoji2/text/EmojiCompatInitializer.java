package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.os.e0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.y;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public class EmojiCompatInitializer implements androidx.startup.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f22929a = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22930b = "EmojiCompatInitializer";

    @w0(19)
    public static class a extends f.d {
        protected a(Context context) {
            super(new b(context));
            f(1);
        }
    }

    @w0(19)
    public static class b implements f.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22933a;

        public class a extends f.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.j f22934a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f22935b;

            a(f.j jVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f22934a = jVar;
                this.f22935b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.j
            public void a(@p0 Throwable th2) {
                try {
                    this.f22934a.a(th2);
                } finally {
                    this.f22935b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.j
            public void b(@n0 p pVar) {
                try {
                    this.f22934a.b(pVar);
                } finally {
                    this.f22935b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f22933a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.i
        public void a(@n0 final f.j jVar) {
            final ThreadPoolExecutor threadPoolExecutorC = androidx.emoji2.text.c.c(EmojiCompatInitializer.f22930b);
            threadPoolExecutorC.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23106b.d(jVar, threadPoolExecutorC);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @k1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(@n0 f.j jVar, @n0 ThreadPoolExecutor threadPoolExecutor) {
            try {
                l lVarA = d.a(this.f22933a);
                if (lVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                lVarA.l(threadPoolExecutor);
                lVarA.a().a(new a(jVar, threadPoolExecutor));
            } catch (Throwable th2) {
                jVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e0.b("EmojiCompat.EmojiCompatInitializer.run");
                if (f.n()) {
                    f.b().q();
                }
            } finally {
                e0.d();
            }
        }
    }

    @Override // androidx.startup.b
    @n0
    public List<Class<? extends androidx.startup.b<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.startup.b
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean a(@n0 Context context) {
        f.m(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    @w0(19)
    void d(@n0 Context context) {
        final Lifecycle lifecycle = ((y) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new androidx.lifecycle.j() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.j
            public void j(@n0 y yVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.d(this);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void l(y yVar) {
                androidx.lifecycle.i.c(this, yVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onDestroy(y yVar) {
                androidx.lifecycle.i.b(this, yVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onStart(y yVar) {
                androidx.lifecycle.i.e(this, yVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onStop(y yVar) {
                androidx.lifecycle.i.f(this, yVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void q(y yVar) {
                androidx.lifecycle.i.a(this, yVar);
            }
        });
    }

    @w0(19)
    void e() {
        androidx.emoji2.text.c.e().postDelayed(new c(), 500L);
    }
}
