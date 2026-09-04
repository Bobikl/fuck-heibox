package androidx.compose.material3;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.saveable.SaverKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@j2
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001,B%\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140(¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u001bR \u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\"8GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "Lkotlin/b2;", "l", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Landroidx/compose/material3/DrawerValue;", "targetValue", "Landroidx/compose/animation/core/h;", "", "anim", ak.av, "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "m", "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableState;", "Landroidx/compose/material3/SwipeableState;", "f", "()Landroidx/compose/material3/SwipeableState;", "swipeableState", "", "k", "()Z", "isOpen", "j", "isClosed", ak.aF, "()Landroidx/compose/material3/DrawerValue;", "currentValue", "i", "isAnimationRunning", "g", "getTargetValue$annotations", "()V", "Landroidx/compose/runtime/m2;", "d", "()Landroidx/compose/runtime/m2;", "getOffset$annotations", androidx.constraintlayout.core.motion.utils.w.c.R, "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lyh/l;)V", "Companion", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class DrawerState {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SwipeableState<DrawerValue> swipeableState;

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/material3/DrawerState;", ak.av, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<DrawerState, DrawerValue> a(@dl.d final yh.l<? super DrawerValue, Boolean> confirmStateChange) {
            kotlin.jvm.internal.f0.p(confirmStateChange, "confirmStateChange");
            return SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, DrawerState, DrawerValue>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DrawerValue invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d DrawerState it) {
                    kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
                    kotlin.jvm.internal.f0.p(it, "it");
                    return it.c();
                }
            }, new yh.l<DrawerValue, DrawerState>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DrawerState invoke(@dl.d DrawerValue it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return new DrawerState(it, confirmStateChange);
                }
            });
        }
    }

    public DrawerState(@dl.d DrawerValue initialValue, @dl.d yh.l<? super DrawerValue, Boolean> confirmStateChange) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(confirmStateChange, "confirmStateChange");
        this.swipeableState = new SwipeableState<>(initialValue, NavigationDrawerKt.f9908c, confirmStateChange);
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(drawerValue, (i10 & 2) != 0 ? new yh.l<DrawerValue, Boolean>() { // from class: androidx.compose.material3.DrawerState.1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d DrawerValue it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @w
    public static /* synthetic */ void e() {
    }

    @w
    public static /* synthetic */ void h() {
    }

    @w
    @dl.e
    public final Object a(@dl.d DrawerValue drawerValue, @dl.d androidx.compose.animation.core.h<Float> hVar, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objJ = this.swipeableState.j(drawerValue, hVar, cVar);
        return objJ == kotlin.coroutines.intrinsics.b.h() ? objJ : kotlin.b2.f124493a;
    }

    @dl.e
    public final Object b(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = a(DrawerValue.Closed, NavigationDrawerKt.f9908c, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    @dl.d
    public final DrawerValue c() {
        return this.swipeableState.p();
    }

    @w
    @dl.d
    public final m2<Float> d() {
        return this.swipeableState.v();
    }

    @dl.d
    public final SwipeableState<DrawerValue> f() {
        return this.swipeableState;
    }

    @w
    @dl.d
    public final DrawerValue g() {
        return this.swipeableState.A();
    }

    public final boolean i() {
        return this.swipeableState.E();
    }

    public final boolean j() {
        return c() == DrawerValue.Closed;
    }

    public final boolean k() {
        return c() == DrawerValue.Open;
    }

    @dl.e
    public final Object l(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = a(DrawerValue.Open, NavigationDrawerKt.f9908c, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    @w
    @dl.e
    public final Object m(@dl.d DrawerValue drawerValue, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objR = this.swipeableState.R(drawerValue, cVar);
        return objR == kotlin.coroutines.intrinsics.b.h() ? objR : kotlin.b2.f124493a;
    }
}
