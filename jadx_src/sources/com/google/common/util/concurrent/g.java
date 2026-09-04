package com.google.common.util.concurrent;

import com.taobao.accs.common.Constants;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public abstract class g implements Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final s0.a<Service.a> f59432h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s0.a<Service.a> f59433i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final s0.a<Service.a> f59434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final s0.a<Service.a> f59435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final s0.a<Service.a> f59436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final s0.a<Service.a> f59437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final s0.a<Service.a> f59438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final s0.a<Service.a> f59439o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f59440a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0.a f59441b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0.a f59442c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x0.a f59443d = new C0491g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x0.a f59444e = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s0<Service.a> f59445f = new s0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile k f59446g = new k(Service.State.NEW);

    /* JADX INFO: compiled from: AbstractService.java */
    public class a implements s0.a<Service.a> {
        a() {
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Service.a aVar) {
            aVar.c();
        }

        public String toString() {
            return "starting()";
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public class b implements s0.a<Service.a> {
        b() {
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Service.a aVar) {
            aVar.b();
        }

        public String toString() {
            return "running()";
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public class c implements s0.a<Service.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Service.State f59447a;

        c(Service.State state) {
            this.f59447a = state;
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Service.a aVar) {
            aVar.e(this.f59447a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f59447a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21);
            sb2.append("terminated({from = ");
            sb2.append(strValueOf);
            sb2.append("})");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public class d implements s0.a<Service.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Service.State f59448a;

        d(Service.State state) {
            this.f59448a = state;
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Service.a aVar) {
            aVar.d(this.f59448a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f59448a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19);
            sb2.append("stopping({from = ");
            sb2.append(strValueOf);
            sb2.append("})");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public class e implements s0.a<Service.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Service.State f59449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f59450b;

        e(g gVar, Service.State state, Throwable th2) {
            this.f59449a = state;
            this.f59450b = th2;
        }

        @Override // com.google.common.util.concurrent.s0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Service.a aVar) {
            aVar.a(this.f59449a, this.f59450b);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f59449a);
            String strValueOf2 = String.valueOf(this.f59450b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 27 + strValueOf2.length());
            sb2.append("failed({from = ");
            sb2.append(strValueOf);
            sb2.append(", cause = ");
            sb2.append(strValueOf2);
            sb2.append("})");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59451a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f59451a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59451a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59451a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59451a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59451a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59451a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractService.java */
    public final class C0491g extends x0.a {
        C0491g() {
            super(g.this.f59440a);
        }

        @Override // com.google.common.util.concurrent.x0.a
        public boolean a() {
            return g.this.h().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public final class h extends x0.a {
        h() {
            super(g.this.f59440a);
        }

        @Override // com.google.common.util.concurrent.x0.a
        public boolean a() {
            return g.this.h() == Service.State.NEW;
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public final class i extends x0.a {
        i() {
            super(g.this.f59440a);
        }

        @Override // com.google.common.util.concurrent.x0.a
        public boolean a() {
            return g.this.h().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public final class j extends x0.a {
        j() {
            super(g.this.f59440a);
        }

        @Override // com.google.common.util.concurrent.x0.a
        public boolean a() {
            return g.this.h().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    /* JADX INFO: compiled from: AbstractService.java */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Service.State f59456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f59457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final Throwable f59458c;

        k(Service.State state) {
            this(state, false, null);
        }

        k(Service.State state, boolean z10, @CheckForNull Throwable th2) {
            com.google.common.base.w.u(!z10 || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            com.google.common.base.w.y((th2 != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th2);
            this.f59456a = state;
            this.f59457b = z10;
            this.f59458c = th2;
        }

        Service.State a() {
            return (this.f59457b && this.f59456a == Service.State.STARTING) ? Service.State.STOPPING : this.f59456a;
        }

        Throwable b() {
            Service.State state = this.f59456a;
            com.google.common.base.w.x0(state == Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", state);
            Throwable th2 = this.f59458c;
            Objects.requireNonNull(th2);
            return th2;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f59434j = w(state);
        Service.State state2 = Service.State.RUNNING;
        f59435k = w(state2);
        f59436l = x(Service.State.NEW);
        f59437m = x(state);
        f59438n = x(state2);
        f59439o = x(Service.State.STOPPING);
    }

    protected g() {
    }

    @t9.a(Constants.KEY_MONIROT)
    private void j(Service.State state) {
        Service.State stateH = h();
        if (stateH != state) {
            if (stateH == Service.State.FAILED) {
                String strValueOf = String.valueOf(this);
                String strValueOf2 = String.valueOf(state);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 56 + strValueOf2.length());
                sb2.append("Expected the service ");
                sb2.append(strValueOf);
                sb2.append(" to be ");
                sb2.append(strValueOf2);
                sb2.append(", but the service has FAILED");
                throw new IllegalStateException(sb2.toString(), e());
            }
            String strValueOf3 = String.valueOf(this);
            String strValueOf4 = String.valueOf(state);
            String strValueOf5 = String.valueOf(stateH);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 38 + strValueOf4.length() + strValueOf5.length());
            sb3.append("Expected the service ");
            sb3.append(strValueOf3);
            sb3.append(" to be ");
            sb3.append(strValueOf4);
            sb3.append(", but was ");
            sb3.append(strValueOf5);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private void k() {
        if (this.f59440a.B()) {
            return;
        }
        this.f59445f.c();
    }

    private void o(Service.State state, Throwable th2) {
        this.f59445f.d(new e(this, state, th2));
    }

    private void p() {
        this.f59445f.d(f59433i);
    }

    private void q() {
        this.f59445f.d(f59432h);
    }

    private void r(Service.State state) {
        if (state == Service.State.STARTING) {
            this.f59445f.d(f59434j);
        } else {
            if (state != Service.State.RUNNING) {
                throw new AssertionError();
            }
            this.f59445f.d(f59435k);
        }
    }

    private void s(Service.State state) {
        switch (f.f59451a[state.ordinal()]) {
            case 1:
                this.f59445f.d(f59436l);
                return;
            case 2:
                this.f59445f.d(f59437m);
                return;
            case 3:
                this.f59445f.d(f59438n);
                return;
            case 4:
                this.f59445f.d(f59439o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private static s0.a<Service.a> w(Service.State state) {
        return new d(state);
    }

    private static s0.a<Service.a> x(Service.State state) {
        return new c(state);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a aVar, Executor executor) {
        this.f59445f.b(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long j10, TimeUnit timeUnit) throws TimeoutException {
        if (this.f59440a.r(this.f59443d, j10, timeUnit)) {
            try {
                j(Service.State.RUNNING);
            } finally {
                this.f59440a.D();
            }
        } else {
            String strValueOf = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50);
            sb2.append("Timed out waiting for ");
            sb2.append(strValueOf);
            sb2.append(" to reach the RUNNING state.");
            throw new TimeoutException(sb2.toString());
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long j10, TimeUnit timeUnit) throws TimeoutException {
        if (this.f59440a.r(this.f59444e, j10, timeUnit)) {
            try {
                j(Service.State.TERMINATED);
                return;
            } finally {
                this.f59440a.D();
            }
        }
        String strValueOf = String.valueOf(this);
        String strValueOf2 = String.valueOf(h());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 65 + strValueOf2.length());
        sb2.append("Timed out waiting for ");
        sb2.append(strValueOf);
        sb2.append(" to reach a terminal state. Current state: ");
        sb2.append(strValueOf2);
        throw new TimeoutException(sb2.toString());
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f59440a.q(this.f59443d);
        try {
            j(Service.State.RUNNING);
        } finally {
            this.f59440a.D();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f59446g.b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f59440a.q(this.f59444e);
        try {
            j(Service.State.TERMINATED);
        } finally {
            this.f59440a.D();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service g() {
        if (!this.f59440a.i(this.f59441b)) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33);
            sb2.append("Service ");
            sb2.append(strValueOf);
            sb2.append(" has already been started");
            throw new IllegalStateException(sb2.toString());
        }
        try {
            this.f59446g = new k(Service.State.STARTING);
            q();
            m();
        } catch (Throwable th2) {
            try {
                t(th2);
            } finally {
                this.f59440a.D();
                k();
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f59446g.a();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return h() == Service.State.RUNNING;
    }

    @o9.a
    @s9.g
    protected void l() {
    }

    @s9.g
    protected abstract void m();

    @s9.g
    protected abstract void n();

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service stopAsync() {
        if (this.f59440a.i(this.f59442c)) {
            try {
                Service.State stateH = h();
                switch (f.f59451a[stateH.ordinal()]) {
                    case 1:
                        this.f59446g = new k(Service.State.TERMINATED);
                        s(Service.State.NEW);
                        break;
                    case 2:
                        Service.State state = Service.State.STARTING;
                        this.f59446g = new k(state, true, null);
                        r(state);
                        l();
                        break;
                    case 3:
                        this.f59446g = new k(Service.State.STOPPING);
                        r(Service.State.RUNNING);
                        n();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        String strValueOf = String.valueOf(stateH);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 45);
                        sb2.append("isStoppable is incorrectly implemented, saw: ");
                        sb2.append(strValueOf);
                        throw new AssertionError(sb2.toString());
                }
            } catch (Throwable th2) {
                try {
                    t(th2);
                } finally {
                    this.f59440a.D();
                    k();
                }
            }
        }
        return this;
    }

    protected final void t(Throwable th2) {
        com.google.common.base.w.E(th2);
        this.f59440a.g();
        try {
            Service.State stateH = h();
            int i10 = f.f59451a[stateH.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    this.f59446g = new k(Service.State.FAILED, false, th2);
                    o(stateH, th2);
                } else if (i10 != 5) {
                }
                this.f59440a.D();
                k();
                return;
            }
            String strValueOf = String.valueOf(stateH);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Failed while in state:");
            sb2.append(strValueOf);
            throw new IllegalStateException(sb2.toString(), th2);
        } catch (Throwable th3) {
            this.f59440a.D();
            k();
            throw th3;
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String strValueOf = String.valueOf(h());
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 3 + strValueOf.length());
        sb2.append(simpleName);
        sb2.append(" [");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    protected final void u() {
        this.f59440a.g();
        try {
            if (this.f59446g.f59456a != Service.State.STARTING) {
                String strValueOf = String.valueOf(this.f59446g.f59456a);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 43);
                sb2.append("Cannot notifyStarted() when the service is ");
                sb2.append(strValueOf);
                IllegalStateException illegalStateException = new IllegalStateException(sb2.toString());
                t(illegalStateException);
                throw illegalStateException;
            }
            if (this.f59446g.f59457b) {
                this.f59446g = new k(Service.State.STOPPING);
                n();
            } else {
                this.f59446g = new k(Service.State.RUNNING);
                p();
            }
            this.f59440a.D();
            k();
        } catch (Throwable th2) {
            this.f59440a.D();
            k();
            throw th2;
        }
    }

    protected final void v() {
        this.f59440a.g();
        try {
            Service.State stateH = h();
            switch (f.f59451a[stateH.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String strValueOf = String.valueOf(stateH);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 43);
                    sb2.append("Cannot notifyStopped() when the service is ");
                    sb2.append(strValueOf);
                    throw new IllegalStateException(sb2.toString());
                case 2:
                case 3:
                case 4:
                    this.f59446g = new k(Service.State.TERMINATED);
                    s(stateH);
                    break;
            }
            this.f59440a.D();
            k();
        } catch (Throwable th2) {
            this.f59440a.D();
            k();
            throw th2;
        }
    }
}
