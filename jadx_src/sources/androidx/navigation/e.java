package androidx.navigation;

/* JADX INFO: compiled from: ActivityNavigatorExtras.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    @dl.d
    public static final ActivityNavigator.c a(@dl.e androidx.core.app.i iVar, int i10) {
        ActivityNavigator.c.a aVar = new ActivityNavigator.c.a();
        if (iVar != null) {
            aVar.c(iVar);
        }
        aVar.a(i10);
        return aVar.b();
    }

    public static /* synthetic */ ActivityNavigator.c b(androidx.core.app.i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return a(iVar, i10);
    }
}
