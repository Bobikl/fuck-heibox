package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z0 {
    static {
        y0.b.a aVar = y0.b.f24296a;
    }

    @dl.d
    public static w0 a(y0.b bVar, @dl.d Class modelClass) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @dl.d
    public static w0 b(y0.b bVar, @dl.d Class modelClass, @dl.d u2.a extras) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        kotlin.jvm.internal.f0.p(extras, "extras");
        return bVar.a(modelClass);
    }

    @dl.d
    @xh.m
    public static y0.b c(@dl.d u2.g<?>... gVarArr) {
        return y0.b.f24296a.a(gVarArr);
    }
}
