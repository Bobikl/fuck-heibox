package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class TXCSavePreFrameFilter {
    private GLTexturePool mGLTexturePool;
    private int mSavePreFrameNumber = 1;
    private TXCGPUImageFilter mDrawFilter = null;
    private int mVideoWidth = -1;
    private int mVideoHeight = -1;
    private ArrayList<GLTexture> mRecyclerTextureBuffers = new ArrayList<>();
    private ArrayList<GLTexture> mPreTextureBuffers = new ArrayList<>();

    public void destroy() {
        TXCGPUImageFilter tXCGPUImageFilter = this.mDrawFilter;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.uninitialize();
            this.mDrawFilter = null;
        }
        ArrayList<GLTexture> arrayList = this.mRecyclerTextureBuffers;
        if (arrayList != null) {
            Iterator<GLTexture> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.mRecyclerTextureBuffers.clear();
            this.mRecyclerTextureBuffers = null;
        }
        ArrayList<GLTexture> arrayList2 = this.mPreTextureBuffers;
        if (arrayList2 != null) {
            Iterator<GLTexture> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().release();
            }
            this.mPreTextureBuffers.clear();
            this.mPreTextureBuffers = null;
        }
    }

    public void initFilter(GLTexturePool gLTexturePool) {
        this.mGLTexturePool = gLTexturePool;
        if (this.mDrawFilter == null) {
            TXCGPUImageFilter tXCGPUImageFilter = new TXCGPUImageFilter();
            this.mDrawFilter = tXCGPUImageFilter;
            tXCGPUImageFilter.initialize(gLTexturePool);
        }
    }

    public boolean onDrawToTexture(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        boolean z10;
        if (this.mPreTextureBuffers.size() < this.mSavePreFrameNumber || this.mPreTextureBuffers.size() <= 0) {
            z10 = false;
        } else {
            GLTexture gLTexture2 = this.mPreTextureBuffers.get(0);
            TXCGPUImageFilter tXCGPUImageFilter = this.mDrawFilter;
            if (tXCGPUImageFilter != null) {
                tXCGPUImageFilter.onDraw(gLTexture2.getId(), gLTexture, floatBuffer, floatBuffer2);
            }
            this.mRecyclerTextureBuffers.add(gLTexture2);
            this.mPreTextureBuffers.remove(0);
            z10 = true;
        }
        GLTexture gLTextureRemove = this.mRecyclerTextureBuffers.size() > 0 ? this.mRecyclerTextureBuffers.remove(0) : this.mGLTexturePool.obtain(this.mVideoWidth, this.mVideoHeight);
        if (gLTextureRemove != null) {
            this.mDrawFilter.onDraw(i10, gLTextureRemove, floatBuffer, floatBuffer2);
            this.mPreTextureBuffers.add(gLTextureRemove);
        }
        return z10;
    }

    public void onOutputSizeChanged(int i10, int i11) {
        this.mVideoWidth = i10;
        this.mVideoHeight = i11;
        TXCGPUImageFilter tXCGPUImageFilter = this.mDrawFilter;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.onOutputSizeChanged(i10, i11);
        }
    }

    public void setSavePreFrameNumber(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.mSavePreFrameNumber = i10;
    }
}
