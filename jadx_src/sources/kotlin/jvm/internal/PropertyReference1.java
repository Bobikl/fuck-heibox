package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference1 extends PropertyReference implements kotlin.reflect.p {
    public PropertyReference1() {
    }

    @kotlin.u0(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @kotlin.u0(version = "1.4")
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return n0.u(this);
    }

    @Override // kotlin.reflect.p
    @kotlin.u0(version = "1.1")
    public Object e0(Object obj) {
        return ((kotlin.reflect.p) getReflected()).e0(obj);
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.p.a getGetter() {
        return ((kotlin.reflect.p) getReflected()).getGetter();
    }

    @Override // yh.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
