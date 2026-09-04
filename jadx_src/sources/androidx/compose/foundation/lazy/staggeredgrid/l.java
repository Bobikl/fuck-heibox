package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.e1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u00020\u001d8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\b\u0010 R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\"\u0010\u000bR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b$\u0010\u000bR\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/l;", "", "", "lane", "mainAxis", "crossAxis", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "j", ak.av, "I", ak.aF, "()I", UCropPlusActivity.ARG_INDEX, "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "key", "", "Landroidx/compose/ui/layout/e1;", "Ljava/util/List;", "f", "()Ljava/util/List;", "placeables", "", "Z", "i", "()Z", "isVertical", "Ls1/n;", "e", "J", "()J", "contentOffset", RXScreenCaptureService.KEY_HEIGHT, "spacing", "g", "mainAxisSize", "sizeWithSpacings", "crossAxisSize", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZJILkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<e1> placeables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long contentOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int sizeWithSpacings;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX WARN: Multi-variable type inference failed */
    private l(int i10, Object obj, List<? extends e1> list, boolean z10, long j10, int i11) {
        Integer numValueOf;
        this.index = i10;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z10;
        this.contentOffset = j10;
        this.spacing = i11;
        Integer numValueOf2 = 0;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            e1 e1Var = (e1) list.get(i12);
            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + (this.isVertical ? e1Var.getHeight() : e1Var.getWidth()));
        }
        int iIntValue = numValueOf2.intValue();
        this.mainAxisSize = iIntValue;
        this.sizeWithSpacings = u.u(iIntValue + this.spacing, 0);
        List<e1> list2 = this.placeables;
        if (!list2.isEmpty()) {
            e1 e1Var2 = list2.get(0);
            numValueOf = Integer.valueOf(this.isVertical ? e1Var2.getWidth() : e1Var2.getHeight());
            int iG = CollectionsKt__CollectionsKt.G(list2);
            int i13 = 1;
            if (1 <= iG) {
                while (true) {
                    e1 e1Var3 = list2.get(i13);
                    Integer numValueOf3 = Integer.valueOf(this.isVertical ? e1Var3.getWidth() : e1Var3.getHeight());
                    numValueOf = numValueOf3.compareTo(numValueOf) > 0 ? numValueOf3 : numValueOf;
                    if (i13 == iG) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        } else {
            numValueOf = null;
        }
        f0.m(numValueOf);
        this.crossAxisSize = numValueOf.intValue();
    }

    public /* synthetic */ l(int i10, Object obj, List list, boolean z10, long j10, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, obj, list, z10, j10, i11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @dl.d
    public final List<e1> f() {
        return this.placeables;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSpacing() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @dl.d
    public final m j(int lane, int mainAxis, int crossAxis) {
        return new m(this.isVertical ? s1.o.a(crossAxis, mainAxis) : s1.o.a(mainAxis, crossAxis), this.index, lane, this.key, s1.s.a(this.sizeWithSpacings, this.crossAxisSize), this.placeables, this.contentOffset, this.isVertical, null);
    }
}
