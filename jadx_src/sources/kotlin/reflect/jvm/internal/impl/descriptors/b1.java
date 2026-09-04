package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* JADX INFO: compiled from: ValueParameterDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface b1 extends l0, d1 {

    /* JADX INFO: compiled from: ValueParameterDescriptor.kt */
    public static final class a {
        public static boolean a(@dl.d b1 b1Var) {
            return false;
        }
    }

    boolean A0();

    boolean C0();

    @dl.e
    kotlin.reflect.jvm.internal.impl.types.d0 F0();

    @dl.d
    b1 N(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i10);

    boolean W();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    b1 a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    kotlin.reflect.jvm.internal.impl.descriptors.a c();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    Collection<b1> f();

    int getIndex();
}
