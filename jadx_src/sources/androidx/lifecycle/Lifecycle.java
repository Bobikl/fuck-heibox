package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private AtomicReference<Object> f24022a = new AtomicReference<>();

    /* JADX INFO: compiled from: Lifecycle.kt */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        @dl.d
        public static final a Companion = new a(null);

        /* JADX INFO: compiled from: Lifecycle.kt */
        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Lifecycle.kt */
            public final /* synthetic */ class C0172a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f24023a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f24023a = iArr;
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.e
            @xh.m
            public final Event a(@dl.d State state) {
                kotlin.jvm.internal.f0.p(state, "state");
                int i10 = C0172a.f24023a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i10 == 2) {
                    return Event.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @dl.e
            @xh.m
            public final Event b(@dl.d State state) {
                kotlin.jvm.internal.f0.p(state, "state");
                int i10 = C0172a.f24023a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_STOP;
                }
                if (i10 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @dl.e
            @xh.m
            public final Event c(@dl.d State state) {
                kotlin.jvm.internal.f0.p(state, "state");
                int i10 = C0172a.f24023a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_START;
                }
                if (i10 == 2) {
                    return Event.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @dl.e
            @xh.m
            public final Event d(@dl.d State state) {
                kotlin.jvm.internal.f0.p(state, "state");
                int i10 = C0172a.f24023a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_CREATE;
                }
                if (i10 == 2) {
                    return Event.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        public final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24024a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f24024a = iArr;
            }
        }

        @dl.e
        @xh.m
        public static final Event downFrom(@dl.d State state) {
            return Companion.a(state);
        }

        @dl.e
        @xh.m
        public static final Event downTo(@dl.d State state) {
            return Companion.b(state);
        }

        @dl.e
        @xh.m
        public static final Event upFrom(@dl.d State state) {
            return Companion.c(state);
        }

        @dl.e
        @xh.m
        public static final Event upTo(@dl.d State state) {
            return Companion.d(state);
        }

        @dl.d
        public final State getTargetState() {
            switch (b.f24024a[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@dl.d State state) {
            kotlin.jvm.internal.f0.p(state, "state");
            return compareTo(state) >= 0;
        }
    }

    @androidx.annotation.k0
    public abstract void a(@dl.d x xVar);

    @dl.d
    @androidx.annotation.k0
    public abstract State b();

    @dl.d
    public final AtomicReference<Object> c() {
        return this.f24022a;
    }

    @androidx.annotation.k0
    public abstract void d(@dl.d x xVar);

    public final void e(@dl.d AtomicReference<Object> atomicReference) {
        kotlin.jvm.internal.f0.p(atomicReference, "<set-?>");
        this.f24022a = atomicReference;
    }
}
