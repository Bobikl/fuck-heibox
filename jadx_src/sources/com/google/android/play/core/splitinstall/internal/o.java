package com.google.android.play.core.splitinstall.internal;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class o {
    public static n a() {
        switch (Build.VERSION.SDK_INT) {
            case 23:
                return new y();
            case 24:
                return new z();
            case 25:
                return new b0();
            case 26:
                return new e0();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new f0();
                }
                break;
        }
        return new h0();
    }
}
