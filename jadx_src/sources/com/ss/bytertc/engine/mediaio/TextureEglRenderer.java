package com.ss.bytertc.engine.mediaio;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.o;
import com.ss.bytertc.base.media.EglRenderer;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
    private static final String TAG = "TextureEglRenderer";
    private final AtomicBoolean mHasBindAtomic;
    private final AtomicBoolean mHasInitAtomic;
    private VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    private TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private final Object mSurfaceTextureListenerLock;
    private volatile WeakReference<TextureView> mTextureViewRef;
    private final Handler mainHandler;

    public TextureEglRenderer(String str) {
        super(str);
        this.mSurfaceTextureListenerLock = new Object();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mTextureViewRef = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bind$0(TextureView textureView) {
        if (textureView.getSurfaceTexture() != null) {
            createEglSurface(textureView.getSurfaceTexture());
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
        textureView.setSurfaceTextureListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrame$1(VideoFrame videoFrame, CountDownLatchI420Buffer countDownLatchI420Buffer) {
        super.onFrame(videoFrame);
        countDownLatchI420Buffer.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postOnMainThreadAndLock$2(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    private boolean postOnMainThreadAndLock(final Runnable runnable, final CountDownLatch countDownLatch) {
        return this.mainHandler.post(new Runnable() { // from class: ug.c
            @Override // java.lang.Runnable
            public final void run() {
                TextureEglRenderer.lambda$postOnMainThreadAndLock$2(runnable, countDownLatch);
            }
        });
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void bind(final TextureView textureView, VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        if (!this.mHasInitAtomic.get()) {
            throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
        }
        if (!this.mHasBindAtomic.compareAndSet(false, true)) {
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
        LogUtil.d(TAG, "bind");
        this.mTextureViewRef = new WeakReference<>(textureView);
        this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
        runOnUIThread(new Runnable() { // from class: ug.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f140805b.lambda$bind$0(textureView);
            }
        });
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        if (!this.mHasInitAtomic.compareAndSet(false, true)) {
            throw new IllegalStateException("TextureEglRenderer has already init!!!!!!");
        }
        LogUtil.d(TAG, a.f131415h);
        super.init(context, iArr, glDrawer);
    }

    @Override // com.ss.bytertc.base.media.EglRenderer, com.ss.bytertc.base.media.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get() && this.mTextureViewRef != null) {
            TextureView textureView = this.mTextureViewRef.get();
            if (videoFrame == null || textureView == null || !textureView.isShown()) {
                return;
            }
            if (!(videoFrame.getBuffer() instanceof CountDownLatchI420Buffer) || !(textureView instanceof IVideoSink)) {
                super.onFrame(videoFrame);
                return;
            }
            final CountDownLatchI420Buffer countDownLatchI420Buffer = (CountDownLatchI420Buffer) videoFrame.getBuffer();
            countDownLatchI420Buffer.retain();
            if (postOnMainThreadAndLock(new Runnable() { // from class: ug.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140802b.lambda$onFrame$1(videoFrame, countDownLatchI420Buffer);
                }
            }, countDownLatchI420Buffer.getLatch())) {
                return;
            }
            countDownLatchI420Buffer.release();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.d(TAG, "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onCreated();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.d(TAG, "onSurfaceTextureDestroyed");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new o(countDownLatch));
        int i10 = EglRenderer.mDestroyTimeoutMs;
        if (i10 <= 0) {
            ThreadUtils.awaitUninterruptibly(countDownLatch);
        } else {
            ThreadUtils.awaitUninterruptibly(countDownLatch, i10);
        }
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onDestroy();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        LogUtil.d(TAG, "onSurfaceTextureSizeChanged");
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    @Override // com.ss.bytertc.base.media.EglRenderer
    public void release() {
        TextureView textureView;
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
        }
        LogUtil.d(TAG, "release");
        super.release();
        this.mHasBindAtomic.compareAndSet(true, false);
        if (this.mTextureViewRef == null || (textureView = this.mTextureViewRef.get()) == null) {
            return;
        }
        textureView.setSurfaceTextureListener(null);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        synchronized (this.mSurfaceTextureListenerLock) {
            this.mSurfaceTextureListener = surfaceTextureListener;
        }
    }
}
