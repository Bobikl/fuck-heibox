package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: BrowserActionsFallbackMenuDialog.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c extends Dialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f3082c = 250;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f3083d = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f3084b;

    /* JADX INFO: compiled from: BrowserActionsFallbackMenuDialog.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3085b;

        a(boolean z10) {
            this.f3085b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3085b) {
                return;
            }
            c.super.dismiss();
        }
    }

    c(Context context, View view) {
        super(context);
        this.f3084b = view;
    }

    private void b(boolean z10) {
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        long j10 = z10 ? f3082c : 150L;
        this.f3084b.setScaleX(f10);
        this.f3084b.setScaleY(f10);
        this.f3084b.animate().scaleX(f11).scaleY(f11).setDuration(j10).setInterpolator(new androidx.interpolator.view.animation.c()).setListener(new a(z10)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}
