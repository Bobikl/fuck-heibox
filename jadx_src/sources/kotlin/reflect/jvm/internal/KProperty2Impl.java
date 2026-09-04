package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.z;

/* JADX INFO: compiled from: KProperty2Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements kotlin.reflect.q<D, E, V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final n.b<a<D, E, V>> f125222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final z<Member> f125223o;

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    public static final class a<D, E, V> extends KPropertyImpl.Getter<V> implements kotlin.reflect.q.a<D, E, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final KProperty2Impl<D, E, V> f125225i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d KProperty2Impl<D, E, ? extends V> property) {
            f0.p(property, "property");
            this.f125225i = property;
        }

        @Override // kotlin.reflect.n.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public KProperty2Impl<D, E, V> a() {
            return this.f125225i;
        }

        @Override // yh.p
        public V invoke(D d10, E e10) {
            return a().Y(d10, e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
        n.b<a<D, E, V>> bVarB = n.b(new yh.a<a<D, E, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty2Impl<D, E, V> f125224b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125224b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KProperty2Impl.a<D, E, V> invoke() {
                return new KProperty2Impl.a<>(this.f125224b);
            }
        });
        f0.o(bVarB, "lazy { Getter(this) }");
        this.f125222n = bVarB;
        this.f125223o = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateSource$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty2Impl<D, E, V> f125226b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125226b = this;
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Member invoke() {
                return this.f125226b.M();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        super(container, descriptor);
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        n.b<a<D, E, V>> bVarB = n.b(new yh.a<a<D, E, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty2Impl<D, E, V> f125224b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125224b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KProperty2Impl.a<D, E, V> invoke() {
                return new KProperty2Impl.a<>(this.f125224b);
            }
        });
        f0.o(bVarB, "lazy { Getter(this) }");
        this.f125222n = bVarB;
        this.f125223o = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateSource$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty2Impl<D, E, V> f125226b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125226b = this;
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Member invoke() {
                return this.f125226b.M();
            }
        });
    }

    @Override // kotlin.reflect.q
    @dl.e
    public Object Q0(D d10, E e10) {
        return O(this.f125223o.getValue(), d10, e10);
    }

    @Override // kotlin.reflect.n
    @dl.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> getGetter() {
        a<D, E, V> aVarInvoke = this.f125222n.invoke();
        f0.o(aVarInvoke, "_getter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.q
    public V Y(D d10, E e10) {
        return getGetter().call(d10, e10);
    }

    @Override // yh.p
    public V invoke(D d10, E e10) {
        return Y(d10, e10);
    }
}
