package com.tencent.qimei.q;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: compiled from: ReportRequestApi.java */
/* JADX INFO: loaded from: classes4.dex */
public enum g {
    REPORT_TYPE("type"),
    REPORT_DATA("params"),
    REPORT_DATA_Q16("q16"),
    REPORT_DATA_Q36("q36"),
    REPORT_DATA_IP("ip"),
    REPORT_PLATFORM_ID(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY),
    REPORT_ANDROID_ID("androidId"),
    REPORT_DATA_NET_TYPE("networkType"),
    REPORT_APPKEY("appKey"),
    REPORT_SDKVERSION("sdkVersion"),
    REPORT_QIMEI_USED_TIME("p1"),
    REPORT_QIMEI_LOCAL_USED_TIME("p2"),
    REPORT_OAID_USED_TIME("p3"),
    REPORT_QIMEI_ERROR_CODE("p1"),
    REPORT_QIMEI_ERROR_DESC("p2"),
    REPORT_QIMEI_CHANGE_OLD_Q16("p1"),
    REPORT_QIMEI_CHANGE_OLD_Q36("p2"),
    REPORT_QIMEI_CHANGE_NEW_Q16("p3"),
    REPORT_QIMEI_CHANGE_NEW_Q36("p4"),
    REPORT_QIMEI_FROM_BEACON("p5"),
    REPORT_CLONE_CACHE_Q16("p1"),
    REPORT_CLONE_CACHE_Q36("p2"),
    REPORT_CLONE_DETECT_TYPE("p3"),
    REPORT_JS_H5ID("hid"),
    REPORT_JS_UA("userAgent"),
    REPORT_JS_BROWSER_TYPE("browser"),
    REPORT_JS_VERSION("version");

    public String C;

    g(String str) {
        this.C = str;
    }

    public String a() {
        return this.C;
    }
}
