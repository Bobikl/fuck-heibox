package androidx.compose.foundation.text.selection;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/selection/u;", "", "Lkotlin/b2;", "b", "", ak.av, "Ljava/lang/Float;", "()Ljava/lang/Float;", ak.aF, "(Ljava/lang/Float;)V", "cachedX", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Float cachedX;

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void b() {
        this.cachedX = null;
    }

    public final void c(@dl.e Float f10) {
        this.cachedX = f10;
    }
}
