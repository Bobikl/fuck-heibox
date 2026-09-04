package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: MenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface m {

    /* JADX INFO: compiled from: MenuPresenter.java */
    public interface a {
        void a(@n0 g gVar, boolean z10);

        boolean b(@n0 g gVar);
    }

    void a(g gVar, boolean z10);

    boolean c(g gVar, j jVar);

    Parcelable d();

    void e(boolean z10);

    boolean f();

    boolean g(g gVar, j jVar);

    int getId();

    void h(Context context, g gVar);

    void i(a aVar);

    void k(Parcelable parcelable);

    boolean l(r rVar);

    n m(ViewGroup viewGroup);
}
