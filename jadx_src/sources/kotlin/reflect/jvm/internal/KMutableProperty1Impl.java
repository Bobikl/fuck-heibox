package kotlin.reflect.jvm.internal;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements kotlin.reflect.l<T, V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final n.b<a<T, V>> f125180p;

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    public static final class a<T, V> extends KPropertyImpl.Setter<V> implements kotlin.reflect.l.a<T, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final KMutableProperty1Impl<T, V> f125182i;

        public a(@dl.d KMutableProperty1Impl<T, V> property) {
            f0.p(property, "property");
            this.f125182i = property;
        }

        @Override // kotlin.reflect.n.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public KMutableProperty1Impl<T, V> a() {
            return this.f125182i;
        }

        public void P(T t10, V v10) throws IllegalCallableAccessException {
            a().Y0(t10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yh.p
        public /* bridge */ /* synthetic */ b2 invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            P(obj, obj2);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature, @dl.e Object obj) {
        super(container, name, signature, obj);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
        n.b<a<T, V>> bVarB = n.b(new yh.a<a<T, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KMutableProperty1Impl<T, V> f125181b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125181b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KMutableProperty1Impl.a<T, V> invoke() {
                return new KMutableProperty1Impl.a<>(this.f125181b);
            }
        });
        f0.o(bVarB, "lazy { Setter(this) }");
        this.f125180p = bVarB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        super(container, descriptor);
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        n.b<a<T, V>> bVarB = n.b(new yh.a<a<T, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KMutableProperty1Impl<T, V> f125181b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125181b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KMutableProperty1Impl.a<T, V> invoke() {
                return new KMutableProperty1Impl.a<>(this.f125181b);
            }
        });
        f0.o(bVarB, "lazy { Setter(this) }");
        this.f125180p = bVarB;
    }

    @Override // kotlin.reflect.l, kotlin.reflect.j
    @dl.d
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public a<T, V> getSetter() {
        a<T, V> aVarInvoke = this.f125180p.invoke();
        f0.o(aVarInvoke, "_setter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.l
    public void Y0(T t10, V v10) throws IllegalCallableAccessException {
        getSetter().call(t10, v10);
    }
}
