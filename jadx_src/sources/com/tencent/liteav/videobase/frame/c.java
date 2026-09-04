package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f100359a = -1;

    public final void a() {
        if (this.f100359a == -1) {
            this.f100359a = OpenGlUtils.generateFrameBufferId();
        }
    }

    public final void a(int i10) {
        int i11 = this.f100359a;
        if (i11 == -1) {
            LiteavLog.d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            OpenGlUtils.attachTextureToFrameBuffer(i10, i11);
        }
    }

    public final void b() {
        OpenGlUtils.bindFramebuffer(36160, this.f100359a);
    }

    public final void c() {
        int i10 = this.f100359a;
        if (i10 == -1) {
            LiteavLog.d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            OpenGlUtils.detachTextureFromFrameBuffer(i10);
        }
    }

    public final void d() {
        int i10 = this.f100359a;
        if (i10 != -1) {
            OpenGlUtils.deleteFrameBuffer(i10);
            this.f100359a = -1;
        }
    }
}
