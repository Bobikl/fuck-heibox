package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Task.java */
/* JADX INFO: loaded from: classes6.dex */
public class h<TResult> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile q f35482l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TResult f35490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f35491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bolts.j f35493g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f35479i = bolts.b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f35480j = bolts.b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f35481k = bolts.a.d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static h<?> f35483m = new h<>((Object) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static h<Boolean> f35484n = new h<>(Boolean.TRUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static h<Boolean> f35485o = new h<>(Boolean.FALSE);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static h<?> f35486p = new h<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35487a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<bolts.g<TResult, Void>> f35494h = new ArrayList();

    /* JADX INFO: compiled from: Task.java */
    public class a implements bolts.g<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.i f35495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f35496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f35497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.c f35498d;

        a(bolts.i iVar, bolts.g gVar, Executor executor, bolts.c cVar) {
            this.f35495a = iVar;
            this.f35496b = gVar;
            this.f35497c = executor;
            this.f35498d = cVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<TResult> hVar) {
            h.l(this.f35495a, this.f35496b, hVar, this.f35497c, this.f35498d);
            return null;
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public class b implements bolts.g<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.i f35500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f35501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f35502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.c f35503d;

        b(bolts.i iVar, bolts.g gVar, Executor executor, bolts.c cVar) {
            this.f35500a = iVar;
            this.f35501b = gVar;
            this.f35502c = executor;
            this.f35503d = cVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<TResult> hVar) {
            h.k(this.f35500a, this.f35501b, hVar, this.f35502c, this.f35503d);
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* JADX INFO: compiled from: Task.java */
    public class c<TContinuationResult> implements bolts.g<TResult, h<TContinuationResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.c f35505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f35506b;

        c(bolts.c cVar, bolts.g gVar) {
            this.f35505a = cVar;
            this.f35506b = gVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<TContinuationResult> then(h<TResult> hVar) {
            bolts.c cVar = this.f35505a;
            if (cVar != null && cVar.a()) {
                return h.i();
            }
            if (hVar.J()) {
                return h.C(hVar.E());
            }
            return hVar.H() ? h.i() : hVar.q(this.f35506b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* JADX INFO: compiled from: Task.java */
    public class d<TContinuationResult> implements bolts.g<TResult, h<TContinuationResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.c f35508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.g f35509b;

        d(bolts.c cVar, bolts.g gVar) {
            this.f35508a = cVar;
            this.f35509b = gVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<TContinuationResult> then(h<TResult> hVar) {
            bolts.c cVar = this.f35508a;
            if (cVar != null && cVar.a()) {
                return h.i();
            }
            if (hVar.J()) {
                return h.C(hVar.E());
            }
            return hVar.H() ? h.i() : hVar.u(this.f35509b);
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.c f35511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f35512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.g f35513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f35514e;

        e(bolts.c cVar, bolts.i iVar, bolts.g gVar, h hVar) {
            this.f35511b = cVar;
            this.f35512c = iVar;
            this.f35513d = gVar;
            this.f35514e = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f35511b;
            if (cVar != null && cVar.a()) {
                this.f35512c.b();
                return;
            }
            try {
                this.f35512c.d(this.f35513d.then(this.f35514e));
            } catch (CancellationException unused) {
                this.f35512c.b();
            } catch (Exception e10) {
                this.f35512c.c(e10);
            }
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.c f35515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f35516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ bolts.g f35517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f35518e;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* JADX INFO: compiled from: Task.java */
        public class a<TContinuationResult> implements bolts.g<TContinuationResult, Void> {
            a() {
            }

            @Override // bolts.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void then(h<TContinuationResult> hVar) {
                bolts.c cVar = f.this.f35515b;
                if (cVar != null && cVar.a()) {
                    f.this.f35516c.b();
                    return null;
                }
                if (hVar.H()) {
                    f.this.f35516c.b();
                } else if (hVar.J()) {
                    f.this.f35516c.c(hVar.E());
                } else {
                    f.this.f35516c.d(hVar.F());
                }
                return null;
            }
        }

        f(bolts.c cVar, bolts.i iVar, bolts.g gVar, h hVar) {
            this.f35515b = cVar;
            this.f35516c = iVar;
            this.f35517d = gVar;
            this.f35518e = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f35515b;
            if (cVar != null && cVar.a()) {
                this.f35516c.b();
                return;
            }
            try {
                h hVar = (h) this.f35517d.then(this.f35518e);
                if (hVar == null) {
                    this.f35516c.d(null);
                } else {
                    hVar.q(new a());
                }
            } catch (CancellationException unused) {
                this.f35516c.b();
            } catch (Exception e10) {
                this.f35516c.c(e10);
            }
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.i f35520b;

        g(bolts.i iVar) {
            this.f35520b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35520b.g(null);
        }
    }

    /* JADX INFO: renamed from: bolts.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Task.java */
    public static final class RunnableC0262h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f35521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f35522c;

        RunnableC0262h(ScheduledFuture scheduledFuture, bolts.i iVar) {
            this.f35521b = scheduledFuture;
            this.f35522c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35521b.cancel(true);
            this.f35522c.e();
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public class i implements bolts.g<TResult, h<Void>> {
        i() {
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<Void> then(h<TResult> hVar) throws Exception {
            if (hVar.H()) {
                return h.i();
            }
            return hVar.J() ? h.C(hVar.E()) : h.D(null);
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.c f35524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.i f35525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callable f35526d;

        j(bolts.c cVar, bolts.i iVar, Callable callable) {
            this.f35524b = cVar;
            this.f35525c = iVar;
            this.f35526d = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            bolts.c cVar = this.f35524b;
            if (cVar != null && cVar.a()) {
                this.f35525c.b();
                return;
            }
            try {
                this.f35525c.d(this.f35526d.call());
            } catch (CancellationException unused) {
                this.f35525c.b();
            } catch (Exception e10) {
                this.f35525c.c(e10);
            }
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class k implements bolts.g<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f35527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.i f35528b;

        k(AtomicBoolean atomicBoolean, bolts.i iVar) {
            this.f35527a = atomicBoolean;
            this.f35528b = iVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<TResult> hVar) {
            if (this.f35527a.compareAndSet(false, true)) {
                this.f35528b.d(hVar);
                return null;
            }
            hVar.E();
            return null;
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class l implements bolts.g<Object, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f35529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bolts.i f35530b;

        l(AtomicBoolean atomicBoolean, bolts.i iVar) {
            this.f35529a = atomicBoolean;
            this.f35530b = iVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<Object> hVar) {
            if (this.f35529a.compareAndSet(false, true)) {
                this.f35530b.d(hVar);
                return null;
            }
            hVar.E();
            return null;
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class m implements bolts.g<Void, List<TResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f35531a;

        m(Collection collection) {
            this.f35531a = collection;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<TResult> then(h<Void> hVar) throws Exception {
            if (this.f35531a.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f35531a.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).F());
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public static final class n implements bolts.g<Object, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f35532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f35533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f35534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f35535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ bolts.i f35536e;

        n(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, bolts.i iVar) {
            this.f35532a = obj;
            this.f35533b = arrayList;
            this.f35534c = atomicBoolean;
            this.f35535d = atomicInteger;
            this.f35536e = iVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(h<Object> hVar) {
            if (hVar.J()) {
                synchronized (this.f35532a) {
                    this.f35533b.add(hVar.E());
                }
            }
            if (hVar.H()) {
                this.f35534c.set(true);
            }
            if (this.f35535d.decrementAndGet() == 0) {
                if (this.f35533b.size() != 0) {
                    if (this.f35533b.size() == 1) {
                        this.f35536e.c((Exception) this.f35533b.get(0));
                    } else {
                        this.f35536e.c(new AggregateException(String.format("There were %d exceptions.", Integer.valueOf(this.f35533b.size())), this.f35533b));
                    }
                } else if (this.f35534c.get()) {
                    this.f35536e.b();
                } else {
                    this.f35536e.d(null);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public class o implements bolts.g<Void, h<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bolts.c f35537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f35538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bolts.g f35539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Executor f35540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ bolts.f f35541e;

        o(bolts.c cVar, Callable callable, bolts.g gVar, Executor executor, bolts.f fVar) {
            this.f35537a = cVar;
            this.f35538b = callable;
            this.f35539c = gVar;
            this.f35540d = executor;
            this.f35541e = fVar;
        }

        @Override // bolts.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<Void> then(h<Void> hVar) throws Exception {
            bolts.c cVar = this.f35537a;
            if (cVar == null || !cVar.a()) {
                return ((Boolean) this.f35538b.call()).booleanValue() ? h.D(null).R(this.f35539c, this.f35540d).R((bolts.g) this.f35541e.a(), this.f35540d) : h.D(null);
            }
            return h.i();
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public class p extends bolts.i<TResult> {
        p() {
        }
    }

    /* JADX INFO: compiled from: Task.java */
    public interface q {
        void a(h<?> hVar, UnobservedTaskException unobservedTaskException);
    }

    h() {
    }

    private h(TResult tresult) {
        X(tresult);
    }

    private h(boolean z10) {
        if (z10) {
            V();
        } else {
            X(null);
        }
    }

    public static h<Void> A(long j10, bolts.c cVar) {
        return B(j10, bolts.b.d(), cVar);
    }

    static h<Void> B(long j10, ScheduledExecutorService scheduledExecutorService, bolts.c cVar) {
        if (cVar != null && cVar.a()) {
            return i();
        }
        if (j10 <= 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new g(iVar), j10, TimeUnit.MILLISECONDS);
        if (cVar != null) {
            cVar.b(new RunnableC0262h(scheduledFutureSchedule, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> C(Exception exc) {
        bolts.i iVar = new bolts.i();
        iVar.c(exc);
        return iVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> h<TResult> D(TResult tresult) {
        if (tresult == 0) {
            return (h<TResult>) f35483m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (h<TResult>) f35484n : (h<TResult>) f35485o;
        }
        bolts.i iVar = new bolts.i();
        iVar.d(tresult);
        return iVar.a();
    }

    public static q G() {
        return f35482l;
    }

    private void T() {
        synchronized (this.f35487a) {
            Iterator<bolts.g<TResult, Void>> it = this.f35494h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f35494h = null;
        }
    }

    public static void U(q qVar) {
        f35482l = qVar;
    }

    public static h<Void> a0(Collection<? extends h<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().q(new n(obj, arrayList, atomicBoolean, atomicInteger, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<List<TResult>> b0(Collection<? extends h<TResult>> collection) {
        return (h<List<TResult>>) a0(collection).L(new m(collection));
    }

    public static <TResult> h<TResult> c(Callable<TResult> callable) {
        return f(callable, f35480j, null);
    }

    public static h<h<?>> c0(Collection<? extends h<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().q(new l(atomicBoolean, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> d(Callable<TResult> callable, bolts.c cVar) {
        return f(callable, f35480j, cVar);
    }

    public static <TResult> h<h<TResult>> d0(Collection<? extends h<TResult>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        bolts.i iVar = new bolts.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends h<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().q(new k(atomicBoolean, iVar));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> e(Callable<TResult> callable, Executor executor) {
        return f(callable, executor, null);
    }

    public static <TResult> h<TResult> f(Callable<TResult> callable, Executor executor, bolts.c cVar) {
        bolts.i iVar = new bolts.i();
        try {
            executor.execute(new j(cVar, iVar, callable));
        } catch (Exception e10) {
            iVar.c(new ExecutorException(e10));
        }
        return iVar.a();
    }

    public static <TResult> h<TResult> g(Callable<TResult> callable) {
        return f(callable, f35479i, null);
    }

    public static <TResult> h<TResult> h(Callable<TResult> callable, bolts.c cVar) {
        return f(callable, f35479i, cVar);
    }

    public static <TResult> h<TResult> i() {
        return (h<TResult>) f35486p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void k(bolts.i<TContinuationResult> iVar, bolts.g<TResult, h<TContinuationResult>> gVar, h<TResult> hVar, Executor executor, bolts.c cVar) {
        try {
            executor.execute(new f(cVar, iVar, gVar, hVar));
        } catch (Exception e10) {
            iVar.c(new ExecutorException(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void l(bolts.i<TContinuationResult> iVar, bolts.g<TResult, TContinuationResult> gVar, h<TResult> hVar, Executor executor, bolts.c cVar) {
        try {
            executor.execute(new e(cVar, iVar, gVar, hVar));
        } catch (Exception e10) {
            iVar.c(new ExecutorException(e10));
        }
    }

    public static <TResult> h<TResult>.p y() {
        return new p();
    }

    public static h<Void> z(long j10) {
        return B(j10, bolts.b.d(), null);
    }

    public Exception E() {
        Exception exc;
        synchronized (this.f35487a) {
            if (this.f35491e != null) {
                this.f35492f = true;
                bolts.j jVar = this.f35493g;
                if (jVar != null) {
                    jVar.a();
                    this.f35493g = null;
                }
            }
            exc = this.f35491e;
        }
        return exc;
    }

    public TResult F() {
        TResult tresult;
        synchronized (this.f35487a) {
            tresult = this.f35490d;
        }
        return tresult;
    }

    public boolean H() {
        boolean z10;
        synchronized (this.f35487a) {
            z10 = this.f35489c;
        }
        return z10;
    }

    public boolean I() {
        boolean z10;
        synchronized (this.f35487a) {
            z10 = this.f35488b;
        }
        return z10;
    }

    public boolean J() {
        boolean z10;
        synchronized (this.f35487a) {
            z10 = E() != null;
        }
        return z10;
    }

    public h<Void> K() {
        return u(new i());
    }

    public <TContinuationResult> h<TContinuationResult> L(bolts.g<TResult, TContinuationResult> gVar) {
        return O(gVar, f35480j, null);
    }

    public <TContinuationResult> h<TContinuationResult> M(bolts.g<TResult, TContinuationResult> gVar, bolts.c cVar) {
        return O(gVar, f35480j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> N(bolts.g<TResult, TContinuationResult> gVar, Executor executor) {
        return O(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> O(bolts.g<TResult, TContinuationResult> gVar, Executor executor, bolts.c cVar) {
        return w(new c(cVar, gVar), executor);
    }

    public <TContinuationResult> h<TContinuationResult> P(bolts.g<TResult, h<TContinuationResult>> gVar) {
        return R(gVar, f35480j);
    }

    public <TContinuationResult> h<TContinuationResult> Q(bolts.g<TResult, h<TContinuationResult>> gVar, bolts.c cVar) {
        return S(gVar, f35480j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> R(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor) {
        return S(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> S(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor, bolts.c cVar) {
        return w(new d(cVar, gVar), executor);
    }

    boolean V() {
        synchronized (this.f35487a) {
            if (this.f35488b) {
                return false;
            }
            this.f35488b = true;
            this.f35489c = true;
            this.f35487a.notifyAll();
            T();
            return true;
        }
    }

    boolean W(Exception exc) {
        synchronized (this.f35487a) {
            if (this.f35488b) {
                return false;
            }
            this.f35488b = true;
            this.f35491e = exc;
            this.f35492f = false;
            this.f35487a.notifyAll();
            T();
            if (!this.f35492f && G() != null) {
                this.f35493g = new bolts.j(this);
            }
            return true;
        }
    }

    boolean X(TResult tresult) {
        synchronized (this.f35487a) {
            if (this.f35488b) {
                return false;
            }
            this.f35488b = true;
            this.f35490d = tresult;
            this.f35487a.notifyAll();
            T();
            return true;
        }
    }

    public void Y() throws InterruptedException {
        synchronized (this.f35487a) {
            if (!I()) {
                this.f35487a.wait();
            }
        }
    }

    public boolean Z(long j10, TimeUnit timeUnit) throws InterruptedException {
        boolean zI;
        synchronized (this.f35487a) {
            if (!I()) {
                this.f35487a.wait(timeUnit.toMillis(j10));
            }
            zI = I();
        }
        return zI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> h<TOut> j() {
        return this;
    }

    public h<Void> m(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar) {
        return p(callable, gVar, f35480j, null);
    }

    public h<Void> n(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, bolts.c cVar) {
        return p(callable, gVar, f35480j, cVar);
    }

    public h<Void> o(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, Executor executor) {
        return p(callable, gVar, executor, null);
    }

    public h<Void> p(Callable<Boolean> callable, bolts.g<Void, h<Void>> gVar, Executor executor, bolts.c cVar) {
        bolts.f fVar = new bolts.f();
        fVar.b(new o(cVar, callable, gVar, executor, fVar));
        return K().w((bolts.g) fVar.a(), executor);
    }

    public <TContinuationResult> h<TContinuationResult> q(bolts.g<TResult, TContinuationResult> gVar) {
        return t(gVar, f35480j, null);
    }

    public <TContinuationResult> h<TContinuationResult> r(bolts.g<TResult, TContinuationResult> gVar, bolts.c cVar) {
        return t(gVar, f35480j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> s(bolts.g<TResult, TContinuationResult> gVar, Executor executor) {
        return t(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> t(bolts.g<TResult, TContinuationResult> gVar, Executor executor, bolts.c cVar) {
        boolean zI;
        bolts.i iVar = new bolts.i();
        synchronized (this.f35487a) {
            zI = I();
            if (!zI) {
                this.f35494h.add(new a(iVar, gVar, executor, cVar));
            }
        }
        if (zI) {
            l(iVar, gVar, this, executor, cVar);
        }
        return iVar.a();
    }

    public <TContinuationResult> h<TContinuationResult> u(bolts.g<TResult, h<TContinuationResult>> gVar) {
        return x(gVar, f35480j, null);
    }

    public <TContinuationResult> h<TContinuationResult> v(bolts.g<TResult, h<TContinuationResult>> gVar, bolts.c cVar) {
        return x(gVar, f35480j, cVar);
    }

    public <TContinuationResult> h<TContinuationResult> w(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor) {
        return x(gVar, executor, null);
    }

    public <TContinuationResult> h<TContinuationResult> x(bolts.g<TResult, h<TContinuationResult>> gVar, Executor executor, bolts.c cVar) {
        boolean zI;
        bolts.i iVar = new bolts.i();
        synchronized (this.f35487a) {
            zI = I();
            if (!zI) {
                this.f35494h.add(new b(iVar, gVar, executor, cVar));
            }
        }
        if (zI) {
            k(iVar, gVar, this, executor, cVar);
        }
        return iVar.a();
    }
}
