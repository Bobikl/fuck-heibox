package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import s1.r;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011ø\u0001\u0001¢\u0006\u0004\b)\u0010*J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u001b\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R \u0010\u0014\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R)\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/g;", "Ls1/p;", "anchorBounds", "Ls1/r;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Ls1/n;", ak.av, "(Ls1/p;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Ls1/j;", "b", "()J", "Ls1/e;", ak.aF, "Lkotlin/Function2;", "Lkotlin/b2;", "d", "contentOffset", "density", "onPositionCalculated", "e", "(JLs1/e;Lyh/p;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "g", "Ls1/e;", RXScreenCaptureService.KEY_HEIGHT, "()Ls1/e;", "Lyh/p;", "i", "()Lyh/p;", "<init>", "(JLs1/e;Lyh/p;Lkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DropdownMenuPositionProvider implements androidx.compose.ui.window.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final s1.e density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @dl.d
    private final yh.p<s1.p, s1.p, kotlin.b2> onPositionCalculated;

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j10, s1.e eVar, yh.p<? super s1.p, ? super s1.p, kotlin.b2> pVar) {
        this.contentOffset = j10;
        this.density = eVar;
        this.onPositionCalculated = pVar;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, s1.e eVar, yh.p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, eVar, (i10 & 4) != 0 ? new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.DropdownMenuPositionProvider.1
            public final void a(@dl.d s1.p pVar2, @dl.d s1.p pVar3) {
                kotlin.jvm.internal.f0.p(pVar2, "<anonymous parameter 0>");
                kotlin.jvm.internal.f0.p(pVar3, "<anonymous parameter 1>");
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                a(pVar2, pVar3);
                return kotlin.b2.f124493a;
            }
        } : pVar, null);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, s1.e eVar, yh.p pVar, kotlin.jvm.internal.u uVar) {
        this(j10, eVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownMenuPositionProvider f(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j10, s1.e eVar, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i10 & 2) != 0) {
            eVar = dropdownMenuPositionProvider.density;
        }
        if ((i10 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.e(j10, eVar, pVar);
    }

    @Override // androidx.compose.ui.window.g
    public long a(@dl.d s1.p anchorBounds, long windowSize, @dl.d LayoutDirection layoutDirection, long popupContentSize) {
        kotlin.sequences.m mVarQ;
        Object obj;
        Object next;
        int iIntValue;
        kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        int iE1 = this.density.e1(MenuKt.j());
        int iE2 = this.density.e1(s1.j.j(this.contentOffset));
        int iE3 = this.density.e1(s1.j.l(this.contentOffset));
        int iT = anchorBounds.t() + iE2;
        int iX = (anchorBounds.x() - iE2) - r.m(popupContentSize);
        int iM = r.m(windowSize) - r.m(popupContentSize);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(iT);
            numArr[1] = Integer.valueOf(iX);
            if (anchorBounds.t() < 0) {
                iM = 0;
            }
            numArr[2] = Integer.valueOf(iM);
            mVarQ = SequencesKt__SequencesKt.q(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(iX);
            numArr2[1] = Integer.valueOf(iT);
            if (anchorBounds.x() <= r.m(windowSize)) {
                iM = 0;
            }
            numArr2[2] = Integer.valueOf(iM);
            mVarQ = SequencesKt__SequencesKt.q(numArr2);
        }
        Iterator it = mVarQ.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            iIntValue = ((Number) next).intValue();
        } while (!(iIntValue >= 0 && iIntValue + r.m(popupContentSize) <= r.m(windowSize)));
        Integer num = (Integer) next;
        if (num != null) {
            iX = num.intValue();
        }
        int iMax = Math.max(anchorBounds.j() + iE3, iE1);
        int f139243b = (anchorBounds.getF139243b() - iE3) - r.j(popupContentSize);
        for (Object obj2 : SequencesKt__SequencesKt.q(Integer.valueOf(iMax), Integer.valueOf(f139243b), Integer.valueOf(anchorBounds.getF139243b() - (r.j(popupContentSize) / 2)), Integer.valueOf((r.j(windowSize) - r.j(popupContentSize)) - iE1))) {
            int iIntValue2 = ((Number) obj2).intValue();
            if (iIntValue2 >= iE1 && iIntValue2 + r.j(popupContentSize) <= r.j(windowSize) - iE1) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            f139243b = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new s1.p(iX, f139243b, r.m(popupContentSize) + iX, r.j(popupContentSize) + f139243b));
        return s1.o.a(iX, f139243b);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final s1.e getDensity() {
        return this.density;
    }

    @dl.d
    public final yh.p<s1.p, s1.p, kotlin.b2> d() {
        return this.onPositionCalculated;
    }

    @dl.d
    public final DropdownMenuPositionProvider e(long contentOffset, @dl.d s1.e density, @dl.d yh.p<? super s1.p, ? super s1.p, kotlin.b2> onPositionCalculated) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(contentOffset, density, onPositionCalculated, null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return s1.j.h(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && kotlin.jvm.internal.f0.g(this.density, dropdownMenuPositionProvider.density) && kotlin.jvm.internal.f0.g(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public final long g() {
        return this.contentOffset;
    }

    @dl.d
    public final s1.e h() {
        return this.density;
    }

    public int hashCode() {
        return (((s1.j.n(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    @dl.d
    public final yh.p<s1.p, s1.p, kotlin.b2> i() {
        return this.onPositionCalculated;
    }

    @dl.d
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) s1.j.q(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }
}
