package com.max.xiaoheihe.module.game.heybox.gamematerial.data;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialListObj;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;

/* JADX INFO: compiled from: GameMaterialRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameMaterialRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f87457a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ Result a(GameMaterialRepository gameMaterialRepository, String str, String str2, String str3, String str4, int i10, int i11) {
        Object[] objArr = {gameMaterialRepository, str, str2, str3, str4, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 37528, new Class[]{GameMaterialRepository.class, String.class, String.class, String.class, String.class, cls, cls}, Result.class);
        return patchProxyResultProxy.isSupported ? (Result) patchProxyResultProxy.result : gameMaterialRepository.d(str, str2, str3, str4, i10, i11);
    }

    private final Result<GameMaterialListObj> d(String str, String str2, String str3, String str4, int i10, int i11) {
        Object[] objArr = {str, str2, str3, str4, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37527, new Class[]{String.class, String.class, String.class, String.class, cls, cls}, Result.class);
        return patchProxyResultProxy.isSupported ? (Result) patchProxyResultProxy.result : i.a().ab(str, str2, str3, str4, i10, i11).execute().a();
    }

    @d
    public final e<Result<GameMaterialListObj>> b(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, int i10, int i11) {
        Object[] objArr = {str, str2, str3, str4, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37526, new Class[]{String.class, String.class, String.class, String.class, cls, cls}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : g.N0(g.I0(new GameMaterialRepository$getGameMaterialList$1(this, str, str2, str3, str4, i10, i11, null)), e1.c());
    }

    @d
    public final e<Result<GameMaterialObj>> c(@d String topicId) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicId}, this, changeQuickRedirect, false, 37525, new Class[]{String.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(topicId, "topicId");
        return g.N0(g.I0(new GameMaterialRepository$getGameMaterialObj$1(topicId, null)), e1.c());
    }
}
