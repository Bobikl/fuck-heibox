package com.ss.bytertc.engine.mediaio;

import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.base.media.SurfaceEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceEglRender extends SurfaceEglRenderer {
    private static final String TAG = "SurfaceEglRender";
    private SurfaceHolder.Callback mCallback;
    private final AtomicBoolean mHasBindAtomic;
    private final AtomicBoolean mHasInitAtomic;
    private final Object mSurfaceCallbackLock;
    private VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    private final Object mSurfaceLifecycleCallbackLock;
    private SoftReference<SurfaceView> surfaceViewSoftReference;

    public SurfaceEglRender(String str) {
        super(str);
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mSurfaceLifecycleCallbackLock = new Object();
        this.mSurfaceCallbackLock = new Object();
        this.surfaceViewSoftReference = new SoftReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bind$0(SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView.getHolder();
        synchronized (this.mSurfaceCallbackLock) {
            SurfaceHolder.Callback callback = this.mCallback;
            if (callback != null) {
                holder.addCallback(callback);
            }
        }
        this.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (holder.getSurface() != null && holder.getSurface().isValid()) {
            setLayoutAspectRatio(surfaceView.getMeasuredWidth() / surfaceView.getMeasuredHeight());
            surfaceCreated(holder);
        }
        holder.addCallback(this);
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void bind(final SurfaceView surfaceView) {
        if (!this.mHasInitAtomic.get()) {
            throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
        }
        if (!this.mHasBindAtomic.compareAndSet(false, true)) {
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
        LogUtil.d(TAG, "bind");
        runOnUIThread(new Runnable() { // from class: ug.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f140798b.lambda$bind$0(surfaceView);
            }
        });
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, com.ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.mHasInitAtomic.compareAndSet(false, true)) {
            throw new IllegalStateException("SurfaceEglRender has already init!!!!!!");
        }
        LogUtil.d(TAG, a.f131415h);
        super.init(context, iArr, glDrawer);
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, com.ss.bytertc.base.media.EglRenderer, com.ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get()) {
            super.onFrame(videoFrame);
        }
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, com.ss.bytertc.base.media.EglRenderer
    public void release() {
        SurfaceView surfaceView;
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
        }
        LogUtil.d(TAG, "release");
        super.release();
        this.mHasBindAtomic.compareAndSet(true, false);
        SoftReference<SurfaceView> softReference = this.surfaceViewSoftReference;
        if (softReference == null || (surfaceView = softReference.get()) == null) {
            return;
        }
        surfaceView.getHolder().removeCallback(this);
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        synchronized (this.mSurfaceCallbackLock) {
            this.mCallback = callback;
        }
    }

    public void setSurfaceLifecycleLisenter(VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
        }
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        super.surfaceChanged(surfaceHolder, i10, i11, i12);
        LogUtil.d(TAG, "surfaceChanged");
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        LogUtil.d(TAG, "surfaceCreated");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
    }

    @Override // com.ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.d(TAG, "surfaceDestroyed");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onDestroy();
            }
        }
    }
}
