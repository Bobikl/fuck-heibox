package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BindGameCardV2.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BindGameCardV2 implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background;

    @e
    private String bottom_left_icon;

    @e
    private final String bottom_right_image;
    private boolean bound;

    @e
    private String game_type;

    @e
    private String key;

    @e
    private String name;

    @e
    private String nickname;

    @e
    private String protocol;

    @e
    private String top_left_icon;

    @e
    private String value;

    public BindGameCardV2(@e String str, boolean z10, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10) {
        this.game_type = str;
        this.bound = z10;
        this.background = str2;
        this.top_left_icon = str3;
        this.nickname = str4;
        this.bottom_left_icon = str5;
        this.bottom_right_image = str6;
        this.value = str7;
        this.key = str8;
        this.protocol = str9;
        this.name = str10;
    }

    public /* synthetic */ BindGameCardV2(String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? false : z10, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static /* synthetic */ BindGameCardV2 copy$default(BindGameCardV2 bindGameCardV2, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindGameCardV2, str, new Byte(z10 ? (byte) 1 : (byte) 0), str2, str3, str4, str5, str6, str7, str8, str9, str10, new Integer(i10), obj}, null, changeQuickRedirect, true, 14622, new Class[]{BindGameCardV2.class, String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, BindGameCardV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindGameCardV2) patchProxyResultProxy.result;
        }
        return bindGameCardV2.copy((i10 & 1) != 0 ? bindGameCardV2.game_type : str, (i10 & 2) != 0 ? bindGameCardV2.bound : z10 ? 1 : 0, (i10 & 4) != 0 ? bindGameCardV2.background : str2, (i10 & 8) != 0 ? bindGameCardV2.top_left_icon : str3, (i10 & 16) != 0 ? bindGameCardV2.nickname : str4, (i10 & 32) != 0 ? bindGameCardV2.bottom_left_icon : str5, (i10 & 64) != 0 ? bindGameCardV2.bottom_right_image : str6, (i10 & 128) != 0 ? bindGameCardV2.value : str7, (i10 & 256) != 0 ? bindGameCardV2.key : str8, (i10 & 512) != 0 ? bindGameCardV2.protocol : str9, (i10 & 1024) != 0 ? bindGameCardV2.name : str10);
    }

    @e
    public final String component1() {
        return this.game_type;
    }

    @e
    public final String component10() {
        return this.protocol;
    }

    @e
    public final String component11() {
        return this.name;
    }

    public final boolean component2() {
        return this.bound;
    }

    @e
    public final String component3() {
        return this.background;
    }

    @e
    public final String component4() {
        return this.top_left_icon;
    }

    @e
    public final String component5() {
        return this.nickname;
    }

    @e
    public final String component6() {
        return this.bottom_left_icon;
    }

    @e
    public final String component7() {
        return this.bottom_right_image;
    }

    @e
    public final String component8() {
        return this.value;
    }

    @e
    public final String component9() {
        return this.key;
    }

    @d
    public final BindGameCardV2 copy(@e String str, boolean z10, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), str2, str3, str4, str5, str6, str7, str8, str9, str10}, this, changeQuickRedirect, false, 14621, new Class[]{String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, BindGameCardV2.class);
        return patchProxyResultProxy.isSupported ? (BindGameCardV2) patchProxyResultProxy.result : new BindGameCardV2(str, z10, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14625, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindGameCardV2)) {
            return false;
        }
        BindGameCardV2 bindGameCardV2 = (BindGameCardV2) obj;
        return f0.g(this.game_type, bindGameCardV2.game_type) && this.bound == bindGameCardV2.bound && f0.g(this.background, bindGameCardV2.background) && f0.g(this.top_left_icon, bindGameCardV2.top_left_icon) && f0.g(this.nickname, bindGameCardV2.nickname) && f0.g(this.bottom_left_icon, bindGameCardV2.bottom_left_icon) && f0.g(this.bottom_right_image, bindGameCardV2.bottom_right_image) && f0.g(this.value, bindGameCardV2.value) && f0.g(this.key, bindGameCardV2.key) && f0.g(this.protocol, bindGameCardV2.protocol) && f0.g(this.name, bindGameCardV2.name);
    }

    @e
    public final String getBackground() {
        return this.background;
    }

    @e
    public final String getBottom_left_icon() {
        return this.bottom_left_icon;
    }

    @e
    public final String getBottom_right_image() {
        return this.bottom_right_image;
    }

    public final boolean getBound() {
        return this.bound;
    }

    @e
    public final String getGame_type() {
        return this.game_type;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getNickname() {
        return this.nickname;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTop_left_icon() {
        return this.top_left_icon;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14624, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.game_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.bound;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str2 = this.background;
        int iHashCode2 = (i10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.top_left_icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bottom_left_icon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bottom_right_image;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.value;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.key;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.protocol;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.name;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setBackground(@e String str) {
        this.background = str;
    }

    public final void setBottom_left_icon(@e String str) {
        this.bottom_left_icon = str;
    }

    public final void setBound(boolean z10) {
        this.bound = z10;
    }

    public final void setGame_type(@e String str) {
        this.game_type = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTop_left_icon(@e String str) {
        this.top_left_icon = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14623, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BindGameCardV2(game_type=" + this.game_type + ", bound=" + this.bound + ", background=" + this.background + ", top_left_icon=" + this.top_left_icon + ", nickname=" + this.nickname + ", bottom_left_icon=" + this.bottom_left_icon + ", bottom_right_image=" + this.bottom_right_image + ", value=" + this.value + ", key=" + this.key + ", protocol=" + this.protocol + ", name=" + this.name + ')';
    }
}
