package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* JADX INFO: compiled from: ExtLogNode.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HMSExtLogger f60433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f60434b;

    public a(HMSExtLogger hMSExtLogger) {
        this.f60433a = hMSExtLogger;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(Context context, String str) {
        d dVar = this.f60434b;
        if (dVar != null) {
            dVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.d
    public void a(d dVar) {
        this.f60434b = dVar;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(String str, int i10, String str2, String str3) {
        HMSExtLogger hMSExtLogger = this.f60433a;
        if (hMSExtLogger != null) {
            if (i10 == 3) {
                hMSExtLogger.d(str2, str3);
            } else if (i10 == 4) {
                hMSExtLogger.i(str2, str3);
            } else if (i10 != 5) {
                hMSExtLogger.e(str2, str3);
            } else {
                hMSExtLogger.w(str2, str3);
            }
        }
        d dVar = this.f60434b;
        if (dVar != null) {
            dVar.a(str, i10, str2, str3);
        }
    }
}
