package kotlin.reflect.jvm.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class j implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yh.p f128312b;

    public j(yh.p pVar) {
        this.f128312b = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return KDeclarationContainerImpl.M(this.f128312b, obj, obj2);
    }
}
