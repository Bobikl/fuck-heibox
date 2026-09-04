package com.bumptech.glide.load.resource.gif;

import androidx.annotation.n0;
import com.bumptech.glide.load.engine.o;

/* JADX INFO: compiled from: GifDrawableResource.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends com.bumptech.glide.load.resource.drawable.d<c> implements o {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return ((c) this.f41649b).l();
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<c> b() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.resource.drawable.d, com.bumptech.glide.load.engine.o
    public void initialize() {
        ((c) this.f41649b).g().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
        ((c) this.f41649b).stop();
        ((c) this.f41649b).o();
    }
}
