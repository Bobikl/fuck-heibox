package com.ss.android.ttvecamera;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class TECameraFrameSetting {
    private byte[] mBufferData;
    private int mBufferSize;
    private int mCameraFacing;
    private int mCameraFormat;
    private int mCameraFrameHeight;
    private int mCameraFrameWidth;
    private int mCameraOutputMode;
    private int mCameraRotation;
    private int mCameraTextureID;
    private int mExtRotate;
    private float[] mMVPMatrix;
    private HashMap<String, Integer> mMetadataMap;
    private ByteBuffer mUBuf;
    private int[] mUParams;
    private ByteBuffer mVBuf;
    private int[] mVParams;
    private ByteBuffer mYBuf;
    private int[] mYParams;
    private int mExposureTime = 0;
    private int mMaxIso = 0;
    private int mMinIso = 0;
    private int mIso = 0;
    private Bitmap mDirectBitmap = null;

    public TECameraFrameSetting(int i10, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i15) {
        this.mCameraOutputMode = i10;
        this.mCameraFrameWidth = i11;
        this.mCameraFrameHeight = i12;
        this.mCameraRotation = i13;
        this.mCameraFacing = i14;
        this.mYBuf = byteBuffer;
        this.mUBuf = byteBuffer2;
        this.mVBuf = byteBuffer3;
        this.mYParams = iArr;
        this.mUParams = iArr2;
        this.mVParams = iArr3;
        this.mCameraFormat = i15;
    }

    public TECameraFrameSetting(int i10, int i11, int i12, int i13, int i14, byte[] bArr, int i15) {
        this.mCameraOutputMode = i10;
        this.mCameraFrameWidth = i11;
        this.mCameraFrameHeight = i12;
        this.mCameraRotation = i13;
        this.mCameraFacing = i14;
        this.mBufferData = bArr;
        this.mCameraFormat = i15;
    }

    public TECameraFrameSetting(int i10, int i11, int i12, int i13, int i14, float[] fArr, int i15, int i16, int i17) {
        this.mCameraTextureID = i10;
        this.mCameraOutputMode = i11;
        this.mCameraFrameWidth = i12;
        this.mCameraFrameHeight = i13;
        this.mCameraRotation = i14;
        this.mMVPMatrix = fArr;
        this.mCameraFacing = i15;
        this.mCameraFormat = i16;
        this.mExtRotate = i17;
    }

    public TECameraFrameSetting(int i10, int i11, int i12, int i13, int i14, float[] fArr, int i15, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i16) {
        this.mCameraTextureID = i10;
        this.mCameraOutputMode = i11;
        this.mCameraFrameWidth = i12;
        this.mCameraFrameHeight = i13;
        this.mCameraRotation = i14;
        this.mMVPMatrix = fArr;
        this.mCameraFacing = i15;
        this.mYBuf = byteBuffer;
        this.mUBuf = byteBuffer2;
        this.mVBuf = byteBuffer3;
        this.mYParams = iArr;
        this.mUParams = iArr2;
        this.mVParams = iArr3;
        this.mCameraFormat = i16;
    }

    public TECameraFrameSetting(int i10, int i11, int i12, int i13, int i14, float[] fArr, int i15, byte[] bArr, int i16) {
        this.mCameraTextureID = i10;
        this.mCameraOutputMode = i11;
        this.mCameraFrameWidth = i12;
        this.mCameraFrameHeight = i13;
        this.mCameraRotation = i14;
        this.mMVPMatrix = fArr;
        this.mCameraFacing = i15;
        this.mBufferData = bArr;
        this.mCameraFormat = i16;
    }

    public TECameraFrameSetting(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i10, int i11, int i12, int i13) {
        this.mYBuf = byteBuffer;
        this.mUBuf = byteBuffer2;
        this.mVBuf = byteBuffer3;
        this.mYParams = iArr;
        this.mUParams = iArr2;
        this.mVParams = iArr3;
        this.mCameraFrameWidth = i10;
        this.mCameraFrameHeight = i11;
        this.mCameraRotation = i12;
        this.mCameraFormat = i13;
    }

    public TECameraFrameSetting(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        this.mBufferData = bArr;
        this.mBufferSize = i10;
        this.mCameraFrameWidth = i11;
        this.mCameraFrameHeight = i12;
        this.mCameraRotation = i13;
        this.mCameraFormat = i14;
    }

    public byte[] getBufferData() {
        return this.mBufferData;
    }

    public int getBufferDataSize() {
        return this.mBufferSize;
    }

    public int getCameraFacing() {
        return this.mCameraFacing;
    }

    public int getCameraFormat() {
        return this.mCameraFormat;
    }

    public int getCameraFrameHeight() {
        return this.mCameraFrameHeight;
    }

    public int getCameraFrameWidth() {
        return this.mCameraFrameWidth;
    }

    public int getCameraOutPutMode() {
        return this.mCameraOutputMode;
    }

    public int getCameraRotation() {
        return this.mCameraRotation;
    }

    public int getCameraTextureID() {
        return this.mCameraTextureID;
    }

    public Bitmap getDirectBitmap() {
        return this.mDirectBitmap;
    }

    public int getExposureTime() {
        return this.mExposureTime;
    }

    public int getExtRotate() {
        return this.mExtRotate;
    }

    public int getIso() {
        return this.mIso;
    }

    public float[] getMVPMatrix() {
        return this.mMVPMatrix;
    }

    public int getMaxIso() {
        return this.mMaxIso;
    }

    public HashMap<String, Integer> getMetadata() {
        return this.mMetadataMap;
    }

    public int getMinIso() {
        return this.mMinIso;
    }

    public ByteBuffer getUBuffer() {
        return this.mUBuf;
    }

    public int[] getUParams() {
        return this.mUParams;
    }

    public ByteBuffer getVBuffer() {
        return this.mVBuf;
    }

    public int[] getVParams() {
        return this.mVParams;
    }

    public ByteBuffer getYBuffer() {
        return this.mYBuf;
    }

    public int[] getYParams() {
        return this.mYParams;
    }

    public void setCameraFrameWidth(int i10) {
        this.mCameraFrameWidth = i10;
    }

    public void setCameraOutPutMode(int i10) {
        this.mCameraOutputMode = i10;
    }

    public void setCameraRotation(int i10) {
        this.mCameraRotation = i10;
    }

    public void setCameraTextureID(int i10) {
        this.mCameraTextureID = i10;
    }

    public void setDirectBitmap(Bitmap bitmap) {
        this.mDirectBitmap = bitmap;
    }

    public void setMVPMatrix(float[] fArr) {
        this.mMVPMatrix = fArr;
    }

    public void setMetadata(HashMap<String, Integer> map) {
        this.mMetadataMap = map;
        this.mExposureTime = map.get("exposuretime").intValue();
        this.mMaxIso = map.get("maxiso").intValue();
        this.mMinIso = map.get("miniso").intValue();
        this.mIso = map.get("iso").intValue();
    }

    public void setmCameraFacing(int i10) {
        this.mCameraFacing = i10;
    }

    public void setmCameraFrameHeight(int i10) {
        this.mCameraFrameHeight = i10;
    }
}
