package com.tencent.qmsp.sdk.f;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static String a(String str) {
        return str.trim().replace(" ", "").replace("\t", "").replace("&", "").replace(":", "").replace(ContainerUtils.KEY_VALUE_DELIMITER, "").replace(";", "");
    }
}
