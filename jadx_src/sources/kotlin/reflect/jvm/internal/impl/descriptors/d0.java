package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: ModuleDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d0 extends k {

    /* JADX INFO: compiled from: ModuleDescriptor.kt */
    public static final class a {
        @dl.e
        public static <R, D> R a(@dl.d d0 d0Var, @dl.d m<R, D> visitor, D d10) {
            kotlin.jvm.internal.f0.p(visitor, "visitor");
            return visitor.m(d0Var, d10);
        }

        @dl.e
        public static k b(@dl.d d0 d0Var) {
            return null;
        }
    }

    boolean F(@dl.d d0 d0Var);

    @dl.d
    k0 R(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @dl.d
    List<d0> V();

    @dl.e
    <T> T a0(@dl.d c0<T> c0Var);

    @dl.d
    Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @dl.d
    kotlin.reflect.jvm.internal.impl.builtins.g t();
}
