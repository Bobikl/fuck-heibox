package com.igexin.push.util;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f64043a;

    e(String str) {
        this.f64043a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.f64043a);
    }
}
