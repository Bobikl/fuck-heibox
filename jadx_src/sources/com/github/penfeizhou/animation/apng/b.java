package com.github.penfeizhou.animation.apng;

import android.content.Context;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;

/* JADX INFO: compiled from: APNGDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends com.github.penfeizhou.animation.a<com.github.penfeizhou.animation.apng.decode.b> {
    public b(com.github.penfeizhou.animation.apng.decode.b bVar) {
        super(bVar);
    }

    public b(com.github.penfeizhou.animation.loader.d dVar) {
        super(dVar);
    }

    public static b p(Context context, String str) {
        return new b(new com.github.penfeizhou.animation.loader.a(context, str));
    }

    public static b q(String str) {
        return new b(new com.github.penfeizhou.animation.loader.c(str));
    }

    public static b r(Context context, int i10) {
        return new b(new com.github.penfeizhou.animation.loader.e(context, i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.apng.decode.b f(com.github.penfeizhou.animation.loader.d dVar, FrameSeqDecoder.i iVar) {
        return new com.github.penfeizhou.animation.apng.decode.b(dVar, iVar);
    }
}
