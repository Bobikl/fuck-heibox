package com.tencent.qmsp.sdk.f;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static void a(String str, boolean z10) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                a(file2.getAbsolutePath(), z10);
            }
            if (z10) {
                return;
            }
            file.delete();
        }
    }
}
