package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.CancellationSignal;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ interface WindowInsetsController {

    public /* synthetic */ interface OnControllableInsetsChangedListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    /* synthetic */ void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener);

    /* synthetic */ void controlWindowInsetsAnimation(int i10, long j10, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListener windowInsetsAnimationControlListener);

    /* synthetic */ int getSystemBarsAppearance();

    /* synthetic */ int getSystemBarsBehavior();

    /* synthetic */ void hide(int i10);

    /* synthetic */ void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener);

    /* synthetic */ void setSystemBarsAppearance(int i10, int i11);

    /* synthetic */ void setSystemBarsBehavior(int i10);

    /* synthetic */ void show(int i10);
}
