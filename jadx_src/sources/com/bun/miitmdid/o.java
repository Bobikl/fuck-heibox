package com.bun.miitmdid;

import android.app.Activity;
import android.content.Context;
import com.bun.miitmdid.interfaces.IIdProvider;
import com.bun.miitmdid.interfaces.IIdentifierListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements IIdProvider {
    private static final char[] NULL_OAID_CHARS = {'0', '-'};
    public static final String TAG = "BaseProvider";
    private boolean isGetAAID;
    private boolean isGetOAID;
    private boolean isGetVAID;
    private boolean isSupportRequestOAIDPermission;
    public IIdentifierListener mcallback;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    public native Context checkContext(Context context);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStartInThreadPool(IIdentifierListener iIdentifierListener);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStartSync(IIdentifierListener iIdentifierListener);

    public native boolean isGetAAID();

    public native boolean isGetOAID();

    public native boolean isGetVAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isSupportRequestOAIDPermission();

    public native void onSupport(String str, String str2, String str3, boolean z10, boolean z11);

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native void requestOAIDPermission(Activity activity, int i10);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void setGetIdFlag(boolean z10, boolean z11, boolean z12);

    public native void setSupportRequestOAIDPermission(boolean z10);
}
