package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface c extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends com.google.android.gms.internal.common.i implements c {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @n0
        public static c N(@n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new i(iBinder);
        }
    }
}
