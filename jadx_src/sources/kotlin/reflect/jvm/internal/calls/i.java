package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ThrowingCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f125315a = new i();

    private i() {
    }

    @dl.e
    public Void a() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public List<Type> c() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.e
    public Object call(@dl.d Object[] args) {
        f0.p(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    public /* bridge */ /* synthetic */ Member d() {
        return (Member) a();
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        f0.o(TYPE, "TYPE");
        return TYPE;
    }
}
