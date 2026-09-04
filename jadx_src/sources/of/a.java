package of;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameLibrarySaveStateViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132287c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final q0 f132288b;

    public a(@d q0 savedStateHandle) {
        f0.p(savedStateHandle, "savedStateHandle");
        this.f132288b = savedStateHandle;
    }

    @e
    public final GameListObj c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38394, new Class[0], GameListObj.class);
        return patchProxyResultProxy.isSupported ? (GameListObj) patchProxyResultProxy.result : (GameListObj) this.f132288b.h("header_game_obj");
    }

    public final int e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38392, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = (Integer) this.f132288b.h("current_tab_index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @d
    public final ArrayList<KeyDescObj> f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38398, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<KeyDescObj> arrayList = (ArrayList) this.f132288b.h("page_list");
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    @e
    public final List<FilterGroup> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38396, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : (List) this.f132288b.h("shown_filter_list_obj");
    }

    public final void h(@e GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameListObj}, this, changeQuickRedirect, false, 38395, new Class[]{GameListObj.class}, Void.TYPE).isSupported || gameListObj == null) {
            return;
        }
        gameListObj.getGames().clear();
        this.f132288b.q("header_game_obj", gameListObj);
    }

    public final void i(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38393, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f132288b.q("current_tab_index", Integer.valueOf(i10));
    }

    public final void k(@d ArrayList<KeyDescObj> value) {
        if (PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, 38399, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(value, "value");
        this.f132288b.q("page_list", value);
    }

    public final void m(@e List<? extends FilterGroup> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38397, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f132288b.q("shown_filter_list_obj", list);
    }
}
