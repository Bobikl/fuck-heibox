package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: DefaultBuiltIns.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f125357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final d f125358j;

    /* JADX INFO: compiled from: DefaultBuiltIns.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final d a() {
            return d.f125358j;
        }
    }

    static {
        u uVar = null;
        f125357i = new a(uVar);
        f125358j = new d(false, 1, uVar);
    }

    public d() {
        this(false, 1, null);
    }

    public d(boolean z10) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    public /* synthetic */ d(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
