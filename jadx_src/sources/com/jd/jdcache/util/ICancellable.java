package com.jd.jdcache.util;

import androidx.annotation.Keep;
import dl.e;

/* JADX INFO: compiled from: ICancellable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface ICancellable {

    /* JADX INFO: compiled from: ICancellable.kt */
    public static final class a {
        public static /* synthetic */ void a(ICancellable iCancellable, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            iCancellable.cancel(str);
        }
    }

    void cancel(@e String str);
}
