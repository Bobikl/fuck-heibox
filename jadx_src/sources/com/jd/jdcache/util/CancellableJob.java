package com.jd.jdcache.util;

import androidx.annotation.Keep;
import dl.e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: CancellableJob.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class CancellableJob implements ICancellable {

    @e
    private final d2 job;

    public CancellableJob(@e d2 d2Var) {
        this.job = d2Var;
    }

    @Override // com.jd.jdcache.util.ICancellable
    public void cancel(@e String str) {
        String str2;
        d2 d2Var = this.job;
        boolean z10 = true;
        if ((d2Var == null || d2Var.x()) ? false : true) {
            if (str != null && str.length() != 0) {
                z10 = false;
            }
            if (z10) {
                str2 = "";
            } else {
                str2 = " Msg: " + str;
            }
            this.job.e(new CancellationException("Job canceled manually." + str2));
        }
    }
}
