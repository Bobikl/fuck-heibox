package com.umeng.socialize.shareboard.widgets;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes4.dex */
public class ViewCompat {
    private static final long FAKE_FRAME_TIME = 10;
    private static final ViewCompatImpl IMPL;

    public static class Api24ViewCompatImpl extends MarshmallowViewCompatImpl {
        private Api24ViewCompatImpl() {
            super();
        }
    }

    public static class BaseViewCompatImpl implements ViewCompatImpl {
        BaseViewCompatImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public boolean canScrollHorizontally(View view, int i10) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        long getFrameTime() {
            return ViewCompat.FAKE_FRAME_TIME;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postInvalidateOnAnimation(View view) {
            view.invalidate();
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postOnAnimation(View view, Runnable runnable) {
            view.postDelayed(runnable, getFrameTime());
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        }
    }

    @TargetApi(11)
    public static class HCViewCompatImpl extends BaseViewCompatImpl {
        HCViewCompatImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl
        long getFrameTime() {
            return ValueAnimator.getFrameDelay();
        }
    }

    public static class ICSMr1ViewCompatImpl extends ICSViewCompatImpl {
        ICSMr1ViewCompatImpl() {
        }
    }

    @TargetApi(14)
    public static class ICSViewCompatImpl extends HCViewCompatImpl {
        ICSViewCompatImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public boolean canScrollHorizontally(View view, int i10) {
            return view.canScrollHorizontally(i10);
        }
    }

    @TargetApi(16)
    public static class JBViewCompatImpl extends ICSMr1ViewCompatImpl {
        JBViewCompatImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postInvalidateOnAnimation(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postOnAnimation(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }
    }

    public static class JbMr1ViewCompatImpl extends JBViewCompatImpl {
        private JbMr1ViewCompatImpl() {
        }
    }

    public static class JbMr2ViewCompatImpl extends JbMr1ViewCompatImpl {
        private JbMr2ViewCompatImpl() {
            super();
        }
    }

    public static class KitKatViewCompatImpl extends JbMr2ViewCompatImpl {
        private KitKatViewCompatImpl() {
            super();
        }
    }

    @TargetApi(20)
    public static class LollipopViewCompatImpl extends KitKatViewCompatImpl {
        private LollipopViewCompatImpl() {
            super();
        }

        private static Object dispatchApplyWindowInsets(View view, Object obj) {
            WindowInsets windowInsets = (WindowInsets) obj;
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            return windowInsetsDispatchApplyWindowInsets != windowInsets ? new WindowInsets(windowInsetsDispatchApplyWindowInsets) : obj;
        }

        private static Object onApplyWindowInsets(View view, Object obj) {
            WindowInsets windowInsets = (WindowInsets) obj;
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            return windowInsetsOnApplyWindowInsets != windowInsets ? new WindowInsets(windowInsetsOnApplyWindowInsets) : obj;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return WindowInsetsCompat.wrap(dispatchApplyWindowInsets(view, WindowInsetsCompat.unwrap(windowInsetsCompat)));
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return WindowInsetsCompat.wrap(onApplyWindowInsets(view, WindowInsetsCompat.unwrap(windowInsetsCompat)));
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void setOnApplyWindowInsetsListener(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                final OnApplyWindowInsetsListenerBridge onApplyWindowInsetsListenerBridge = new OnApplyWindowInsetsListenerBridge() { // from class: com.umeng.socialize.shareboard.widgets.ViewCompat.LollipopViewCompatImpl.1
                    @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListenerBridge
                    public Object onApplyWindowInsets(View view2, Object obj) {
                        return WindowInsetsCompat.unwrap(onApplyWindowInsetsListener.onApplyWindowInsets(view2, WindowInsetsCompat.wrap(obj)));
                    }
                };
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.umeng.socialize.shareboard.widgets.ViewCompat.LollipopViewCompatImpl.2
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        return (WindowInsets) onApplyWindowInsetsListenerBridge.onApplyWindowInsets(view2, windowInsets);
                    }
                });
            }
        }
    }

    public static class MarshmallowViewCompatImpl extends LollipopViewCompatImpl {
        private MarshmallowViewCompatImpl() {
            super();
        }
    }

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);
    }

    public interface OnApplyWindowInsetsListenerBridge {
        Object onApplyWindowInsets(View view, Object obj);
    }

    public interface ViewCompatImpl {
        boolean canScrollHorizontally(View view, int i10);

        WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);

        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);

        void postInvalidateOnAnimation(View view);

        void postOnAnimation(View view, Runnable runnable);

        void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener);
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            IMPL = new Api24ViewCompatImpl();
        } else {
            IMPL = new MarshmallowViewCompatImpl();
        }
    }

    ViewCompat() {
    }

    static boolean canScrollHorizontally(View view, int i10) {
        return IMPL.canScrollHorizontally(view, i10);
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return IMPL.dispatchApplyWindowInsets(view, windowInsetsCompat);
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return IMPL.onApplyWindowInsets(view, windowInsetsCompat);
    }

    static void postInvalidateOnAnimation(View view) {
        IMPL.postInvalidateOnAnimation(view);
    }

    static void postOnAnimation(View view, Runnable runnable) {
        IMPL.postOnAnimation(view, runnable);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        IMPL.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }
}
