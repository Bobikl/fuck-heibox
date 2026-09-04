package com.bun.miitmdid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public interface w extends IInterface {

    public static abstract class a extends Binder implements w {

        /* JADX INFO: renamed from: com.bun.miitmdid.w$a$a, reason: collision with other inner class name */
        public static class C0350a implements w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static w f42153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f42154b;

            public C0350a(IBinder iBinder) {
                this.f42154b = iBinder;
            }

            @Override // com.bun.miitmdid.w
            public native boolean a();

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.bun.miitmdid.w
            public native String getAAID();

            @Override // com.bun.miitmdid.w
            public native String getOAID();

            @Override // com.bun.miitmdid.w
            public native String getVAID();

            @Override // com.bun.miitmdid.w
            public native boolean isSupported();
        }

        public static native w a(IBinder iBinder);

        public static native w b();
    }

    boolean a();

    String getAAID();

    String getOAID();

    String getVAID();

    boolean isSupported();
}
