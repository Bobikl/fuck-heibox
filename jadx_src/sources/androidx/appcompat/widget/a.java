package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ActionBarContainer f2701a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
    @androidx.annotation.w0(21)
    public static class C0017a {
        private C0017a() {
        }

        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public a(ActionBarContainer actionBarContainer) {
        this.f2701a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2701a;
        if (actionBarContainer.f2282i) {
            Drawable drawable = actionBarContainer.f2281h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2279f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2701a;
        Drawable drawable3 = actionBarContainer2.f2280g;
        if (drawable3 == null || !actionBarContainer2.f2283j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.w0(21)
    public void getOutline(@androidx.annotation.n0 Outline outline) {
        ActionBarContainer actionBarContainer = this.f2701a;
        if (actionBarContainer.f2282i) {
            if (actionBarContainer.f2281h != null) {
                C0017a.a(actionBarContainer.f2279f, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2279f;
            if (drawable != null) {
                C0017a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
