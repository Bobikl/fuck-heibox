package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.r1;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/k;", "Landroidx/compose/ui/layout/r1;", "Landroidx/compose/ui/layout/r1$a;", "slotIds", "Lkotlin/b2;", ak.av, "", "slotId", "reusableSlotId", "", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "factory", "", "", "Ljava/util/Map;", "countPerType", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class k implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyLayoutItemContentFactory factory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, Integer> countPerType;

    public k(@dl.d LazyLayoutItemContentFactory factory) {
        f0.p(factory, "factory");
        this.factory = factory;
        this.countPerType = new LinkedHashMap();
    }

    @Override // androidx.compose.ui.layout.r1
    public void a(@dl.d r1.a slotIds) {
        f0.p(slotIds, "slotIds");
        this.countPerType.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object objC = this.factory.c(it.next());
            Integer num = this.countPerType.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.countPerType.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.r1
    public boolean b(@dl.e Object slotId, @dl.e Object reusableSlotId) {
        return f0.g(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }
}
