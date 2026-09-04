package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.x0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.UiState;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialObj;
import com.max.xiaoheihe.module.game.heybox.gamematerial.data.GameMaterialRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.k;

/* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameMaterialLibraryViewModel extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f87618p = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final GameMaterialRepository f87619d = new GameMaterialRepository();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final j<String> f87620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final u<String> f87621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final j<KeyDescObj> f87622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final u<KeyDescObj> f87623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final j<KeyDescObj> f87624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final u<KeyDescObj> f87625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final j<List<a>> f87626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final u<List<a>> f87627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final j<Pair<Integer, Integer>> f87628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final j<UiState<GameMaterialObj>> f87629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final u<UiState<GameMaterialObj>> f87630o;

    public GameMaterialLibraryViewModel() {
        j<String> jVarA = v.a(null);
        this.f87620e = jVarA;
        this.f87621f = jVarA;
        j<KeyDescObj> jVarA2 = v.a(null);
        this.f87622g = jVarA2;
        this.f87623h = jVarA2;
        j<KeyDescObj> jVarA3 = v.a(null);
        this.f87624i = jVarA3;
        this.f87625j = jVarA3;
        j<List<a>> jVarA4 = v.a(null);
        this.f87626k = jVarA4;
        this.f87627l = jVarA4;
        this.f87628m = v.a(new Pair(null, null));
        j<UiState<GameMaterialObj>> jVarA5 = v.a(UiState.Loading.f66632b);
        this.f87629n = jVarA5;
        this.f87630o = jVarA5;
    }

    @dl.d
    public final u<List<a>> i() {
        return this.f87627l;
    }

    @dl.d
    public final GameMaterialRepository k() {
        return this.f87619d;
    }

    @dl.d
    public final u<KeyDescObj> m() {
        return this.f87625j;
    }

    @dl.d
    public final u<KeyDescObj> n() {
        return this.f87623h;
    }

    @dl.d
    public final u<String> o() {
        return this.f87621f;
    }

    @dl.d
    public final u<UiState<GameMaterialObj>> p() {
        return this.f87630o;
    }

    public final void r(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37800, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("GameMaterialLibraryViewModel, onFilterItemChecked, listIndex = " + i10 + ", secondIndex = " + i11 + ", " + this.f87627l.getValue());
        this.f87628m.d(new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11)));
        List<a> value = this.f87627l.getValue();
        if (i10 > (value != null ? value.size() : 0) - 1) {
            return;
        }
        k.f(x0.a(this), null, null, new GameMaterialLibraryViewModel$onFilterItemChecked$1(this, i10, i11, null), 3, null);
    }

    public final void s() {
        String value;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37804, new Class[0], Void.TYPE).isSupported || (value = this.f87621f.getValue()) == null) {
            return;
        }
        g.f74531b.q("GameMaterialLibraryViewModel, requestHomeData, topicId = " + value);
        k.f(x0.a(this), null, null, new GameMaterialLibraryViewModel$requestHomeData$1(this, value, null), 3, null);
    }

    public final void t(@dl.d KeyDescObj sizeKey) {
        if (PatchProxy.proxy(new Object[]{sizeKey}, this, changeQuickRedirect, false, 37803, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sizeKey, "sizeKey");
        g.f74531b.q("GameMaterialLibraryViewModel, setSizeKey, sizeKey = " + sizeKey);
        this.f87624i.setValue(sizeKey);
    }

    public final void u(@dl.d KeyDescObj sortKey) {
        if (PatchProxy.proxy(new Object[]{sortKey}, this, changeQuickRedirect, false, 37802, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sortKey, "sortKey");
        g.f74531b.q("GameMaterialLibraryViewModel, setSortKey, sortKey = " + sortKey + ", current = " + this.f87622g.getValue());
        this.f87622g.setValue(sortKey);
    }

    public final void v(@dl.d String topicId) {
        if (PatchProxy.proxy(new Object[]{topicId}, this, changeQuickRedirect, false, 37801, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(topicId, "topicId");
        g.f74531b.q("GameMaterialLibraryViewModel, setTopicId, topicId = " + topicId);
        this.f87620e.setValue(topicId);
    }
}
