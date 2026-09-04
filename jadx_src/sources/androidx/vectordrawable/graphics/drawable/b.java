package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: Animatable2Compat.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b extends Animatable {

    /* JADX INFO: compiled from: Animatable2Compat.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Animatable2.AnimationCallback f28039a;

        /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Animatable2Compat.java */
        public class C0223a extends Animatable2.AnimationCallback {
            C0223a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @w0(23)
        Animatable2.AnimationCallback a() {
            if (this.f28039a == null) {
                this.f28039a = new C0223a();
            }
            return this.f28039a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    boolean b(@n0 a aVar);

    void c(@n0 a aVar);

    void clearAnimationCallbacks();
}
