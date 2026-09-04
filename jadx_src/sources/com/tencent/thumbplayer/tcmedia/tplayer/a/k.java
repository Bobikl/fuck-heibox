package com.tencent.thumbplayer.tcmedia.tplayer.a;

import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class k {
    public static a a(int i10) {
        if (i10 == 0) {
            return new n();
        }
        if (i10 == 1) {
            return new e();
        }
        if (i10 == 2) {
            return new f();
        }
        TPLogUtil.e("TPReporterFactory", "Type is not match ReporterType, return null");
        return null;
    }
}
