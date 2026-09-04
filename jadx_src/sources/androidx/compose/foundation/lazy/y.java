package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.e1;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B~\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\tR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\tR\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\tR\u001d\u0010/\u001a\u00020,8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00103\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u0012\u00102R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b\b\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "", androidx.constraintlayout.core.motion.utils.w.c.R, "layoutWidth", "layoutHeight", "Landroidx/compose/foundation/lazy/v;", "f", ak.av, "I", "b", "()I", UCropPlusActivity.ARG_INDEX, "", "Landroidx/compose/ui/layout/e1;", "Ljava/util/List;", "placeables", "", ak.aF, "Z", "isVertical", "Landroidx/compose/ui/c$b;", "d", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/ui/c$c;", "e", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "g", "reverseLayout", RXScreenCaptureService.KEY_HEIGHT, "beforeContentPadding", "i", "afterContentPadding", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "j", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "k", "spacing", "Ls1/n;", "l", "J", "visualOffset", "m", "Ljava/lang/Object;", "()Ljava/lang/Object;", "key", "n", UiKitSpanObj.TYPE_SIZE, "o", "sizeWithSpacings", "p", "crossAxisSize", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/ui/unit/LayoutDirection;ZIILandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;IJLjava/lang/Object;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<e1> placeables;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final androidx.compose.ui.c.b horizontalAlignment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final androidx.compose.ui.c.InterfaceC0079c verticalAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyListItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object key;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int sizeWithSpacings;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX WARN: Multi-variable type inference failed */
    private y(int i10, List<? extends e1> list, boolean z10, androidx.compose.ui.c.b bVar, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, LayoutDirection layoutDirection, boolean z11, int i11, int i12, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i13, long j10, Object obj) {
        this.index = i10;
        this.placeables = list;
        this.isVertical = z10;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC0079c;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.spacing = i13;
        this.visualOffset = j10;
        this.key = obj;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            e1 e1Var = (e1) list.get(i14);
            height += this.isVertical ? e1Var.getHeight() : e1Var.getWidth();
            iMax = Math.max(iMax, !this.isVertical ? e1Var.getHeight() : e1Var.getWidth());
        }
        this.size = height;
        this.sizeWithSpacings = fi.u.u(height + this.spacing, 0);
        this.crossAxisSize = iMax;
    }

    @androidx.compose.foundation.t
    public /* synthetic */ y(int i10, List list, boolean z10, androidx.compose.ui.c.b bVar, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, LayoutDirection layoutDirection, boolean z11, int i11, int i12, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i13, long j10, Object obj, kotlin.jvm.internal.u uVar) {
        this(i10, list, z10, bVar, interfaceC0079c, layoutDirection, z11, i11, i12, lazyListItemPlacementAnimator, i13, j10, obj);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    @dl.d
    public final v f(int offset, int layoutWidth, int layoutHeight) {
        long jA;
        ArrayList arrayList = new ArrayList();
        int i10 = this.isVertical ? layoutHeight : layoutWidth;
        boolean z10 = this.reverseLayout;
        int height = z10 ? (i10 - offset) - this.size : offset;
        int iG = z10 ? CollectionsKt__CollectionsKt.G(this.placeables) : 0;
        while (true) {
            boolean z11 = true;
            if (!this.reverseLayout ? iG >= this.placeables.size() : iG < 0) {
                z11 = false;
            }
            if (!z11) {
                int i11 = this.index;
                Object obj = this.key;
                int i12 = this.size;
                int i13 = this.sizeWithSpacings;
                boolean z12 = this.reverseLayout;
                return new v(offset, i11, obj, i12, i13, -(!z12 ? this.beforeContentPadding : this.afterContentPadding), i10 + (!z12 ? this.afterContentPadding : this.beforeContentPadding), this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
            }
            e1 e1Var = this.placeables.get(iG);
            int size = this.reverseLayout ? 0 : arrayList.size();
            if (this.isVertical) {
                androidx.compose.ui.c.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                jA = s1.o.a(bVar.a(e1Var.getWidth(), layoutWidth, this.layoutDirection), height);
            } else {
                androidx.compose.ui.c.InterfaceC0079c interfaceC0079c = this.verticalAlignment;
                if (interfaceC0079c == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                jA = s1.o.a(height, interfaceC0079c.a(e1Var.getHeight(), layoutHeight));
            }
            long j10 = jA;
            height += this.isVertical ? e1Var.getHeight() : e1Var.getWidth();
            arrayList.add(size, new u(j10, e1Var, this.placeables.get(iG).b(), null));
            iG = this.reverseLayout ? iG - 1 : iG + 1;
        }
    }
}
