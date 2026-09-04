package com.igexin.push.extension.distribution.basic.c;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes6.dex */
public class d implements FileFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f63958a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f63959b = 604800000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f63960c;

    d(c cVar) {
        this.f63960c = cVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return this.f63958a - file.lastModified() >= this.f63959b;
    }
}
