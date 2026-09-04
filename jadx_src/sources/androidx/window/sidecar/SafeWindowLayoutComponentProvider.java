package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.w0;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.z;
import yh.a;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u0004*\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u0004*\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J \u0010\u0014\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0015\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0017\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00020\u0004*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "Ljava/lang/ClassLoader;", "classLoader", "", "i", "r", "p", "n", "q", "Lkotlin/Function0;", "block", ak.aB, "Ljava/lang/reflect/Method;", "Lkotlin/reflect/d;", "clazz", "k", "Ljava/lang/Class;", "j", "kotlin.jvm.PlatformType", ak.aG, "t", "l", "v", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "b", "Lkotlin/z;", "m", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "o", "(Ljava/lang/reflect/Method;)Z", "isPublic", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SafeWindowLayoutComponentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final SafeWindowLayoutComponentProvider f28572a = new SafeWindowLayoutComponentProvider();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private static final z windowLayoutComponent = b0.c(new a<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        @Override // yh.a
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader == null || !SafeWindowLayoutComponentProvider.f28572a.i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    });

    private SafeWindowLayoutComponentProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 && r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(Method method, kotlin.reflect.d<?> dVar) {
        return j(method, xh.a.e(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(final ClassLoader classLoader) {
        return s(new a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f28572a;
                Class clsL = safeWindowLayoutComponentProvider.l(classLoader);
                boolean z10 = false;
                Method getBoundsMethod = clsL.getMethod("getBounds", new Class[0]);
                Method getTypeMethod = clsL.getMethod("getType", new Class[0]);
                Method getStateMethod = clsL.getMethod("getState", new Class[0]);
                f0.o(getBoundsMethod, "getBoundsMethod");
                if (safeWindowLayoutComponentProvider.k(getBoundsMethod, n0.d(Rect.class)) && safeWindowLayoutComponentProvider.o(getBoundsMethod)) {
                    f0.o(getTypeMethod, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (safeWindowLayoutComponentProvider.k(getTypeMethod, n0.d(cls)) && safeWindowLayoutComponentProvider.o(getTypeMethod)) {
                        f0.o(getStateMethod, "getStateMethod");
                        if (safeWindowLayoutComponentProvider.k(getStateMethod, n0.d(cls)) && safeWindowLayoutComponentProvider.o(getStateMethod)) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(final ClassLoader classLoader) {
        return s(new a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f28572a;
                boolean z10 = false;
                Method getWindowLayoutComponentMethod = safeWindowLayoutComponentProvider.t(classLoader).getMethod("getWindowLayoutComponent", new Class[0]);
                Class windowLayoutComponentClass = safeWindowLayoutComponentProvider.v(classLoader);
                f0.o(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (safeWindowLayoutComponentProvider.o(getWindowLayoutComponentMethod)) {
                    f0.o(windowLayoutComponentClass, "windowLayoutComponentClass");
                    if (safeWindowLayoutComponentProvider.j(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    @w0(24)
    private final boolean q(final ClassLoader classLoader) {
        return s(new a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f28572a;
                Class clsV = safeWindowLayoutComponentProvider.v(classLoader);
                boolean z10 = false;
                Method addListenerMethod = clsV.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method removeListenerMethod = clsV.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                f0.o(addListenerMethod, "addListenerMethod");
                if (safeWindowLayoutComponentProvider.o(addListenerMethod)) {
                    f0.o(removeListenerMethod, "removeListenerMethod");
                    if (safeWindowLayoutComponentProvider.o(removeListenerMethod)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    private final boolean r(final ClassLoader classLoader) {
        return s(new a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f28572a;
                boolean z10 = false;
                Method getWindowExtensionsMethod = safeWindowLayoutComponentProvider.u(classLoader).getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class windowExtensionsClass = safeWindowLayoutComponentProvider.t(classLoader);
                f0.o(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                f0.o(windowExtensionsClass, "windowExtensionsClass");
                if (safeWindowLayoutComponentProvider.j(getWindowExtensionsMethod, windowExtensionsClass) && safeWindowLayoutComponentProvider.o(getWindowExtensionsMethod)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    private final boolean s(a<Boolean> aVar) {
        try {
            return aVar.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @e
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) windowLayoutComponent.getValue();
    }
}
