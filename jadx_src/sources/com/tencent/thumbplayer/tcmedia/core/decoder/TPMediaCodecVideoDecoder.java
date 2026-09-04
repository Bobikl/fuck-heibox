package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.google.android.gms.common.m;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.g.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class TPMediaCodecVideoDecoder extends TPBaseMediaCodecDecoder {
    private static final String DEVICE_NAME_VIVO_X5L = "vivo X5L";
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int PIXEL_STRIDE_CONTINUOUS = 1;
    private static final String TAG = "TPMediaCodecVideoDecode";
    private static final int YUV420P_PLANAR_COUNT = 3;
    private int mCropBottom;
    private int mCropLeft;
    private int mCropRight;
    private int mCropTop;
    private byte[] mCsd0Data;
    private byte[] mCsd1Data;
    private byte[] mCsd2Data;
    private boolean mDisableDolbyVisionComponent;
    private int mDolbyVisionLevel;
    private int mDolbyVisionProfile;
    private boolean mEnableMediaCodecOutputData;
    private ArrayList<String> mMimeCandidates;
    private int mRotation;
    private int mVideoHeight;
    private int mVideoWidth;

    public TPMediaCodecVideoDecoder(int i10) {
        super(i10);
        this.mEnableMediaCodecOutputData = false;
        this.mMimeCandidates = new ArrayList<>();
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mCropLeft = 0;
        this.mCropRight = 0;
        this.mCropTop = 0;
        this.mCropBottom = 0;
        this.mRotation = 0;
        this.mDolbyVisionProfile = 0;
        this.mDolbyVisionLevel = 0;
        this.mCsd0Data = null;
        this.mCsd1Data = null;
        this.mCsd2Data = null;
        this.mDisableDolbyVisionComponent = false;
    }

    private void copyVideoDataFromImage(Image image, TPFrameInfo tPFrameInfo) {
        if (image.getFormat() != 35) {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            TPNativeLog.printLog(4, TAG, "copyVideoDataFromImage: image format not support!");
            return;
        }
        tPFrameInfo.format = 0;
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        int[] iArr = tPFrameInfo.lineSize;
        if (iArr == null || iArr.length < 3) {
            tPFrameInfo.lineSize = new int[3];
        }
        byte[][] bArr = tPFrameInfo.videoData;
        if (bArr == null || bArr.length < 3) {
            tPFrameInfo.videoData = new byte[3][];
        }
        int i10 = 0;
        while (i10 < 3) {
            int i11 = i10 == 0 ? 0 : 1;
            copyVideoDataFromPlane(planes[i10], width >> i11, height >> i11, i10, tPFrameInfo);
            i10++;
        }
    }

    private void copyVideoDataFromPlane(Image.Plane plane, int i10, int i11, int i12, TPFrameInfo tPFrameInfo) {
        ByteBuffer buffer = plane.getBuffer();
        tPFrameInfo.lineSize[i12] = i10;
        int i13 = i10 * i11;
        byte[][] bArr = tPFrameInfo.videoData;
        byte[] bArr2 = bArr[i12];
        if (bArr2 == null || bArr2.length < i13) {
            bArr[i12] = new byte[i13];
        }
        if (plane.getPixelStride() == 1) {
            buffer.get(tPFrameInfo.videoData[i12], 0, i13);
            return;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            tPFrameInfo.videoData[i12][i14] = buffer.get(plane.getPixelStride() * i14);
        }
    }

    private void processOutputData(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 2;
            bVar.a(i10, false);
            return;
        }
        Image imageB = bVar.b(i10);
        if (imageB != null) {
            copyVideoDataFromImage(imageB, tPFrameInfo);
            bVar.a(i10, false);
        } else {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            bVar.a(i10, false);
            TPNativeLog.printLog(4, TAG, "processOutputBuffer: getOutputImage return null");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void configCodec(b bVar, String str) {
        Surface surface;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, this.mVideoWidth, this.mVideoHeight);
        mediaFormatCreateVideoFormat.setInteger("rotation-degrees", this.mRotation);
        if (TPSystemInfo.getDeviceName().equalsIgnoreCase(DEVICE_NAME_VIVO_X5L)) {
            mediaFormatCreateVideoFormat.setInteger("max-input-size", this.mVideoWidth * this.mVideoHeight);
        }
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            mediaFormatCreateVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
        }
        byte[] bArr2 = this.mCsd1Data;
        if (bArr2 != null) {
            mediaFormatCreateVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
        }
        byte[] bArr3 = this.mCsd2Data;
        if (bArr3 != null) {
            mediaFormatCreateVideoFormat.setByteBuffer("csd-2", ByteBuffer.wrap(bArr3));
        }
        if ("video/dolby-vision".equals(str)) {
            mediaFormatCreateVideoFormat.setInteger(m.f52595a, TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile));
            mediaFormatCreateVideoFormat.setInteger("level", TPCodecUtils.convertDolbyVisionToOmxLevel(this.mDolbyVisionLevel));
        }
        if (this.mEnableMediaCodecOutputData) {
            mediaFormatCreateVideoFormat.setInteger("color-format", 2135033992);
            surface = null;
        } else {
            surface = this.mSurface;
        }
        bVar.a(mediaFormatCreateVideoFormat, surface, this.mMediaCrypto, 0);
        bVar.d(1);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    String getCodecName(String str, boolean z10) {
        String dolbyVisionDecoderName;
        int i10 = this.mDolbyVisionProfile;
        return (i10 <= 0 || this.mDisableDolbyVisionComponent || (dolbyVisionDecoderName = TPCodecUtils.getDolbyVisionDecoderName(str, i10, this.mDolbyVisionLevel, z10)) == null) ? TPCodecUtils.getDecoderName(str, z10) : dolbyVisionDecoderName;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    String getLogTag() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public ArrayList<String> getMimeCandidates() {
        return this.mMimeCandidates;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i10, int i11, int i12, int i13) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i10, int i11, int i12, Surface surface, int i13, int i14, int i15) {
        TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " width:" + i10 + " height:" + i11 + " rotation:" + i12 + " dvProfile:" + i14 + " dvLevel:" + i15);
        this.mVideoWidth = i10;
        this.mVideoHeight = i11;
        this.mRotation = i12;
        this.mSurface = surface;
        this.mDrmType = i13;
        this.mDolbyVisionProfile = i14;
        this.mDolbyVisionLevel = i15;
        this.mMimeCandidates.clear();
        if ("video/dolby-vision".equals(str)) {
            int iConvertDolbyVisionToOmxProfile = TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile);
            boolean z10 = false;
            if (iConvertDolbyVisionToOmxProfile >= 4 && iConvertDolbyVisionToOmxProfile <= 256) {
                z10 = true;
            }
            if (this.mDisableDolbyVisionComponent && z10) {
                this.mMimeCandidates.add("video/hevc");
            } else {
                this.mMimeCandidates.add(str);
                if (z10) {
                    this.mMimeCandidates.add("video/hevc");
                }
            }
        } else {
            this.mMimeCandidates.add(str);
        }
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processMediaCodecException(Exception exc) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processOutputBuffer(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.width = this.mVideoWidth;
        tPFrameInfo.height = this.mVideoHeight;
        tPFrameInfo.cropLeft = this.mCropLeft;
        tPFrameInfo.cropRight = this.mCropRight;
        tPFrameInfo.cropTop = this.mCropTop;
        tPFrameInfo.cropBottom = this.mCropBottom;
        tPFrameInfo.format = 167;
        if (this.mEnableMediaCodecOutputData) {
            processOutputData(bVar, i10, bufferInfo, tPFrameInfo);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processOutputConfigData(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.errCode = 0;
        processOutputBuffer(bVar, i10, bufferInfo, tPFrameInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processOutputFormatChanged(MediaFormat mediaFormat) {
        boolean z10 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        this.mVideoWidth = mediaFormat.getInteger("width");
        this.mVideoHeight = mediaFormat.getInteger("height");
        if (z10) {
            this.mCropLeft = mediaFormat.getInteger(KEY_CROP_LEFT);
            this.mCropRight = mediaFormat.getInteger(KEY_CROP_RIGHT);
            this.mCropTop = mediaFormat.getInteger(KEY_CROP_TOP);
            this.mCropBottom = mediaFormat.getInteger(KEY_CROP_BOTTOM);
        }
        TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: mVideoWidth: " + this.mVideoWidth + ", mVideoHeight: " + this.mVideoHeight + ", mCropLeft: " + this.mCropLeft + ", mCropRight: " + this.mCropRight + ", mCropTop: " + this.mCropTop + ", mCropBottom: " + this.mCropBottom);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f10) {
        return super.setOperateRate(f10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(Surface surface) {
        if (this.mEnableMediaCodecOutputData) {
            return 3;
        }
        return super.setOutputSurface(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i10, boolean z10) {
        String logTag;
        StringBuilder sb2;
        if (5 == i10) {
            if (this.mStarted) {
                logTag = getLogTag();
                sb2 = new StringBuilder("BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA failed. need set before start, mStart=");
                sb2.append(this.mStarted);
                sb2.append(", api level is ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(", support api level = 21");
                TPNativeLog.printLog(3, logTag, sb2.toString());
            } else {
                this.mEnableMediaCodecOutputData = z10;
            }
        } else if (6 == i10) {
            if (this.mStarted) {
                logTag = getLogTag();
                sb2 = new StringBuilder("BOOL_FORCE_DOLBY_VISION_USE_HEVC_CODEC failed. need set before start, mStart=");
                sb2.append(this.mStarted);
                TPNativeLog.printLog(3, logTag, sb2.toString());
            } else {
                this.mDisableDolbyVisionComponent = z10;
            }
        }
        return super.setParamBool(i10, z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i10, byte[] bArr) {
        if (i10 == 200) {
            this.mCsd0Data = bArr;
        } else if (i10 == 201) {
            this.mCsd1Data = bArr;
        } else if (i10 == 202) {
            this.mCsd2Data = bArr;
        }
        return super.setParamBytes(i10, bArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i10, Object obj) {
        return super.setParamObject(i10, obj);
    }
}
