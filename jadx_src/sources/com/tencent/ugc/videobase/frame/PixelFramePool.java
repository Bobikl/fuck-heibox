package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class PixelFramePool extends FramePool<PixelFrame> {

    public static final class a implements FramePool.Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f103890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final GLConstants.a f103891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final GLConstants.PixelFormatType f103892d;

        public a(int i10, int i11, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
            this.f103889a = i10;
            this.f103890b = i11;
            this.f103891c = aVar;
            this.f103892d = pixelFormatType;
        }

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final boolean equals(Object obj) {
            if (a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103889a == aVar.f103889a && this.f103890b == aVar.f103890b && this.f103891c == aVar.f103891c && this.f103892d == aVar.f103892d;
        }

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final int hashCode() {
            return (((((this.f103889a * 10001) + this.f103890b) << 2) + this.f103891c.ordinal()) << 2) + this.f103892d.ordinal();
        }
    }

    public static final class b extends PixelFrame {
        private b(IRecycler<PixelFrame> iRecycler, int i10, int i11, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
            super(iRecycler, i10, i11, aVar, pixelFormatType);
        }

        /* synthetic */ b(IRecycler iRecycler, int i10, int i11, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType, byte b10) {
            this(iRecycler, i10, i11, aVar, pixelFormatType);
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setBuffer(ByteBuffer byteBuffer) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setData(byte[] bArr) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Data");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setHeight(int i10) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its height");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setPixelBufferType(GLConstants.a aVar) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its buffer type");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its format type");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setWidth(int i10) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its width");
        }
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    protected PixelFrame createInstance(IRecycler<PixelFrame> iRecycler, FramePool.Key key) {
        a aVar = (a) key;
        return new b(iRecycler, aVar.f103889a, aVar.f103890b, aVar.f103891c, aVar.f103892d, (byte) 0);
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    protected /* bridge */ /* synthetic */ RefCounted createInstance(IRecycler iRecycler, FramePool.Key key) {
        return createInstance((IRecycler<PixelFrame>) iRecycler, key);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void destroyInstance(PixelFrame pixelFrame) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.ugc.videobase.frame.FramePool
    public FramePool.Key keyForObject(PixelFrame pixelFrame) {
        return new a(pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getPixelBufferType(), pixelFrame.getPixelFormatType());
    }

    public PixelFrame obtain(int i10, int i11, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
        PixelFrame pixelFrame = (PixelFrame) super.obtain(new a(i10, i11, aVar, pixelFormatType));
        pixelFrame.reset();
        return pixelFrame;
    }
}
