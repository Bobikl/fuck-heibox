package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameShotPictureFolderListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameShotPictureFolderListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameShotPictureFolderObj> infos;

    public GameShotPictureFolderListObj(@e List<GameShotPictureFolderObj> list) {
        this.infos = list;
    }

    public static /* synthetic */ GameShotPictureFolderListObj copy$default(GameShotPictureFolderListObj gameShotPictureFolderListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameShotPictureFolderListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14865, new Class[]{GameShotPictureFolderListObj.class, List.class, Integer.TYPE, Object.class}, GameShotPictureFolderListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameShotPictureFolderListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = gameShotPictureFolderListObj.infos;
        }
        return gameShotPictureFolderListObj.copy(list);
    }

    @e
    public final List<GameShotPictureFolderObj> component1() {
        return this.infos;
    }

    @d
    public final GameShotPictureFolderListObj copy(@e List<GameShotPictureFolderObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14864, new Class[]{List.class}, GameShotPictureFolderListObj.class);
        return patchProxyResultProxy.isSupported ? (GameShotPictureFolderListObj) patchProxyResultProxy.result : new GameShotPictureFolderListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14868, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameShotPictureFolderListObj) && f0.g(this.infos, ((GameShotPictureFolderListObj) obj).infos);
    }

    @e
    public final List<GameShotPictureFolderObj> getInfos() {
        return this.infos;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14867, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameShotPictureFolderObj> list = this.infos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setInfos(@e List<GameShotPictureFolderObj> list) {
        this.infos = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14866, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameShotPictureFolderListObj(infos=" + this.infos + ')';
    }
}
