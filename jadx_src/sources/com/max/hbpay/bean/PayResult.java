package com.max.hbpay.bean;

import android.text.TextUtils;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;
import z5.g;
import z5.j;

/* JADX INFO: loaded from: classes11.dex */
public class PayResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String memo;
    private String result;
    private String resultStatus;

    public PayResult(Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, j.f141892a)) {
                this.resultStatus = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.result = map.get(str);
            } else if (TextUtils.equals(str, j.f141893b)) {
                this.memo = map.get(str);
            }
        }
    }

    public String getMemo() {
        return this.memo;
    }

    public String getResult() {
        return this.result;
    }

    public String getResultStatus() {
        return this.resultStatus;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.i.f33368p3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "resultStatus={" + this.resultStatus + "};memo={" + this.memo + "};result={" + this.result + g.f141884d;
    }
}
