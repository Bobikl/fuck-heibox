package com.tencent.live.beauty.custom;

import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
public class TXCustomBeautyDef {

    public enum TXCustomBeautyBufferType {
        TXCustomBeautyBufferTypeUnknown,
        TXCustomBeautyBufferTypeByteBuffer,
        TXCustomBeautyBufferTypeByteArray,
        TXCustomBeautyBufferTypeTexture
    }

    public enum TXCustomBeautyPixelFormat {
        TXCustomBeautyPixelFormatUnknown,
        TXCustomBeautyPixelFormatI420,
        TXCustomBeautyPixelFormatTexture2D
    }

    public static final class TXCustomBeautyVideoFrame {
        public ByteBuffer buffer;
        public TXCustomBeautyBufferType bufferType;
        public byte[] data;
        public int height;
        public TXCustomBeautyPixelFormat pixelFormat;
        public int rotation;
        public TXThirdTexture texture;
        public long timestamp;
        public int width;
    }

    public static final class TXThirdTexture {
        public EGLContext eglContext10;
        public android.opengl.EGLContext eglContext14;
        public int textureId;
    }
}
