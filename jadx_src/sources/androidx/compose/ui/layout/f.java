package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/r1;", "Landroidx/compose/ui/layout/r1$a;", "slotIds", "Lkotlin/b2;", ak.av, "", "slotId", "reusableSlotId", "", "b", "", "I", "maxSlotsToRetainForReuse", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSlotsToRetainForReuse;

    public f(int i10) {
        this.maxSlotsToRetainForReuse = i10;
    }

    @Override // androidx.compose.ui.layout.r1
    public void a(@dl.d r1.a slotIds) {
        kotlin.jvm.internal.f0.p(slotIds, "slotIds");
        if (slotIds.size() > this.maxSlotsToRetainForReuse) {
            int i10 = 0;
            Iterator<Object> it = slotIds.iterator();
            while (it.hasNext()) {
                it.next();
                i10++;
                if (i10 > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.r1
    public boolean b(@dl.e Object slotId, @dl.e Object reusableSlotId) {
        return true;
    }
}
