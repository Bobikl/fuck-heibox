package ng;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;

/* JADX INFO: compiled from: RefreshInternal.java */
/* JADX INFO: loaded from: classes8.dex */
public interface h extends pg.f {
    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void b(@n0 i iVar, int i10, int i11);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    int g(@n0 j jVar, boolean z10);

    @n0
    og.b getSpinnerStyle();

    @n0
    View getView();

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void h(float f10, int i10, int i11);

    boolean j();

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void o(@n0 j jVar, int i10, int i11);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void p(@n0 j jVar, int i10, int i11);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void r(boolean z10, float f10, int i10, int i11, int i12);

    @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
    void setPrimaryColors(@l int... iArr);
}
