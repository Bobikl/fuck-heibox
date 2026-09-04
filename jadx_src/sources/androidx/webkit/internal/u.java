package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.n0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: WebViewGlueCommunicator.java */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28395a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28396b = "createWebViewProviderFactory";

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b0 f28397a = new b0(u.d().getWebkitToCompatConverter());

        private a() {
        }
    }

    /* JADX INFO: compiled from: WebViewGlueCommunicator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final w f28398a = u.a();

        private b() {
        }
    }

    private u() {
    }

    @n0
    static w a() {
        try {
            return new x((WebViewProviderFactoryBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new c();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName(f28395a, false, e()).getDeclaredMethod(f28396b, new Class[0]).invoke(null, new Object[0]);
    }

    @n0
    public static b0 c() {
        return a.f28397a;
    }

    @n0
    public static w d() {
        return b.f28398a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
