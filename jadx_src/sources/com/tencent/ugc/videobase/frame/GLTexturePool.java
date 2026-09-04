package com.tencent.ugc.videobase.frame;

import android.opengl.EGL14;
import com.tencent.liteav.base.util.i;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class GLTexturePool extends FramePool<GLTexture> {
    private static final AtomicInteger sTextureCount = new AtomicInteger();

    public static class PooledGLTexture extends GLTexture {
        private static final String TAG = "GLTexture";
        private GLConstants.ColorRange mColorRange;
        private GLConstants.ColorSpace mColorSpace;
        private final int mHeight;
        private FrameMetaData mMetaData;
        private int mTextureId;
        private final int mWidth;

        private PooledGLTexture(IRecycler<GLTexture> iRecycler, int i10, int i11) {
            super(iRecycler);
            this.mTextureId = -1;
            this.mWidth = i10;
            this.mHeight = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initialize() {
            this.mTextureId = OpenGlUtils.createTexture(this.mWidth, this.mHeight, bb.c.f.OB, bb.c.f.OB);
            GLTexturePool.sTextureCount.incrementAndGet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void uninitialize() {
            i.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT);
            OpenGlUtils.deleteTexture(this.mTextureId);
            this.mTextureId = -1;
            GLTexturePool.sTextureCount.getAndDecrement();
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public GLConstants.ColorRange getColorRange() {
            return this.mColorRange;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public GLConstants.ColorSpace getColorSpace() {
            return this.mColorSpace;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public int getHeight() {
            return this.mHeight;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public int getId() {
            return this.mTextureId;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public FrameMetaData getMetaData() {
            return this.mMetaData;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public int getWidth() {
            return this.mWidth;
        }

        @Override // com.tencent.ugc.videobase.frame.RefCounted
        public void release() {
            super.release();
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void reset() {
            this.mMetaData = null;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
            this.mColorRange = colorRange;
            this.mColorSpace = colorSpace;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void setMetaData(FrameMetaData frameMetaData) {
            this.mMetaData = frameMetaData;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public PixelFrame wrap(Object obj) {
            TextureFrame textureFrame = new TextureFrame(this, obj);
            textureFrame.setColorFormat(this.mColorRange, this.mColorSpace);
            textureFrame.retain();
            return textureFrame;
        }
    }

    public static class TextureFrame extends PixelFrame {
        private static final IRecycler<TextureFrame> RECYCLER = b.a();
        private final GLTexture mTexture;

        private TextureFrame(GLTexture gLTexture, Object obj) {
            super(RECYCLER);
            gLTexture.retain();
            this.mWidth = gLTexture.getWidth();
            this.mHeight = gLTexture.getHeight();
            this.mTexture = gLTexture;
            this.mTextureId = gLTexture.getId();
            this.mGLContext = obj;
            this.mPixelBufferType = GLConstants.a.TEXTURE_2D;
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
            this.mMetaData = gLTexture.getMetaData();
            this.mColorRange = gLTexture.getColorRange();
            this.mColorSpace = gLTexture.getColorSpace();
        }

        public GLTexture getGLTexture() {
            return this.mTexture;
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public void setTextureId(int i10) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    public static final class a implements FramePool.Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f103887b;

        public a(int i10, int i11) {
            this.f103886a = i10;
            this.f103887b = i11;
        }

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final boolean equals(Object obj) {
            if (obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103886a == aVar.f103886a && this.f103887b == aVar.f103887b;
        }

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final int hashCode() {
            return (this.f103886a * 37213) + this.f103887b;
        }
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    protected GLTexture createInstance(IRecycler<GLTexture> iRecycler, FramePool.Key key) {
        a aVar = (a) key;
        PooledGLTexture pooledGLTexture = new PooledGLTexture(iRecycler, aVar.f103886a, aVar.f103887b);
        pooledGLTexture.initialize();
        return pooledGLTexture;
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    protected /* bridge */ /* synthetic */ RefCounted createInstance(IRecycler iRecycler, FramePool.Key key) {
        return createInstance((IRecycler<GLTexture>) iRecycler, key);
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void destroy() {
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void destroyInstance(GLTexture gLTexture) {
        ((PooledGLTexture) gLTexture).uninitialize();
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void evictAll() {
        super.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.ugc.videobase.frame.FramePool
    public FramePool.Key keyForObject(GLTexture gLTexture) {
        return new a(gLTexture.getWidth(), gLTexture.getHeight());
    }

    public GLTexture obtain(int i10, int i11) {
        GLTexture gLTexture = (GLTexture) super.obtain(new a(i10, i11));
        gLTexture.reset();
        return gLTexture;
    }
}
