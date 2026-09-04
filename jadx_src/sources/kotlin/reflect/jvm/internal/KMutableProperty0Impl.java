package kotlin.reflect.jvm.internal;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* JADX INFO: compiled from: KProperty0Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements kotlin.reflect.k<V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final n.b<a<V>> f125177p;

    /* JADX INFO: compiled from: KProperty0Impl.kt */
    public static final class a<R> extends KPropertyImpl.Setter<R> implements kotlin.reflect.k.a<R> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final KMutableProperty0Impl<R> f125179i;

        public a(@dl.d KMutableProperty0Impl<R> property) {
            f0.p(property, "property");
            this.f125179i = property;
        }

        @Override // kotlin.reflect.n.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public KMutableProperty0Impl<R> a() {
            return this.f125179i;
        }

        public void P(R r10) throws IllegalCallableAccessException {
            a().set(r10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Object obj) throws IllegalCallableAccessException {
            P(obj);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature, @dl.e Object obj) {
        super(container, name, signature, obj);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
        n.b<a<V>> bVarB = n.b(new yh.a<a<V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$_setter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KMutableProperty0Impl<V> f125178b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125178b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KMutableProperty0Impl.a<V> invoke() {
                return new KMutableProperty0Impl.a<>(this.f125178b);
            }
        });
        f0.o(bVarB, "lazy { Setter(this) }");
        this.f125177p = bVarB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        super(container, descriptor);
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        n.b<a<V>> bVarB = n.b(new yh.a<a<V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$_setter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KMutableProperty0Impl<V> f125178b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125178b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KMutableProperty0Impl.a<V> invoke() {
                return new KMutableProperty0Impl.a<>(this.f125178b);
            }
        });
        f0.o(bVarB, "lazy { Setter(this) }");
        this.f125177p = bVarB;
    }

    @Override // kotlin.reflect.k, kotlin.reflect.j
    @dl.d
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public a<V> getSetter() {
        a<V> aVarInvoke = this.f125177p.invoke();
        f0.o(aVarInvoke, "_setter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.k
    public void set(V v10) throws IllegalCallableAccessException {
        getSetter().call(v10);
    }
}
