package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallProductActionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String button_desc;

    @e
    private String cdkey;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private String icon_color;

    @e
    private String name;

    @e
    private SendToPcObj send_to_pc;

    @e
    private String type;

    @e
    private String url;

    /* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
    @o(parameters = 0)
    public static final class SendToPcObj implements Serializable {
        public static final int $stable = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        @e
        private String desc;

        @e
        private Integer kid;

        public SendToPcObj(@e String str, @e Integer num) {
            this.desc = str;
            this.kid = num;
        }

        public static /* synthetic */ SendToPcObj copy$default(SendToPcObj sendToPcObj, String str, Integer num, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sendToPcObj, str, num, new Integer(i10), obj}, null, changeQuickRedirect, true, 15617, new Class[]{SendToPcObj.class, String.class, Integer.class, Integer.TYPE, Object.class}, SendToPcObj.class);
            if (patchProxyResultProxy.isSupported) {
                return (SendToPcObj) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                str = sendToPcObj.desc;
            }
            if ((i10 & 2) != 0) {
                num = sendToPcObj.kid;
            }
            return sendToPcObj.copy(str, num);
        }

        @e
        public final String component1() {
            return this.desc;
        }

        @e
        public final Integer component2() {
            return this.kid;
        }

        @d
        public final SendToPcObj copy(@e String str, @e Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, num}, this, changeQuickRedirect, false, 15616, new Class[]{String.class, Integer.class}, SendToPcObj.class);
            return patchProxyResultProxy.isSupported ? (SendToPcObj) patchProxyResultProxy.result : new SendToPcObj(str, num);
        }

        public boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15620, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendToPcObj)) {
                return false;
            }
            SendToPcObj sendToPcObj = (SendToPcObj) obj;
            return f0.g(this.desc, sendToPcObj.desc) && f0.g(this.kid, sendToPcObj.kid);
        }

        @e
        public final String getDesc() {
            return this.desc;
        }

        @e
        public final Integer getKid() {
            return this.kid;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15619, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            String str = this.desc;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.kid;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final void setDesc(@e String str) {
            this.desc = str;
        }

        public final void setKid(@e Integer num) {
            this.kid = num;
        }

        @d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15618, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "SendToPcObj(desc=" + this.desc + ", kid=" + this.kid + ')';
        }
    }

    public MallProductActionObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e SendToPcObj sendToPcObj) {
        this.name = str;
        this.icon = str2;
        this.icon_color = str3;
        this.url = str4;
        this.cdkey = str5;
        this.desc = str6;
        this.type = str7;
        this.button_desc = str8;
        this.send_to_pc = sendToPcObj;
    }

    public static /* synthetic */ MallProductActionObj copy$default(MallProductActionObj mallProductActionObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SendToPcObj sendToPcObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallProductActionObj, str, str2, str3, str4, str5, str6, str7, str8, sendToPcObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15612, new Class[]{MallProductActionObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, SendToPcObj.class, Integer.TYPE, Object.class}, MallProductActionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallProductActionObj) patchProxyResultProxy.result;
        }
        return mallProductActionObj.copy((i10 & 1) != 0 ? mallProductActionObj.name : str, (i10 & 2) != 0 ? mallProductActionObj.icon : str2, (i10 & 4) != 0 ? mallProductActionObj.icon_color : str3, (i10 & 8) != 0 ? mallProductActionObj.url : str4, (i10 & 16) != 0 ? mallProductActionObj.cdkey : str5, (i10 & 32) != 0 ? mallProductActionObj.desc : str6, (i10 & 64) != 0 ? mallProductActionObj.type : str7, (i10 & 128) != 0 ? mallProductActionObj.button_desc : str8, (i10 & 256) != 0 ? mallProductActionObj.send_to_pc : sendToPcObj);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.icon;
    }

    @e
    public final String component3() {
        return this.icon_color;
    }

    @e
    public final String component4() {
        return this.url;
    }

    @e
    public final String component5() {
        return this.cdkey;
    }

    @e
    public final String component6() {
        return this.desc;
    }

    @e
    public final String component7() {
        return this.type;
    }

    @e
    public final String component8() {
        return this.button_desc;
    }

    @e
    public final SendToPcObj component9() {
        return this.send_to_pc;
    }

    @d
    public final MallProductActionObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e SendToPcObj sendToPcObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, sendToPcObj}, this, changeQuickRedirect, false, 15611, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, SendToPcObj.class}, MallProductActionObj.class);
        return patchProxyResultProxy.isSupported ? (MallProductActionObj) patchProxyResultProxy.result : new MallProductActionObj(str, str2, str3, str4, str5, str6, str7, str8, sendToPcObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15615, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallProductActionObj)) {
            return false;
        }
        MallProductActionObj mallProductActionObj = (MallProductActionObj) obj;
        return f0.g(this.name, mallProductActionObj.name) && f0.g(this.icon, mallProductActionObj.icon) && f0.g(this.icon_color, mallProductActionObj.icon_color) && f0.g(this.url, mallProductActionObj.url) && f0.g(this.cdkey, mallProductActionObj.cdkey) && f0.g(this.desc, mallProductActionObj.desc) && f0.g(this.type, mallProductActionObj.type) && f0.g(this.button_desc, mallProductActionObj.button_desc) && f0.g(this.send_to_pc, mallProductActionObj.send_to_pc);
    }

    @e
    public final String getButton_desc() {
        return this.button_desc;
    }

    @e
    public final String getCdkey() {
        return this.cdkey;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getIcon_color() {
        return this.icon_color;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final SendToPcObj getSend_to_pc() {
        return this.send_to_pc;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15614, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cdkey;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.type;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.button_desc;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        SendToPcObj sendToPcObj = this.send_to_pc;
        return iHashCode8 + (sendToPcObj != null ? sendToPcObj.hashCode() : 0);
    }

    public final void setButton_desc(@e String str) {
        this.button_desc = str;
    }

    public final void setCdkey(@e String str) {
        this.cdkey = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setIcon_color(@e String str) {
        this.icon_color = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setSend_to_pc(@e SendToPcObj sendToPcObj) {
        this.send_to_pc = sendToPcObj;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15613, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallProductActionObj(name=" + this.name + ", icon=" + this.icon + ", icon_color=" + this.icon_color + ", url=" + this.url + ", cdkey=" + this.cdkey + ", desc=" + this.desc + ", type=" + this.type + ", button_desc=" + this.button_desc + ", send_to_pc=" + this.send_to_pc + ')';
    }
}
