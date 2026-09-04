package com.github.penfeizhou.animation.loader;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements d {
    @Override // com.github.penfeizhou.animation.loader.d
    public com.github.penfeizhou.animation.io.e a() throws IOException {
        return new com.github.penfeizhou.animation.io.a(b());
    }

    public abstract ByteBuffer b();
}
