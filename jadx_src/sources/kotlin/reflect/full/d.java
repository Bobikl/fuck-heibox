package kotlin.reflect.full;

import kotlin.reflect.p;

/* JADX INFO: loaded from: classes5.dex */
public class d implements kotlin.reflect.jvm.internal.impl.utils.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f125068a;

    public d(p pVar) {
        this.f125068a = pVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public Iterable a(Object obj) {
        return KClasses.W(this.f125068a, (kotlin.reflect.d) obj);
    }
}
