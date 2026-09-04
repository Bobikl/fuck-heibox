package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public class TextureHolderPool extends LimitedFramePool<TextureHolder> {

    public static class TextureHolder extends GLTexture {
        private GLConstants.ColorRange mColorRange;
        private GLConstants.ColorSpace mColorSpace;
        private int mHeight;
        private FrameMetaData mMetaData;
        private int mTarget;
        private int mTextureId;
        private int mWidth;

        public TextureHolder(IRecycler<? extends GLTexture> iRecycler) {
            super(iRecycler);
            this.mTextureId = -1;
            this.mTarget = bb.c.e.F;
            this.mWidth = 0;
            this.mHeight = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTarget() {
            return this.mTarget;
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

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void reset() {
            this.mTextureId = -1;
            this.mTarget = bb.c.e.F;
            this.mWidth = 0;
            this.mHeight = 0;
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

        public void updateTexture(int i10, int i11, int i12, int i13) {
            this.mTarget = i10;
            this.mTextureId = i11;
            this.mWidth = i12;
            this.mHeight = i13;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public PixelFrame wrap(Object obj) {
            a aVar = new a(this, obj, (byte) 0);
            aVar.setColorFormat(this.mColorRange, this.mColorSpace);
            aVar.retain();
            return aVar;
        }
    }

    public static final class a extends PixelFrame {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final IRecycler<a> f103894b = c.a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextureHolder f103895a;

        private a(TextureHolder textureHolder, Object obj) {
            super(f103894b);
            textureHolder.retain();
            this.mWidth = textureHolder.getWidth();
            this.mHeight = textureHolder.getHeight();
            this.f103895a = textureHolder;
            this.mTextureId = textureHolder.getId();
            this.mColorRange = textureHolder.mColorRange;
            this.mColorSpace = textureHolder.mColorSpace;
            this.mGLContext = obj;
            if (textureHolder.getTarget() == 3553) {
                this.mPixelBufferType = GLConstants.a.TEXTURE_2D;
            } else if (textureHolder.getTarget() == 36197) {
                this.mPixelBufferType = GLConstants.a.TEXTURE_OES;
            }
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
        }

        /* synthetic */ a(TextureHolder textureHolder, Object obj, byte b10) {
            this(textureHolder, obj);
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setTextureId(int i10) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    public TextureHolderPool(int i10) {
        super(i10);
    }

    @Override // com.tencent.ugc.videobase.frame.LimitedFramePool
    protected /* bridge */ /* synthetic */ RefCounted createInstance(IRecycler iRecycler) {
        return createInstance((IRecycler<TextureHolder>) iRecycler);
    }

    @Override // com.tencent.ugc.videobase.frame.LimitedFramePool
    protected TextureHolder createInstance(IRecycler<TextureHolder> iRecycler) {
        return new TextureHolder(iRecycler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.ugc.videobase.frame.LimitedFramePool
    public void destroyInstance(TextureHolder textureHolder) {
    }
}
