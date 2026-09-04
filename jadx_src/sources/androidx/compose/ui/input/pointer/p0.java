package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/p0;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "disallowIntercept", "b", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", ak.av, "()Landroidx/compose/ui/input/pointer/PointerInteropFilter;", ak.aF, "(Landroidx/compose/ui/input/pointer/PointerInteropFilter;)V", "pointerInteropFilter", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class p0 implements yh.l<Boolean, b2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14816c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private PointerInteropFilter pointerInteropFilter;

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PointerInteropFilter getPointerInteropFilter() {
        return this.pointerInteropFilter;
    }

    public void b(boolean z10) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.e(z10);
    }

    public final void c(@dl.e PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
        b(bool.booleanValue());
        return b2.f124493a;
    }
}
