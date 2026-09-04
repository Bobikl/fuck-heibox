package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0010\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010 \u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!H\u0002\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0014\u0010%\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0001H\u0002\u001a\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0002\u001aD\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001c\u00100\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002\u001a;\u00108\u001a\u000202*\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`32\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00012\f\u00107\u001a\b\u0012\u0004\u0012\u00020206H\u0082\b\u001a,\u0010:\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`32\u0006\u00109\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001H\u0002\u001a,\u0010;\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`32\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001H\u0002\"\u0014\u0010=\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u0011\"\u0014\u0010?\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u0011\"\u0014\u0010A\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010\u0011\"\u0014\u0010C\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u0011\"\u0014\u0010E\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010\u0011\"\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010\u0011\"\u0014\u0010I\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010\u0011\"\u0014\u0010K\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010\u0011\"\u0014\u0010M\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010\u0011\"\u0014\u0010O\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010\u0011\"\u0014\u0010Q\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010\u0011\"\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010\u0011\"\u0014\u0010U\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010\u0011\"\u0014\u0010W\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010\u0011\"\u0014\u0010Y\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010\u0011\"\u0014\u0010[\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010\u0011\"\u0014\u0010]\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010\u0011\"\u0014\u0010_\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010\u0011\"\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010\u0011¨\u0006b"}, d2 = {"", "", "address", "P", "", "X", "f0", androidx.exifinterface.media.a.X4, "g0", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "G", "U", "value", "r0", "J", "n0", "I", "H", "m0", "K", "Y", "len", "", "Z", "c0", "s0", "d0", "h0", "t0", "i0", "Q", "q0", "", "indices", "l0", "R", "L", "anchor", "o0", "M", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", androidx.exifinterface.media.a.T4, "p0", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/c;", "Lkotlin/collections/ArrayList;", UCropPlusActivity.ARG_INDEX, "effectiveSize", "Lkotlin/Function0;", "block", "O", "location", "k0", "b0", ak.av, "parentAnchorPivot", "b", "Key_Offset", ak.aF, "GroupInfo_Offset", "d", "ParentAnchor_Offset", "e", "Size_Offset", "f", "DataAnchor_Offset", "g", "Group_Fields_Size", RXScreenCaptureService.KEY_HEIGHT, "NodeBit_Mask", "i", "ObjectKey_Mask", "j", "ObjectKey_Shift", "k", "Aux_Mask", "l", "Aux_Shift", "m", "Mark_Mask", "n", "ContainsMark_Mask", "o", "Slots_Shift", "p", "NodeCount_Mask", "q", "MinGroupGrowthSize", "r", "MinSlotsGrowthSize", ak.aB, "NodeKey", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13363a = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13364b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13365c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f13366d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f13367e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13368f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f13369g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f13370h = 1073741824;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f13371i = 536870912;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f13372j = 29;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f13373k = 268435456;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f13374l = 28;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f13375m = 134217728;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f13376n = 67108864;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f13377o = 28;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f13378p = 67108863;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f13379q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f13380r = 32;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f13381s = 125;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return K(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & f13376n) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> M(int[] iArr, int i10) {
        return l0(iArr, fi.u.B1(fi.u.W1(4, i10), 5));
    }

    static /* synthetic */ List N(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return M(iArr, i10);
    }

    private static final c O(ArrayList<c> arrayList, int i10, int i11, yh.a<c> aVar) {
        int iK0 = k0(arrayList, i10, i11);
        if (iK0 < 0) {
            c cVarInvoke = aVar.invoke();
            arrayList.add(-(iK0 + 1), cVarInvoke);
            return cVarInvoke;
        }
        c cVar = arrayList.get(iK0);
        kotlin.jvm.internal.f0.o(cVar, "get(location)");
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> R(int[] iArr, int i10) {
        return l0(iArr, fi.u.B1(fi.u.W1(3, i10), 5));
    }

    static /* synthetic */ List S(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return R(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & f13375m) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = z10 ? 1073741824 : 0;
        int i15 = z11 ? 536870912 : 0;
        int i16 = z12 ? 268435456 : 0;
        int i17 = i10 * 5;
        iArr[i17 + 0] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> Z(int[] iArr, int i10) {
        return l0(iArr, fi.u.B1(fi.u.W1(0, i10), 5));
    }

    static /* synthetic */ List a0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return Z(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b0(ArrayList<c> arrayList, int i10, int i11) {
        int iK0 = k0(arrayList, i10, i11);
        return iK0 >= 0 ? iK0 : -(iK0 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & f13378p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> d0(int[] iArr, int i10) {
        List<Integer> listL0 = l0(iArr, fi.u.B1(fi.u.W1(1, i10), 5));
        ArrayList arrayList = new ArrayList(listL0.size());
        int size = listL0.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(listL0.get(i11).intValue() & f13378p));
        }
        return arrayList;
    }

    static /* synthetic */ List e0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return d0(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + K(iArr[i11 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> i0(int[] iArr, int i10) {
        return l0(iArr, fi.u.B1(fi.u.W1(2, i10), 5));
    }

    static /* synthetic */ List j0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return i0(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k0(ArrayList<c> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int location = arrayList.get(i13).getLocation();
            if (location < 0) {
                location += i11;
            }
            int iT = kotlin.jvm.internal.f0.t(location, i10);
            if (iT < 0) {
                i12 = i13 + 1;
            } else {
                if (iT <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private static final List<Integer> l0(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + K(iArr[i11 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | f13376n;
        } else {
            iArr[i11] = iArr[i11] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    private static final void p0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 0] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(int[] iArr, int i10, int i11) {
        ComposerKt.q0(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | f13375m;
        } else {
            iArr[i11] = iArr[i11] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(int[] iArr, int i10, int i11) {
        ComposerKt.q0(i11 >= 0 && i11 < f13378p);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }
}
