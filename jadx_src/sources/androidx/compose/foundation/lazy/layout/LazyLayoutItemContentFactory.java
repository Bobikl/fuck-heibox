package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J(\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0010R\u00020\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "key", ak.aF, "", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "b", "(ILjava/lang/Object;)Lyh/p;", "Landroidx/compose/runtime/saveable/b;", ak.av, "Landroidx/compose/runtime/saveable/b;", "saveableStateHolder", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "Ljava/util/Map;", "lambdasCache", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "Lyh/a;", "d", "()Lyh/a;", "<init>", "(Landroidx/compose/runtime/saveable/b;Lyh/a;)V", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyLayoutItemContentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.saveable.b saveableStateHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<i> f7051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, CachedItemContent> lambdasCache;

    /* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", ak.aF, "()Lyh/p;", ak.av, "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "key", "b", "g", "type", "", "<set-?>", "Landroidx/compose/runtime/a1;", "f", "()I", RXScreenCaptureService.KEY_HEIGHT, "(I)V", "lastKnownIndex", "d", "content", "initialIndex", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public final class CachedItemContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Object key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final Object type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final a1 lastKnownIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> f7056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ LazyLayoutItemContentFactory f7057e;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @dl.d int i10, @dl.e Object key, Object obj) {
            f0.p(key, "key");
            this.f7057e = lazyLayoutItemContentFactory;
            this.key = key;
            this.type = obj;
            this.lastKnownIndex = h2.g(Integer.valueOf(i10), null, 2, null);
        }

        private final yh.p<androidx.compose.runtime.p, Integer, b2> c() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f7057e;
            return androidx.compose.runtime.internal.b.c(1403994769, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
                    final int iF;
                    if ((i10 & 11) == 2 && pVar.b()) {
                        pVar.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)");
                    }
                    final i iVarInvoke = lazyLayoutItemContentFactory.d().invoke();
                    Integer num = iVarInvoke.d().get(this.getKey());
                    if (num != null) {
                        this.h(num.intValue());
                        iF = num.intValue();
                    } else {
                        iF = this.f();
                    }
                    pVar.T(-715770513);
                    if (iF < iVarInvoke.a()) {
                        Object objE = iVarInvoke.e(iF);
                        if (f0.g(objE, this.getKey())) {
                            lazyLayoutItemContentFactory.saveableStateHolder.f(objE, androidx.compose.runtime.internal.b.b(pVar, -1238863364, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                                    if ((i11 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1238863364, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous>.<anonymous> (LazyLayoutItemContentFactory.kt:97)");
                                    }
                                    iVarInvoke.c(iF, pVar2, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num2) {
                                    a(pVar2, num2.intValue());
                                    return b2.f124493a;
                                }
                            }), pVar, bb.c.b.W7);
                        }
                    }
                    pVar.c0();
                    Object key = this.getKey();
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    EffectsKt.c(key, new yh.l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.2

                        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$a */
                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f7063a;

                            public a(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
                                this.f7063a = cachedItemContent;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                this.f7063a.f7056d = null;
                            }
                        }

                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            return new a(cachedItemContent);
                        }
                    }, pVar, 8);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
                    a(pVar, num.intValue());
                    return b2.f124493a;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(int i10) {
            this.lastKnownIndex.setValue(Integer.valueOf(i10));
        }

        @dl.d
        public final yh.p<androidx.compose.runtime.p, Integer, b2> d() {
            yh.p pVar = this.f7056d;
            if (pVar != null) {
                return pVar;
            }
            yh.p<androidx.compose.runtime.p, Integer, b2> pVarC = c();
            this.f7056d = pVarC;
            return pVarC;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int f() {
            return ((Number) this.lastKnownIndex.getValue()).intValue();
        }

        @dl.e
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Object getType() {
            return this.type;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.d yh.a<? extends i> itemProvider) {
        f0.p(saveableStateHolder, "saveableStateHolder");
        f0.p(itemProvider, "itemProvider");
        this.saveableStateHolder = saveableStateHolder;
        this.f7051b = itemProvider;
        this.lambdasCache = new LinkedHashMap();
    }

    @dl.d
    public final yh.p<androidx.compose.runtime.p, Integer, b2> b(int index, @dl.d Object key) {
        f0.p(key, "key");
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        Object objB = this.f7051b.invoke().b(index);
        if (cachedItemContent != null && cachedItemContent.f() == index && f0.g(cachedItemContent.getType(), objB)) {
            return cachedItemContent.d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, index, key, objB);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.d();
    }

    @dl.e
    public final Object c(@dl.e Object key) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null) {
            return cachedItemContent.getType();
        }
        i iVarInvoke = this.f7051b.invoke();
        Integer num = iVarInvoke.d().get(key);
        if (num != null) {
            return iVarInvoke.b(num.intValue());
        }
        return null;
    }

    @dl.d
    public final yh.a<i> d() {
        return this.f7051b;
    }
}
