package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.u1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\t\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001(B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$B1\b\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0018\u00010\u000e¢\u0006\u0004\b#\u0010'J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001J!\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nH\u0096\u0001J\u001c\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f0\u000eH\u0016J*\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00032\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0002\b\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R/\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/c;", "Landroidx/compose/runtime/saveable/b;", "", "value", "", ak.av, "", "key", "e", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/c$a;", "b", "", "", ak.aF, "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "f", "(Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "d", "Landroidx/compose/runtime/saveable/c;", "wrappedRegistry", "<set-?>", "Landroidx/compose/runtime/a1;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/saveable/b;", "i", "(Landroidx/compose/runtime/saveable/b;)V", "wrappedHolder", "", "Ljava/util/Set;", "previouslyComposedKeys", "<init>", "(Landroidx/compose/runtime/saveable/c;)V", "parentRegistry", "restoredValues", "(Landroidx/compose/runtime/saveable/c;Ljava/util/Map;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazySaveableStateHolder implements androidx.compose.runtime.saveable.c, androidx.compose.runtime.saveable.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.saveable.c wrappedRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 wrappedHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<Object> previouslyComposedKeys;

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "Landroidx/compose/runtime/saveable/c;", "parentRegistry", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", ak.av, "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<LazySaveableStateHolder, Map<String, List<Object>>> a(@dl.e final androidx.compose.runtime.saveable.c parentRegistry) {
            return SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Map<String, List<Object>> invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d LazySaveableStateHolder it) {
                    f0.p(Saver, "$this$Saver");
                    f0.p(it, "it");
                    Map<String, List<Object>> mapC = it.c();
                    if (mapC.isEmpty()) {
                        return null;
                    }
                    return mapC;
                }
            }, new yh.l<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LazySaveableStateHolder invoke(@dl.d Map<String, ? extends List<? extends Object>> restored) {
                    f0.p(restored, "restored");
                    return new LazySaveableStateHolder(parentRegistry, restored);
                }
            });
        }
    }

    public LazySaveableStateHolder(@dl.d androidx.compose.runtime.saveable.c wrappedRegistry) {
        f0.p(wrappedRegistry, "wrappedRegistry");
        this.wrappedRegistry = wrappedRegistry;
        this.wrappedHolder = h2.g(null, null, 2, null);
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    public LazySaveableStateHolder(@dl.e final androidx.compose.runtime.saveable.c cVar, @dl.e Map<String, ? extends List<? extends Object>> map) {
        this(SaveableStateRegistryKt.a(map, new yh.l<Object, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d Object it) {
                f0.p(it, "it");
                androidx.compose.runtime.saveable.c cVar2 = cVar;
                return Boolean.valueOf(cVar2 != null ? cVar2.a(it) : true);
            }
        }));
    }

    @Override // androidx.compose.runtime.saveable.c
    public boolean a(@dl.d Object value) {
        f0.p(value, "value");
        return this.wrappedRegistry.a(value);
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.d
    public androidx.compose.runtime.saveable.c.a b(@dl.d String key, @dl.d yh.a<? extends Object> valueProvider) {
        f0.p(key, "key");
        f0.p(valueProvider, "valueProvider");
        return this.wrappedRegistry.b(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.d
    public Map<String, List<Object>> c() {
        androidx.compose.runtime.saveable.b bVarH = h();
        if (bVarH != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                bVarH.d(it.next());
            }
        }
        return this.wrappedRegistry.c();
    }

    @Override // androidx.compose.runtime.saveable.b
    public void d(@dl.d Object key) {
        f0.p(key, "key");
        androidx.compose.runtime.saveable.b bVarH = h();
        if (bVarH == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        bVarH.d(key);
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.e
    public Object e(@dl.d String key) {
        f0.p(key, "key");
        return this.wrappedRegistry.e(key);
    }

    @Override // androidx.compose.runtime.saveable.b
    @androidx.compose.runtime.h
    public void f(@dl.d final Object key, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        f0.p(key, "key");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-697180401);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-697180401, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        androidx.compose.runtime.saveable.b bVarH = h();
        if (bVarH == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        bVarH.f(key, content, pVarF, (i10 & 112) | bb.c.b.f30512a7);
        EffectsKt.c(key, new yh.l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ LazySaveableStateHolder f7120a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f7121b;

                public a(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
                    this.f7120a = lazySaveableStateHolder;
                    this.f7121b = obj;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f7120a.previouslyComposedKeys.add(this.f7121b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                f0.p(DisposableEffect, "$this$DisposableEffect");
                this.f7118b.previouslyComposedKeys.remove(key);
                return new a(this.f7118b, key);
            }
        }, pVarF, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f7122b.f(key, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.e
    public final androidx.compose.runtime.saveable.b h() {
        return (androidx.compose.runtime.saveable.b) this.wrappedHolder.getValue();
    }

    public final void i(@dl.e androidx.compose.runtime.saveable.b bVar) {
        this.wrappedHolder.setValue(bVar);
    }
}
