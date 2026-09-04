package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsAnimation;
import androidx.annotation.Keep;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@SuppressLint({"NewApi", "Override"})
@j1
@w0(30)
@TargetApi(30)
public class ImeSyncDeferringInsetsCallback {
    private WindowInsets lastWindowInsets;
    private View view;
    private final int deferredInsetTypes = WindowInsets$Type.ime();
    private boolean animating = false;
    private boolean needsSave = false;
    private AnimationCallback animationCallback = new AnimationCallback();
    private InsetsListener insetsListener = new InsetsListener();

    @Keep
    public class AnimationCallback extends WindowInsetsAnimation.Callback {
        AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (!ImeSyncDeferringInsetsCallback.this.animating || (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) == 0) {
                return;
            }
            ImeSyncDeferringInsetsCallback.this.animating = false;
            if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || ImeSyncDeferringInsetsCallback.this.view == null) {
                return;
            }
            ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if ((it.next().getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                int i10 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(WindowInsets$Type.navigationBars()).bottom : 0;
                WindowInsets$Builder windowInsets$Builder = new WindowInsets$Builder(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                windowInsets$Builder.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i10, 0)));
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(windowInsets$Builder.build());
            }
            return windowInsets;
        }
    }

    public class InsetsListener implements View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            return ImeSyncDeferringInsetsCallback.this.animating ? WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    ImeSyncDeferringInsetsCallback(@n0 View view) {
        this.view = view;
    }

    @j1
    WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    @j1
    View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
