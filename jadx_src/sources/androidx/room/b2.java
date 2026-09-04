package androidx.room;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import io.reactivex.BackpressureStrategy;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: RxRoom.java */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f27053a = new Object();

    /* JADX INFO: compiled from: RxRoom.java */
    public class a implements io.reactivex.m<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f27054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoomDatabase f27055b;

        /* JADX INFO: renamed from: androidx.room.b2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RxRoom.java */
        public class C0213a extends f0.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.reactivex.l f27056b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0213a(String[] strArr, io.reactivex.l lVar) {
                super(strArr);
                this.f27056b = lVar;
            }

            @Override // androidx.room.f0.c
            public void c(@androidx.annotation.n0 Set<String> set) {
                if (this.f27056b.isCancelled()) {
                    return;
                }
                this.f27056b.onNext(b2.f27053a);
            }
        }

        /* JADX INFO: compiled from: RxRoom.java */
        public class b implements kh.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0.c f27058b;

            b(f0.c cVar) {
                this.f27058b = cVar;
            }

            @Override // kh.a
            public void run() throws Exception {
                a.this.f27055b.getInvalidationTracker().s(this.f27058b);
            }
        }

        a(String[] strArr, RoomDatabase roomDatabase) {
            this.f27054a = strArr;
            this.f27055b = roomDatabase;
        }

        @Override // io.reactivex.m
        public void a(io.reactivex.l<Object> lVar) throws Exception {
            C0213a c0213a = new C0213a(this.f27054a, lVar);
            if (!lVar.isCancelled()) {
                this.f27055b.getInvalidationTracker().b(c0213a);
                lVar.c(io.reactivex.disposables.c.c(new b(c0213a)));
            }
            if (lVar.isCancelled()) {
                return;
            }
            lVar.onNext(b2.f27053a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: RxRoom.java */
    public class b<T> implements kh.o<Object, io.reactivex.w<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.reactivex.q f27060b;

        b(io.reactivex.q qVar) {
            this.f27060b = qVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.w<T> apply(Object obj) throws Exception {
            return this.f27060b;
        }
    }

    /* JADX INFO: compiled from: RxRoom.java */
    public class c implements io.reactivex.c0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f27061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoomDatabase f27062b;

        /* JADX INFO: compiled from: RxRoom.java */
        public class a extends f0.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.reactivex.b0 f27063b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String[] strArr, io.reactivex.b0 b0Var) {
                super(strArr);
                this.f27063b = b0Var;
            }

            @Override // androidx.room.f0.c
            public void c(@androidx.annotation.n0 Set<String> set) {
                this.f27063b.onNext(b2.f27053a);
            }
        }

        /* JADX INFO: compiled from: RxRoom.java */
        public class b implements kh.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0.c f27065b;

            b(f0.c cVar) {
                this.f27065b = cVar;
            }

            @Override // kh.a
            public void run() throws Exception {
                c.this.f27062b.getInvalidationTracker().s(this.f27065b);
            }
        }

        c(String[] strArr, RoomDatabase roomDatabase) {
            this.f27061a = strArr;
            this.f27062b = roomDatabase;
        }

        @Override // io.reactivex.c0
        public void a(io.reactivex.b0<Object> b0Var) throws Exception {
            a aVar = new a(this.f27061a, b0Var);
            this.f27062b.getInvalidationTracker().b(aVar);
            b0Var.c(io.reactivex.disposables.c.c(new b(aVar)));
            b0Var.onNext(b2.f27053a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: RxRoom.java */
    public class d<T> implements kh.o<Object, io.reactivex.w<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.reactivex.q f27067b;

        d(io.reactivex.q qVar) {
            this.f27067b = qVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.w<T> apply(Object obj) throws Exception {
            return this.f27067b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: RxRoom.java */
    public class e<T> implements io.reactivex.m0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f27068a;

        e(Callable callable) {
            this.f27068a = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.m0
        public void a(io.reactivex.k0<T> k0Var) throws Exception {
            try {
                k0Var.onSuccess(this.f27068a.call());
            } catch (EmptyResultSetException e10) {
                k0Var.b(e10);
            }
        }
    }

    @Deprecated
    public b2() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> io.reactivex.j<T> a(RoomDatabase roomDatabase, boolean z10, String[] strArr, Callable<T> callable) {
        io.reactivex.h0 h0VarB = io.reactivex.schedulers.b.b(h(roomDatabase, z10));
        return (io.reactivex.j<T>) b(roomDatabase, strArr).l6(h0VarB).S7(h0VarB).l4(h0VarB).J2(new b(io.reactivex.q.m0(callable)));
    }

    public static io.reactivex.j<Object> b(RoomDatabase roomDatabase, String... strArr) {
        return io.reactivex.j.w1(new a(strArr, roomDatabase), BackpressureStrategy.LATEST);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static <T> io.reactivex.j<T> c(RoomDatabase roomDatabase, String[] strArr, Callable<T> callable) {
        return a(roomDatabase, false, strArr, callable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> io.reactivex.z<T> d(RoomDatabase roomDatabase, boolean z10, String[] strArr, Callable<T> callable) {
        io.reactivex.h0 h0VarB = io.reactivex.schedulers.b.b(h(roomDatabase, z10));
        return (io.reactivex.z<T>) e(roomDatabase, strArr).I5(h0VarB).m7(h0VarB).a4(h0VarB).A2(new d(io.reactivex.q.m0(callable)));
    }

    public static io.reactivex.z<Object> e(RoomDatabase roomDatabase, String... strArr) {
        return io.reactivex.z.q1(new c(strArr, roomDatabase));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static <T> io.reactivex.z<T> f(RoomDatabase roomDatabase, String[] strArr, Callable<T> callable) {
        return d(roomDatabase, false, strArr, callable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> io.reactivex.i0<T> g(Callable<T> callable) {
        return io.reactivex.i0.B(new e(callable));
    }

    private static Executor h(RoomDatabase roomDatabase, boolean z10) {
        return z10 ? roomDatabase.x() : roomDatabase.t();
    }
}
