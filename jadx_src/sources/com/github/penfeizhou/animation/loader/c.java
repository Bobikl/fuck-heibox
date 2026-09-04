package com.github.penfeizhou.animation.loader;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f43317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.github.penfeizhou.animation.io.e f43318b;

    public c(String str) {
        this.f43317a = new File(str);
    }

    @Override // com.github.penfeizhou.animation.loader.d
    public synchronized com.github.penfeizhou.animation.io.e a() throws IOException {
        return new com.github.penfeizhou.animation.io.c(this.f43317a);
    }
}
