package com.xiaomi.push;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes4.dex */
public class cc implements FilenameFilter {
    cc() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return (TextUtils.isEmpty(str) || str.toLowerCase().endsWith(".lock")) ? false : true;
    }
}
