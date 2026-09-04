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

/* JADX INFO: compiled from: GameShotListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameShotListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GameShotPictureFolderObj current_folder;

    @e
    private List<GameScreenPicShotObj> screen_shots;

    @e
    private String tips_img_url;

    @e
    private String toast;

    public GameShotListObj(@e List<GameScreenPicShotObj> list, @e GameShotPictureFolderObj gameShotPictureFolderObj, @e String str, @e String str2) {
        this.screen_shots = list;
        this.current_folder = gameShotPictureFolderObj;
        this.tips_img_url = str;
        this.toast = str2;
    }

    public static /* synthetic */ GameShotListObj copy$default(GameShotListObj gameShotListObj, List list, GameShotPictureFolderObj gameShotPictureFolderObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameShotListObj, list, gameShotPictureFolderObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14860, new Class[]{GameShotListObj.class, List.class, GameShotPictureFolderObj.class, String.class, String.class, Integer.TYPE, Object.class}, GameShotListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameShotListObj) patchProxyResultProxy.result;
        }
        return gameShotListObj.copy((i10 & 1) != 0 ? gameShotListObj.screen_shots : list, (i10 & 2) != 0 ? gameShotListObj.current_folder : gameShotPictureFolderObj, (i10 & 4) != 0 ? gameShotListObj.tips_img_url : str, (i10 & 8) != 0 ? gameShotListObj.toast : str2);
    }

    @e
    public final List<GameScreenPicShotObj> component1() {
        return this.screen_shots;
    }

    @e
    public final GameShotPictureFolderObj component2() {
        return this.current_folder;
    }

    @e
    public final String component3() {
        return this.tips_img_url;
    }

    @e
    public final String component4() {
        return this.toast;
    }

    @d
    public final GameShotListObj copy(@e List<GameScreenPicShotObj> list, @e GameShotPictureFolderObj gameShotPictureFolderObj, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, gameShotPictureFolderObj, str, str2}, this, changeQuickRedirect, false, 14859, new Class[]{List.class, GameShotPictureFolderObj.class, String.class, String.class}, GameShotListObj.class);
        return patchProxyResultProxy.isSupported ? (GameShotListObj) patchProxyResultProxy.result : new GameShotListObj(list, gameShotPictureFolderObj, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14863, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameShotListObj)) {
            return false;
        }
        GameShotListObj gameShotListObj = (GameShotListObj) obj;
        return f0.g(this.screen_shots, gameShotListObj.screen_shots) && f0.g(this.current_folder, gameShotListObj.current_folder) && f0.g(this.tips_img_url, gameShotListObj.tips_img_url) && f0.g(this.toast, gameShotListObj.toast);
    }

    @e
    public final GameShotPictureFolderObj getCurrent_folder() {
        return this.current_folder;
    }

    @e
    public final List<GameScreenPicShotObj> getScreen_shots() {
        return this.screen_shots;
    }

    @e
    public final String getTips_img_url() {
        return this.tips_img_url;
    }

    @e
    public final String getToast() {
        return this.toast;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14862, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameScreenPicShotObj> list = this.screen_shots;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        GameShotPictureFolderObj gameShotPictureFolderObj = this.current_folder;
        int iHashCode2 = (iHashCode + (gameShotPictureFolderObj == null ? 0 : gameShotPictureFolderObj.hashCode())) * 31;
        String str = this.tips_img_url;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toast;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCurrent_folder(@e GameShotPictureFolderObj gameShotPictureFolderObj) {
        this.current_folder = gameShotPictureFolderObj;
    }

    public final void setScreen_shots(@e List<GameScreenPicShotObj> list) {
        this.screen_shots = list;
    }

    public final void setTips_img_url(@e String str) {
        this.tips_img_url = str;
    }

    public final void setToast(@e String str) {
        this.toast = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14861, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameShotListObj(screen_shots=" + this.screen_shots + ", current_folder=" + this.current_folder + ", tips_img_url=" + this.tips_img_url + ", toast=" + this.toast + ')';
    }
}
