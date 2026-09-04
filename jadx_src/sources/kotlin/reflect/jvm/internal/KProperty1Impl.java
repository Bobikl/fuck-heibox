package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.z;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements kotlin.reflect.p<T, V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final n.b<a<T, V>> f125217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final z<Member> f125218o;

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    public static final class a<T, V> extends KPropertyImpl.Getter<V> implements kotlin.reflect.p.a<T, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final KProperty1Impl<T, V> f125220i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d KProperty1Impl<T, ? extends V> property) {
            f0.p(property, "property");
            this.f125220i = property;
        }

        @Override // kotlin.reflect.n.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public KProperty1Impl<T, V> a() {
            return this.f125220i;
        }

        @Override // yh.l
        public V invoke(T t10) {
            return a().get(t10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature, @dl.e Object obj) {
        super(container, name, signature, obj);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
        n.b<a<T, V>> bVarB = n.b(new yh.a<a<T, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty1Impl<T, V> f125219b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125219b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KProperty1Impl.a<T, V> invoke() {
                return new KProperty1Impl.a<>(this.f125219b);
            }
        });
        f0.o(bVarB, "lazy { Getter(this) }");
        this.f125217n = bVarB;
        this.f125218o = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty1Impl<T, V> f125221b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125221b = this;
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Member invoke() {
                return this.f125221b.M();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        super(container, descriptor);
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        n.b<a<T, V>> bVarB = n.b(new yh.a<a<T, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty1Impl<T, V> f125219b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125219b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KProperty1Impl.a<T, V> invoke() {
                return new KProperty1Impl.a<>(this.f125219b);
            }
        });
        f0.o(bVarB, "lazy { Getter(this) }");
        this.f125217n = bVarB;
        this.f125218o = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty1Impl<T, V> f125221b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125221b = this;
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Member invoke() {
                return this.f125221b.M();
            }
        });
    }

    @Override // kotlin.reflect.n
    @dl.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public a<T, V> getGetter() {
        a<T, V> aVarInvoke = this.f125217n.invoke();
        f0.o(aVarInvoke, "_getter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.p
    @dl.e
    public Object e0(T t10) {
        return O(this.f125218o.getValue(), t10, null);
    }

    @Override // kotlin.reflect.p
    public V get(T t10) {
        return getGetter().call(t10);
    }

    @Override // yh.l
    public V invoke(T t10) {
        return get(t10);
    }
}
