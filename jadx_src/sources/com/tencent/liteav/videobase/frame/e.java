package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.tencent.liteav.videobase.frame.a<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f100360a = new AtomicInteger();

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f100361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f100362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f100363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private FrameMetaData f100364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ProducerChainTimestamp f100365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ConsumerChainTimestamp f100366f;

        private a(g<d> gVar, int i10, int i11) {
            super(gVar);
            this.f100361a = -1;
            this.f100362b = i10;
            this.f100363c = i11;
        }

        /* synthetic */ a(g gVar, int i10, int i11, byte b10) {
            this(gVar, i10, i11);
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int a() {
            return this.f100361a;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final PixelFrame a(Object obj) {
            b bVar = new b(this, obj, (byte) 0);
            bVar.retain();
            return bVar;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int b() {
            return this.f100362b;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int c() {
            return this.f100363c;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final FrameMetaData d() {
            return this.f100364d;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final void e() {
            this.f100364d = null;
            this.f100365e = null;
            this.f100366f = null;
        }

        @Override // com.tencent.liteav.videobase.frame.j
        public final void release() {
            super.release();
        }
    }

    public static final class b extends PixelFrame {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g<b> f100367b = f.a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f100368a;

        private b(d dVar, Object obj) {
            super(f100367b);
            dVar.retain();
            this.mWidth = dVar.b();
            this.mHeight = dVar.c();
            this.f100368a = dVar;
            this.mTextureId = dVar.a();
            this.mGLContext = obj;
            this.mPixelBufferType = GLConstants.a.TEXTURE_2D;
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
            this.mMetaData = dVar.d();
        }

        /* synthetic */ b(d dVar, Object obj, byte b10) {
            this(dVar, obj);
        }

        @Override // com.tencent.liteav.videobase.frame.PixelFrame
        public final void setTextureId(int i10) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    public static final class c implements com.tencent.liteav.videobase.frame.a.InterfaceC0965a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f100369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f100370b;

        public c(int i10, int i11) {
            this.f100369a = i10;
            this.f100370b = i11;
        }

        public final boolean equals(Object obj) {
            if (obj.getClass() != c.class) {
                return false;
            }
            c cVar = (c) obj;
            return this.f100369a == cVar.f100369a && this.f100370b == cVar.f100370b;
        }

        public final int hashCode() {
            return (this.f100369a * 37213) + this.f100370b;
        }
    }

    public final d a(int i10, int i11) {
        d dVar = (d) super.a(new c(i10, i11));
        dVar.e();
        return dVar;
    }

    @Override // com.tencent.liteav.videobase.frame.a
    protected final /* synthetic */ j a(g gVar, com.tencent.liteav.videobase.frame.a.InterfaceC0965a interfaceC0965a) {
        c cVar = (c) interfaceC0965a;
        a aVar = new a(gVar, cVar.f100369a, cVar.f100370b, (byte) 0);
        aVar.f100361a = OpenGlUtils.createTexture(aVar.f100362b, aVar.f100363c, bb.c.f.OB, bb.c.f.OB);
        f100360a.incrementAndGet();
        return aVar;
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final void a() {
        super.a();
    }

    @Override // com.tencent.liteav.videobase.frame.a
    protected final /* synthetic */ void a(j jVar) {
        a aVar = (a) ((d) jVar);
        OpenGlUtils.deleteTexture(aVar.f100361a);
        aVar.f100361a = -1;
        f100360a.getAndDecrement();
    }

    @Override // com.tencent.liteav.videobase.frame.a
    protected final /* synthetic */ com.tencent.liteav.videobase.frame.a.InterfaceC0965a b(j jVar) {
        d dVar = (d) jVar;
        return new c(dVar.b(), dVar.c());
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final void b() {
        super.b();
    }
}
