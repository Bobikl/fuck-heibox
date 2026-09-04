package com.github.piasy.biv.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class ThreadedCallbacks implements InvocationHandler {
    private final Handler mHandler;
    private final Object mTarget;
    private static final Object NON_SENSE = new Object();
    private static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f43453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object[] f43454c;

        a(Method method, Object[] objArr) {
            this.f43453b = method;
            this.f43454c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f43453b.invoke(ThreadedCallbacks.this.mTarget, this.f43454c);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private ThreadedCallbacks(Handler handler, Object obj) {
        this.mHandler = handler;
        this.mTarget = obj;
    }

    public static <T> T create(Handler handler, Class<T> cls, T t10) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ThreadedCallbacks(handler, t10));
    }

    public static <T> T create(Class<T> cls, T t10) {
        return (T) create(MAIN_HANDLER, cls, t10);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getReturnType().equals(Void.TYPE)) {
            if (Looper.myLooper() == this.mHandler.getLooper()) {
                method.invoke(this.mTarget, objArr);
            } else {
                this.mHandler.post(new a(method, objArr));
            }
            return NON_SENSE;
        }
        throw new RuntimeException("Method should return void: " + method);
    }
}
