package com.max.xiaoheihe.module.webview.component;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebviewFragmentViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TargetComment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f94596h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("link_id")
    @e
    private String f94597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("root_id")
    @e
    private String f94598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("reply_id")
    @e
    private String f94599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("reply_user_avatar")
    @e
    private String f94600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("reply_user_name")
    @e
    private String f94601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("reply_comment_text")
    @e
    private String f94602g;

    public TargetComment(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.f94597b = str;
        this.f94598c = str2;
        this.f94599d = str3;
        this.f94600e = str4;
        this.f94601f = str5;
        this.f94602g = str6;
    }

    public static /* synthetic */ TargetComment h(TargetComment targetComment, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{targetComment, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 47500, new Class[]{TargetComment.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TargetComment.class);
        if (patchProxyResultProxy.isSupported) {
            return (TargetComment) patchProxyResultProxy.result;
        }
        return targetComment.g((i10 & 1) != 0 ? targetComment.f94597b : str, (i10 & 2) != 0 ? targetComment.f94598c : str2, (i10 & 4) != 0 ? targetComment.f94599d : str3, (i10 & 8) != 0 ? targetComment.f94600e : str4, (i10 & 16) != 0 ? targetComment.f94601f : str5, (i10 & 32) != 0 ? targetComment.f94602g : str6);
    }

    @e
    public final String a() {
        return this.f94597b;
    }

    @e
    public final String b() {
        return this.f94598c;
    }

    @e
    public final String c() {
        return this.f94599d;
    }

    @e
    public final String d() {
        return this.f94600e;
    }

    @e
    public final String e() {
        return this.f94601f;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47503, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetComment)) {
            return false;
        }
        TargetComment targetComment = (TargetComment) obj;
        return f0.g(this.f94597b, targetComment.f94597b) && f0.g(this.f94598c, targetComment.f94598c) && f0.g(this.f94599d, targetComment.f94599d) && f0.g(this.f94600e, targetComment.f94600e) && f0.g(this.f94601f, targetComment.f94601f) && f0.g(this.f94602g, targetComment.f94602g);
    }

    @e
    public final String f() {
        return this.f94602g;
    }

    @d
    public final TargetComment g(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 47499, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, TargetComment.class);
        return patchProxyResultProxy.isSupported ? (TargetComment) patchProxyResultProxy.result : new TargetComment(str, str2, str3, str4, str5, str6);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47502, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f94597b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94598c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94599d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94600e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f94601f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f94602g;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @e
    public final String i() {
        return this.f94597b;
    }

    @e
    public final String j() {
        return this.f94602g;
    }

    @e
    public final String k() {
        return this.f94599d;
    }

    @e
    public final String l() {
        return this.f94600e;
    }

    @e
    public final String m() {
        return this.f94601f;
    }

    @e
    public final String n() {
        return this.f94598c;
    }

    public final void o(@e String str) {
        this.f94597b = str;
    }

    public final void p(@e String str) {
        this.f94602g = str;
    }

    public final void q(@e String str) {
        this.f94599d = str;
    }

    public final void r(@e String str) {
        this.f94600e = str;
    }

    public final void s(@e String str) {
        this.f94601f = str;
    }

    public final void t(@e String str) {
        this.f94598c = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47501, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TargetComment(linkId=" + this.f94597b + ", rootId=" + this.f94598c + ", replyID=" + this.f94599d + ", replyUserAvatar=" + this.f94600e + ", replyUserName=" + this.f94601f + ", replyCommentText=" + this.f94602g + ')';
    }
}
