package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/lazy/g;", "", "it", "Lkotlin/b2;", ak.av, "(Landroidx/compose/foundation/lazy/g;ILandroidx/compose/runtime/p;I)V"}, k = 3, mv = {1, 7, 1})
public final class LazyDslKt$items$8 extends Lambda implements yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.r<g, T, androidx.compose.runtime.p, Integer, b2> f6473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ T[] f6474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$8(yh.r<? super g, ? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> rVar, T[] tArr) {
        super(4);
        this.f6473b = rVar;
        this.f6474c = tArr;
    }

    @Override // yh.r
    public /* bridge */ /* synthetic */ b2 U0(g gVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
        a(gVar, num.intValue(), pVar, num2.intValue());
        return b2.f124493a;
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
    @androidx.compose.runtime.h
    public final void a(@dl.d g items, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
        int i12;
        f0.p(items, "$this$items");
        if ((i11 & 14) == 0) {
            i12 = (pVar.s(items) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= pVar.y(i10) ? 32 : 16;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVar.b()) {
            pVar.l();
            return;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1043393750, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:214)");
        }
        this.f6473b.U0(items, this.f6474c[i10], pVar, Integer.valueOf(i12 & 14));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
    }
}
