package com.max.xiaoheihe.module.bbs.post;

import android.content.Context;
import androidx.collection.k;
import androidx.compose.runtime.internal.o;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.WikiEntryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PostPageParam.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostPageParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f81492q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Context f81493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private String f81494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private String f81495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private String f81496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private String f81497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private Boolean f81498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private BBSLinkRecObj f81499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private Boolean f81500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f81501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private WikiEntryObj f81502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f81503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private LinkInfoObj f81504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private String f81505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e
    private VideoInfoObj f81506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @e
    private String f81507p;

    public PostPageParam(@d Context context, @e String str, @e String str2, @e String str3, @e String str4, @e Boolean bool, @e BBSLinkRecObj bBSLinkRecObj, @e Boolean bool2, long j10, @e WikiEntryObj wikiEntryObj, int i10, @e LinkInfoObj linkInfoObj, @e String str5, @e VideoInfoObj videoInfoObj, @e String str6) {
        f0.p(context, "context");
        this.f81493b = context;
        this.f81494c = str;
        this.f81495d = str2;
        this.f81496e = str3;
        this.f81497f = str4;
        this.f81498g = bool;
        this.f81499h = bBSLinkRecObj;
        this.f81500i = bool2;
        this.f81501j = j10;
        this.f81502k = wikiEntryObj;
        this.f81503l = i10;
        this.f81504m = linkInfoObj;
        this.f81505n = str5;
        this.f81506o = videoInfoObj;
        this.f81507p = str6;
    }

    public /* synthetic */ PostPageParam(Context context, String str, String str2, String str3, String str4, Boolean bool, BBSLinkRecObj bBSLinkRecObj, Boolean bool2, long j10, WikiEntryObj wikiEntryObj, int i10, LinkInfoObj linkInfoObj, String str5, VideoInfoObj videoInfoObj, String str6, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bBSLinkRecObj, (i11 & 128) != 0 ? null : bool2, (i11 & 256) != 0 ? 0L : j10, (i11 & 512) != 0 ? null : wikiEntryObj, (i11 & 1024) != 0 ? 0 : i10, (i11 & 2048) != 0 ? null : linkInfoObj, (i11 & 4096) != 0 ? null : str5, (i11 & 8192) != 0 ? null : videoInfoObj, (i11 & 16384) == 0 ? str6 : null);
    }

    public static /* synthetic */ PostPageParam q(PostPageParam postPageParam, Context context, String str, String str2, String str3, String str4, Boolean bool, BBSLinkRecObj bBSLinkRecObj, Boolean bool2, long j10, WikiEntryObj wikiEntryObj, int i10, LinkInfoObj linkInfoObj, String str5, VideoInfoObj videoInfoObj, String str6, int i11, Object obj) {
        long j11 = j10;
        Object[] objArr = {postPageParam, context, str, str2, str3, str4, bool, bBSLinkRecObj, bool2, new Long(j11), wikiEntryObj, new Integer(i10), linkInfoObj, str5, videoInfoObj, str6, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 28498, new Class[]{PostPageParam.class, Context.class, String.class, String.class, String.class, String.class, Boolean.class, BBSLinkRecObj.class, Boolean.class, Long.TYPE, WikiEntryObj.class, cls, LinkInfoObj.class, String.class, VideoInfoObj.class, String.class, cls, Object.class}, PostPageParam.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPageParam) patchProxyResultProxy.result;
        }
        Context context2 = (i11 & 1) != 0 ? postPageParam.f81493b : context;
        String str7 = (i11 & 2) != 0 ? postPageParam.f81494c : str;
        String str8 = (i11 & 4) != 0 ? postPageParam.f81495d : str2;
        String str9 = (i11 & 8) != 0 ? postPageParam.f81496e : str3;
        String str10 = (i11 & 16) != 0 ? postPageParam.f81497f : str4;
        Boolean bool3 = (i11 & 32) != 0 ? postPageParam.f81498g : bool;
        BBSLinkRecObj bBSLinkRecObj2 = (i11 & 64) != 0 ? postPageParam.f81499h : bBSLinkRecObj;
        Boolean bool4 = (i11 & 128) != 0 ? postPageParam.f81500i : bool2;
        if ((i11 & 256) != 0) {
            j11 = postPageParam.f81501j;
        }
        return postPageParam.p(context2, str7, str8, str9, str10, bool3, bBSLinkRecObj2, bool4, j11, (i11 & 512) != 0 ? postPageParam.f81502k : wikiEntryObj, (i11 & 1024) != 0 ? postPageParam.f81503l : i10, (i11 & 2048) != 0 ? postPageParam.f81504m : linkInfoObj, (i11 & 4096) != 0 ? postPageParam.f81505n : str5, (i11 & 8192) != 0 ? postPageParam.f81506o : videoInfoObj, (i11 & 16384) != 0 ? postPageParam.f81507p : str6);
    }

    @e
    public final Boolean A() {
        return this.f81498g;
    }

    @e
    public final Boolean B() {
        return this.f81500i;
    }

    public final int C() {
        return this.f81503l;
    }

    @e
    public final VideoInfoObj D() {
        return this.f81506o;
    }

    public final long E() {
        return this.f81501j;
    }

    @e
    public final WikiEntryObj F() {
        return this.f81502k;
    }

    public final void G(@e String str) {
        this.f81507p = str;
    }

    public final void H(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28496, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f81493b = context;
    }

    public final void I(@e String str) {
        this.f81494c = str;
    }

    public final void J(@e LinkInfoObj linkInfoObj) {
        this.f81504m = linkInfoObj;
    }

    public final void K(@e String str) {
        this.f81495d = str;
    }

    public final void L(@e String str) {
        this.f81496e = str;
    }

    public final void M(@e String str) {
        this.f81505n = str;
    }

    public final void N(@e BBSLinkRecObj bBSLinkRecObj) {
        this.f81499h = bBSLinkRecObj;
    }

    public final void O(@e String str) {
        this.f81497f = str;
    }

    public final void P(@e Boolean bool) {
        this.f81498g = bool;
    }

    public final void Q(@e Boolean bool) {
        this.f81500i = bool;
    }

    public final void R(int i10) {
        this.f81503l = i10;
    }

    public final void S(@e VideoInfoObj videoInfoObj) {
        this.f81506o = videoInfoObj;
    }

    public final void T(long j10) {
        this.f81501j = j10;
    }

    public final void U(@e WikiEntryObj wikiEntryObj) {
        this.f81502k = wikiEntryObj;
    }

    @d
    public final Context a() {
        return this.f81493b;
    }

    @e
    public final WikiEntryObj b() {
        return this.f81502k;
    }

    public final int c() {
        return this.f81503l;
    }

    @e
    public final LinkInfoObj d() {
        return this.f81504m;
    }

    @e
    public final String e() {
        return this.f81505n;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28501, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPageParam)) {
            return false;
        }
        PostPageParam postPageParam = (PostPageParam) obj;
        return f0.g(this.f81493b, postPageParam.f81493b) && f0.g(this.f81494c, postPageParam.f81494c) && f0.g(this.f81495d, postPageParam.f81495d) && f0.g(this.f81496e, postPageParam.f81496e) && f0.g(this.f81497f, postPageParam.f81497f) && f0.g(this.f81498g, postPageParam.f81498g) && f0.g(this.f81499h, postPageParam.f81499h) && f0.g(this.f81500i, postPageParam.f81500i) && this.f81501j == postPageParam.f81501j && f0.g(this.f81502k, postPageParam.f81502k) && this.f81503l == postPageParam.f81503l && f0.g(this.f81504m, postPageParam.f81504m) && f0.g(this.f81505n, postPageParam.f81505n) && f0.g(this.f81506o, postPageParam.f81506o) && f0.g(this.f81507p, postPageParam.f81507p);
    }

    @e
    public final VideoInfoObj f() {
        return this.f81506o;
    }

    @e
    public final String g() {
        return this.f81507p;
    }

    @e
    public final String h() {
        return this.f81494c;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28500, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.f81493b.hashCode() * 31;
        String str = this.f81494c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81495d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81496e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81497f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f81498g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        BBSLinkRecObj bBSLinkRecObj = this.f81499h;
        int iHashCode7 = (iHashCode6 + (bBSLinkRecObj == null ? 0 : bBSLinkRecObj.hashCode())) * 31;
        Boolean bool2 = this.f81500i;
        int iHashCode8 = (((iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + k.a(this.f81501j)) * 31;
        WikiEntryObj wikiEntryObj = this.f81502k;
        int iHashCode9 = (((iHashCode8 + (wikiEntryObj == null ? 0 : wikiEntryObj.hashCode())) * 31) + this.f81503l) * 31;
        LinkInfoObj linkInfoObj = this.f81504m;
        int iHashCode10 = (iHashCode9 + (linkInfoObj == null ? 0 : linkInfoObj.hashCode())) * 31;
        String str5 = this.f81505n;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        VideoInfoObj videoInfoObj = this.f81506o;
        int iHashCode12 = (iHashCode11 + (videoInfoObj == null ? 0 : videoInfoObj.hashCode())) * 31;
        String str6 = this.f81507p;
        return iHashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    @e
    public final String i() {
        return this.f81495d;
    }

    @e
    public final String j() {
        return this.f81496e;
    }

    @e
    public final String k() {
        return this.f81497f;
    }

    @e
    public final Boolean l() {
        return this.f81498g;
    }

    @e
    public final BBSLinkRecObj m() {
        return this.f81499h;
    }

    @e
    public final Boolean n() {
        return this.f81500i;
    }

    public final long o() {
        return this.f81501j;
    }

    @d
    public final PostPageParam p(@d Context context, @e String str, @e String str2, @e String str3, @e String str4, @e Boolean bool, @e BBSLinkRecObj bBSLinkRecObj, @e Boolean bool2, long j10, @e WikiEntryObj wikiEntryObj, int i10, @e LinkInfoObj linkInfoObj, @e String str5, @e VideoInfoObj videoInfoObj, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, bool, bBSLinkRecObj, bool2, new Long(j10), wikiEntryObj, new Integer(i10), linkInfoObj, str5, videoInfoObj, str6}, this, changeQuickRedirect, false, 28497, new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.class, BBSLinkRecObj.class, Boolean.class, Long.TYPE, WikiEntryObj.class, Integer.TYPE, LinkInfoObj.class, String.class, VideoInfoObj.class, String.class}, PostPageParam.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPageParam) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return new PostPageParam(context, str, str2, str3, str4, bool, bBSLinkRecObj, bool2, j10, wikiEntryObj, i10, linkInfoObj, str5, videoInfoObj, str6);
    }

    @e
    public final String r() {
        return this.f81507p;
    }

    @d
    public final Context s() {
        return this.f81493b;
    }

    @e
    public final String t() {
        return this.f81494c;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28499, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostPageParam(context=" + this.f81493b + ", hSrc=" + this.f81494c + ", linkId=" + this.f81495d + ", linkTag=" + this.f81496e + ", rootCommentId=" + this.f81497f + ", showComment=" + this.f81498g + ", recObj=" + this.f81499h + ", showTopic=" + this.f81500i + ", videoPosition=" + this.f81501j + ", wiki=" + this.f81502k + ", vertical=" + this.f81503l + ", info=" + this.f81504m + ", pageUrl=" + this.f81505n + ", videoInfo=" + this.f81506o + ", commentId=" + this.f81507p + ')';
    }

    @e
    public final LinkInfoObj u() {
        return this.f81504m;
    }

    @e
    public final String v() {
        return this.f81495d;
    }

    @e
    public final String w() {
        return this.f81496e;
    }

    @e
    public final String x() {
        return this.f81505n;
    }

    @e
    public final BBSLinkRecObj y() {
        return this.f81499h;
    }

    @e
    public final String z() {
        return this.f81497f;
    }
}
