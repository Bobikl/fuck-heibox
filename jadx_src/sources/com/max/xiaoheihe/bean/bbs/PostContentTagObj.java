package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
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
public final class PostContentTagObj implements Serializable {
    public static final int STYLE_TYPE_COMMON = 1;
    public static final int STYLE_TYPE_HASHTAG = 2;
    public static final int STYLE_TYPE_UI_KIT = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_color;

    @e
    private String icon;

    @e
    private String protocol;

    @e
    private Integer style_type;

    @e
    private TagSubLabel sublabel;

    @e
    private String text;

    @e
    private String text_color;

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

    /* JADX INFO: compiled from: ConceptPostTagObj.kt */
    @o(parameters = 0)
    public static final class TagSubLabel implements Serializable {
        public static final int $stable = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        @e
        private String end_color;

        @e
        private String start_color;

        @e
        private String sub_title;

        public TagSubLabel(@e String str, @e String str2, @e String str3) {
            this.sub_title = str;
            this.start_color = str2;
            this.end_color = str3;
        }

        public static /* synthetic */ TagSubLabel copy$default(TagSubLabel tagSubLabel, String str, String str2, String str3, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tagSubLabel, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14366, new Class[]{TagSubLabel.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TagSubLabel.class);
            if (patchProxyResultProxy.isSupported) {
                return (TagSubLabel) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                str = tagSubLabel.sub_title;
            }
            if ((i10 & 2) != 0) {
                str2 = tagSubLabel.start_color;
            }
            if ((i10 & 4) != 0) {
                str3 = tagSubLabel.end_color;
            }
            return tagSubLabel.copy(str, str2, str3);
        }

        @e
        public final String component1() {
            return this.sub_title;
        }

        @e
        public final String component2() {
            return this.start_color;
        }

        @e
        public final String component3() {
            return this.end_color;
        }

        @d
        public final TagSubLabel copy(@e String str, @e String str2, @e String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14365, new Class[]{String.class, String.class, String.class}, TagSubLabel.class);
            return patchProxyResultProxy.isSupported ? (TagSubLabel) patchProxyResultProxy.result : new TagSubLabel(str, str2, str3);
        }

        public boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14369, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagSubLabel)) {
                return false;
            }
            TagSubLabel tagSubLabel = (TagSubLabel) obj;
            return f0.g(this.sub_title, tagSubLabel.sub_title) && f0.g(this.start_color, tagSubLabel.start_color) && f0.g(this.end_color, tagSubLabel.end_color);
        }

        @e
        public final String getEnd_color() {
            return this.end_color;
        }

        @e
        public final String getStart_color() {
            return this.start_color;
        }

        @e
        public final String getSub_title() {
            return this.sub_title;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14368, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            String str = this.sub_title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.start_color;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.end_color;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setEnd_color(@e String str) {
            this.end_color = str;
        }

        public final void setStart_color(@e String str) {
            this.start_color = str;
        }

        public final void setSub_title(@e String str) {
            this.sub_title = str;
        }

        @d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14367, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "TagSubLabel(sub_title=" + this.sub_title + ", start_color=" + this.start_color + ", end_color=" + this.end_color + ')';
        }
    }

    public PostContentTagObj(@e String str, @e String str2, @e Integer num, @e String str3, @e String str4, @e String str5, @e TagSubLabel tagSubLabel) {
        this.icon = str;
        this.text = str2;
        this.style_type = num;
        this.protocol = str3;
        this.bg_color = str4;
        this.text_color = str5;
        this.sublabel = tagSubLabel;
    }

    public static /* synthetic */ PostContentTagObj copy$default(PostContentTagObj postContentTagObj, String str, String str2, Integer num, String str3, String str4, String str5, TagSubLabel tagSubLabel, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postContentTagObj, str, str2, num, str3, str4, str5, tagSubLabel, new Integer(i10), obj}, null, changeQuickRedirect, true, 14361, new Class[]{PostContentTagObj.class, String.class, String.class, Integer.class, String.class, String.class, String.class, TagSubLabel.class, Integer.TYPE, Object.class}, PostContentTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostContentTagObj) patchProxyResultProxy.result;
        }
        return postContentTagObj.copy((i10 & 1) != 0 ? postContentTagObj.icon : str, (i10 & 2) != 0 ? postContentTagObj.text : str2, (i10 & 4) != 0 ? postContentTagObj.style_type : num, (i10 & 8) != 0 ? postContentTagObj.protocol : str3, (i10 & 16) != 0 ? postContentTagObj.bg_color : str4, (i10 & 32) != 0 ? postContentTagObj.text_color : str5, (i10 & 64) != 0 ? postContentTagObj.sublabel : tagSubLabel);
    }

    @e
    public final String component1() {
        return this.icon;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @e
    public final Integer component3() {
        return this.style_type;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @e
    public final String component5() {
        return this.bg_color;
    }

    @e
    public final String component6() {
        return this.text_color;
    }

    @e
    public final TagSubLabel component7() {
        return this.sublabel;
    }

    @d
    public final PostContentTagObj copy(@e String str, @e String str2, @e Integer num, @e String str3, @e String str4, @e String str5, @e TagSubLabel tagSubLabel) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, num, str3, str4, str5, tagSubLabel}, this, changeQuickRedirect, false, 14360, new Class[]{String.class, String.class, Integer.class, String.class, String.class, String.class, TagSubLabel.class}, PostContentTagObj.class);
        return patchProxyResultProxy.isSupported ? (PostContentTagObj) patchProxyResultProxy.result : new PostContentTagObj(str, str2, num, str3, str4, str5, tagSubLabel);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14364, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostContentTagObj)) {
            return false;
        }
        PostContentTagObj postContentTagObj = (PostContentTagObj) obj;
        return f0.g(this.icon, postContentTagObj.icon) && f0.g(this.text, postContentTagObj.text) && f0.g(this.style_type, postContentTagObj.style_type) && f0.g(this.protocol, postContentTagObj.protocol) && f0.g(this.bg_color, postContentTagObj.bg_color) && f0.g(this.text_color, postContentTagObj.text_color) && f0.g(this.sublabel, postContentTagObj.sublabel);
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final Integer getStyle_type() {
        return this.style_type;
    }

    @e
    public final TagSubLabel getSublabel() {
        return this.sublabel;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14363, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.style_type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.protocol;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bg_color;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text_color;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TagSubLabel tagSubLabel = this.sublabel;
        return iHashCode6 + (tagSubLabel != null ? tagSubLabel.hashCode() : 0);
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setStyle_type(@e Integer num) {
        this.style_type = num;
    }

    public final void setSublabel(@e TagSubLabel tagSubLabel) {
        this.sublabel = tagSubLabel;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14362, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostContentTagObj(icon=" + this.icon + ", text=" + this.text + ", style_type=" + this.style_type + ", protocol=" + this.protocol + ", bg_color=" + this.bg_color + ", text_color=" + this.text_color + ", sublabel=" + this.sublabel + ')';
    }
}
