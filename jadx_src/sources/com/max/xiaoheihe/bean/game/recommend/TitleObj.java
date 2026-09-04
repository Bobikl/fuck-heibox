package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TitleObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TitleObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_color;

    @e
    private String bottom;

    @e
    private String desc;

    @e
    private String more_button_text;

    @e
    private String name;

    @e
    private String prot;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15415, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleObj) || !super.equals(obj)) {
            return false;
        }
        TitleObj titleObj = (TitleObj) obj;
        return f0.g(this.name, titleObj.name) && f0.g(this.desc, titleObj.desc) && f0.g(this.prot, titleObj.prot) && f0.g(this.more_button_text, titleObj.more_button_text) && f0.g(this.bg_color, titleObj.bg_color);
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final String getBottom() {
        return this.bottom;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getMore_button_text() {
        return this.more_button_text;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15416, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.prot;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.more_button_text;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.bg_color;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setBottom(@e String str) {
        this.bottom = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setMore_button_text(@e String str) {
        this.more_button_text = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }
}
