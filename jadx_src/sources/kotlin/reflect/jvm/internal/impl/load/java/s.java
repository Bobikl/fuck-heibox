package kotlin.reflect.jvm.internal.impl.load.java;

import com.umeng.analytics.pro.ak;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JvmAbi.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s f126304a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final kotlin.reflect.jvm.internal.impl.name.c f126305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final kotlin.reflect.jvm.internal.impl.name.b f126306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f126307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f126308e;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmField");
        f126305b = cVar;
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        f0.o(bVarM, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f126306c = bVarM;
        kotlin.reflect.jvm.internal.impl.name.b bVarM2 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f0.o(bVarM2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f126307d = bVarM2;
        kotlin.reflect.jvm.internal.impl.name.b bVarE = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/jvm/internal/RepeatableContainer");
        f0.o(bVarE, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f126308e = bVarE;
    }

    private s() {
    }

    @dl.d
    @xh.m
    public static final String b(@dl.d String propertyName) {
        f0.p(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + ti.a.a(propertyName);
    }

    @xh.m
    public static final boolean c(@dl.d String name) {
        f0.p(name, "name");
        return kotlin.text.u.v2(name, "get", false, 2, null) || kotlin.text.u.v2(name, ak.f104422ae, false, 2, null);
    }

    @xh.m
    public static final boolean d(@dl.d String name) {
        f0.p(name, "name");
        return kotlin.text.u.v2(name, "set", false, 2, null);
    }

    @dl.d
    @xh.m
    public static final String e(@dl.d String propertyName) {
        String strA;
        f0.p(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            f0.o(strA, "this as java.lang.String).substring(startIndex)");
        } else {
            strA = ti.a.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    @xh.m
    public static final boolean f(@dl.d String name) {
        f0.p(name, "name");
        if (!kotlin.text.u.v2(name, ak.f104422ae, false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return f0.t(97, cCharAt) > 0 || f0.t(cCharAt, 122) > 0;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return f126308e;
    }
}
