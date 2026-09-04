package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: NavigatorProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
@SuppressLint({"TypeParameterUnusedInFormals"})
public class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f25231b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Map<Class<?>, String> f25232c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<String, Navigator<? extends NavDestination>> f25233a = new LinkedHashMap();

    /* JADX INFO: compiled from: NavigatorProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final String a(@dl.d Class<? extends Navigator<?>> navigatorClass) {
            kotlin.jvm.internal.f0.p(navigatorClass, "navigatorClass");
            String strValue = (String) q0.f25232c.get(navigatorClass);
            if (strValue == null) {
                Navigator.b bVar = (Navigator.b) navigatorClass.getAnnotation(Navigator.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                q0.f25232c.put(navigatorClass, strValue);
            }
            kotlin.jvm.internal.f0.m(strValue);
            return strValue;
        }

        public final boolean b(@dl.e String str) {
            if (str != null) {
                if (str.length() > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @dl.d
    @xh.m
    public static final String d(@dl.d Class<? extends Navigator<?>> cls) {
        return f25231b.a(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Navigator<? extends NavDestination> b(@dl.d Navigator<? extends NavDestination> navigator) {
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        return c(f25231b.a(navigator.getClass()), navigator);
    }

    @androidx.annotation.i
    @dl.e
    public Navigator<? extends NavDestination> c(@dl.d String name, @dl.d Navigator<? extends NavDestination> navigator) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        if (!f25231b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator<? extends NavDestination> navigator2 = this.f25233a.get(name);
        if (kotlin.jvm.internal.f0.g(navigator2, navigator)) {
            return navigator;
        }
        boolean z10 = false;
        if (navigator2 != null && navigator2.c()) {
            z10 = true;
        }
        if (!(!z10)) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.c()) {
            return this.f25233a.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @dl.d
    public final <T extends Navigator<?>> T e(@dl.d Class<T> navigatorClass) {
        kotlin.jvm.internal.f0.p(navigatorClass, "navigatorClass");
        return (T) f(f25231b.a(navigatorClass));
    }

    @androidx.annotation.i
    @dl.d
    public <T extends Navigator<?>> T f(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        if (!f25231b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator<? extends NavDestination> navigator = this.f25233a.get(name);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, Navigator<? extends NavDestination>> g() {
        return kotlin.collections.s0.D0(this.f25233a);
    }
}
