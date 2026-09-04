package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.4")
public class AdaptedFunctionReference implements b0, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f124873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f124874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f124875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f124876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f124877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f124878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f124879h;

    public AdaptedFunctionReference(int i10, Class cls, String str, String str2, int i11) {
        this(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    public AdaptedFunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f124873b = obj;
        this.f124874c = cls;
        this.f124875d = str;
        this.f124876e = str2;
        this.f124877f = (i11 & 1) == 1;
        this.f124878g = i10;
        this.f124879h = i11 >> 1;
    }

    public kotlin.reflect.h a() {
        Class cls = this.f124874c;
        if (cls == null) {
            return null;
        }
        return this.f124877f ? n0.g(cls) : n0.d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.f124877f == adaptedFunctionReference.f124877f && this.f124878g == adaptedFunctionReference.f124878g && this.f124879h == adaptedFunctionReference.f124879h && f0.g(this.f124873b, adaptedFunctionReference.f124873b) && f0.g(this.f124874c, adaptedFunctionReference.f124874c) && this.f124875d.equals(adaptedFunctionReference.f124875d) && this.f124876e.equals(adaptedFunctionReference.f124876e);
    }

    @Override // kotlin.jvm.internal.b0
    public int getArity() {
        return this.f124878g;
    }

    public int hashCode() {
        Object obj = this.f124873b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f124874c;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f124875d.hashCode()) * 31) + this.f124876e.hashCode()) * 31) + (this.f124877f ? 1231 : bb.c.b.Pk)) * 31) + this.f124878g) * 31) + this.f124879h;
    }

    public String toString() {
        return n0.w(this);
    }
}
