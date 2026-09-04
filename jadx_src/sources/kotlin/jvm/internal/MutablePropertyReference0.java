package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements kotlin.reflect.k {
    public MutablePropertyReference0() {
    }

    @kotlin.u0(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @kotlin.u0(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return n0.j(this);
    }

    @Override // kotlin.reflect.o
    @kotlin.u0(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.k) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.o.a getGetter() {
        return ((kotlin.reflect.k) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.k.a getSetter() {
        return ((kotlin.reflect.k) getReflected()).getSetter();
    }

    @Override // yh.a
    public Object invoke() {
        return get();
    }
}
