package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = org.apache.tools.ant.util.s0.f136932w)
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f124881d;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.f124881d = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: a */
    public kotlin.reflect.i getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            return this.f124881d.equals(((FunInterfaceConstructorReference) obj).f124881d);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.f124881d.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface " + this.f124881d.getName();
    }
}
