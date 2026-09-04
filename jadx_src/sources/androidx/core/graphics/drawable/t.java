package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: WrappedDrawableState.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f20703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f20704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ColorStateList f20705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f20706d;

    t(@p0 t tVar) {
        this.f20705c = null;
        this.f20706d = r.f20694h;
        if (tVar != null) {
            this.f20703a = tVar.f20703a;
            this.f20704b = tVar.f20704b;
            this.f20705c = tVar.f20705c;
            this.f20706d = tVar.f20706d;
        }
    }

    boolean a() {
        return this.f20704b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f20703a;
        Drawable.ConstantState constantState = this.f20704b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @n0
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @n0
    public Drawable newDrawable(@p0 Resources resources) {
        return new s(this, resources);
    }
}
