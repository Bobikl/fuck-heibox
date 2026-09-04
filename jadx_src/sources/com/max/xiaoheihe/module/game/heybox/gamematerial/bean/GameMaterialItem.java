package com.max.xiaoheihe.module.game.heybox.gamematerial.bean;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.bbs.ImageInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameMaterialObj.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameMaterialItem implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"imgs"}, value = SocialConstants.PARAM_IMG_URL)
    @e
    private final ImageInfoObj img;

    @e
    private final String img_num;

    @SerializedName("link_id")
    @e
    private final Integer linkId;

    @e
    private final String source;

    public GameMaterialItem(@e Integer num, @e ImageInfoObj imageInfoObj, @e String str, @e String str2) {
        this.linkId = num;
        this.img = imageInfoObj;
        this.source = str;
        this.img_num = str2;
    }

    public /* synthetic */ GameMaterialItem(Integer num, ImageInfoObj imageInfoObj, String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : imageInfoObj, str, str2);
    }

    public static /* synthetic */ GameMaterialItem copy$default(GameMaterialItem gameMaterialItem, Integer num, ImageInfoObj imageInfoObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialItem, num, imageInfoObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 37513, new Class[]{GameMaterialItem.class, Integer.class, ImageInfoObj.class, String.class, String.class, Integer.TYPE, Object.class}, GameMaterialItem.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMaterialItem) patchProxyResultProxy.result;
        }
        return gameMaterialItem.copy((i10 & 1) != 0 ? gameMaterialItem.linkId : num, (i10 & 2) != 0 ? gameMaterialItem.img : imageInfoObj, (i10 & 4) != 0 ? gameMaterialItem.source : str, (i10 & 8) != 0 ? gameMaterialItem.img_num : str2);
    }

    @e
    public final Integer component1() {
        return this.linkId;
    }

    @e
    public final ImageInfoObj component2() {
        return this.img;
    }

    @e
    public final String component3() {
        return this.source;
    }

    @e
    public final String component4() {
        return this.img_num;
    }

    @d
    public final GameMaterialItem copy(@e Integer num, @e ImageInfoObj imageInfoObj, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, imageInfoObj, str, str2}, this, changeQuickRedirect, false, 37512, new Class[]{Integer.class, ImageInfoObj.class, String.class, String.class}, GameMaterialItem.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialItem) patchProxyResultProxy.result : new GameMaterialItem(num, imageInfoObj, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37510, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameMaterialItem)) {
            return false;
        }
        GameMaterialItem gameMaterialItem = (GameMaterialItem) obj;
        return f0.g(this.linkId, gameMaterialItem.linkId) && f0.g(this.img, gameMaterialItem.img) && f0.g(this.source, gameMaterialItem.source) && f0.g(this.img_num, gameMaterialItem.img_num);
    }

    @e
    public final ImageInfoObj getImg() {
        return this.img;
    }

    @e
    public final String getImg_num() {
        return this.img_num;
    }

    @e
    public final Integer getLinkId() {
        return this.linkId;
    }

    @e
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37511, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.linkId;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        ImageInfoObj imageInfoObj = this.img;
        int iHashCode = (iIntValue + (imageInfoObj != null ? imageInfoObj.hashCode() : 0)) * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.img_num;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37514, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameMaterialItem(linkId=" + this.linkId + ", img=" + this.img + ", source=" + this.source + ", img_num=" + this.img_num + ')';
    }
}
