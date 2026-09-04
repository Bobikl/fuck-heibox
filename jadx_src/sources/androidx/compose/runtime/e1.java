package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/e1;", "N", "Landroidx/compose/runtime/e;", "node", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)V", ak.av, "", UCropPlusActivity.ARG_INDEX, "instance", "f", "(ILjava/lang/Object;)V", "g", "count", "b", "from", "to", "e", "clear", "Landroidx/compose/runtime/e;", "applier", "I", androidx.constraintlayout.core.motion.utils.w.c.R, ak.aF, "nesting", "getCurrent", "()Ljava/lang/Object;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "(Landroidx/compose/runtime/e;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e1<N> implements e<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<N> applier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nesting;

    public e1(@dl.d e<N> applier, int i10) {
        kotlin.jvm.internal.f0.p(applier, "applier");
        this.applier = applier;
        this.offset = i10;
    }

    @Override // androidx.compose.runtime.e
    public void a() {
        int i10 = this.nesting;
        if (!(i10 > 0)) {
            ComposerKt.A("OffsetApplier up called with no corresponding down".toString());
            throw new KotlinNothingValueException();
        }
        this.nesting = i10 - 1;
        this.applier.a();
    }

    @Override // androidx.compose.runtime.e
    public void b(int i10, int i11) {
        this.applier.b(i10 + (this.nesting == 0 ? this.offset : 0), i11);
    }

    @Override // androidx.compose.runtime.e
    public /* synthetic */ void c() {
        d.b(this);
    }

    @Override // androidx.compose.runtime.e
    public void clear() {
        ComposerKt.A("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.e
    public /* synthetic */ void d() {
        d.a(this);
    }

    @Override // androidx.compose.runtime.e
    public void e(int i10, int i11, int i12) {
        int i13 = this.nesting == 0 ? this.offset : 0;
        this.applier.e(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.e
    public void f(int index, N instance) {
        this.applier.f(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.e
    public void g(int index, N instance) {
        this.applier.g(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.e
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.e
    public void h(N node) {
        this.nesting++;
        this.applier.h(node);
    }
}
