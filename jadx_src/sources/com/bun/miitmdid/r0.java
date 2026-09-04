package com.bun.miitmdid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public interface r0 extends IInterface {

    public static abstract class a extends Binder implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f42141a = 0;

        /* JADX INFO: renamed from: com.bun.miitmdid.r0$a$a, reason: collision with other inner class name */
        public static class C0349a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f42142a;

            public C0349a(IBinder iBinder) {
                this.f42142a = iBinder;
            }

            @Override // com.bun.miitmdid.r0
            public native void a(q0 q0Var);

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.bun.miitmdid.r0
            public native void b(q0 q0Var);
        }
    }

    void a(q0 q0Var);

    void b(q0 q0Var);
}
