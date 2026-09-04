package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.g;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BP\u00121\u0010%\u001a-\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00160\u0007¢\u0006\u0002\b#¢\u0006\u0002\b$\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.JV\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u000526\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00010\u0007H\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!RB\u0010%\u001a-\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00160\u0007¢\u0006\u0002\b#¢\u0006\u0002\b$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider;", "Landroidx/compose/foundation/lazy/layout/g;", "IntervalContent", "Landroidx/compose/foundation/lazy/layout/i;", androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function2;", "Lkotlin/m0;", "name", "localIndex", "content", "block", "n", "(ILyh/p;)Ljava/lang/Object;", "Lfi/l;", k0.f48802q, "Landroidx/compose/foundation/lazy/layout/c;", "list", "", "", "k", "Lkotlin/b2;", ak.aF, "(ILandroidx/compose/runtime/p;I)V", "e", "b", "Landroidx/compose/foundation/lazy/layout/c;", "l", "()Landroidx/compose/foundation/lazy/layout/c;", "intervals", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "keyToIndexMap", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "itemContentProvider", "Lyh/r;", "m", "()Lyh/r;", ak.av, "()I", "itemCount", "nearestItemsRange", "<init>", "(Lyh/r;Landroidx/compose/foundation/lazy/layout/c;Lfi/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultLazyLayoutItemsProvider<IntervalContent extends g> implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.r<IntervalContent, Integer, androidx.compose.runtime.p, Integer, b2> f7010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c<IntervalContent> intervals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, Integer> keyToIndexMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultLazyLayoutItemsProvider(@dl.d yh.r<? super IntervalContent, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContentProvider, @dl.d c<? extends IntervalContent> intervals, @dl.d fi.l nearestItemsRange) {
        f0.p(itemContentProvider, "itemContentProvider");
        f0.p(intervals, "intervals");
        f0.p(nearestItemsRange, "nearestItemsRange");
        this.f7010a = itemContentProvider;
        this.intervals = intervals;
        this.keyToIndexMap = k(nearestItemsRange, intervals);
    }

    @androidx.compose.foundation.t
    private final Map<Object, Integer> k(fi.l range, c<? extends g> list) {
        final int iH = range.h();
        if (!(iH >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final int iMin = Math.min(range.i(), list.getSize() - 1);
        if (iMin < iH) {
            return s0.z();
        }
        final HashMap map = new HashMap();
        list.b(iH, iMin, new yh.l<c.a<? extends g>, b2>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d c.a<? extends g> it) {
                f0.p(it, "it");
                if (it.c().getKey() == null) {
                    return;
                }
                yh.l<Integer, Object> key = it.c().getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                int iMax = Math.max(iH, it.getStartIndex());
                int iMin2 = Math.min(iMin, (it.getStartIndex() + it.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) - 1);
                if (iMax > iMin2) {
                    return;
                }
                while (true) {
                    map.put(key.invoke(Integer.valueOf(iMax - it.getStartIndex())), Integer.valueOf(iMax));
                    if (iMax == iMin2) {
                        return;
                    } else {
                        iMax++;
                    }
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(c.a<? extends g> aVar) {
                a(aVar);
                return b2.f124493a;
            }
        });
        return map;
    }

    private final <T> T n(int index, yh.p<? super Integer, ? super IntervalContent, ? extends T> block) {
        c.a<IntervalContent> aVar = this.intervals.get(index);
        return block.invoke(Integer.valueOf(index - aVar.getStartIndex()), aVar.c());
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int a() {
        return this.intervals.getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.e
    public Object b(int index) {
        c.a<IntervalContent> aVar = this.intervals.get(index);
        return aVar.c().getType().invoke(Integer.valueOf(index - aVar.getStartIndex()));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @androidx.compose.runtime.h
    public void c(final int i10, @dl.e androidx.compose.runtime.p pVar, final int i11) {
        int i12;
        androidx.compose.runtime.p pVarF = pVar.F(-1877726744);
        if ((i11 & 14) == 0) {
            i12 = (pVarF.y(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= pVarF.s(this) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1877726744, i11, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:115)");
            }
            c.a<IntervalContent> aVar = this.intervals.get(i10);
            this.f7010a.U0(aVar.c(), Integer.valueOf(i10 - aVar.getStartIndex()), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>(this) { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider$Item$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ DefaultLazyLayoutItemsProvider<IntervalContent> f7013b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f7013b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                this.f7013b.c(i10, pVar2, i11 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Map<Object, Integer> d() {
        return this.keyToIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Object e(int index) {
        Object objInvoke;
        c.a<IntervalContent> aVar = this.intervals.get(index);
        int startIndex = index - aVar.getStartIndex();
        yh.l<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? r.a(index) : objInvoke;
    }

    @dl.d
    public final c<IntervalContent> l() {
        return this.intervals;
    }

    @dl.d
    public final yh.r<IntervalContent, Integer, androidx.compose.runtime.p, Integer, b2> m() {
        return this.f7010a;
    }
}
