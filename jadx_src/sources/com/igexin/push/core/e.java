package com.igexin.push.core;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final class e implements FilenameFilter {
    e() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith("tdata");
    }
}
