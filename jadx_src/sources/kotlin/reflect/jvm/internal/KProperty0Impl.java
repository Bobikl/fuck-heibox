package kotlin.reflect.jvm.internal;

import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.z;

/* JADX INFO: compiled from: KProperty0Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements kotlin.reflect.o<V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final n.b<a<V>> f125212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final z<Object> f125213o;

    /* JADX INFO: compiled from: KProperty0Impl.kt */
    public static final class a<R> extends KPropertyImpl.Getter<R> implements kotlin.reflect.o.a<R> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final KProperty0Impl<R> f125215i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d KProperty0Impl<? extends R> property) {
            f0.p(property, "property");
            this.f125215i = property;
        }

        @Override // kotlin.reflect.n.a
        @dl.d
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public KProperty0Impl<R> a() {
            return this.f125215i;
        }

        @Override // yh.a
        public R invoke() {
            return M().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@dl.d KDeclarationContainerImpl container, @dl.d String name, @dl.d String signature, @dl.e Object obj) {
        super(container, name, signature, obj);
        f0.p(container, "container");
        f0.p(name, "name");
        f0.p(signature, "signature");
        n.b<a<V>> bVarB = n.b(new yh.a<a<? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty0Impl<V> f125214b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125214b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KProperty0Impl.a<V> invoke() {
                return new KProperty0Impl.a<>(this.f125214b);
            }
        });
        f0.o(bVarB, "lazy { Getter(this) }");
        this.f125212n = bVarB;
        this.f125213o = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<Object>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty0Impl<V> f125216b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125216b = this;
            }

            @Override // yh.a
            @dl.e
            public final Object invoke() {
                KPropertyImpl kPropertyImpl = this.f125216b;
                return kPropertyImpl.O(kPropertyImpl.M(), null, null);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@dl.d KDeclarationContainerImpl container, @dl.d o0 descriptor) {
        super(container, descriptor);
        f0.p(container, "container");
        f0.p(descriptor, "descriptor");
        n.b<a<V>> bVarB = n.b(new yh.a<a<? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty0Impl<V> f125214b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125214b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KProperty0Impl.a<V> invoke() {
                return new KProperty0Impl.a<>(this.f125214b);
            }
        });
        f0.o(bVarB, "lazy { Getter(this) }");
        this.f125212n = bVarB;
        this.f125213o = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<Object>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KProperty0Impl<V> f125216b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125216b = this;
            }

            @Override // yh.a
            @dl.e
            public final Object invoke() {
                KPropertyImpl kPropertyImpl = this.f125216b;
                return kPropertyImpl.O(kPropertyImpl.M(), null, null);
            }
        });
    }

    @Override // kotlin.reflect.n
    @dl.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<V> getGetter() {
        a<V> aVarInvoke = this.f125212n.invoke();
        f0.o(aVarInvoke, "_getter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.o
    public V get() {
        return Q().call(new Object[0]);
    }

    @Override // kotlin.reflect.o
    @dl.e
    public Object getDelegate() {
        return this.f125213o.getValue();
    }

    @Override // yh.a
    public V invoke() {
        return get();
    }
}
