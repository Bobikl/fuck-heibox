package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: ThemedSpinnerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public interface t0 extends SpinnerAdapter {

    /* JADX INFO: compiled from: ThemedSpinnerAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f2933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LayoutInflater f2934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LayoutInflater f2935c;

        public a(@androidx.annotation.n0 Context context) {
            this.f2933a = context;
            this.f2934b = LayoutInflater.from(context);
        }

        @androidx.annotation.n0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f2935c;
            return layoutInflater != null ? layoutInflater : this.f2934b;
        }

        @androidx.annotation.p0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f2935c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@androidx.annotation.p0 Resources.Theme theme) {
            if (theme == null) {
                this.f2935c = null;
            } else if (theme == this.f2933a.getTheme()) {
                this.f2935c = this.f2934b;
            } else {
                this.f2935c = LayoutInflater.from(new androidx.appcompat.view.d(this.f2933a, theme));
            }
        }
    }

    @androidx.annotation.p0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@androidx.annotation.p0 Resources.Theme theme);
}
