package com.xiaomi.push;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes4.dex */
public class y implements FileFilter {
    y() {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
