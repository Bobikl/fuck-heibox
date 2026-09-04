package butterknife.internal;

import android.view.View;

/* JADX INFO: compiled from: DebouncingOnClickListener.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f35556b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Runnable f35557c = new Runnable() { // from class: butterknife.internal.b
        @Override // java.lang.Runnable
        public final void run() {
            c.f35556b = true;
        }
    };

    public abstract void b(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f35556b) {
            f35556b = false;
            view.post(f35557c);
            b(view);
        }
    }
}
