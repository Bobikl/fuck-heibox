package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VoteOptionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VoteOptionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @d
    private String f76966id;

    @d
    private String img;

    @d
    private String text;

    @d
    private String vote_count;

    public VoteOptionObj(@d String text, @d String vote_count, @d String img, @d String id2) {
        f0.p(text, "text");
        f0.p(vote_count, "vote_count");
        f0.p(img, "img");
        f0.p(id2, "id");
        this.text = text;
        this.vote_count = vote_count;
        this.img = img;
        this.f76966id = id2;
    }

    public static /* synthetic */ VoteOptionObj copy$default(VoteOptionObj voteOptionObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voteOptionObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14538, new Class[]{VoteOptionObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, VoteOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteOptionObj) patchProxyResultProxy.result;
        }
        return voteOptionObj.copy((i10 & 1) != 0 ? voteOptionObj.text : str, (i10 & 2) != 0 ? voteOptionObj.vote_count : str2, (i10 & 4) != 0 ? voteOptionObj.img : str3, (i10 & 8) != 0 ? voteOptionObj.f76966id : str4);
    }

    @d
    public final String component1() {
        return this.text;
    }

    @d
    public final String component2() {
        return this.vote_count;
    }

    @d
    public final String component3() {
        return this.img;
    }

    @d
    public final String component4() {
        return this.f76966id;
    }

    @d
    public final VoteOptionObj copy(@d String text, @d String vote_count, @d String img, @d String id2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{text, vote_count, img, id2}, this, changeQuickRedirect, false, 14537, new Class[]{String.class, String.class, String.class, String.class}, VoteOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteOptionObj) patchProxyResultProxy.result;
        }
        f0.p(text, "text");
        f0.p(vote_count, "vote_count");
        f0.p(img, "img");
        f0.p(id2, "id");
        return new VoteOptionObj(text, vote_count, img, id2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14541, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoteOptionObj)) {
            return false;
        }
        VoteOptionObj voteOptionObj = (VoteOptionObj) obj;
        return f0.g(this.text, voteOptionObj.text) && f0.g(this.vote_count, voteOptionObj.vote_count) && f0.g(this.img, voteOptionObj.img) && f0.g(this.f76966id, voteOptionObj.f76966id);
    }

    @d
    public final String getId() {
        return this.f76966id;
    }

    @d
    public final String getImg() {
        return this.img;
    }

    @d
    public final String getText() {
        return this.text;
    }

    @d
    public final String getVote_count() {
        return this.vote_count;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14540, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((this.text.hashCode() * 31) + this.vote_count.hashCode()) * 31) + this.img.hashCode()) * 31) + this.f76966id.hashCode();
    }

    public final void setId(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14536, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f76966id = str;
    }

    public final void setImg(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14535, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.img = str;
    }

    public final void setText(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14533, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.text = str;
    }

    public final void setVote_count(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14534, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.vote_count = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14539, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "VoteOptionObj(text=" + this.text + ", vote_count=" + this.vote_count + ", img=" + this.img + ", id=" + this.f76966id + ')';
    }
}
