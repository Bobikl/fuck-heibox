package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.l0;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/b;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/l0;", "Ljava/lang/reflect/Method;", "O", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", "C", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class b extends kotlin.coroutines.a implements l0 {

    @dl.e
    private volatile Object _preHandler;

    public b() {
        super(l0.INSTANCE);
        this._preHandler = this;
    }

    private final Method O() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z10 = true;
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.l0
    public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method methodO = O();
            Object objInvoke = methodO != null ? methodO.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
