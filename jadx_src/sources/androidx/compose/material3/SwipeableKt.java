package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u00062\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a¹\u0001\u0010'\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0001*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c28\b\u0002\u0010\"\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010)\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040*H\u0002\u001aP\u0010/\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040*2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002\u001a/\u00100\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u00101\"*\u00107\u001a\u000202\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "initialValue", "Landroidx/compose/animation/core/h;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "newValue", "", "confirmStateChange", "Landroidx/compose/material3/SwipeableState;", "i", "(Ljava/lang/Object;Landroidx/compose/animation/core/h;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/material3/SwipeableState;", "value", "Lkotlin/b2;", "onValueChange", "j", "(Ljava/lang/Object;Lyh/l;Landroidx/compose/animation/core/h;Landroidx/compose/runtime/p;II)Landroidx/compose/material3/SwipeableState;", "Landroidx/compose/ui/n;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Lkotlin/Function2;", "from", "to", "Landroidx/compose/material3/z1;", "thresholds", "Landroidx/compose/material3/d1;", "resistance", "Ls1/h;", "velocityThreshold", "k", "(Landroidx/compose/ui/n;Landroidx/compose/material3/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/g;Lyh/p;Landroidx/compose/material3/d1;F)Landroidx/compose/ui/n;", androidx.constraintlayout.core.motion.utils.w.c.R, "", "", "e", "lastValue", "velocity", "d", "f", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "Landroidx/compose/ui/input/nestedscroll/b;", "g", "(Landroidx/compose/material3/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/b;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material3/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class SwipeableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float d(float r3, float r4, java.util.Set<java.lang.Float> r5, yh.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = e(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt.d(float, float, java.util.Set, yh.p, float, float):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> e(float f10, Set<Float> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((double) ((Number) next).floatValue()) <= ((double) f10) + 0.001d) {
                arrayList.add(next);
            }
        }
        Float fM3 = CollectionsKt___CollectionsKt.M3(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (((double) ((Number) obj).floatValue()) >= ((double) f10) - 0.001d) {
                arrayList2.add(obj);
            }
        }
        Float fE4 = CollectionsKt___CollectionsKt.e4(arrayList2);
        if (fM3 == null) {
            return CollectionsKt__CollectionsKt.M(fE4);
        }
        if (fE4 != null && !kotlin.jvm.internal.f0.f(fM3, fE4)) {
            return CollectionsKt__CollectionsKt.L(fM3, fE4);
        }
        return kotlin.collections.s.k(fM3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float f(Map<Float, ? extends T> map, T t10) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.f0.g(((Map.Entry) next).getValue(), t10));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    @dl.d
    public static final <T> androidx.compose.ui.input.nestedscroll.b g(@dl.d SwipeableState<T> swipeableState) {
        kotlin.jvm.internal.f0.p(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @w
    public static /* synthetic */ void h(SwipeableState swipeableState) {
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public static final <T> SwipeableState<T> i(@dl.d final T initialValue, @dl.e final androidx.compose.animation.core.h<Float> hVar, @dl.e final yh.l<? super T, Boolean> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        pVar.T(102743774);
        if ((i11 & 2) != 0) {
            hVar = s1.f12114a.a();
        }
        if ((i11 & 4) != 0) {
            lVar = new yh.l<T, Boolean>() { // from class: androidx.compose.material3.SwipeableKt$rememberSwipeableState$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d T it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(102743774, i10, -1, "androidx.compose.material3.rememberSwipeableState (Swipeable.kt:467)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.d(new Object[0], SwipeableState.INSTANCE.a(hVar, lVar), null, new yh.a<SwipeableState<T>>() { // from class: androidx.compose.material3.SwipeableKt$rememberSwipeableState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SwipeableState<T> invoke() {
                return new SwipeableState<>(initialValue, hVar, lVar);
            }
        }, pVar, 72, 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return swipeableState;
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public static final <T> SwipeableState<T> j(@dl.d final T value, @dl.d final yh.l<? super T, kotlin.b2> onValueChange, @dl.e androidx.compose.animation.core.h<Float> hVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        pVar.T(1306709399);
        if ((i11 & 4) != 0) {
            hVar = s1.f12114a.a();
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(1306709399, i10, -1, "androidx.compose.material3.rememberSwipeableStateFor (Swipeable.kt:496)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = new SwipeableState(value, hVar, new yh.l<T, Boolean>() { // from class: androidx.compose.material3.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d T it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return Boolean.TRUE;
                }
            });
            pVar.N(objU);
        }
        pVar.c0();
        final SwipeableState<T> swipeableState = (SwipeableState) objU;
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = h2.g(Boolean.FALSE, null, 2, null);
            pVar.N(objU2);
        }
        pVar.c0();
        final androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objU2;
        int i12 = i10 & 8;
        EffectsKt.g(value, a1Var.getValue(), new SwipeableKt$rememberSwipeableStateFor$1(value, swipeableState, null), pVar, (i10 & 14) | i12 | 512);
        EffectsKt.c(swipeableState.p(), new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.material3.SwipeableKt$rememberSwipeableStateFor$2

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {
                @Override // androidx.compose.runtime.e0
                public void dispose() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                if (!kotlin.jvm.internal.f0.g(value, swipeableState.p())) {
                    onValueChange.invoke((T) swipeableState.p());
                    androidx.compose.runtime.a1<Boolean> a1Var2 = a1Var;
                    a1Var2.setValue(Boolean.valueOf(!a1Var2.getValue().booleanValue()));
                }
                return new a();
            }
        }, pVar, i12);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return swipeableState;
    }

    @w
    @dl.d
    public static final <T> androidx.compose.ui.n k(@dl.d androidx.compose.ui.n swipeable, @dl.d final SwipeableState<T> state, @dl.d final Map<Float, ? extends T> anchors, @dl.d final Orientation orientation, final boolean z10, final boolean z11, @dl.e final androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super T, ? super T, ? extends z1> thresholds, @dl.e final ResistanceConfig resistanceConfig, final float f10) {
        kotlin.jvm.internal.f0.p(swipeable, "$this$swipeable");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(anchors, "anchors");
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        kotlin.jvm.internal.f0.p(thresholds, "thresholds");
        return ComposedModifierKt.g(swipeable, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("swipeable");
                x0Var.getProperties().c("state", state);
                x0Var.getProperties().c("anchors", anchors);
                x0Var.getProperties().c("orientation", orientation);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("reverseDirection", Boolean.valueOf(z11));
                x0Var.getProperties().c("interactionSource", gVar);
                x0Var.getProperties().c("thresholds", thresholds);
                x0Var.getProperties().c("resistance", resistanceConfig);
                x0Var.getProperties().c("velocityThreshold", s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.SwipeableKt$swipeable$3

            /* JADX INFO: renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$3, reason: invalid class name */
            /* JADX INFO: compiled from: Swipeable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {603}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f11033b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ SwipeableState<T> f11034c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Map<Float, T> f11035d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ ResistanceConfig f11036e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ s1.e f11037f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ yh.p<T, T, z1> f11038g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ float f11039h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, s1.e eVar, yh.p<? super T, ? super T, ? extends z1> pVar, float f10, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.f11034c = swipeableState;
                    this.f11035d = map;
                    this.f11036e = resistanceConfig;
                    this.f11037f = eVar;
                    this.f11038g = pVar;
                    this.f11039h = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass3(this.f11034c, this.f11035d, this.f11036e, this.f11037f, this.f11038g, this.f11039h, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    return ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f11033b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        Map mapM = this.f11034c.m();
                        this.f11034c.I(this.f11035d);
                        this.f11034c.N(this.f11036e);
                        SwipeableState<T> swipeableState = this.f11034c;
                        final Map<Float, T> map = this.f11035d;
                        final yh.p<T, T, z1> pVar = this.f11038g;
                        final s1.e eVar = this.f11037f;
                        swipeableState.O(new yh.p<Float, Float, Float>() { // from class: androidx.compose.material3.SwipeableKt.swipeable.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference incomplete: some casts might be missing */
                            @dl.d
                            public final Float a(float f10, float f11) {
                                return Float.valueOf(pVar.invoke((T) kotlin.collections.s0.K(map, Float.valueOf(f10)), (T) kotlin.collections.s0.K(map, Float.valueOf(f11))).a(eVar, f10, f11));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
                                return a(f10.floatValue(), f11.floatValue());
                            }
                        });
                        this.f11034c.P(this.f11037f.E1(this.f11039h));
                        SwipeableState<T> swipeableState2 = this.f11034c;
                        Object obj2 = this.f11035d;
                        this.f11033b = 1;
                        if (swipeableState2.H(mapM, obj2, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return kotlin.b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1169892884);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1169892884, i10, -1, "androidx.compose.material3.swipeable.<anonymous> (Swipeable.kt:581)");
                }
                if (!(!anchors.isEmpty())) {
                    throw new IllegalArgumentException("You must have at least one anchor.".toString());
                }
                if (!(CollectionsKt___CollectionsKt.V1(anchors.values()).size() == anchors.size())) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
                }
                s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
                state.l(anchors);
                Map<Float, T> map = anchors;
                SwipeableState<T> swipeableState = state;
                EffectsKt.g(map, swipeableState, new AnonymousClass3(swipeableState, map, resistanceConfig, eVar, thresholds, f10, null), pVar, bb.c.b.f30512a7);
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                boolean zE = state.E();
                androidx.compose.foundation.gestures.f draggableState = state.getDraggableState();
                Orientation orientation2 = orientation;
                boolean z12 = z10;
                androidx.compose.foundation.interaction.g gVar2 = gVar;
                SwipeableState<T> swipeableState2 = state;
                pVar.T(1157296644);
                boolean zS = pVar.s(swipeableState2);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new SwipeableKt$swipeable$3$4$1(swipeableState2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarH = DraggableKt.h(companion, draggableState, orientation2, (188 & 4) != 0 ? true : z12, (188 & 8) != 0 ? null : gVar2, (188 & 16) != 0 ? false : zE, (188 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (188 & 64) != 0 ? new DraggableKt$draggable$2(null) : (yh.q) objU, (188 & 128) != 0 ? false : z11);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarH;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }
}
