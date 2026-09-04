package androidx.lifecycle;

/* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DefaultLifecycleObserverAdapter implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j f23983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final v f23984c;

    /* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23985a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23985a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@dl.d j defaultLifecycleObserver, @dl.e v vVar) {
        kotlin.jvm.internal.f0.p(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f23983b = defaultLifecycleObserver;
        this.f23984c = vVar;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        switch (a.f23985a[event.ordinal()]) {
            case 1:
                this.f23983b.q(source);
                break;
            case 2:
                this.f23983b.onStart(source);
                break;
            case 3:
                this.f23983b.j(source);
                break;
            case 4:
                this.f23983b.l(source);
                break;
            case 5:
                this.f23983b.onStop(source);
                break;
            case 6:
                this.f23983b.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        v vVar = this.f23984c;
        if (vVar != null) {
            vVar.d(source, event);
        }
    }
}
