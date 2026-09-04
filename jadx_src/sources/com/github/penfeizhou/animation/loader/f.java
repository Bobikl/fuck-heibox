package com.github.penfeizhou.animation.loader;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements d {
    @Override // com.github.penfeizhou.animation.loader.d
    public final synchronized com.github.penfeizhou.animation.io.e a() throws IOException {
        return new com.github.penfeizhou.animation.io.f(b());
    }

    protected abstract InputStream b() throws IOException;
}
