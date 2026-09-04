package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.builtins.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f125522i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.builtins.g f125523j = new b();

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.builtins.g a() {
            return b.f125523j;
        }
    }

    private b() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        f(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.g
    @dl.d
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public gi.c.a M() {
        return gi.c.a.f119064a;
    }
}
