package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;

/* JADX INFO: compiled from: LiveDataUtils.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class l {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* JADX INFO: compiled from: LiveDataUtils.java */
    public class a<In> implements j0<In> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Out f29360a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.taskexecutor.c f29361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f29362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0.a f29363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.g0 f29364e;

        /* JADX INFO: renamed from: androidx.work.impl.utils.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LiveDataUtils.java */
        public class RunnableC0234a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f29365b;

            RunnableC0234a(Object obj) {
                this.f29365b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f29362c) {
                    ?? Apply = a.this.f29363d.apply(this.f29365b);
                    a aVar = a.this;
                    Out out = aVar.f29360a;
                    if (out == 0 && Apply != 0) {
                        aVar.f29360a = Apply;
                        aVar.f29364e.o(Apply);
                    } else if (out != 0 && !out.equals(Apply)) {
                        a aVar2 = a.this;
                        aVar2.f29360a = Apply;
                        aVar2.f29364e.o(Apply);
                    }
                }
            }
        }

        a(androidx.work.impl.utils.taskexecutor.c cVar, Object obj, f0.a aVar, androidx.lifecycle.g0 g0Var) {
            this.f29361b = cVar;
            this.f29362c = obj;
            this.f29363d = aVar;
            this.f29364e = g0Var;
        }

        @Override // androidx.lifecycle.j0
        public void a(@p0 In in) {
            this.f29361b.a(new RunnableC0234a(in));
        }
    }

    private l() {
    }

    @n0
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> a(@n0 LiveData<In> liveData, @n0 f0.a<In, Out> aVar, @n0 androidx.work.impl.utils.taskexecutor.c cVar) {
        Object obj = new Object();
        androidx.lifecycle.g0 g0Var = new androidx.lifecycle.g0();
        g0Var.s(liveData, new a(cVar, obj, aVar, g0Var));
        return g0Var;
    }
}
