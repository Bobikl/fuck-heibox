package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.j1;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\"\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Landroidx/compose/runtime/saveable/c;", ak.av, "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", "b", "()Landroidx/compose/runtime/j1;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 7, 1})
public final class SaveableStateRegistryKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<c> f13130a = CompositionLocalKt.e(new yh.a<c>() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return null;
        }
    });

    @dl.d
    public static final c a(@dl.e Map<String, ? extends List<? extends Object>> map, @dl.d l<Object, Boolean> canBeSaved) {
        f0.p(canBeSaved, "canBeSaved");
        return new d(map, canBeSaved);
    }

    @dl.d
    public static final j1<c> b() {
        return f13130a;
    }
}
