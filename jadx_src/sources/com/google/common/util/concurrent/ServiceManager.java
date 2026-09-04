package com.google.common.util.concurrent;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Ordering;
import com.google.common.collect.b3;
import com.google.common.collect.i2;
import com.taobao.accs.common.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class ServiceManager implements g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f59327c = Logger.getLogger(ServiceManager.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s0.a<c> f59328d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s0.a<c> f59329e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f59330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList<Service> f59331b;

    public static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }

        /* synthetic */ EmptyServiceManagerWarning(a aVar) {
            this();
        }
    }

    public class a implements s0.a<c> {
        a() {
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar) {
            cVar.b();
        }

        public String toString() {
            return "healthy()";
        }
    }

    public class b implements s0.a<c> {
        b() {
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar) {
            cVar.c();
        }

        public String toString() {
            return "stopped()";
        }
    }

    public static abstract class c {
        public void a(Service service) {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public static final class d extends g {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.common.util.concurrent.g
        protected void m() {
            u();
        }

        @Override // com.google.common.util.concurrent.g
        protected void n() {
            v();
        }
    }

    public static final class e extends Service.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Service f59332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WeakReference<f> f59333b;

        e(Service service, WeakReference<f> weakReference) {
            this.f59332a = service;
            this.f59333b = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void a(Service.State state, Throwable th2) {
            f fVar = this.f59333b.get();
            if (fVar != null) {
                if (!(this.f59332a instanceof d)) {
                    Logger logger = ServiceManager.f59327c;
                    Level level = Level.SEVERE;
                    String strValueOf = String.valueOf(this.f59332a);
                    String strValueOf2 = String.valueOf(state);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 34 + strValueOf2.length());
                    sb2.append("Service ");
                    sb2.append(strValueOf);
                    sb2.append(" has failed in the ");
                    sb2.append(strValueOf2);
                    sb2.append(" state.");
                    logger.log(level, sb2.toString(), th2);
                }
                fVar.n(this.f59332a, state, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void b() {
            f fVar = this.f59333b.get();
            if (fVar != null) {
                fVar.n(this.f59332a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void c() {
            f fVar = this.f59333b.get();
            if (fVar != null) {
                fVar.n(this.f59332a, Service.State.NEW, Service.State.STARTING);
                if (this.f59332a instanceof d) {
                    return;
                }
                ServiceManager.f59327c.log(Level.FINE, "Starting {0}.", this.f59332a);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void d(Service.State state) {
            f fVar = this.f59333b.get();
            if (fVar != null) {
                fVar.n(this.f59332a, state, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void e(Service.State state) {
            f fVar = this.f59333b.get();
            if (fVar != null) {
                if (!(this.f59332a instanceof d)) {
                    ServiceManager.f59327c.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f59332a, state});
                }
                fVar.n(this.f59332a, state, Service.State.TERMINATED);
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final x0 f59334a = new x0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @t9.a(Constants.KEY_MONIROT)
        final i2<Service.State, Service> f59335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @t9.a(Constants.KEY_MONIROT)
        final com.google.common.collect.s1<Service.State> f59336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @t9.a(Constants.KEY_MONIROT)
        final Map<Service, com.google.common.base.a0> f59337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @t9.a(Constants.KEY_MONIROT)
        boolean f59338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @t9.a(Constants.KEY_MONIROT)
        boolean f59339f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f59340g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final x0.a f59341h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final x0.a f59342i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final s0<c> f59343j;

        public class a implements com.google.common.base.n<Map.Entry<Service, Long>, Long> {
            a(f fVar) {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long apply(Map.Entry<Service, Long> entry) {
                return entry.getValue();
            }
        }

        public class b implements s0.a<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Service f59344a;

            b(f fVar, Service service) {
                this.f59344a = service;
            }

            @Override // com.google.common.util.concurrent.s0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(c cVar) {
                cVar.a(this.f59344a);
            }

            public String toString() {
                String strValueOf = String.valueOf(this.f59344a);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
                sb2.append("failed({service=");
                sb2.append(strValueOf);
                sb2.append("})");
                return sb2.toString();
            }
        }

        public final class c extends x0.a {
            c() {
                super(f.this.f59334a);
            }

            @Override // com.google.common.util.concurrent.x0.a
            @t9.a("ServiceManagerState.this.monitor")
            public boolean a() {
                int iE1 = f.this.f59336c.E1(Service.State.RUNNING);
                f fVar = f.this;
                return iE1 == fVar.f59340g || fVar.f59336c.contains(Service.State.STOPPING) || f.this.f59336c.contains(Service.State.TERMINATED) || f.this.f59336c.contains(Service.State.FAILED);
            }
        }

        public final class d extends x0.a {
            d() {
                super(f.this.f59334a);
            }

            @Override // com.google.common.util.concurrent.x0.a
            @t9.a("ServiceManagerState.this.monitor")
            public boolean a() {
                return f.this.f59336c.E1(Service.State.TERMINATED) + f.this.f59336c.E1(Service.State.FAILED) == f.this.f59340g;
            }
        }

        f(ImmutableCollection<Service> immutableCollection) {
            i2<Service.State, Service> i2VarA = MultimapBuilder.c(Service.State.class).g().a();
            this.f59335b = i2VarA;
            this.f59336c = i2VarA.n0();
            this.f59337d = Maps.b0();
            this.f59341h = new c();
            this.f59342i = new d();
            this.f59343j = new s0<>();
            this.f59340g = immutableCollection.size();
            i2VarA.t0(Service.State.NEW, immutableCollection);
        }

        void a(c cVar, Executor executor) {
            this.f59343j.b(cVar, executor);
        }

        void b() {
            this.f59334a.q(this.f59341h);
            try {
                f();
            } finally {
                this.f59334a.D();
            }
        }

        void c(long j10, TimeUnit timeUnit) throws TimeoutException {
            this.f59334a.g();
            try {
                if (this.f59334a.N(this.f59341h, j10, timeUnit)) {
                    f();
                    this.f59334a.D();
                } else {
                    String strValueOf = String.valueOf(Multimaps.n(this.f59335b, Predicates.n(ImmutableSet.F(Service.State.NEW, Service.State.STARTING))));
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 93);
                    sb2.append("Timeout waiting for the services to become healthy. The following services have not started: ");
                    sb2.append(strValueOf);
                    throw new TimeoutException(sb2.toString());
                }
            } catch (Throwable th2) {
                this.f59334a.D();
                throw th2;
            }
        }

        void d() {
            this.f59334a.q(this.f59342i);
            this.f59334a.D();
        }

        void e(long j10, TimeUnit timeUnit) throws TimeoutException {
            this.f59334a.g();
            try {
                if (this.f59334a.N(this.f59342i, j10, timeUnit)) {
                    this.f59334a.D();
                    return;
                }
                String strValueOf = String.valueOf(Multimaps.n(this.f59335b, Predicates.q(Predicates.n(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 83);
                sb2.append("Timeout waiting for the services to stop. The following services have not stopped: ");
                sb2.append(strValueOf);
                throw new TimeoutException(sb2.toString());
            } catch (Throwable th2) {
                this.f59334a.D();
                throw th2;
            }
        }

        @t9.a(Constants.KEY_MONIROT)
        void f() {
            com.google.common.collect.s1<Service.State> s1Var = this.f59336c;
            Service.State state = Service.State.RUNNING;
            if (s1Var.E1(state) == this.f59340g) {
                return;
            }
            String strValueOf = String.valueOf(Multimaps.n(this.f59335b, Predicates.q(Predicates.m(state))));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 79);
            sb2.append("Expected to be healthy after starting. The following services are not running: ");
            sb2.append(strValueOf);
            throw new IllegalStateException(sb2.toString());
        }

        void g() {
            com.google.common.base.w.h0(!this.f59334a.B(), "It is incorrect to execute listeners with the monitor held.");
            this.f59343j.c();
        }

        void h(Service service) {
            this.f59343j.d(new b(this, service));
        }

        void i() {
            this.f59343j.d(ServiceManager.f59328d);
        }

        void j() {
            this.f59343j.d(ServiceManager.f59329e);
        }

        void k() {
            this.f59334a.g();
            try {
                if (!this.f59339f) {
                    this.f59338e = true;
                    this.f59334a.D();
                    return;
                }
                ArrayList arrayListQ = Lists.q();
                b3<Service> it = l().values().iterator();
                while (it.hasNext()) {
                    Service next = it.next();
                    if (next.h() != Service.State.NEW) {
                        arrayListQ.add(next);
                    }
                }
                String strValueOf = String.valueOf(arrayListQ);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 89);
                sb2.append("Services started transitioning asynchronously before the ServiceManager was constructed: ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            } catch (Throwable th2) {
                this.f59334a.D();
                throw th2;
            }
        }

        ImmutableSetMultimap<Service.State, Service> l() {
            ImmutableSetMultimap.a aVarM = ImmutableSetMultimap.M();
            this.f59334a.g();
            try {
                for (Map.Entry<Service.State, Service> entry : this.f59335b.i()) {
                    if (!(entry.getValue() instanceof d)) {
                        aVarM.g(entry);
                    }
                }
                this.f59334a.D();
                return aVarM.a();
            } catch (Throwable th2) {
                this.f59334a.D();
                throw th2;
            }
        }

        ImmutableMap<Service, Long> m() {
            this.f59334a.g();
            try {
                ArrayList arrayListU = Lists.u(this.f59337d.size());
                for (Map.Entry<Service, com.google.common.base.a0> entry : this.f59337d.entrySet()) {
                    Service key = entry.getKey();
                    com.google.common.base.a0 value = entry.getValue();
                    if (!value.i() && !(key instanceof d)) {
                        arrayListU.add(Maps.O(key, Long.valueOf(value.g(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f59334a.D();
                Collections.sort(arrayListU, Ordering.z().D(new a(this)));
                return ImmutableMap.f(arrayListU);
            } catch (Throwable th2) {
                this.f59334a.D();
                throw th2;
            }
        }

        void n(Service service, Service.State state, Service.State state2) {
            com.google.common.base.w.E(service);
            com.google.common.base.w.d(state != state2);
            this.f59334a.g();
            try {
                this.f59339f = true;
                if (this.f59338e) {
                    com.google.common.base.w.B0(this.f59335b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                    com.google.common.base.w.B0(this.f59335b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                    com.google.common.base.a0 a0VarC = this.f59337d.get(service);
                    if (a0VarC == null) {
                        a0VarC = com.google.common.base.a0.c();
                        this.f59337d.put(service, a0VarC);
                    }
                    Service.State state3 = Service.State.RUNNING;
                    if (state2.compareTo(state3) >= 0 && a0VarC.i()) {
                        a0VarC.l();
                        if (!(service instanceof d)) {
                            ServiceManager.f59327c.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, a0VarC});
                        }
                    }
                    Service.State state4 = Service.State.FAILED;
                    if (state2 == state4) {
                        h(service);
                    }
                    if (this.f59336c.E1(state3) == this.f59340g) {
                        i();
                    } else if (this.f59336c.E1(Service.State.TERMINATED) + this.f59336c.E1(state4) == this.f59340g) {
                        j();
                    }
                }
            } finally {
                this.f59334a.D();
                g();
            }
        }

        void o(Service service) {
            this.f59334a.g();
            try {
                if (this.f59337d.get(service) == null) {
                    this.f59337d.put(service, com.google.common.base.a0.c());
                }
            } finally {
                this.f59334a.D();
            }
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
        ImmutableList<Service> immutableListU = ImmutableList.u(iterable);
        if (immutableListU.isEmpty()) {
            a aVar = null;
            f59327c.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new EmptyServiceManagerWarning(aVar));
            immutableListU = ImmutableList.D(new d(aVar));
        }
        f fVar = new f(immutableListU);
        this.f59330a = fVar;
        this.f59331b = immutableListU;
        WeakReference weakReference = new WeakReference(fVar);
        b3<Service> it = immutableListU.iterator();
        while (it.hasNext()) {
            Service next = it.next();
            next.a(new e(next, weakReference), y0.c());
            com.google.common.base.w.u(next.h() == Service.State.NEW, "Can only manage NEW services, %s", next);
        }
        this.f59330a.k();
    }

    public void e(c cVar, Executor executor) {
        this.f59330a.a(cVar, executor);
    }

    public void f() {
        this.f59330a.b();
    }

    public void g(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59330a.c(j10, timeUnit);
    }

    public void h() {
        this.f59330a.d();
    }

    public void i(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59330a.e(j10, timeUnit);
    }

    public boolean j() {
        b3<Service> it = this.f59331b.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.g1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSetMultimap<Service.State, Service> a() {
        return this.f59330a.l();
    }

    @s9.a
    public ServiceManager l() {
        b3<Service> it = this.f59331b.iterator();
        while (it.hasNext()) {
            com.google.common.base.w.x0(it.next().h() == Service.State.NEW, "Not all services are NEW, cannot start %s", this);
        }
        b3<Service> it2 = this.f59331b.iterator();
        while (it2.hasNext()) {
            Service next = it2.next();
            try {
                this.f59330a.o(next);
                next.g();
            } catch (IllegalStateException e10) {
                Logger logger = f59327c;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(next);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
                sb2.append("Unable to start Service ");
                sb2.append(strValueOf);
                logger.log(level, sb2.toString(), (Throwable) e10);
            }
        }
        return this;
    }

    public ImmutableMap<Service, Long> m() {
        return this.f59330a.m();
    }

    @s9.a
    public ServiceManager n() {
        b3<Service> it = this.f59331b.iterator();
        while (it.hasNext()) {
            it.next().stopAsync();
        }
        return this;
    }

    public String toString() {
        return com.google.common.base.q.b(ServiceManager.class).f("services", com.google.common.collect.o.d(this.f59331b, Predicates.q(Predicates.o(d.class)))).toString();
    }
}
