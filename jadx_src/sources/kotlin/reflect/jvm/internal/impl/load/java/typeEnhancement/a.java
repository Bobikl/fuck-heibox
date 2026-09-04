package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f126383a = new a();

    private a() {
    }

    private final Void b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public d0 getType() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public t0 j() {
        b();
        throw null;
    }

    @dl.d
    public String toString() {
        return "[EnhancedType]";
    }
}
