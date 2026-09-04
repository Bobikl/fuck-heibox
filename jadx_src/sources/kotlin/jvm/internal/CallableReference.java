package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CallableReference implements kotlin.reflect.c, Serializable {

    @kotlin.u0(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.f124880b;

    @kotlin.u0(version = "1.4")
    private final boolean isTopLevel;

    @kotlin.u0(version = "1.4")
    private final String name;

    @kotlin.u0(version = "1.4")
    private final Class owner;

    @kotlin.u0(version = "1.1")
    protected final Object receiver;
    private transient kotlin.reflect.c reflected;

    @kotlin.u0(version = "1.4")
    private final String signature;

    @kotlin.u0(version = "1.2")
    public static class NoReceiver implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final NoReceiver f124880b = new NoReceiver();

        private NoReceiver() {
        }

        private Object b() throws ObjectStreamException {
            return f124880b;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @kotlin.u0(version = "1.1")
    protected CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    @kotlin.u0(version = "1.4")
    protected CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // kotlin.reflect.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @kotlin.u0(version = "1.1")
    public kotlin.reflect.c compute() {
        kotlin.reflect.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        kotlin.reflect.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    protected abstract kotlin.reflect.c computeReflected();

    @Override // kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @kotlin.u0(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.name;
    }

    public kotlin.reflect.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? n0.g(cls) : n0.d(cls);
    }

    @Override // kotlin.reflect.c
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @kotlin.u0(version = "1.1")
    protected kotlin.reflect.c getReflected() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.r getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.c
    @kotlin.u0(version = "1.1")
    public List<kotlin.reflect.s> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.c
    @kotlin.u0(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.c
    @kotlin.u0(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.c
    @kotlin.u0(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.c
    @kotlin.u0(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.c
    @kotlin.u0(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
