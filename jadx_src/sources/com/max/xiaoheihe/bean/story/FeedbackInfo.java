package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedbackInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cate;
    private int col_count;

    @d
    private Options options;

    @e
    private String text;

    public FeedbackInfo(@e String str, int i10, @e String str2, @d Options options) {
        f0.p(options, "options");
        this.text = str;
        this.col_count = i10;
        this.cate = str2;
        this.options = options;
    }

    public /* synthetic */ FeedbackInfo(String str, int i10, String str2, Options options, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : str2, options);
    }

    public static /* synthetic */ FeedbackInfo copy$default(FeedbackInfo feedbackInfo, String str, int i10, String str2, Options options, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {feedbackInfo, str, new Integer(i12), str2, options, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15939, new Class[]{FeedbackInfo.class, String.class, cls, String.class, Options.class, cls, Object.class}, FeedbackInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedbackInfo) patchProxyResultProxy.result;
        }
        String str3 = (i11 & 1) != 0 ? feedbackInfo.text : str;
        if ((i11 & 2) != 0) {
            i12 = feedbackInfo.col_count;
        }
        return feedbackInfo.copy(str3, i12, (i11 & 4) != 0 ? feedbackInfo.cate : str2, (i11 & 8) != 0 ? feedbackInfo.options : options);
    }

    @e
    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.col_count;
    }

    @e
    public final String component3() {
        return this.cate;
    }

    @d
    public final Options component4() {
        return this.options;
    }

    @d
    public final FeedbackInfo copy(@e String str, int i10, @e String str2, @d Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), str2, options}, this, changeQuickRedirect, false, 15938, new Class[]{String.class, Integer.TYPE, String.class, Options.class}, FeedbackInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedbackInfo) patchProxyResultProxy.result;
        }
        f0.p(options, "options");
        return new FeedbackInfo(str, i10, str2, options);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15942, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackInfo)) {
            return false;
        }
        FeedbackInfo feedbackInfo = (FeedbackInfo) obj;
        return f0.g(this.text, feedbackInfo.text) && this.col_count == feedbackInfo.col_count && f0.g(this.cate, feedbackInfo.cate) && f0.g(this.options, feedbackInfo.options);
    }

    @e
    public final String getCate() {
        return this.cate;
    }

    public final int getCol_count() {
        return this.col_count;
    }

    @d
    public final Options getOptions() {
        return this.options;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15941, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.col_count) * 31;
        String str2 = this.cate;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.options.hashCode();
    }

    public final void setCate(@e String str) {
        this.cate = str;
    }

    public final void setCol_count(int i10) {
        this.col_count = i10;
    }

    public final void setOptions(@d Options options) {
        if (PatchProxy.proxy(new Object[]{options}, this, changeQuickRedirect, false, 15937, new Class[]{Options.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(options, "<set-?>");
        this.options = options;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15940, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedbackInfo(text=" + this.text + ", col_count=" + this.col_count + ", cate=" + this.cate + ", options=" + this.options + ')';
    }
}
