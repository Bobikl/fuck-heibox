package com.tencent.qimei.l;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static String a(String str) {
        return str.trim().replace(" ", "").replace("\t", "").replace("&", "").replace(":", "").replace(ContainerUtils.KEY_VALUE_DELIMITER, "").replace(";", "");
    }

    public static void a(String[] strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10] == null) {
                strArr[i10] = "";
            }
        }
    }
}
