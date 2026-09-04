package kotlin.reflect.jvm.internal;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* JADX INFO: compiled from: KProperty2Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KMutableProperty2Impl<D, E, V> extends KProperty2Impl<D, E, V> implements kotlin.reflect.m<D, E, V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final n.b<a<D, E, V>> f125183p;

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    public static final class a<D, E, V> extends KPropertyImpl.Setter<V> implements kotlin.reflect.m.a<D, E, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final KMutableProperty2Impl<D, E, V> f125185i;

        public a(@dl.d KMutableProperty2Impl<D, E, V> property) {
            f0.p(property, "property");
            this.f125185i = property;
        }

        @Override // kotlin.reflect.n.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public KMutableProperty2Impl<D, E, V> a() {
            return this.f125185i;
        }

        public void P(D d10, E e10, V v10) throws IllegalCallableAccessException {
            a().u0(d10, e10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yh.q
        public /* bridge */ /* synthetic */ b2 invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            P(obj, obj2, obj3);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature) {
        super(container, name, signature);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
        n.b<a<D, E, V>> bVarB = n.b(new yh.a<a<D, E, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KMutableProperty2Impl<D, E, V> f125184b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125184b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KMutableProperty2Impl.a<D, E, V> invoke() {
                return new KMutableProperty2Impl.a<>(this.f125184b);
            }
        });
        f0.o(bVarB, "lazy { Setter(this) }");
        this.f125183p = bVarB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        super(container, descriptor);
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        n.b<a<D, E, V>> bVarB = n.b(new yh.a<a<D, E, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KMutableProperty2Impl<D, E, V> f125184b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125184b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KMutableProperty2Impl.a<D, E, V> invoke() {
                return new KMutableProperty2Impl.a<>(this.f125184b);
            }
        });
        f0.o(bVarB, "lazy { Setter(this) }");
        this.f125183p = bVarB;
    }

    @Override // kotlin.reflect.m, kotlin.reflect.j
    @dl.d
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> getSetter() {
        a<D, E, V> aVarInvoke = this.f125183p.invoke();
        f0.o(aVarInvoke, "_setter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.m
    public void u0(D d10, E e10, V v10) throws IllegalCallableAccessException {
        getSetter().call(d10, e10, v10);
    }
}
