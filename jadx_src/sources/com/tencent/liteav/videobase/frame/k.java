package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h<b> {

    public static final class a extends PixelFrame {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g<a> f100392b = l.a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f100393a;

        private a(b bVar, Object obj) {
            super(f100392b);
            bVar.retain();
            this.mWidth = bVar.f100396c;
            this.mHeight = bVar.f100397d;
            this.f100393a = bVar;
            this.mTextureId = bVar.f100394a;
            this.mGLContext = obj;
            int i10 = bVar.f100395b;
            if (i10 == 3553) {
                this.mPixelBufferType = GLConstants.a.TEXTURE_2D;
            } else if (i10 == 36197) {
                this.mPixelBufferType = GLConstants.a.TEXTURE_OES;
            }
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
        }

        /* synthetic */ a(b bVar, Object obj, byte b10) {
            this(bVar, obj);
        }

        @Override // com.tencent.liteav.videobase.frame.PixelFrame
        public final void setTextureId(int i10) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f100394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f100397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private FrameMetaData f100398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ProducerChainTimestamp f100399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ConsumerChainTimestamp f100400g;

        public b(g<? extends d> gVar) {
            super(gVar);
            this.f100394a = -1;
            this.f100395b = bb.c.e.F;
            this.f100396c = 0;
            this.f100397d = 0;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int a() {
            return this.f100394a;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final PixelFrame a(Object obj) {
            a aVar = new a(this, obj, (byte) 0);
            aVar.retain();
            return aVar;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int b() {
            return this.f100396c;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int c() {
            return this.f100397d;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final FrameMetaData d() {
            return this.f100398e;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final void e() {
            this.f100394a = -1;
            this.f100395b = bb.c.e.F;
            this.f100396c = 0;
            this.f100397d = 0;
            this.f100398e = null;
            this.f100400g = null;
            this.f100399f = null;
        }
    }

    @Override // com.tencent.liteav.videobase.frame.h
    protected final /* synthetic */ j a(g gVar) {
        return new b(gVar);
    }
}
