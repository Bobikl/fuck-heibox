package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: loaded from: classes5.dex */
public class f implements kotlin.reflect.jvm.internal.impl.utils.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f125546a;

    public f(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f125546a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        return JvmBuiltInsCustomizer.s(this.f125546a, (kotlin.reflect.jvm.internal.impl.descriptors.d) obj);
    }
}
