package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TemplateHashtagResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TemplateHashtagLaberObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String end_color;

    @e
    private String start_color;

    @e
    private String sub_title;

    public TemplateHashtagLaberObj(@e String str, @e String str2, @d String end_color) {
        f0.p(end_color, "end_color");
        this.sub_title = str;
        this.start_color = str2;
        this.end_color = end_color;
    }

    public static /* synthetic */ TemplateHashtagLaberObj copy$default(TemplateHashtagLaberObj templateHashtagLaberObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{templateHashtagLaberObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14474, new Class[]{TemplateHashtagLaberObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TemplateHashtagLaberObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagLaberObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = templateHashtagLaberObj.sub_title;
        }
        if ((i10 & 2) != 0) {
            str2 = templateHashtagLaberObj.start_color;
        }
        if ((i10 & 4) != 0) {
            str3 = templateHashtagLaberObj.end_color;
        }
        return templateHashtagLaberObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.sub_title;
    }

    @e
    public final String component2() {
        return this.start_color;
    }

    @d
    public final String component3() {
        return this.end_color;
    }

    @d
    public final TemplateHashtagLaberObj copy(@e String str, @e String str2, @d String end_color) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, end_color}, this, changeQuickRedirect, false, 14473, new Class[]{String.class, String.class, String.class}, TemplateHashtagLaberObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagLaberObj) patchProxyResultProxy.result;
        }
        f0.p(end_color, "end_color");
        return new TemplateHashtagLaberObj(str, str2, end_color);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14477, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateHashtagLaberObj)) {
            return false;
        }
        TemplateHashtagLaberObj templateHashtagLaberObj = (TemplateHashtagLaberObj) obj;
        return f0.g(this.sub_title, templateHashtagLaberObj.sub_title) && f0.g(this.start_color, templateHashtagLaberObj.start_color) && f0.g(this.end_color, templateHashtagLaberObj.end_color);
    }

    @d
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14476, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sub_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.start_color;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.end_color.hashCode();
    }

    public final void setEnd_color(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14472, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14475, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TemplateHashtagLaberObj(sub_title=" + this.sub_title + ", start_color=" + this.start_color + ", end_color=" + this.end_color + ')';
    }
}
