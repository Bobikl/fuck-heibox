package io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.util.ViewUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterMutatorView extends FrameLayout {

    @j1
    @p0
    ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private final AndroidTouchProcessor androidTouchProcessor;
    private int left;
    private FlutterMutatorsStack mutatorsStack;
    private int prevLeft;
    private int prevTop;
    private float screenDensity;
    private int top;

    public FlutterMutatorView(@n0 Context context) {
        this(context, 1.0f, null);
    }

    public FlutterMutatorView(@n0 Context context, float f10, @p0 AndroidTouchProcessor androidTouchProcessor) {
        super(context, null);
        this.screenDensity = f10;
        this.androidTouchProcessor = androidTouchProcessor;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.mutatorsStack.getFinalMatrix());
        float f10 = this.screenDensity;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.left, -this.top);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.mutatorsStack.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.left, -this.top);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.androidTouchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i10 = this.left;
            this.prevLeft = i10;
            int i11 = this.top;
            this.prevTop = i11;
            matrix.postTranslate(i10, i11);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        return this.androidTouchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void readyToDisplay(@n0 FlutterMutatorsStack flutterMutatorsStack, int i10, int i11, int i12, int i13) {
        this.mutatorsStack = flutterMutatorsStack;
        this.left = i10;
        this.top = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(@n0 final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    View view3 = this;
                    onFocusChangeListener2.onFocusChange(view3, ViewUtils.childHasFocus(view3));
                }
            };
            this.activeFocusListener = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
            return;
        }
        this.activeFocusListener = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }
}
