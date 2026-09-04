package com.tencent.qmsp.sdk.f;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class k {
    public static int a(String str, String str2) {
        try {
            return j.a(str, new File(str2));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return -1;
        }
    }
}
