package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.l2;
import androidx.core.util.f;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: LoaderManagerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f24307c = "LoaderManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f24308d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final y f24309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final c f24310b;

    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class a<D> extends i0<D> implements androidx.loader.content.c.InterfaceC0181c<D> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f24311m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @p0
        private final Bundle f24312n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @n0
        private final androidx.loader.content.c<D> f24313o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private y f24314p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private C0179b<D> f24315q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private androidx.loader.content.c<D> f24316r;

        a(int i10, @p0 Bundle bundle, @n0 androidx.loader.content.c<D> cVar, @p0 androidx.loader.content.c<D> cVar2) {
            this.f24311m = i10;
            this.f24312n = bundle;
            this.f24313o = cVar;
            this.f24316r = cVar2;
            cVar.u(i10, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0181c
        public void a(@n0 androidx.loader.content.c<D> cVar, @p0 D d10) {
            if (b.f24308d) {
                Log.v(b.f24307c, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d10);
                return;
            }
            if (b.f24308d) {
                Log.w(b.f24307c, "onLoadComplete was incorrectly called on a background thread");
            }
            o(d10);
        }

        @Override // androidx.lifecycle.LiveData
        protected void m() {
            if (b.f24308d) {
                Log.v(b.f24307c, "  Starting: " + this);
            }
            this.f24313o.y();
        }

        @Override // androidx.lifecycle.LiveData
        protected void n() {
            if (b.f24308d) {
                Log.v(b.f24307c, "  Stopping: " + this);
            }
            this.f24313o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void p(@n0 j0<? super D> j0Var) {
            super.p(j0Var);
            this.f24314p = null;
            this.f24315q = null;
        }

        @Override // androidx.lifecycle.i0, androidx.lifecycle.LiveData
        public void r(D d10) {
            super.r(d10);
            androidx.loader.content.c<D> cVar = this.f24316r;
            if (cVar != null) {
                cVar.w();
                this.f24316r = null;
            }
        }

        @k0
        androidx.loader.content.c<D> s(boolean z10) {
            if (b.f24308d) {
                Log.v(b.f24307c, "  Destroying: " + this);
            }
            this.f24313o.b();
            this.f24313o.a();
            C0179b<D> c0179b = this.f24315q;
            if (c0179b != null) {
                p(c0179b);
                if (z10) {
                    c0179b.d();
                }
            }
            this.f24313o.B(this);
            if ((c0179b == null || c0179b.c()) && !z10) {
                return this.f24313o;
            }
            this.f24313o.w();
            return this.f24316r;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f24311m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f24312n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f24313o);
            this.f24313o.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f24315q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f24315q);
                this.f24315q.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f24311m);
            sb2.append(" : ");
            f.a(this.f24313o, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        @n0
        androidx.loader.content.c<D> u() {
            return this.f24313o;
        }

        boolean v() {
            C0179b<D> c0179b;
            return (!h() || (c0179b = this.f24315q) == null || c0179b.c()) ? false : true;
        }

        void w() {
            y yVar = this.f24314p;
            C0179b<D> c0179b = this.f24315q;
            if (yVar == null || c0179b == null) {
                return;
            }
            super.p(c0179b);
            k(yVar, c0179b);
        }

        @n0
        @k0
        androidx.loader.content.c<D> x(@n0 y yVar, @n0 androidx.loader.app.a.InterfaceC0178a<D> interfaceC0178a) {
            C0179b<D> c0179b = new C0179b<>(this.f24313o, interfaceC0178a);
            k(yVar, c0179b);
            C0179b<D> c0179b2 = this.f24315q;
            if (c0179b2 != null) {
                p(c0179b2);
            }
            this.f24314p = yVar;
            this.f24315q = c0179b;
            return this.f24313o;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class C0179b<D> implements j0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final androidx.loader.content.c<D> f24317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final androidx.loader.app.a.InterfaceC0178a<D> f24318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24319c = false;

        C0179b(@n0 androidx.loader.content.c<D> cVar, @n0 androidx.loader.app.a.InterfaceC0178a<D> interfaceC0178a) {
            this.f24317a = cVar;
            this.f24318b = interfaceC0178a;
        }

        @Override // androidx.lifecycle.j0
        public void a(@p0 D d10) {
            if (b.f24308d) {
                Log.v(b.f24307c, "  onLoadFinished in " + this.f24317a + ": " + this.f24317a.d(d10));
            }
            this.f24318b.b(this.f24317a, d10);
            this.f24319c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f24319c);
        }

        boolean c() {
            return this.f24319c;
        }

        @k0
        void d() {
            if (this.f24319c) {
                if (b.f24308d) {
                    Log.v(b.f24307c, "  Resetting: " + this.f24317a);
                }
                this.f24318b.c(this.f24317a);
            }
        }

        public String toString() {
            return this.f24318b.toString();
        }
    }

    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class c extends w0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final y0.b f24320d = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l2<a> f24321b = new l2<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24322c = false;

        /* JADX INFO: compiled from: LoaderManagerImpl.java */
        public static final class a implements y0.b {
            a() {
            }

            @Override // androidx.lifecycle.y0.b
            @n0
            public <T extends w0> T a(@n0 Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.y0.b
            public /* synthetic */ w0 b(Class cls, u2.a aVar) {
                return z0.b(this, cls, aVar);
            }
        }

        c() {
        }

        @n0
        static c f(b1 b1Var) {
            return (c) new y0(b1Var, f24320d).a(c.class);
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f24321b.x() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f24321b.x(); i10++) {
                    a aVarY = this.f24321b.y(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f24321b.m(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarY.toString());
                    aVarY.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void e() {
            this.f24322c = false;
        }

        <D> a<D> g(int i10) {
            return this.f24321b.g(i10);
        }

        boolean h() {
            int iX = this.f24321b.x();
            for (int i10 = 0; i10 < iX; i10++) {
                if (this.f24321b.y(i10).v()) {
                    return true;
                }
            }
            return false;
        }

        boolean i() {
            return this.f24322c;
        }

        void k() {
            int iX = this.f24321b.x();
            for (int i10 = 0; i10 < iX; i10++) {
                this.f24321b.y(i10).w();
            }
        }

        void m(int i10, @n0 a aVar) {
            this.f24321b.n(i10, aVar);
        }

        void n(int i10) {
            this.f24321b.q(i10);
        }

        void o() {
            this.f24322c = true;
        }

        @Override // androidx.lifecycle.w0
        protected void onCleared() {
            super.onCleared();
            int iX = this.f24321b.x();
            for (int i10 = 0; i10 < iX; i10++) {
                this.f24321b.y(i10).s(true);
            }
            this.f24321b.b();
        }
    }

    b(@n0 y yVar, @n0 b1 b1Var) {
        this.f24309a = yVar;
        this.f24310b = c.f(b1Var);
    }

    @n0
    @k0
    private <D> androidx.loader.content.c<D> j(int i10, @p0 Bundle bundle, @n0 androidx.loader.app.a.InterfaceC0178a<D> interfaceC0178a, @p0 androidx.loader.content.c<D> cVar) {
        try {
            this.f24310b.o();
            androidx.loader.content.c<D> cVarA = interfaceC0178a.a(i10, bundle);
            if (cVarA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarA.getClass().isMemberClass() && !Modifier.isStatic(cVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarA);
            }
            a aVar = new a(i10, bundle, cVarA, cVar);
            if (f24308d) {
                Log.v(f24307c, "  Created new loader " + aVar);
            }
            this.f24310b.m(i10, aVar);
            this.f24310b.e();
            return aVar.x(this.f24309a, interfaceC0178a);
        } catch (Throwable th2) {
            this.f24310b.e();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    @k0
    public void a(int i10) {
        if (this.f24310b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f24308d) {
            Log.v(f24307c, "destroyLoader in " + this + " of " + i10);
        }
        a aVarG = this.f24310b.g(i10);
        if (aVarG != null) {
            aVarG.s(true);
            this.f24310b.n(i10);
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f24310b.c(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    @p0
    public <D> androidx.loader.content.c<D> e(int i10) {
        if (this.f24310b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> aVarG = this.f24310b.g(i10);
        if (aVarG != null) {
            return aVarG.u();
        }
        return null;
    }

    @Override // androidx.loader.app.a
    public boolean f() {
        return this.f24310b.h();
    }

    @Override // androidx.loader.app.a
    @n0
    @k0
    public <D> androidx.loader.content.c<D> g(int i10, @p0 Bundle bundle, @n0 androidx.loader.app.a.InterfaceC0178a<D> interfaceC0178a) {
        if (this.f24310b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarG = this.f24310b.g(i10);
        if (f24308d) {
            Log.v(f24307c, "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarG == null) {
            return j(i10, bundle, interfaceC0178a, null);
        }
        if (f24308d) {
            Log.v(f24307c, "  Re-using existing loader " + aVarG);
        }
        return aVarG.x(this.f24309a, interfaceC0178a);
    }

    @Override // androidx.loader.app.a
    public void h() {
        this.f24310b.k();
    }

    @Override // androidx.loader.app.a
    @n0
    @k0
    public <D> androidx.loader.content.c<D> i(int i10, @p0 Bundle bundle, @n0 androidx.loader.app.a.InterfaceC0178a<D> interfaceC0178a) {
        if (this.f24310b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f24308d) {
            Log.v(f24307c, "restartLoader in " + this + ": args=" + bundle);
        }
        a<D> aVarG = this.f24310b.g(i10);
        return j(i10, bundle, interfaceC0178a, aVarG != null ? aVarG.s(false) : null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        f.a(this.f24309a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
