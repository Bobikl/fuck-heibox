package androidx.compose.runtime.collection;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import yh.l;

/* JADX INFO: compiled from: IdentityScopeMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0018\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010*J\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002J#\u0010\r\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0082\bJ\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\u0002J7\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00012!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000J\u0006\u0010\u001c\u001a\u00020\u000bJ\u001d\u0010\u001d\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u0015J/\u0010\u001f\u001a\u00020\u000b2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nH\u0086\bø\u0001\u0000J\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b \u0010!R(\u0010+\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010*\u001a\u0004\b/\u00100\"\u0004\b1\u00102R6\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u00105\u0012\u0004\b:\u0010*\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010B\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010<\u0012\u0004\bA\u0010*\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006D"}, d2 = {"Landroidx/compose/runtime/collection/d;", "", androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, androidx.exifinterface.media.a.W4, "Landroidx/compose/runtime/collection/c;", "v", "value", "i", "Lkotlin/Function1;", "Lkotlin/b2;", "removalOperation", ak.aG, "f", "midIndex", "valueHash", "g", "scope", "", ak.aF, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", "e", "Lkotlin/m0;", "name", "block", RXScreenCaptureService.KEY_HEIGHT, "d", "r", "predicate", "t", ak.aB, "(Ljava/lang/Object;)V", "", ak.av, "[I", "n", "()[I", "y", "([I)V", "getValueOrder$annotations", "()V", "valueOrder", "", "b", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", ak.aD, "([Ljava/lang/Object;)V", "getValues$annotations", "values", "[Landroidx/compose/runtime/collection/c;", "j", "()[Landroidx/compose/runtime/collection/c;", RXScreenCaptureService.KEY_WIDTH, "([Landroidx/compose/runtime/collection/c;)V", "getScopeSets$annotations", "scopeSets", "I", "l", "()I", "x", "(I)V", "getSize$annotations", UiKitSpanObj.TYPE_SIZE, "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] valueOrder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] values;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private c<T>[] scopeSets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    public d() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new c[50];
    }

    private final Object A(int index) {
        Object obj = this.values[this.valueOrder[index]];
        f0.m(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(Object value) {
        int iB = androidx.compose.runtime.b.b(value);
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.values[this.valueOrder[i12]];
            f0.m(obj);
            int iB2 = androidx.compose.runtime.b.b(obj);
            if (iB2 < iB) {
                i11 = i12 + 1;
            } else {
                if (iB2 <= iB) {
                    return value == obj ? i12 : g(i12, value, iB);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    private final int g(int midIndex, Object value, int valueHash) {
        for (int i10 = midIndex - 1; -1 < i10; i10--) {
            Object obj = this.values[this.valueOrder[i10]];
            f0.m(obj);
            if (obj == value) {
                return i10;
            }
            if (androidx.compose.runtime.b.b(obj) != valueHash) {
                break;
            }
        }
        int i11 = midIndex + 1;
        int i12 = this.size;
        while (i11 < i12) {
            Object obj2 = this.values[this.valueOrder[i11]];
            f0.m(obj2);
            if (obj2 == value) {
                return i11;
            }
            if (androidx.compose.runtime.b.b(obj2) != valueHash) {
                return -(i11 + 1);
            }
            i11++;
        }
        i11 = this.size;
        return -(i11 + 1);
    }

    private final c<T> i(Object value) {
        int iF;
        if (this.size > 0) {
            iF = f(value);
            if (iF >= 0) {
                return v(iF);
            }
        } else {
            iF = -1;
        }
        int i10 = -(iF + 1);
        int i11 = this.size;
        int[] iArr = this.valueOrder;
        if (i11 < iArr.length) {
            int i12 = iArr[i11];
            this.values[i12] = value;
            c<T> cVar = this.scopeSets[i12];
            if (cVar == null) {
                cVar = new c<>();
                this.scopeSets[i12] = cVar;
            }
            int i13 = this.size;
            if (i10 < i13) {
                int[] iArr2 = this.valueOrder;
                m.a1(iArr2, iArr2, i10 + 1, i10, i13);
            }
            this.valueOrder[i10] = i12;
            this.size++;
            return cVar;
        }
        int length = iArr.length * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.scopeSets, length);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        this.scopeSets = (c[]) objArrCopyOf;
        c<T> cVar2 = new c<>();
        this.scopeSets[i11] = cVar2;
        Object[] objArrCopyOf2 = Arrays.copyOf(this.values, length);
        f0.o(objArrCopyOf2, "copyOf(this, newSize)");
        this.values = objArrCopyOf2;
        objArrCopyOf2[i11] = value;
        int[] iArr3 = new int[length];
        int i14 = this.size;
        while (true) {
            i14++;
            if (i14 >= length) {
                break;
            }
            iArr3[i14] = i14;
        }
        int i15 = this.size;
        if (i10 < i15) {
            m.a1(this.valueOrder, iArr3, i10 + 1, i10, i15);
        }
        iArr3[i10] = i11;
        if (i10 > 0) {
            m.j1(this.valueOrder, iArr3, 0, 0, i10, 6, null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return cVar2;
    }

    @r0
    public static /* synthetic */ void k() {
    }

    @r0
    public static /* synthetic */ void m() {
    }

    @r0
    public static /* synthetic */ void o() {
    }

    @r0
    public static /* synthetic */ void q() {
    }

    private final void u(l<? super c<T>, b2> lVar) {
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            c<T> cVar = j()[i12];
            f0.m(cVar);
            lVar.invoke(cVar);
            if (cVar.size() > 0) {
                if (i10 != i11) {
                    int i13 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i13;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i14 = i10; i14 < size2; i14++) {
            getValues()[getValueOrder()[i14]] = null;
        }
        x(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c<T> v(int index) {
        c<T> cVar = this.scopeSets[this.valueOrder[index]];
        f0.m(cVar);
        return cVar;
    }

    public final boolean c(@dl.d Object value, @dl.d T scope) {
        f0.p(value, "value");
        f0.p(scope, "scope");
        return i(value).add(scope);
    }

    public final void d() {
        int length = this.scopeSets.length;
        for (int i10 = 0; i10 < length; i10++) {
            c<T> cVar = this.scopeSets[i10];
            if (cVar != null) {
                cVar.clear();
            }
            this.valueOrder[i10] = i10;
            this.values[i10] = null;
        }
        this.size = 0;
    }

    public final boolean e(@dl.d Object element) {
        f0.p(element, "element");
        return f(element) >= 0;
    }

    public final void h(@dl.d Object value, @dl.d l<? super T, b2> block) {
        f0.p(value, "value");
        f0.p(block, "block");
        int iF = f(value);
        if (iF >= 0) {
            c cVarV = v(iF);
            int size = cVarV.size();
            for (int i10 = 0; i10 < size; i10++) {
                block.invoke((Object) cVarV.get(i10));
            }
        }
    }

    @dl.d
    public final c<T>[] j() {
        return this.scopeSets;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean r(@dl.d Object value, @dl.d T scope) {
        int i10;
        c<T> cVar;
        f0.p(value, "value");
        f0.p(scope, "scope");
        int iF = f(value);
        if (iF < 0 || (cVar = this.scopeSets[(i10 = this.valueOrder[iF])]) == null) {
            return false;
        }
        boolean zRemove = cVar.remove(scope);
        if (cVar.size() == 0) {
            int i11 = iF + 1;
            int i12 = this.size;
            if (i11 < i12) {
                int[] iArr = this.valueOrder;
                m.a1(iArr, iArr, iF, i11, i12);
            }
            int[] iArr2 = this.valueOrder;
            int i13 = this.size;
            iArr2[i13 - 1] = i10;
            this.values[i10] = null;
            this.size = i13 - 1;
        }
        return zRemove;
    }

    public final void s(@dl.d T scope) {
        f0.p(scope, "scope");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            c<T> cVar = j()[i12];
            f0.m(cVar);
            cVar.remove(scope);
            if (cVar.size() > 0) {
                if (i10 != i11) {
                    int i13 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i13;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i14 = i10; i14 < size2; i14++) {
            getValues()[getValueOrder()[i14]] = null;
        }
        x(i10);
    }

    public final void t(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            c<T> cVar = j()[i12];
            f0.m(cVar);
            int size2 = cVar.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = cVar.getValues()[i14];
                f0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!predicate.invoke(obj).booleanValue()) {
                    if (i13 != i14) {
                        cVar.getValues()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size3 = cVar.size();
            for (int i15 = i13; i15 < size3; i15++) {
                cVar.getValues()[i15] = null;
            }
            cVar.o(i13);
            if (cVar.size() > 0) {
                if (i10 != i11) {
                    int i16 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size4 = getSize();
        for (int i17 = i10; i17 < size4; i17++) {
            getValues()[getValueOrder()[i17]] = null;
        }
        x(i10);
    }

    public final void w(@dl.d c<T>[] cVarArr) {
        f0.p(cVarArr, "<set-?>");
        this.scopeSets = cVarArr;
    }

    public final void x(int i10) {
        this.size = i10;
    }

    public final void y(@dl.d int[] iArr) {
        f0.p(iArr, "<set-?>");
        this.valueOrder = iArr;
    }

    public final void z(@dl.d Object[] objArr) {
        f0.p(objArr, "<set-?>");
        this.values = objArr;
    }
}
