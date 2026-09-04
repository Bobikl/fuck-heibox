package com.bumptech.glide.load.data.mediastore;

import java.io.File;

/* JADX INFO: compiled from: FileService.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
