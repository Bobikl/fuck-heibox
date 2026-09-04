package com.tencent.ugc.videobase.videobase;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToI420Filter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToI420NoDiv16Filter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToNV12Filter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToNV21Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FrameConverter {
    private static final String TAG = "FrameConverter";
    private GLTexturePool mGLTexturePool;
    private final Map<ConvertParams, a> mSameParamsConverts = new HashMap();

    public interface FrameConvertListener {
        void onFrameConverted(int i10, PixelFrame pixelFrame);
    }

    public void addListener(ConvertParams convertParams, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType, int i10, FrameConvertListener frameConvertListener) {
        a aVar2 = this.mSameParamsConverts.get(convertParams);
        if (aVar2 == null) {
            aVar2 = new a(convertParams);
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                aVar2.a(gLTexturePool);
            }
            this.mSameParamsConverts.put(convertParams, aVar2);
        }
        List<a.C1029a> arrayList = aVar2.f103914e.get(pixelFormatType);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            aVar2.f103914e.put(pixelFormatType, arrayList);
        }
        for (a.C1029a c1029a : arrayList) {
            if (c1029a.f103923b == i10 && c1029a.f103924c == frameConvertListener) {
                return;
            }
        }
        arrayList.add(new a.C1029a(aVar, i10, frameConvertListener));
    }

    public void initialize(GLTexturePool gLTexturePool) {
        this.mGLTexturePool = gLTexturePool;
        Iterator<a> it = this.mSameParamsConverts.values().iterator();
        while (it.hasNext()) {
            it.next().a(gLTexturePool);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x022c  */
    public void processFrame(long j10, GLTexture gLTexture) {
        PixelFrame pixelFrameWrap;
        l lVar;
        GLTexture gLTexture2;
        GLConstants.PixelFormatType[] pixelFormatTypeArr;
        TXCGPUImageFilter tXCGPUImageFilter;
        TXCGPUImageFilter tXCGPUImageRGBAToI420Filter;
        PixelFrame pixelFrame;
        PixelFrame pixelFrameObtain;
        int i10;
        if (this.mSameParamsConverts.size() <= 0) {
            LiteavLog.w(TAG, "process frame without SameParamsConverter.");
        }
        Iterator<a> it = this.mSameParamsConverts.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f103917h) {
                int width = next.f103913d.width;
                if (width == 0) {
                    width = gLTexture.getWidth();
                }
                int height = next.f103913d.height;
                if (height == 0) {
                    height = gLTexture.getHeight();
                }
                if (gLTexture.getWidth() == width && gLTexture.getHeight() == height) {
                    ConvertParams convertParams = next.f103913d;
                    if (convertParams.rotation != l.NORMAL || convertParams.mirror) {
                        if (next.f103916g == null) {
                            next.f103916g = new PixelFrameRenderer(width, height);
                        }
                        pixelFrameWrap = gLTexture.wrap(OpenGlUtils.getCurrentContext());
                        lVar = next.f103913d.rotation;
                        if (lVar != l.ROTATION_90) {
                            pixelFrameWrap.setWidth(gLTexture.getHeight());
                            pixelFrameWrap.setHeight(gLTexture.getWidth());
                        } else {
                            pixelFrameWrap.setWidth(gLTexture.getHeight());
                            pixelFrameWrap.setHeight(gLTexture.getWidth());
                        }
                        pixelFrameWrap.setRotation(next.f103913d.rotation);
                        pixelFrameWrap.setMirrorHorizontal(next.f103913d.mirror);
                        GLTexture gLTextureObtain = next.f103919j.obtain(width, height);
                        gLTextureObtain.setColorFormat(pixelFrameWrap.getColorRange(), pixelFrameWrap.getColorSpace());
                        gLTextureObtain.setMetaData(gLTexture.getMetaData());
                        next.f103916g.renderFrame(pixelFrameWrap, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
                        pixelFrameWrap.release();
                        gLTexture2 = gLTextureObtain;
                    } else {
                        gLTexture.retain();
                        gLTexture2 = gLTexture;
                    }
                } else {
                    if (next.f103916g == null) {
                        next.f103916g = new PixelFrameRenderer(width, height);
                    }
                    pixelFrameWrap = gLTexture.wrap(OpenGlUtils.getCurrentContext());
                    lVar = next.f103913d.rotation;
                    if (lVar != l.ROTATION_90 || lVar == l.ROTATION_270) {
                        pixelFrameWrap.setWidth(gLTexture.getHeight());
                        pixelFrameWrap.setHeight(gLTexture.getWidth());
                    } else {
                        pixelFrameWrap.setWidth(gLTexture.getWidth());
                        pixelFrameWrap.setHeight(gLTexture.getHeight());
                    }
                    pixelFrameWrap.setRotation(next.f103913d.rotation);
                    pixelFrameWrap.setMirrorHorizontal(next.f103913d.mirror);
                    GLTexture gLTextureObtain2 = next.f103919j.obtain(width, height);
                    gLTextureObtain2.setColorFormat(pixelFrameWrap.getColorRange(), pixelFrameWrap.getColorSpace());
                    gLTextureObtain2.setMetaData(gLTexture.getMetaData());
                    next.f103916g.renderFrame(pixelFrameWrap, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain2);
                    pixelFrameWrap.release();
                    gLTexture2 = gLTextureObtain2;
                }
                PixelFrame pixelFrameWrap2 = gLTexture2.wrap(OpenGlUtils.getCurrentContext());
                pixelFrameWrap2.setMetaData(gLTexture2.getMetaData());
                next.a(pixelFrameWrap2, j10);
                pixelFrameWrap2.release();
                PixelFrame pixelFrameA = next.a(j10, gLTexture2, GLConstants.PixelFormatType.RGBA);
                if (pixelFrameA != null) {
                    pixelFrameA.release();
                }
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    pixelFormatTypeArr = a.f103910a;
                    if (i12 >= pixelFormatTypeArr.length) {
                        break;
                    }
                    if (next.f103914e.containsKey(pixelFormatTypeArr[i12])) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
                if (i11 >= 0) {
                    int width2 = gLTexture2.getWidth();
                    int height2 = gLTexture2.getHeight();
                    GLConstants.ColorRange colorRange = gLTexture2.getColorRange();
                    GLConstants.ColorSpace colorSpace = gLTexture2.getColorSpace();
                    GLTexture gLTextureObtain3 = next.f103919j.obtain(width2, height2);
                    gLTextureObtain3.setColorFormat(colorRange, colorSpace);
                    GLConstants.PixelFormatType pixelFormatType = pixelFormatTypeArr[i11];
                    if (pixelFormatType != null) {
                        tXCGPUImageFilter = next.f103915f.get(pixelFormatType);
                        if (tXCGPUImageFilter == null) {
                            int i13 = a.AnonymousClass1.f103921a[pixelFormatType.ordinal()];
                            if (i13 == 1) {
                                tXCGPUImageRGBAToI420Filter = next.f103913d.height % 16 == 0 ? new TXCGPUImageRGBAToI420Filter() : new TXCGPUImageRGBAToI420NoDiv16Filter();
                            } else if (i13 == 2) {
                                tXCGPUImageRGBAToI420Filter = new TXCGPUImageRGBAToNV12Filter();
                            } else if (i13 != 3) {
                                tXCGPUImageFilter = null;
                            } else {
                                tXCGPUImageRGBAToI420Filter = new TXCGPUImageRGBAToNV21Filter();
                            }
                            tXCGPUImageFilter = tXCGPUImageRGBAToI420Filter;
                            tXCGPUImageFilter.initialize(null);
                            ConvertParams convertParams2 = next.f103913d;
                            tXCGPUImageFilter.onOutputSizeChanged(convertParams2.width, convertParams2.height);
                            next.f103915f.put(pixelFormatType, tXCGPUImageFilter);
                        }
                    } else {
                        tXCGPUImageFilter = null;
                    }
                    if (tXCGPUImageFilter != null) {
                        OpenGlUtils.glViewport(0, 0, width2, height2);
                        tXCGPUImageFilter.setColorFormat(colorRange, colorSpace);
                        tXCGPUImageFilter.onDraw(gLTexture2.getId(), gLTextureObtain3, next.f103911b, next.f103912c);
                        gLTextureObtain3.setMetaData(gLTexture2.getMetaData());
                        PixelFrame pixelFrameA2 = next.a(j10, gLTextureObtain3, pixelFormatTypeArr[i11]);
                        if (pixelFrameA2 != null) {
                            gLTextureObtain3.release();
                            Object buffer = pixelFrameA2.getPixelBufferType() == GLConstants.a.BYTE_BUFFER ? pixelFrameA2.getBuffer() : pixelFrameA2.getData();
                            int i14 = i11 + 1;
                            while (true) {
                                GLConstants.PixelFormatType[] pixelFormatTypeArr2 = a.f103910a;
                                if (i14 >= pixelFormatTypeArr2.length) {
                                    break;
                                }
                                GLConstants.PixelFormatType pixelFormatType2 = pixelFormatTypeArr2[i14];
                                GLConstants.a aVar = GLConstants.a.BYTE_BUFFER;
                                int iA = next.a(pixelFormatType2, aVar);
                                GLConstants.PixelFormatType pixelFormatType3 = pixelFormatTypeArr2[i14];
                                GLConstants.a aVar2 = GLConstants.a.BYTE_ARRAY;
                                int iA2 = next.a(pixelFormatType3, aVar2);
                                if (iA != 0) {
                                    pixelFrameObtain = next.f103918i.obtain(width2, height2, aVar, pixelFormatTypeArr2[i14]);
                                } else {
                                    if (iA2 != 0) {
                                        pixelFrameObtain = next.f103918i.obtain(width2, height2, aVar2, pixelFormatTypeArr2[i14]);
                                    } else {
                                        pixelFrame = null;
                                    }
                                    if (pixelFrame == null && pixelFrame.isFrameDataValid()) {
                                        pixelFrame.setColorFormat(colorRange, colorSpace);
                                        i10 = width2;
                                        OpenGlUtils.convertYuvFormat(pixelFrameA2.getPixelFormatType(), buffer, pixelFrame.getPixelFormatType(), pixelFrame.getBuffer(), i10, height2);
                                        pixelFrame.setMetaData(gLTexture2.getMetaData());
                                        next.a(pixelFrame, j10);
                                        PixelFrame pixelFrame2 = pixelFrame;
                                        next.a(j10, pixelFrame2, iA, iA2);
                                        pixelFrame2.release();
                                    } else {
                                        i10 = width2;
                                    }
                                    i14++;
                                    colorRange = colorRange;
                                    height2 = height2;
                                    width2 = i10;
                                    colorSpace = colorSpace;
                                }
                                pixelFrame = pixelFrameObtain;
                                if (pixelFrame == null) {
                                    i10 = width2;
                                } else {
                                    i10 = width2;
                                }
                                i14++;
                                colorRange = colorRange;
                                height2 = height2;
                                width2 = i10;
                                colorSpace = colorSpace;
                            }
                            pixelFrameA2.release();
                        }
                    }
                } else {
                    it = it;
                }
                gLTexture2.release();
            } else {
                it = it;
            }
            it = it;
        }
    }

    public void removeListener(int i10, FrameConvertListener frameConvertListener) {
        ArrayList<ConvertParams> arrayList = new ArrayList();
        for (Map.Entry<ConvertParams, a> entry : this.mSameParamsConverts.entrySet()) {
            entry.getValue().a(i10, frameConvertListener);
            if (!(!entry.getValue().f103914e.isEmpty())) {
                arrayList.add(entry.getKey());
            }
        }
        for (ConvertParams convertParams : arrayList) {
            a aVar = this.mSameParamsConverts.get(convertParams);
            if (aVar != null) {
                aVar.a();
            }
            this.mSameParamsConverts.remove(convertParams);
        }
    }

    public void uninitialize() {
        Iterator<a> it = this.mSameParamsConverts.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
