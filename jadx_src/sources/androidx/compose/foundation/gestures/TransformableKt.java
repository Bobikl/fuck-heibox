package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.i0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a3\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\n*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/gestures/t;", "state", "", "lockRotationOnZoomPan", "enabled", "f", "Landroidx/compose/ui/input/pointer/i0;", "Landroidx/compose/runtime/m2;", "panZoomLock", "Lkotlin/b2;", "e", "(Landroidx/compose/ui/input/pointer/i0;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/d;", "requireUnconsumed", ak.aF, "(Landroidx/compose/ui/input/pointer/d;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TransformableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, androidx.compose.ui.input.pointer.x] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:19:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.d r17, boolean r18, kotlin.coroutines.c<? super kotlin.b2> r19) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.c(androidx.compose.ui.input.pointer.d, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object d(androidx.compose.ui.input.pointer.d dVar, boolean z10, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c(dVar, z10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(i0 i0Var, m2<Boolean> m2Var, m2<? extends t> m2Var2, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Ref.BooleanRef booleanRef;
        m2<? extends t> m2Var3;
        float f10;
        Ref.LongRef longRef;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        Ref.BooleanRef booleanRef2;
        m2<Boolean> m2Var4;
        i0 i0Var2;
        if (cVar instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) cVar;
            int i10 = transformableKt$detectZoom$1.f5707l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.f5707l = i10 - Integer.MIN_VALUE;
            } else {
                transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(cVar);
            }
        } else {
            transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(cVar);
        }
        Object obj = transformableKt$detectZoom$1.f5706k;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = transformableKt$detectZoom$1.f5707l;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    float f11 = transformableKt$detectZoom$1.f5705j;
                    Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) transformableKt$detectZoom$1.f5704i;
                    Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) transformableKt$detectZoom$1.f5703h;
                    Ref.LongRef longRef2 = (Ref.LongRef) transformableKt$detectZoom$1.f5702g;
                    Ref.FloatRef floatRef3 = (Ref.FloatRef) transformableKt$detectZoom$1.f5701f;
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) transformableKt$detectZoom$1.f5700e;
                    m2<? extends t> m2Var5 = (m2) transformableKt$detectZoom$1.f5699d;
                    m2<Boolean> m2Var6 = (m2) transformableKt$detectZoom$1.f5698c;
                    i0Var2 = (i0) transformableKt$detectZoom$1.f5697b;
                    t0.n(obj);
                    f10 = f11;
                    booleanRef2 = booleanRef3;
                    booleanRef = booleanRef4;
                    longRef = longRef2;
                    floatRef = floatRef3;
                    floatRef2 = floatRef4;
                    m2Var3 = m2Var5;
                    m2Var4 = m2Var6;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            Ref.FloatRef floatRef5 = new Ref.FloatRef();
            Ref.FloatRef floatRef6 = new Ref.FloatRef();
            floatRef6.f124888b = 1.0f;
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.f124890b = b1.f.f30364b.e();
            booleanRef = new Ref.BooleanRef();
            float fB = i0Var.getViewConfiguration().b();
            Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
            TransformableKt$detectZoom$2 transformableKt$detectZoom$2 = new TransformableKt$detectZoom$2(null);
            transformableKt$detectZoom$1.f5697b = i0Var;
            transformableKt$detectZoom$1.f5698c = m2Var;
            m2Var3 = m2Var2;
            transformableKt$detectZoom$1.f5699d = m2Var3;
            transformableKt$detectZoom$1.f5700e = floatRef5;
            transformableKt$detectZoom$1.f5701f = floatRef6;
            transformableKt$detectZoom$1.f5702g = longRef3;
            transformableKt$detectZoom$1.f5703h = booleanRef;
            transformableKt$detectZoom$1.f5704i = booleanRef5;
            transformableKt$detectZoom$1.f5705j = fB;
            transformableKt$detectZoom$1.f5707l = 1;
            if (i0Var.n1(transformableKt$detectZoom$2, transformableKt$detectZoom$1) == objH) {
                return objH;
            }
            f10 = fB;
            longRef = longRef3;
            floatRef = floatRef6;
            floatRef2 = floatRef5;
            booleanRef2 = booleanRef5;
            m2Var4 = m2Var;
            i0Var2 = i0Var;
            t value = m2Var3.getValue();
            MutatePriority mutatePriority = MutatePriority.UserInput;
            TransformableKt$detectZoom$3 transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(i0Var2, booleanRef, floatRef, floatRef2, longRef, f10, booleanRef2, m2Var4, null);
            transformableKt$detectZoom$1.f5697b = null;
            transformableKt$detectZoom$1.f5698c = null;
            transformableKt$detectZoom$1.f5699d = null;
            transformableKt$detectZoom$1.f5700e = null;
            transformableKt$detectZoom$1.f5701f = null;
            transformableKt$detectZoom$1.f5702g = null;
            transformableKt$detectZoom$1.f5703h = null;
            transformableKt$detectZoom$1.f5704i = null;
            transformableKt$detectZoom$1.f5707l = 2;
            if (value.a(mutatePriority, transformableKt$detectZoom$3, transformableKt$detectZoom$1) == objH) {
                return objH;
            }
        } catch (CancellationException unused) {
        }
        return b2.f124493a;
    }

    @dl.d
    public static final androidx.compose.ui.n f(@dl.d androidx.compose.ui.n nVar, @dl.d final t state, final boolean z10, final boolean z11) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("transformable");
                x0Var.getProperties().c("state", state);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z11));
                x0Var.getProperties().c("lockRotationOnZoomPan", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(1509335853);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1509335853, i10, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
                }
                m2 m2VarT = e2.t(state, pVar, 0);
                m2 m2VarT2 = e2.t(Boolean.valueOf(z10), pVar, 0);
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TransformableKt$transformable$2$block$1$1(m2VarT2, m2VarT, null);
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarC = z11 ? SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE, b2.f124493a, (yh.p) objU) : androidx.compose.ui.n.INSTANCE;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarC;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n g(androidx.compose.ui.n nVar, t tVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return f(nVar, tVar, z10, z11);
    }
}
