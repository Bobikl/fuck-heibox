package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(@l9.a int i10) {
        super(new Status(i10, String.format("Split Install Error(%d): %s", Integer.valueOf(i10), l9.c.b(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @l9.a
    public int d() {
        return super.b();
    }
}
