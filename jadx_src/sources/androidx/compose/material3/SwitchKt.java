package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a|\u0010\u001c\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u001d\u0010!\u001a\u00020\u00188\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001d\u0010#\u001a\u00020\u00188\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0017\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010\u001e\"\u0017\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010\u001e\"\u0017\u0010)\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010\u001e\"\u0017\u0010+\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010\u001e\"\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/b2;", "onCheckedChange", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "thumbContent", "enabled", "Landroidx/compose/material3/t1;", "colors", "Landroidx/compose/foundation/interaction/g;", "interactionSource", ak.av, "(ZLyh/l;Landroidx/compose/ui/n;Lyh/p;ZLandroidx/compose/material3/t1;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/foundation/layout/k;", "Landroidx/compose/runtime/m2;", "", "thumbValue", "Landroidx/compose/foundation/interaction/e;", "Landroidx/compose/ui/graphics/g2;", "thumbShape", "Ls1/h;", "uncheckedThumbDiameter", "minBound", "maxBound", "b", "(Landroidx/compose/foundation/layout/k;ZZLandroidx/compose/material3/t1;Landroidx/compose/runtime/m2;Lyh/p;Landroidx/compose/foundation/interaction/e;Landroidx/compose/ui/graphics/g2;FFFLandroidx/compose/runtime/p;II)V", "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "ThumbDiameter", "i", "UncheckedThumbDiameter", ak.aF, "SwitchWidth", "d", "SwitchHeight", "e", "ThumbPadding", "f", "ThumbPathLength", "Landroidx/compose/animation/core/e1;", "g", "Landroidx/compose/animation/core/e1;", "AnimationSpec", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class SwitchKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f11123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f11125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f11126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f11127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f11128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.e1<Float> f11129g;

    static {
        t0.w0 w0Var = t0.w0.f140501a;
        float fR = w0Var.r();
        f11123a = fR;
        f11124b = w0Var.N();
        float fG = w0Var.G();
        f11125c = fG;
        float fD = w0Var.D();
        f11126d = fD;
        float fG2 = s1.h.g(s1.h.g(fD - fR) / 2);
        f11127e = fG2;
        f11128f = s1.h.g(s1.h.g(fG - fR) - fG2);
        f11129g = new androidx.compose.animation.core.e1<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Failed to calculate best type for var: r0v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v16 ??, new type: yh.q<androidx.compose.runtime.v1<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.p, java.lang.Integer, kotlin.b2>
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v12 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v18 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r59v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r59v0 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v9 ??, new type: androidx.compose.material3.u1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v9 ??, new type: androidx.compose.material3.u1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r59v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r59v0 ??, new type: androidx.compose.runtime.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(boolean r52, @dl.e yh.l<? super java.lang.Boolean, kotlin.b2> r53, @dl.e androidx.compose.ui.n r54, @dl.e yh.p<? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2> r55, boolean r56, @dl.e androidx.compose.material3.t1 r57, @dl.e androidx.compose.foundation.interaction.g r58, @dl.e androidx.compose.runtime.p r59, int r60, int r61) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.a(boolean, yh.l, androidx.compose.ui.n, yh.p, boolean, androidx.compose.material3.t1, androidx.compose.foundation.interaction.g, androidx.compose.runtime.p, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(final androidx.compose.foundation.layout.k kVar, final boolean z10, final boolean z11, final t1 t1Var, final m2<Float> m2Var, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final androidx.compose.foundation.interaction.e eVar, final g2 g2Var, final float f10, final float f11, final float f12, androidx.compose.runtime.p pVar2, final int i10, final int i11) {
        int i12;
        int i13;
        final float fFloatValue;
        androidx.compose.runtime.p pVarF = pVar2.F(-1968109941);
        if ((i10 & 14) == 0) {
            i12 = (pVarF.s(kVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= pVarF.u(z10) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.u(z11) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(t1Var) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i12 |= pVarF.s(m2Var) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            i12 |= pVarF.s(pVar) ? 131072 : 65536;
        }
        if ((i10 & 3670016) == 0) {
            i12 |= pVarF.s(eVar) ? 1048576 : 524288;
        }
        if ((i10 & 29360128) == 0) {
            i12 |= pVarF.s(g2Var) ? 8388608 : 4194304;
        }
        if ((i10 & 234881024) == 0) {
            i12 |= pVarF.w(f10) ? 67108864 : 33554432;
        }
        if ((i10 & 1879048192) == 0) {
            i12 |= pVarF.w(f11) ? 536870912 : 268435456;
        }
        if ((i11 & 14) == 0) {
            i13 = i11 | (pVarF.w(f12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 1533916891) == 306783378 && (i13 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1968109941, i12, i13, "androidx.compose.material3.SwitchImpl (Switch.kt:171)");
            }
            int i14 = ((i12 >> 6) & 14) | (i12 & 112) | ((i12 >> 3) & bb.c.b.f30796me);
            m2<androidx.compose.ui.graphics.l0> m2VarD = t1Var.d(z11, z10, pVarF, i14);
            m2<Boolean> m2VarA = PressInteractionKt.a(eVar, pVarF, (i12 >> 18) & 14);
            int i15 = i12;
            float fL = e(m2VarA) ? t0.w0.f140501a.l() : s1.h.g(s1.h.g(s1.h.g(f11123a - f10) * (s1.h.g(((s1.e) pVarF.K(CompositionLocalsKt.i())).F(m2Var.getValue().floatValue()) - f11) / s1.h.g(f12 - f11))) + f10);
            pVarF.T(-993794194);
            if (e(m2VarA)) {
                fFloatValue = ((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(z10 ? s1.h.g(f11128f - t0.w0.f140501a.E()) : t0.w0.f140501a.E());
            } else {
                fFloatValue = m2Var.getValue().floatValue();
            }
            pVarF.c0();
            t0.w0 w0Var = t0.w0.f140501a;
            g2 g2VarD = ShapesKt.d(w0Var.F(), pVarF, 6);
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            androidx.compose.ui.c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.n nVarC = BackgroundKt.c(BorderKt.h(SizeKt.o(SizeKt.H(kVar.b(companion, companion2.i()), f11125c), f11126d), w0Var.E(), t1Var.a(z11, z10, pVarF, i14).getValue().M(), g2VarD), d(m2VarD), g2VarD);
            pVarF.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion2.C(), false, pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarC);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, i0VarK, companion3.d());
            Updater.j(pVarB, eVar2, companion3.b());
            Updater.j(pVarB, layoutDirection, companion3.c());
            Updater.j(pVarB, d2Var, companion3.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
            pVarF.T(968687813);
            long jC = c(t1Var.c(z11, z10, pVarF, i14));
            androidx.compose.ui.n nVarB = boxScopeInstance.b(companion, companion2.o());
            Float fValueOf = Float.valueOf(fFloatValue);
            pVarF.T(1157296644);
            boolean zS = pVarF.s(fValueOf);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new yh.l<s1.e, s1.n>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final long a(@dl.d s1.e offset) {
                        kotlin.jvm.internal.f0.p(offset, "$this$offset");
                        return s1.o.a(di.d.L0(fFloatValue), 0);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ s1.n invoke(s1.e eVar3) {
                        return s1.n.b(a(eVar3));
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarC2 = BackgroundKt.c(SizeKt.u(IndicationKt.b(OffsetKt.d(nVarB, (yh.l) objU), eVar, androidx.compose.material.ripple.j.e(false, s1.h.g(w0Var.C() / 2), 0L, pVarF, 54, 4)), fL), jC, g2Var);
            androidx.compose.ui.c cVarI = companion2.i();
            pVarF.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(cVarI, false, pVarF, 6);
            pVarF.T(-1323940314);
            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA2 = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarC2);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA2);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
            Updater.j(pVarB2, i0VarK2, companion3.d());
            Updater.j(pVarB2, eVar3, companion3.b());
            Updater.j(pVarB2, layoutDirection2, companion3.c());
            Updater.j(pVarB2, d2Var2, companion3.f());
            pVarF.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            pVarF.T(881862015);
            if (pVar != null) {
                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(t1Var.b(z11, z10, pVarF, i14).getValue())}, pVar, pVarF, ((i15 >> 12) & 112) | 8);
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i16) {
                SwitchKt.b(kVar, z10, z11, t1Var, m2Var, pVar, eVar, g2Var, f10, f11, f12, pVar3, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    private static final long c(m2<androidx.compose.ui.graphics.l0> m2Var) {
        return m2Var.getValue().M();
    }

    private static final long d(m2<androidx.compose.ui.graphics.l0> m2Var) {
        return m2Var.getValue().M();
    }

    private static final boolean e(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }

    public static final float h() {
        return f11123a;
    }

    public static final float i() {
        return f11124b;
    }
}
