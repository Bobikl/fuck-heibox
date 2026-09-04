package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.ak;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b,\u0010-J%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t*\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f¢\u0006\u0002\b\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/j;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/layout/b;", "Landroidx/compose/foundation/lazy/i$a;", "currentInterval", "Landroidx/compose/ui/layout/b$b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "d", "(Landroidx/compose/foundation/lazy/i$a;I)Landroidx/compose/foundation/lazy/i$a;", "", "f", "(Landroidx/compose/foundation/lazy/i$a;I)Z", "n", "(I)Z", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/b$a;", "Lkotlin/t;", "block", ak.av, "(ILyh/l;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/LazyListState;", "b", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/i;", ak.aF, "Landroidx/compose/foundation/lazy/i;", "beyondBoundsInfo", "Z", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "e", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "()Landroidx/compose/ui/layout/b;", "value", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/i;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class j implements androidx.compose.ui.modifier.m<androidx.compose.ui.layout.b>, androidx.compose.ui.layout.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyListState state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i beyondBoundsInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Orientation orientation;

    /* JADX INFO: compiled from: LazyBeyondBoundsModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6997a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f6997a = iArr;
        }
    }

    /* JADX INFO: compiled from: LazyBeyondBoundsModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/lazy/j$b", "Landroidx/compose/ui/layout/b$a;", "", ak.av, "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements androidx.compose.ui.layout.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<i.Interval> f6999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7000c;

        b(Ref.ObjectRef<i.Interval> objectRef, int i10) {
            this.f6999b = objectRef;
            this.f7000c = i10;
        }

        @Override // androidx.compose.ui.layout.b.a
        public boolean a() {
            return j.this.f(this.f6999b.f124891b, this.f7000c);
        }
    }

    public j(@dl.d LazyListState state, @dl.d i beyondBoundsInfo, boolean z10, @dl.d LayoutDirection layoutDirection, @dl.d Orientation orientation) {
        f0.p(state, "state");
        f0.p(beyondBoundsInfo, "beyondBoundsInfo");
        f0.p(layoutDirection, "layoutDirection");
        f0.p(orientation, "orientation");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z10;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private final i.Interval d(i.Interval currentInterval, int direction) {
        int iF = currentInterval.f();
        int iE = currentInterval.e();
        androidx.compose.ui.layout.b.C0089b.Companion companion = androidx.compose.ui.layout.b.C0089b.INSTANCE;
        if (androidx.compose.ui.layout.b.C0089b.j(direction, companion.c())) {
            iF--;
        } else if (androidx.compose.ui.layout.b.C0089b.j(direction, companion.b())) {
            iE++;
        } else if (androidx.compose.ui.layout.b.C0089b.j(direction, companion.a())) {
            if (this.reverseLayout) {
                iE++;
            } else {
                iF--;
            }
        } else if (androidx.compose.ui.layout.b.C0089b.j(direction, companion.d())) {
            if (this.reverseLayout) {
                iF--;
            } else {
                iE++;
            }
        } else if (androidx.compose.ui.layout.b.C0089b.j(direction, companion.e())) {
            int i10 = a.f6997a[this.layoutDirection.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.reverseLayout) {
                        iF--;
                    } else {
                        iE++;
                    }
                }
            } else if (this.reverseLayout) {
                iE++;
            } else {
                iF--;
            }
        } else {
            if (!androidx.compose.ui.layout.b.C0089b.j(direction, companion.f())) {
                e.c();
                throw new KotlinNothingValueException();
            }
            int i11 = a.f6997a[this.layoutDirection.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (this.reverseLayout) {
                        iE++;
                    } else {
                        iF--;
                    }
                }
            } else if (this.reverseLayout) {
                iF--;
            } else {
                iE++;
            }
        }
        return this.beyondBoundsInfo.a(iF, iE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(i.Interval interval, int i10) {
        if (n(i10)) {
            return false;
        }
        androidx.compose.ui.layout.b.C0089b.Companion companion = androidx.compose.ui.layout.b.C0089b.INSTANCE;
        if (androidx.compose.ui.layout.b.C0089b.j(i10, companion.c())) {
            return m(interval);
        }
        if (androidx.compose.ui.layout.b.C0089b.j(i10, companion.b())) {
            return g(interval, this);
        }
        if (androidx.compose.ui.layout.b.C0089b.j(i10, companion.a())) {
            return this.reverseLayout ? g(interval, this) : m(interval);
        }
        if (androidx.compose.ui.layout.b.C0089b.j(i10, companion.d())) {
            return this.reverseLayout ? m(interval) : g(interval, this);
        }
        if (androidx.compose.ui.layout.b.C0089b.j(i10, companion.e())) {
            int i11 = a.f6997a[this.layoutDirection.ordinal()];
            if (i11 == 1) {
                return this.reverseLayout ? g(interval, this) : m(interval);
            }
            if (i11 == 2) {
                return this.reverseLayout ? m(interval) : g(interval, this);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!androidx.compose.ui.layout.b.C0089b.j(i10, companion.f())) {
            e.c();
            throw new KotlinNothingValueException();
        }
        int i12 = a.f6997a[this.layoutDirection.ordinal()];
        if (i12 == 1) {
            return this.reverseLayout ? m(interval) : g(interval, this);
        }
        if (i12 == 2) {
            return this.reverseLayout ? g(interval, this) : m(interval);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean g(i.Interval interval, j jVar) {
        return interval.e() < jVar.state.q().getTotalItemsCount() - 1;
    }

    private static final boolean m(i.Interval interval) {
        return interval.f() > 0;
    }

    private final boolean n(int i10) {
        androidx.compose.ui.layout.b.C0089b.Companion companion = androidx.compose.ui.layout.b.C0089b.INSTANCE;
        if (!(androidx.compose.ui.layout.b.C0089b.j(i10, companion.a()) ? true : androidx.compose.ui.layout.b.C0089b.j(i10, companion.d()))) {
            if (!(androidx.compose.ui.layout.b.C0089b.j(i10, companion.e()) ? true : androidx.compose.ui.layout.b.C0089b.j(i10, companion.f()))) {
                if (!(androidx.compose.ui.layout.b.C0089b.j(i10, companion.c()) ? true : androidx.compose.ui.layout.b.C0089b.j(i10, companion.b()))) {
                    e.c();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == Orientation.Vertical) {
                return true;
            }
        } else if (this.orientation == Orientation.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.b
    @dl.e
    public <T> T a(int direction, @dl.d yh.l<? super androidx.compose.ui.layout.b.a, ? extends T> block) {
        f0.p(block, "block");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = (T) this.beyondBoundsInfo.a(this.state.m(), ((m) CollectionsKt___CollectionsKt.k3(this.state.q().f())).getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String());
        T tInvoke = null;
        while (tInvoke == null && f((i.Interval) objectRef.f124891b, direction)) {
            T t10 = (T) d((i.Interval) objectRef.f124891b, direction);
            this.beyondBoundsInfo.e((i.Interval) objectRef.f124891b);
            objectRef.f124891b = t10;
            k1 k1VarW = this.state.w();
            if (k1VarW != null) {
                k1VarW.d();
            }
            tInvoke = block.invoke(new b(objectRef, direction));
        }
        this.beyondBoundsInfo.e((i.Interval) objectRef.f124891b);
        k1 k1VarW2 = this.state.w();
        if (k1VarW2 != null) {
            k1VarW2.d();
        }
        return tInvoke;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.b getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<androidx.compose.ui.layout.b> getKey() {
        return BeyondBoundsLayoutKt.a();
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
