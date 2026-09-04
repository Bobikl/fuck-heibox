package com.tencent.ugc.videobase.videobase;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFramePool;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.utils.YUVReadTools;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final GLConstants.PixelFormatType[] f103910a = {GLConstants.PixelFormatType.I420, GLConstants.PixelFormatType.NV21, GLConstants.PixelFormatType.NV12};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ConvertParams f103913d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    PixelFrameRenderer f103916g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    PixelFramePool f103918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    GLTexturePool f103919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f103920k = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f103917h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FloatBuffer f103911b = OpenGlUtils.createNormalCubeVerticesBuffer();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final FloatBuffer f103912c = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<GLConstants.PixelFormatType, List<C1029a>> f103914e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<GLConstants.PixelFormatType, TXCGPUImageFilter> f103915f = new HashMap();

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.videobase.a$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103921a;

        static {
            int[] iArr = new int[GLConstants.PixelFormatType.values().length];
            f103921a = iArr;
            try {
                iArr[GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103921a[GLConstants.PixelFormatType.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103921a[GLConstants.PixelFormatType.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.videobase.a$a, reason: collision with other inner class name */
    public static final class C1029a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GLConstants.a f103922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FrameConverter.FrameConvertListener f103924c;

        public C1029a(GLConstants.a aVar, int i10, FrameConverter.FrameConvertListener frameConvertListener) {
            this.f103922a = aVar;
            this.f103923b = i10;
            this.f103924c = frameConvertListener;
        }
    }

    public a(ConvertParams convertParams) {
        this.f103913d = convertParams;
    }

    private void a(GLConstants.PixelFormatType pixelFormatType, GLTexture gLTexture, Object obj) {
        ConvertParams convertParams = this.f103913d;
        int i10 = convertParams.width;
        int i11 = convertParams.height;
        if (this.f103920k == -1) {
            this.f103920k = OpenGlUtils.generateFrameBufferId();
        }
        OpenGlUtils.attachTextureToFrameBuffer(gLTexture.getId(), this.f103920k);
        GLES20.glBindFramebuffer(36160, this.f103920k);
        if (pixelFormatType == GLConstants.PixelFormatType.RGBA) {
            OpenGlUtils.readPixels(0, 0, i10, i11, obj);
            OpenGlUtils.detachTextureFromFrameBuffer(this.f103920k);
            return;
        }
        if (i11 % 16 == 0) {
            OpenGlUtils.readPixels(0, 0, i10, (i11 * 3) / 8, obj);
        } else if (obj instanceof ByteBuffer) {
            YUVReadTools.nativeReadYUVPlanesForByteBuffer(i10, i11, (ByteBuffer) obj);
        } else {
            YUVReadTools.nativeReadYUVPlanesForByteArray(i10, i11, (byte[]) obj);
        }
        OpenGlUtils.detachTextureFromFrameBuffer(this.f103920k);
    }

    final int a(GLConstants.PixelFormatType pixelFormatType, GLConstants.a aVar) {
        List<C1029a> list = this.f103914e.get(pixelFormatType);
        int i10 = 0;
        if (list != null) {
            Iterator<C1029a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f103922a == aVar) {
                    i10++;
                }
            }
        }
        return i10;
    }

    final PixelFrame a(long j10, GLTexture gLTexture, GLConstants.PixelFormatType pixelFormatType) {
        GLConstants.a aVar = GLConstants.a.BYTE_BUFFER;
        int iA = a(pixelFormatType, aVar);
        GLConstants.a aVar2 = GLConstants.a.BYTE_ARRAY;
        int iA2 = a(pixelFormatType, aVar2);
        if (iA == 0 && iA2 == 0) {
            return null;
        }
        boolean z10 = iA != 0;
        PixelFramePool pixelFramePool = this.f103918i;
        int width = gLTexture.getWidth();
        int height = gLTexture.getHeight();
        if (!z10) {
            aVar = aVar2;
        }
        PixelFrame pixelFrameObtain = pixelFramePool.obtain(width, height, aVar, pixelFormatType);
        pixelFrameObtain.setColorFormat(gLTexture.getColorRange(), gLTexture.getColorSpace());
        if (!pixelFrameObtain.isFrameDataValid()) {
            pixelFrameObtain.release();
            return null;
        }
        a(pixelFormatType, gLTexture, z10 ? pixelFrameObtain.getBuffer() : pixelFrameObtain.getData());
        pixelFrameObtain.setMetaData(gLTexture.getMetaData());
        a(pixelFrameObtain, j10);
        a(j10, pixelFrameObtain, iA, iA2);
        return pixelFrameObtain;
    }

    public final void a() {
        Iterator<TXCGPUImageFilter> it = this.f103915f.values().iterator();
        while (it.hasNext()) {
            it.next().uninitialize();
        }
        this.f103915f.clear();
        PixelFrameRenderer pixelFrameRenderer = this.f103916g;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.f103916g = null;
        }
        PixelFramePool pixelFramePool = this.f103918i;
        if (pixelFramePool != null) {
            pixelFramePool.destroy();
            this.f103918i = null;
        }
        OpenGlUtils.deleteFrameBuffer(this.f103920k);
        this.f103920k = -1;
        this.f103917h = false;
    }

    public final void a(int i10, FrameConverter.FrameConvertListener frameConvertListener) {
        for (Map.Entry<GLConstants.PixelFormatType, List<C1029a>> entry : this.f103914e.entrySet()) {
            for (C1029a c1029a : entry.getValue()) {
                if (c1029a.f103923b == i10 && c1029a.f103924c == frameConvertListener) {
                    entry.getValue().remove(c1029a);
                    break;
                }
            }
            if (entry.getValue().isEmpty()) {
                this.f103914e.remove(entry.getKey());
                return;
            }
        }
    }

    final void a(long j10, PixelFrame pixelFrame, int i10, int i11) {
        GLConstants.a pixelBufferType = pixelFrame.getPixelBufferType();
        GLConstants.a aVar = GLConstants.a.BYTE_BUFFER;
        boolean z10 = pixelBufferType == aVar && i11 != 0;
        GLConstants.a pixelBufferType2 = pixelFrame.getPixelBufferType();
        GLConstants.a aVar2 = GLConstants.a.BYTE_ARRAY;
        boolean z11 = pixelBufferType2 == aVar2 && i10 != 0;
        if (z10 || z11) {
            PixelFramePool pixelFramePool = this.f103918i;
            int width = pixelFrame.getWidth();
            int height = pixelFrame.getHeight();
            if (z10) {
                aVar = aVar2;
            }
            PixelFrame pixelFrameObtain = pixelFramePool.obtain(width, height, aVar, pixelFrame.getPixelFormatType());
            pixelFrameObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
            if (!pixelFrameObtain.isFrameDataValid()) {
                pixelFrameObtain.release();
                return;
            }
            if (z10) {
                OpenGlUtils.nativeCopyDataFromByteBufferToByteArray(pixelFrame.getBuffer(), pixelFrameObtain.getData(), pixelFrameObtain.getData().length);
            } else {
                OpenGlUtils.nativeCopyDataFromByteArrayToByteBuffer(pixelFrame.getData(), pixelFrameObtain.getBuffer(), pixelFrame.getData().length);
            }
            a(pixelFrameObtain, j10);
            pixelFrameObtain.release();
        }
    }

    public final void a(GLTexturePool gLTexturePool) {
        if (!this.f103917h && gLTexturePool != null) {
            this.f103917h = true;
            this.f103918i = new PixelFramePool();
            this.f103919j = gLTexturePool;
        } else {
            LiteavLog.i("SameParamsConverter", "SameParamsConverter mIsInitialized " + this.f103917h + " , texturePool " + gLTexturePool);
        }
    }

    final void a(PixelFrame pixelFrame, long j10) {
        List<C1029a> list = this.f103914e.get(pixelFrame.getPixelFormatType());
        if (list == null || list.isEmpty()) {
            return;
        }
        pixelFrame.setTimestamp(j10);
        for (C1029a c1029a : new ArrayList(list)) {
            if (c1029a.f103922a == pixelFrame.getPixelBufferType()) {
                c1029a.f103924c.onFrameConverted(c1029a.f103923b, pixelFrame);
            }
        }
    }
}
