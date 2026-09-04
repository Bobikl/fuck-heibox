package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.u1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010 B1\u0012(\b\u0002\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002J*\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0016R4\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0013R\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/b;", "", "", "", "", "", RXScreenCaptureService.KEY_HEIGHT, "key", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "f", "(Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "d", ak.av, "Ljava/util/Map;", "savedStates", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "b", "registryHolders", "Landroidx/compose/runtime/saveable/c;", ak.aF, "Landroidx/compose/runtime/saveable/c;", "g", "()Landroidx/compose/runtime/saveable/c;", "i", "(Landroidx/compose/runtime/saveable/c;)V", "parentSaveableStateRegistry", "<init>", "(Ljava/util/Map;)V", "RegistryHolder", "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
public final class SaveableStateHolderImpl implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final e<SaveableStateHolderImpl, ?> f13108e = SaverKt.a(new p<f, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Object, Map<String, List<Object>>> invoke(@dl.d f Saver, @dl.d SaveableStateHolderImpl it) {
            f0.p(Saver, "$this$Saver");
            f0.p(it, "it");
            return it.h();
        }
    }, new l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SaveableStateHolderImpl invoke(@dl.d Map<Object, Map<String, List<Object>>> it) {
            f0.p(it, "it");
            return new SaveableStateHolderImpl(it);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Object, RegistryHolder> registryHolders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c parentSaveableStateRegistry;

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u0002R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "", "", "", "", "map", "Lkotlin/b2;", "d", ak.av, "Ljava/lang/Object;", "()Ljava/lang/Object;", "key", "", "b", "Z", ak.aF, "()Z", "e", "(Z)V", "shouldSave", "Landroidx/compose/runtime/saveable/c;", "Landroidx/compose/runtime/saveable/c;", "()Landroidx/compose/runtime/saveable/c;", "registry", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
    public final class RegistryHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Object key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldSave;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final c registry;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SaveableStateHolderImpl f13117d;

        public RegistryHolder(@dl.d final SaveableStateHolderImpl saveableStateHolderImpl, Object key) {
            f0.p(key, "key");
            this.f13117d = saveableStateHolderImpl;
            this.key = key;
            this.shouldSave = true;
            this.registry = SaveableStateRegistryKt.a((Map) saveableStateHolderImpl.savedStates.get(key), new l<Object, Boolean>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$RegistryHolder$registry$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d Object it) {
                    f0.p(it, "it");
                    c parentSaveableStateRegistry = saveableStateHolderImpl.getParentSaveableStateRegistry();
                    return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.a(it) : true);
                }
            });
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getRegistry() {
            return this.registry;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void d(@dl.d Map<Object, Map<String, List<Object>>> map) {
            f0.p(map, "map");
            if (this.shouldSave) {
                Map<String, List<Object>> mapC = this.registry.c();
                if (mapC.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, mapC);
                }
            }
        }

        public final void e(boolean z10) {
            this.shouldSave = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.saveable.SaveableStateHolderImpl$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final e<SaveableStateHolderImpl, ?> a() {
            return SaveableStateHolderImpl.f13108e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SaveableStateHolderImpl(@dl.d Map<Object, Map<String, List<Object>>> savedStates) {
        f0.p(savedStates, "savedStates");
        this.savedStates = savedStates;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> mapJ0 = s0.J0(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((RegistryHolder) it.next()).d(mapJ0);
        }
        if (mapJ0.isEmpty()) {
            return null;
        }
        return mapJ0;
    }

    @Override // androidx.compose.runtime.saveable.b
    public void d(@dl.d Object key) {
        f0.p(key, "key");
        RegistryHolder registryHolder = this.registryHolders.get(key);
        if (registryHolder != null) {
            registryHolder.e(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    @Override // androidx.compose.runtime.saveable.b
    @h
    public void f(@dl.d final Object key, @dl.d final p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        f0.p(key, "key");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1198538093);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1198538093, i10, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        pVarF.T(444418301);
        pVarF.i(207, key);
        pVarF.T(-642722479);
        pVarF.T(-492369756);
        Object objU = pVarF.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            c parentSaveableStateRegistry = getParentSaveableStateRegistry();
            if (!(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.a(key) : true)) {
                throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objU = new RegistryHolder(this, key);
            pVarF.N(objU);
        }
        pVarF.c0();
        final RegistryHolder registryHolder = (RegistryHolder) objU;
        CompositionLocalKt.b(new k1[]{SaveableStateRegistryKt.b().f(registryHolder.getRegistry())}, content, pVarF, (i10 & 112) | 8);
        EffectsKt.c(b2.f124493a, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ SaveableStateHolderImpl.RegistryHolder f13122a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ SaveableStateHolderImpl f13123b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f13124c;

                public a(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
                    this.f13122a = registryHolder;
                    this.f13123b = saveableStateHolderImpl;
                    this.f13124c = obj;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f13122a.d(this.f13123b.savedStates);
                    this.f13123b.registryHolders.remove(this.f13124c);
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
                boolean z10 = !this.f13119b.registryHolders.containsKey(key);
                Object obj = key;
                if (z10) {
                    this.f13119b.savedStates.remove(key);
                    this.f13119b.registryHolders.put(key, registryHolder);
                    return new a(registryHolder, this.f13119b, key);
                }
                throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
            }
        }, pVarF, 0);
        pVarF.c0();
        pVarF.S();
        pVarF.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f13125b.f(key, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void i(@dl.e c cVar) {
        this.parentSaveableStateRegistry = cVar;
    }
}
