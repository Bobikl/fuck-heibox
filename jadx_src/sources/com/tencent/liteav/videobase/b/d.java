package com.tencent.liteav.videobase.b;

import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.tencent.liteav.videobase.a.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100234h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f100235i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f100236j = -1;

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i10, com.tencent.liteav.videobase.frame.d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.a(this.f100236j, dVar, floatBuffer, floatBuffer2);
    }

    public final void a(Buffer buffer, int i10, int i11) {
        if (this.f100234h != i10 || this.f100235i != i11) {
            this.f100234h = i10;
            this.f100235i = i11;
            OpenGlUtils.deleteTexture(this.f100236j);
            this.f100236j = -1;
        }
        this.f100236j = OpenGlUtils.loadTexture(bb.c.f.OB, buffer, i10, i11, this.f100236j);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void c() {
        super.c();
        OpenGlUtils.deleteTexture(this.f100236j);
        this.f100236j = -1;
    }
}
