package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TintResources.java */
/* JADX INFO: loaded from: classes.dex */
public class w0 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f2964b;

    public w0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Resources resources) {
        super(resources);
        this.f2964b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.n0, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableA = a(i10);
        Context context = this.f2964b.get();
        if (drawableA != null && context != null) {
            m0.h().x(context, i10, drawableA);
        }
        return drawableA;
    }
}
