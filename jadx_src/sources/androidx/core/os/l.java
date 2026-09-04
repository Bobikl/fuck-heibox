package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: HandlerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20977a = "HandlerCompat";

    /* JADX INFO: compiled from: HandlerCompat.java */
    @w0(28)
    public static class a {
        private a() {
        }

        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler b(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean c(Handler handler, Runnable runnable, Object obj, long j10) {
            return handler.postDelayed(runnable, obj, j10);
        }
    }

    /* JADX INFO: compiled from: HandlerCompat.java */
    @w0(29)
    public static class b {
        private b() {
        }

        public static boolean a(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private l() {
    }

    @androidx.annotation.n0
    public static Handler a(@androidx.annotation.n0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w(f20977a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w(f20977a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w(f20977a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @androidx.annotation.n0
    public static Handler b(@androidx.annotation.n0 Looper looper, @androidx.annotation.n0 Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(looper, callback);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w(f20977a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w(f20977a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w(f20977a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @w0(16)
    public static boolean c(@androidx.annotation.n0 Handler handler, @androidx.annotation.n0 Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e12) {
            e = e12;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean d(@androidx.annotation.n0 Handler handler, @androidx.annotation.n0 Runnable runnable, @p0 Object obj, long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(handler, runnable, obj, j10);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j10);
    }
}
