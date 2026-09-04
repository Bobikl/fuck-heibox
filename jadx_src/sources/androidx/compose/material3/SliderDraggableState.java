package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0004\b$\u0010%JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/material3/SliderDraggableState;", "Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/d;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "b", "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "delta", ak.av, "", "<set-?>", "Landroidx/compose/runtime/a1;", "g", "()Z", RXScreenCaptureService.KEY_HEIGHT, "(Z)V", "isDragging", ak.aF, "Landroidx/compose/foundation/gestures/d;", "dragScope", "Landroidx/compose/foundation/MutatorMutex;", "d", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Lkotlin/Function1;", "onDelta", "Lyh/l;", "f", "()Lyh/l;", "<init>", "(Lyh/l;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class SliderDraggableState implements androidx.compose.foundation.gestures.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<Float, kotlin.b2> f10514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isDragging;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.gestures.d dragScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MutatorMutex scrollMutex;

    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/material3/SliderDraggableState$a", "Landroidx/compose/foundation/gestures/d;", "", "pixels", "Lkotlin/b2;", ak.aF, "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.foundation.gestures.d {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.d
        public void c(float f10) {
            SliderDraggableState.this.f().invoke(Float.valueOf(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState(@dl.d yh.l<? super Float, kotlin.b2> onDelta) {
        kotlin.jvm.internal.f0.p(onDelta, "onDelta");
        this.f10514a = onDelta;
        this.isDragging = h2.g(Boolean.FALSE, null, 2, null);
        this.dragScope = new a();
        this.scrollMutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean z10) {
        this.isDragging.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.foundation.gestures.f
    public void a(float f10) {
        this.f10514a.invoke(Float.valueOf(f10));
    }

    @Override // androidx.compose.foundation.gestures.f
    @dl.e
    public Object b(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super androidx.compose.foundation.gestures.d, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objG = kotlinx.coroutines.r0.g(new SliderDraggableState$drag$2(this, mutatePriority, pVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : kotlin.b2.f124493a;
    }

    @dl.d
    public final yh.l<Float, kotlin.b2> f() {
        return this.f10514a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }
}
