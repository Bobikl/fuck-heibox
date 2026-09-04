package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/saveable/b;", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/saveable/b;", "runtime-saveable_release"}, k = 2, mv = {1, 7, 1})
public final class SaveableStateHolderKt {
    @dl.d
    @h
    public static final b a(@dl.e p pVar, int i10) {
        pVar.T(15454635);
        if (ComposerKt.g0()) {
            ComposerKt.w0(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:58)");
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.d(new Object[0], SaveableStateHolderImpl.INSTANCE.a(), null, new yh.a<SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$rememberSaveableStateHolder$1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SaveableStateHolderImpl invoke() {
                return new SaveableStateHolderImpl(null, 1, null);
            }
        }, pVar, bb.c.d.f31377lj, 4);
        saveableStateHolderImpl.i((c) pVar.K(SaveableStateRegistryKt.b()));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return saveableStateHolderImpl;
    }
}
