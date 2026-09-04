package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.R;
import com.umeng.analytics.pro.ak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\"\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010\u0018\u00010\u000f*\u00020\u000eH\u0002\u001a \u0010\u0012\u001a\u00020\u000e*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000fH\u0002\"\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroid/view/View;", sd.b.f139384b, "Landroidx/savedstate/d;", "owner", "Landroidx/compose/ui/platform/q0;", ak.av, "", "id", "savedStateRegistryOwner", "b", "", "value", "", "e", "Landroid/os/Bundle;", "", "", "g", "f", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class DisposableSaveableStateRegistry_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Class<? extends Object>[] f15634a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements androidx.savedstate.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.saveable.c f15639a;

        a(androidx.compose.runtime.saveable.c cVar) {
            this.f15639a = cVar;
        }

        @Override // androidx.savedstate.b.c
        @dl.d
        public final Bundle saveState() {
            return DisposableSaveableStateRegistry_androidKt.f(this.f15639a.c());
        }
    }

    @dl.d
    public static final q0 a(@dl.d View view, @dl.d androidx.savedstate.d owner) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(owner, "owner");
        Object parent = view.getParent();
        kotlin.jvm.internal.f0.n(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return b(strValueOf, owner);
    }

    @dl.d
    public static final q0 b(@dl.d String id2, @dl.d androidx.savedstate.d savedStateRegistryOwner) {
        final boolean z10;
        kotlin.jvm.internal.f0.p(id2, "id");
        kotlin.jvm.internal.f0.p(savedStateRegistryOwner, "savedStateRegistryOwner");
        final String str = androidx.compose.runtime.saveable.c.class.getSimpleName() + ':' + id2;
        final androidx.savedstate.b savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle bundleB = savedStateRegistry.b(str);
        androidx.compose.runtime.saveable.c cVarA = SaveableStateRegistryKt.a(bundleB != null ? g(bundleB) : null, new yh.l<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d Object it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.e(it));
            }
        });
        try {
            savedStateRegistry.j(str, new a(cVarA));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new q0(cVarA, new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z10) {
                    savedStateRegistry.m(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.r) {
            androidx.compose.runtime.snapshots.r rVar = (androidx.compose.runtime.snapshots.r) obj;
            if (rVar.a() != androidx.compose.runtime.e2.l() && rVar.a() != androidx.compose.runtime.e2.w() && rVar.a() != androidx.compose.runtime.e2.s()) {
                return false;
            }
            T value = rVar.getValue();
            if (value == 0) {
                return true;
            }
            return e(value);
        }
        if ((obj instanceof kotlin.u) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f15634a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle f(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = bundle.keySet();
        kotlin.jvm.internal.f0.o(setKeySet, "this.keySet()");
        for (String key : setKeySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(key);
            kotlin.jvm.internal.f0.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            kotlin.jvm.internal.f0.o(key, "key");
            linkedHashMap.put(key, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
