package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: NavArgsLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class n<Args extends m> implements kotlin.z<Args> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<Args> f25208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<Bundle> f25209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Args f25210d;

    public n(@dl.d kotlin.reflect.d<Args> navArgsClass, @dl.d yh.a<Bundle> argumentProducer) {
        kotlin.jvm.internal.f0.p(navArgsClass, "navArgsClass");
        kotlin.jvm.internal.f0.p(argumentProducer, "argumentProducer");
        this.f25208b = navArgsClass;
        this.f25209c = argumentProducer;
    }

    @Override // kotlin.z
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.f25210d;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.f25209c.invoke();
        Method method = o.a().get(this.f25208b);
        if (method == null) {
            Class clsE = xh.a.e(this.f25208b);
            Class<Bundle>[] clsArrB = o.b();
            method = clsE.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArrB, clsArrB.length));
            o.a().put(this.f25208b, method);
            kotlin.jvm.internal.f0.o(method, "navArgsClass.java.getMet…                        }");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        kotlin.jvm.internal.f0.n(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.f25210d = args2;
        return args2;
    }

    @Override // kotlin.z
    public boolean l() {
        return this.f25210d != null;
    }
}
