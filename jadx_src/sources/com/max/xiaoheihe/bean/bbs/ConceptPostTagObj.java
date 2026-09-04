package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ConceptPostTagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ConceptPostTagObj implements Serializable {

    @d
    public static final String TYPE_TOPIC = "topic";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String end_color;

    @e
    private String key;

    @e
    private String name;

    @e
    private String pic_url;

    @e
    private String protocol;

    @e
    private String start_color;

    @e
    private String sub_title;

    @e
    private String topic_id;

    @e
    private String type;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ConceptPostTagObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public ConceptPostTagObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9) {
        this.name = str;
        this.type = str2;
        this.topic_id = str3;
        this.pic_url = str4;
        this.sub_title = str5;
        this.start_color = str6;
        this.end_color = str7;
        this.key = str8;
        this.protocol = str9;
    }

    public static /* synthetic */ ConceptPostTagObj copy$default(ConceptPostTagObj conceptPostTagObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{conceptPostTagObj, str, str2, str3, str4, str5, str6, str7, str8, str9, new Integer(i10), obj}, null, changeQuickRedirect, true, 14259, new Class[]{ConceptPostTagObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ConceptPostTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConceptPostTagObj) patchProxyResultProxy.result;
        }
        return conceptPostTagObj.copy((i10 & 1) != 0 ? conceptPostTagObj.name : str, (i10 & 2) != 0 ? conceptPostTagObj.type : str2, (i10 & 4) != 0 ? conceptPostTagObj.topic_id : str3, (i10 & 8) != 0 ? conceptPostTagObj.pic_url : str4, (i10 & 16) != 0 ? conceptPostTagObj.sub_title : str5, (i10 & 32) != 0 ? conceptPostTagObj.start_color : str6, (i10 & 64) != 0 ? conceptPostTagObj.end_color : str7, (i10 & 128) != 0 ? conceptPostTagObj.key : str8, (i10 & 256) != 0 ? conceptPostTagObj.protocol : str9);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.type;
    }

    @e
    public final String component3() {
        return this.topic_id;
    }

    @e
    public final String component4() {
        return this.pic_url;
    }

    @e
    public final String component5() {
        return this.sub_title;
    }

    @e
    public final String component6() {
        return this.start_color;
    }

    @e
    public final String component7() {
        return this.end_color;
    }

    @e
    public final String component8() {
        return this.key;
    }

    @e
    public final String component9() {
        return this.protocol;
    }

    @d
    public final ConceptPostTagObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9}, this, changeQuickRedirect, false, 14258, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, ConceptPostTagObj.class);
        return patchProxyResultProxy.isSupported ? (ConceptPostTagObj) patchProxyResultProxy.result : new ConceptPostTagObj(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14262, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConceptPostTagObj)) {
            return false;
        }
        ConceptPostTagObj conceptPostTagObj = (ConceptPostTagObj) obj;
        return f0.g(this.name, conceptPostTagObj.name) && f0.g(this.type, conceptPostTagObj.type) && f0.g(this.topic_id, conceptPostTagObj.topic_id) && f0.g(this.pic_url, conceptPostTagObj.pic_url) && f0.g(this.sub_title, conceptPostTagObj.sub_title) && f0.g(this.start_color, conceptPostTagObj.start_color) && f0.g(this.end_color, conceptPostTagObj.end_color) && f0.g(this.key, conceptPostTagObj.key) && f0.g(this.protocol, conceptPostTagObj.protocol);
    }

    @e
    public final String getEnd_color() {
        return this.end_color;
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
    public final String getPic_url() {
        return this.pic_url;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getStart_color() {
        return this.start_color;
    }

    @e
    public final String getSub_title() {
        return this.sub_title;
    }

    @e
    public final String getTopic_id() {
        return this.topic_id;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14261, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topic_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pic_url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sub_title;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.start_color;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.end_color;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.key;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.protocol;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setEnd_color(@e String str) {
        this.end_color = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPic_url(@e String str) {
        this.pic_url = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setStart_color(@e String str) {
        this.start_color = str;
    }

    public final void setSub_title(@e String str) {
        this.sub_title = str;
    }

    public final void setTopic_id(@e String str) {
        this.topic_id = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public final KeyDescObj toKeyDescObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14257, new Class[0], KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(this.key);
        keyDescObj.setName(this.name);
        keyDescObj.setIcon(this.pic_url);
        keyDescObj.setProtocol(this.protocol);
        return keyDescObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14260, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ConceptPostTagObj(name=" + this.name + ", type=" + this.type + ", topic_id=" + this.topic_id + ", pic_url=" + this.pic_url + ", sub_title=" + this.sub_title + ", start_color=" + this.start_color + ", end_color=" + this.end_color + ", key=" + this.key + ", protocol=" + this.protocol + ')';
    }
}
