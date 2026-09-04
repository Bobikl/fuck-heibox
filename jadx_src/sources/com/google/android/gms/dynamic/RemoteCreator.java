package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.n0;
import com.google.android.gms.common.internal.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public abstract class RemoteCreator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f52671b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public static class RemoteCreatorException extends Exception {
        @v8.a
        public RemoteCreatorException(@n0 String str) {
            super(str);
        }

        @v8.a
        public RemoteCreatorException(@n0 String str, @n0 Throwable th2) {
            super(str, th2);
        }
    }

    @v8.a
    protected RemoteCreator(@n0 String str) {
        this.f52670a = str;
    }

    @n0
    @v8.a
    protected abstract T a(@n0 IBinder iBinder);

    @n0
    @v8.a
    protected final T b(@n0 Context context) throws RemoteCreatorException {
        if (this.f52671b == null) {
            p.l(context);
            Context contextI = com.google.android.gms.common.f.i(context);
            if (contextI == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f52671b = a((IBinder) contextI.getClassLoader().loadClass(this.f52670a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new RemoteCreatorException("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new RemoteCreatorException("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new RemoteCreatorException("Could not instantiate creator.", e12);
            }
        }
        return (T) this.f52671b;
    }
}
