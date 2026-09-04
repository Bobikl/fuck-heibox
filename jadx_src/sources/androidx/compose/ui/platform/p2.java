package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR3\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/p2;", "Landroidx/compose/ui/platform/o2;", "Landroidx/compose/runtime/a1;", "", ak.av, "Landroidx/compose/runtime/a1;", "_isWindowFocused", "value", "b", "()Z", "f", "(Z)V", "isWindowFocused", "Landroidx/compose/ui/input/pointer/l0;", "()I", "e", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "()V", "keyboardModifiers", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class p2 implements o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.a1<androidx.compose.ui.input.pointer.l0> f15964c = androidx.compose.runtime.h2.g(androidx.compose.ui.input.pointer.l0.a(androidx.compose.ui.input.pointer.s.a()), null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1<Boolean> _isWindowFocused = androidx.compose.runtime.h2.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.p2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/p2$a;", "", "Landroidx/compose/runtime/a1;", "Landroidx/compose/ui/input/pointer/l0;", "GlobalKeyboardModifiers", "Landroidx/compose/runtime/a1;", ak.av, "()Landroidx/compose/runtime/a1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.a1<androidx.compose.ui.input.pointer.l0> a() {
            return p2.f15964c;
        }
    }

    public static /* synthetic */ void d() {
    }

    @Override // androidx.compose.ui.platform.o2
    @androidx.compose.ui.g
    public int a() {
        return f15964c.getValue().getPackedValue();
    }

    @Override // androidx.compose.ui.platform.o2
    public boolean b() {
        return this._isWindowFocused.getValue().booleanValue();
    }

    public void e(int i10) {
        f15964c.setValue(androidx.compose.ui.input.pointer.l0.a(i10));
    }

    public void f(boolean z10) {
        this._isWindowFocused.setValue(Boolean.valueOf(z10));
    }
}
