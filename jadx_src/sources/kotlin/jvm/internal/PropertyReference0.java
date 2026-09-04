package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference0 extends PropertyReference implements kotlin.reflect.o {
    public PropertyReference0() {
    }

    @kotlin.u0(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @kotlin.u0(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return n0.t(this);
    }

    @Override // kotlin.reflect.o
    @kotlin.u0(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.o) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.o.a getGetter() {
        return ((kotlin.reflect.o) getReflected()).getGetter();
    }

    @Override // yh.a
    public Object invoke() {
        return get();
    }
}
