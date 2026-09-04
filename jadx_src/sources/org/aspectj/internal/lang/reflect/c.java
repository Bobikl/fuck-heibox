package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import org.aspectj.lang.reflect.DeclareAnnotation;
import zj.a0;
import zj.y;

/* JADX INFO: compiled from: DeclareAnnotationImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class c implements DeclareAnnotation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Annotation f137609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zj.c<?> f137611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DeclareAnnotation.Kind f137612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a0 f137613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y f137614f;

    /* JADX INFO: compiled from: DeclareAnnotationImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137615a;

        static {
            int[] iArr = new int[DeclareAnnotation.Kind.values().length];
            f137615a = iArr;
            try {
                iArr[DeclareAnnotation.Kind.Type.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137615a[DeclareAnnotation.Kind.Method.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137615a[DeclareAnnotation.Kind.Field.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137615a[DeclareAnnotation.Kind.Constructor.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(zj.c<?> cVar, String str, String str2, Annotation annotation, String str3) {
        this.f137611c = cVar;
        if (str.equals("at_type")) {
            this.f137612d = DeclareAnnotation.Kind.Type;
        } else if (str.equals("at_field")) {
            this.f137612d = DeclareAnnotation.Kind.Field;
        } else if (str.equals("at_method")) {
            this.f137612d = DeclareAnnotation.Kind.Method;
        } else {
            if (!str.equals("at_constructor")) {
                throw new IllegalStateException("Unknown declare annotation kind: " + str);
            }
            this.f137612d = DeclareAnnotation.Kind.Constructor;
        }
        if (this.f137612d == DeclareAnnotation.Kind.Type) {
            this.f137613e = new s(str2);
        } else {
            this.f137614f = new p(str2);
        }
        this.f137609a = annotation;
        this.f137610b = str3;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public zj.c<?> a() {
        return this.f137611c;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public DeclareAnnotation.Kind b() {
        return this.f137612d;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public Annotation c() {
        return this.f137609a;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public a0 e() {
        return this.f137613e;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public String f() {
        return this.f137610b;
    }

    @Override // org.aspectj.lang.reflect.DeclareAnnotation
    public y g() {
        return this.f137614f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare @");
        int i10 = a.f137615a[b().ordinal()];
        if (i10 == 1) {
            stringBuffer.append("type : ");
            stringBuffer.append(e().a());
        } else if (i10 == 2) {
            stringBuffer.append("method : ");
            stringBuffer.append(g().a());
        } else if (i10 == 3) {
            stringBuffer.append("field : ");
            stringBuffer.append(g().a());
        } else if (i10 == 4) {
            stringBuffer.append("constructor : ");
            stringBuffer.append(g().a());
        }
        stringBuffer.append(" : ");
        stringBuffer.append(f());
        return stringBuffer.toString();
    }
}
