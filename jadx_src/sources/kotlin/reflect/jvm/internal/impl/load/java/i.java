package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class i {
    public static /* synthetic */ mi.u a(j jVar, kotlin.reflect.jvm.internal.impl.name.c cVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return jVar.c(cVar, z10);
    }
}
