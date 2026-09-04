package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MultiCallback.java */
/* JADX INFO: loaded from: classes5.dex */
public class n implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f138394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f138395c;

    /* JADX INFO: compiled from: MultiCallback.java */
    public static final class a extends WeakReference<Drawable.Callback> {
        a(Drawable.Callback callback) {
            super(callback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && get() == ((a) obj).get();
        }

        public int hashCode() {
            Drawable.Callback callback = get();
            if (callback != null) {
                return callback.hashCode();
            }
            return 0;
        }
    }

    public n() {
        this(false);
    }

    public n(boolean z10) {
        this.f138394b = new CopyOnWriteArrayList<>();
        this.f138395c = z10;
    }

    public void a(Drawable.Callback callback) {
        for (int i10 = 0; i10 < this.f138394b.size(); i10++) {
            a aVar = this.f138394b.get(i10);
            if (aVar.get() == null) {
                this.f138394b.remove(aVar);
            }
        }
        this.f138394b.addIfAbsent(new a(callback));
    }

    public void b(Drawable.Callback callback) {
        for (int i10 = 0; i10 < this.f138394b.size(); i10++) {
            a aVar = this.f138394b.get(i10);
            Drawable.Callback callback2 = aVar.get();
            if (callback2 == null || callback2 == callback) {
                this.f138394b.remove(aVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@n0 Drawable drawable) {
        for (int i10 = 0; i10 < this.f138394b.size(); i10++) {
            a aVar = this.f138394b.get(i10);
            Drawable.Callback callback = aVar.get();
            if (callback == null) {
                this.f138394b.remove(aVar);
            } else if (this.f138395c && (callback instanceof View)) {
                ((View) callback).invalidate();
            } else {
                callback.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
        for (int i10 = 0; i10 < this.f138394b.size(); i10++) {
            a aVar = this.f138394b.get(i10);
            Drawable.Callback callback = aVar.get();
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            } else {
                this.f138394b.remove(aVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
        for (int i10 = 0; i10 < this.f138394b.size(); i10++) {
            a aVar = this.f138394b.get(i10);
            Drawable.Callback callback = aVar.get();
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            } else {
                this.f138394b.remove(aVar);
            }
        }
    }
}
