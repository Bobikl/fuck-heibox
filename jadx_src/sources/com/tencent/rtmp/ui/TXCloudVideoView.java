package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class TXCloudVideoView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    private static final int FOCUS_AREA_SIZE_IN_DP = 70;
    private WeakReference<b> mCallback;
    private final Rect mDashMargin;
    private final Dashboard mDashboard;
    private final a mDelayedTapRunnable;
    private final HashSet<TextureView> mDeprecatedTextureViewSet;
    private boolean mEnableShowLog;
    private boolean mEnableTouchToFocus;
    private boolean mEnableZoom;
    private FocusIndicatorView mFocusIndicatorView;
    protected Object mGLContext;
    private final Runnable mHideIndicatorViewRunnable;
    private float mLastScaleFactor;
    private float mScaleFactor;
    private ScaleGestureDetector mScaleGestureDetector;
    private WeakReference<Surface> mSurface;
    private final WeakReference<SurfaceView> mSurfaceView;
    private final String mTAG;
    private TextureView mTopTextureView;
    private String mUserId;
    private TextureView mVideoViewSetByUser;
    private AndroidViewEventListener mViewEventListener;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Point f102106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f102108c;

        private a() {
            this.f102106a = new Point();
            this.f102107b = 0;
            this.f102108c = 0;
        }

        /* synthetic */ a(TXCloudVideoView tXCloudVideoView, byte b10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TXCloudVideoView.this.mViewEventListener != null) {
                AndroidViewEventListener androidViewEventListener = TXCloudVideoView.this.mViewEventListener;
                Point point = this.f102106a;
                androidViewEventListener.onTap(point.x, point.y, this.f102107b, this.f102108c);
            }
        }
    }

    public interface b {
        void onShowLog(boolean z10);
    }

    public TXCloudVideoView(Context context) {
        this(context, null, null);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView) {
        super(context, attributeSet);
        this.mTAG = "TXCloudVideoView_" + hashCode();
        this.mDashMargin = new Rect();
        this.mDeprecatedTextureViewSet = new HashSet<>();
        this.mEnableTouchToFocus = false;
        this.mDelayedTapRunnable = new a(this, (byte) 0);
        this.mEnableZoom = false;
        this.mUserId = "";
        this.mHideIndicatorViewRunnable = com.tencent.rtmp.ui.a.a(this);
        this.mDashboard = new Dashboard(context);
        this.mSurfaceView = surfaceView != null ? new WeakReference<>(surfaceView) : null;
    }

    public TXCloudVideoView(Context context, Surface surface) {
        this(context, null, null);
        this.mSurface = surface != null ? new WeakReference<>(surface) : null;
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), null, surfaceView);
    }

    private void addViewInternal(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.w(this.mTAG, "addViewInternal,TextureView is null.");
            return;
        }
        if (textureView.getParent() == null) {
            addView(textureView);
            updateTopTextureView();
        } else if (textureView.getParent() == this) {
            LiteavLog.i(this.mTAG, "view has been added.");
        } else {
            LiteavLog.w(this.mTAG, "view has been added to other parent view. parent=" + textureView.getParent());
        }
        this.mDeprecatedTextureViewSet.remove(textureView);
    }

    private TextureView getTextureViewSetByUser() {
        return this.mVideoViewSetByUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideIndicatorView() {
        FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView != null) {
            focusIndicatorView.setVisibility(8);
        }
    }

    private boolean isShowLogEnabled() {
        return this.mEnableShowLog;
    }

    private static int px2dip(Context context, float f10) {
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void removeDeprecatedViews(TextureView textureView) {
        Iterator<TextureView> it = this.mDeprecatedTextureViewSet.iterator();
        while (it.hasNext()) {
            TextureView next = it.next();
            if (next != null && next != textureView) {
                try {
                    removeView(next);
                } catch (Exception e10) {
                    LiteavLog.e(this.mTAG, "removeView view error: ", e10);
                }
                it.remove();
            }
        }
        updateTopTextureView();
    }

    private void removeViewInternal(TextureView textureView, boolean z10) {
        if (textureView == null) {
            return;
        }
        if (z10) {
            try {
                removeView(textureView);
            } catch (Exception e10) {
                LiteavLog.e(this.mTAG, "removeView view error: ", e10);
            }
            updateTopTextureView();
            this.mDeprecatedTextureViewSet.remove(textureView);
            return;
        }
        if (textureView.getParent() == this) {
            removeDeprecatedViews(textureView);
            this.mDeprecatedTextureViewSet.add(textureView);
        } else if (textureView.getParent() == null) {
            LiteavLog.i(this.mTAG, "current view has been removed from the parent view. view=".concat(String.valueOf(textureView)));
        } else if (textureView.getParent() != this) {
            LiteavLog.w(this.mTAG, "current view is not a child view of this view. parent=" + textureView.getParent());
        }
    }

    private void repositionDashBoard() {
        try {
            removeView(this.mDashboard);
        } catch (Exception e10) {
            LiteavLog.e(this.mTAG, "removeView dashboard view error: ", e10);
        }
        addView(this.mDashboard);
    }

    private void setAndroidViewEventListener(AndroidViewEventListener androidViewEventListener) {
        this.mViewEventListener = androidViewEventListener;
    }

    private void setBackgroundColorForInternalView(int i10) {
        LiteavLog.i(this.mTAG, "setBackgroundColorForInternalView color:".concat(String.valueOf(i10)));
        if (this.mSurface == null && this.mSurfaceView == null) {
            int i11 = (i10 >> 16) & 255;
            post(com.tencent.rtmp.ui.b.a(this, i10 & 255, (i10 >> 24) & 255, i11, (i10 >> 8) & 255));
        }
    }

    private void setShowLogCallback(WeakReference<b> weakReference) {
        this.mCallback = weakReference;
    }

    private void setTouchToFocusEnabled(boolean z10) {
        this.mEnableTouchToFocus = z10;
    }

    private void setZoomEnabled(boolean z10) {
        LiteavLog.i(this.mTAG, "setZoomEnabled: ".concat(String.valueOf(z10)));
        this.mEnableZoom = z10;
    }

    private void showFocusView(int i10, int i11, int i12, int i13) {
        post(c.a(this, i10, i11, i12, i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFocusViewInternal(int i10, int i11, int i12, int i13) {
        if ((i12 != 0 && i12 != getWidth()) || (i13 != 0 && i13 != getHeight())) {
            LiteavLog.i(this.mTAG, "ignore show indicator view when view size changed");
            return;
        }
        LiteavLog.v(this.mTAG, "show indicator view at (%d,%d)", Integer.valueOf(i10), Integer.valueOf(i11));
        removeCallbacks(this.mHideIndicatorViewRunnable);
        int i14 = (int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i14, i14);
        int i15 = i14 / 2;
        layoutParams.leftMargin = h.a(i10 - i15, 0, getWidth() - i14);
        layoutParams.topMargin = h.a(i11 - i15, 0, getHeight() - i14);
        View view = this.mFocusIndicatorView;
        if (view == null) {
            FocusIndicatorView focusIndicatorView = new FocusIndicatorView(getContext());
            this.mFocusIndicatorView = focusIndicatorView;
            addView(focusIndicatorView, layoutParams);
        } else if (indexOfChild(view) != getChildCount() - 1) {
            try {
                removeView(this.mFocusIndicatorView);
            } catch (Exception e10) {
                LiteavLog.e(this.mTAG, "removeView focus indicator view error: ", e10);
            }
            addView(this.mFocusIndicatorView, layoutParams);
        } else {
            this.mFocusIndicatorView.setLayoutParams(layoutParams);
        }
        this.mFocusIndicatorView.setVisibility(0);
        FocusIndicatorView focusIndicatorView2 = this.mFocusIndicatorView;
        focusIndicatorView2.startAnimation(focusIndicatorView2.f102097a);
        postDelayed(this.mHideIndicatorViewRunnable, TimeUnit.SECONDS.toMillis(1L));
    }

    private void updateTopTextureView() {
        TextureView textureView;
        int childCount = getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                textureView = null;
                break;
            }
            View childAt = getChildAt(childCount);
            if (childAt instanceof TextureView) {
                textureView = (TextureView) childAt;
                break;
            }
            childCount--;
        }
        if (this.mTopTextureView != textureView) {
            this.mTopTextureView = textureView;
        }
    }

    public void addVideoView(TextureView textureView) {
        removeViewInternal(this.mVideoViewSetByUser, true);
        addViewInternal(textureView);
        this.mVideoViewSetByUser = textureView;
        repositionDashBoard();
    }

    public void clearLastFrame(boolean z10) {
        if (z10) {
            setVisibility(8);
        }
    }

    public void clearLog() {
        Dashboard dashboard = this.mDashboard;
        if (dashboard != null) {
            dashboard.f102090a.setLength(0);
            TextView textView = dashboard.f102091b;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = dashboard.f102092c;
            if (textView2 != null) {
                textView2.setText("");
            }
        }
    }

    public void disableLog(boolean z10) {
    }

    @Deprecated
    public TextureView getHWVideoView() {
        return getVideoView();
    }

    public Object getOpenGLContext() {
        return this.mGLContext;
    }

    public Surface getSurface() {
        WeakReference<Surface> weakReference = this.mSurface;
        if (weakReference == null) {
            return null;
        }
        Surface surface = weakReference.get();
        if (surface == null) {
            LiteavLog.w(this.mTAG, "surface is null.");
        }
        return surface;
    }

    public SurfaceView getSurfaceView() {
        WeakReference<SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference == null) {
            return null;
        }
        SurfaceView surfaceView = weakReference.get();
        if (surfaceView == null) {
            LiteavLog.w(this.mTAG, "surfaceView is null.");
        }
        return surfaceView;
    }

    public String getUserId() {
        return this.mUserId;
    }

    @Deprecated
    public TextureView getVideoView() {
        TextureView textureView = this.mVideoViewSetByUser;
        return textureView != null ? textureView : this.mTopTextureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LiteavLog.i(this.mTAG, "onAttachedToWindow");
    }

    public void onDestroy() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LiteavLog.i(this.mTAG, "onDetachedFromWindow");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Dashboard dashboard = this.mDashboard;
        Rect rect = this.mDashMargin;
        dashboard.a(rect.left, rect.top, rect.right, rect.bottom);
        this.mDashboard.setStatusTextSize((float) (((double) px2dip(getContext(), getWidth())) / 30.0d));
        this.mDashboard.setEventTextSize((float) (((double) px2dip(getContext(), getWidth())) / 25.0d));
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.mEnableZoom) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.mLastScaleFactor;
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        float fA = h.a(this.mScaleFactor + scaleFactor, 0.0f);
        this.mScaleFactor = fA;
        AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onZoom(fA);
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        return this.mEnableZoom;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onSizeChanged(i10, i11, i12, i13);
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            if (this.mEnableTouchToFocus) {
                a aVar = this.mDelayedTapRunnable;
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int width = getWidth();
                int height = getHeight();
                Point point = aVar.f102106a;
                point.x = x10;
                point.y = y10;
                aVar.f102107b = width;
                aVar.f102108c = height;
                removeCallbacks(this.mDelayedTapRunnable);
                postDelayed(this.mDelayedTapRunnable, 100L);
            }
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2 && this.mEnableZoom) {
            removeCallbacks(this.mDelayedTapRunnable);
            hideIndicatorView();
            if (this.mScaleGestureDetector == null) {
                this.mScaleGestureDetector = new ScaleGestureDetector(getContext(), this);
            }
            this.mScaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.mEnableZoom) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            performClick();
        }
        return true;
    }

    public void removeVideoView() {
        removeViewInternal(this.mVideoViewSetByUser, true);
        this.mVideoViewSetByUser = null;
    }

    public void setDashBoardMarginInPx(int i10, int i11, int i12, int i13) {
        Rect rect = this.mDashMargin;
        rect.left = i10;
        rect.right = i11;
        rect.top = i12;
        rect.bottom = i13;
        this.mDashboard.a(i10, i12, i11, i13);
    }

    public void setDashBoardMarginInRatio(final float f10, final float f11, final float f12, final float f13) {
        postDelayed(new Runnable() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                TXCloudVideoView tXCloudVideoView = TXCloudVideoView.this;
                tXCloudVideoView.setDashBoardMarginInPx((int) (tXCloudVideoView.getWidth() * f10), (int) (TXCloudVideoView.this.getWidth() * f11), (int) (TXCloudVideoView.this.getHeight() * f12), (int) (TXCloudVideoView.this.getHeight() * f13));
            }
        }, 100L);
    }

    public void setLogMargin(float f10, float f11, float f12, float f13) {
        setDashBoardMarginInPx((int) f10, (int) f11, (int) f12, (int) f13);
    }

    public void setOpenGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void showLog(boolean z10) {
        this.mEnableShowLog = z10;
        WeakReference<b> weakReference = this.mCallback;
        b bVar = weakReference == null ? null : weakReference.get();
        if (bVar != null) {
            bVar.onShowLog(z10);
        }
    }
}
