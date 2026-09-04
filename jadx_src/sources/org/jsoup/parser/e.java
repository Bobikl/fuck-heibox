package org.jsoup.parser;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Tag.java */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, e> f137946i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f137947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f137948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f137949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f137950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f137951n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f137952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f137953b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f137954c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137955d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f137956e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f137957f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f137958g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f137959h = false;

    static {
        String[] strArr = {LinkDraftObj.DRAFT_TYPE_HTML, "head", "body", "frameset", GameObj.FILTER_HEAD_SCRIPT, "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", com.google.android.exoplayer2.text.ttml.d.f49801q, "blockquote", "hr", "address", "figure", "figcaption", j5.c.f124295c, "fieldset", "ins", "del", ak.aB, "dl", SocializeProtocolConstants.PROTOCOL_KEY_DT, "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", GameRecommendAdapter.f85958h, "plaintext"};
        f137947j = strArr;
        f137948k = new String[]{"object", com.google.android.exoplayer2.text.ttml.d.X, UiKitSpanObj.TYPE_FONT, com.google.android.exoplayer2.text.ttml.d.f49795n, "i", "b", ak.aG, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", com.google.android.exoplayer2.text.ttml.d.N, "rt", "rp", ak.av, SocialConstants.PARAM_IMG_URL, com.google.android.exoplayer2.text.ttml.d.f49807t, "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", com.google.android.exoplayer2.text.ttml.d.f49805s, "input", AddressListActivity.N, "textarea", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", RemoteMessageConst.MessageBody.PARAM, "source", "track", "summary", "command", "device"};
        f137949l = new String[]{"meta", "link", com.google.android.exoplayer2.text.ttml.d.X, "frame", SocialConstants.PARAM_IMG_URL, com.google.android.exoplayer2.text.ttml.d.f49807t, "wbr", "embed", "hr", "input", "keygen", "col", "command", "device"};
        f137950m = new String[]{"title", ak.av, "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", GameObj.FILTER_HEAD_SCRIPT, "style", "ins", "del", ak.aB};
        f137951n = new String[]{"pre", "plaintext", "title", "textarea"};
        for (String str : strArr) {
            l(new e(str));
        }
        for (String str2 : f137948k) {
            e eVar = new e(str2);
            eVar.f137953b = false;
            eVar.f137955d = false;
            eVar.f137954c = false;
            l(eVar);
        }
        for (String str3 : f137949l) {
            e eVar2 = f137946i.get(str3);
            org.jsoup.helper.d.j(eVar2);
            eVar2.f137955d = false;
            eVar2.f137956e = false;
            eVar2.f137957f = true;
        }
        for (String str4 : f137950m) {
            e eVar3 = f137946i.get(str4);
            org.jsoup.helper.d.j(eVar3);
            eVar3.f137954c = false;
        }
        for (String str5 : f137951n) {
            e eVar4 = f137946i.get(str5);
            org.jsoup.helper.d.j(eVar4);
            eVar4.f137959h = true;
        }
    }

    private e(String str) {
        this.f137952a = str.toLowerCase();
    }

    public static boolean i(String str) {
        return f137946i.containsKey(str);
    }

    private static void l(e eVar) {
        f137946i.put(eVar.f137952a, eVar);
    }

    public static e n(String str) {
        org.jsoup.helper.d.j(str);
        Map<String, e> map = f137946i;
        e eVar = map.get(str);
        if (eVar != null) {
            return eVar;
        }
        String lowerCase = str.trim().toLowerCase();
        org.jsoup.helper.d.h(lowerCase);
        e eVar2 = map.get(lowerCase);
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e(lowerCase);
        eVar3.f137953b = false;
        eVar3.f137955d = true;
        return eVar3;
    }

    public boolean a() {
        return this.f137955d;
    }

    public boolean b() {
        return this.f137954c;
    }

    public String c() {
        return this.f137952a;
    }

    public boolean d() {
        return this.f137953b;
    }

    public boolean e() {
        return (this.f137956e || f()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f137955d == eVar.f137955d && this.f137956e == eVar.f137956e && this.f137957f == eVar.f137957f && this.f137954c == eVar.f137954c && this.f137953b == eVar.f137953b && this.f137959h == eVar.f137959h && this.f137958g == eVar.f137958g && this.f137952a.equals(eVar.f137952a);
    }

    public boolean f() {
        return this.f137957f;
    }

    public boolean g() {
        return !this.f137953b;
    }

    public boolean h() {
        return f137946i.containsKey(this.f137952a);
    }

    public int hashCode() {
        return (((((((((((((this.f137952a.hashCode() * 31) + (this.f137953b ? 1 : 0)) * 31) + (this.f137954c ? 1 : 0)) * 31) + (this.f137955d ? 1 : 0)) * 31) + (this.f137956e ? 1 : 0)) * 31) + (this.f137957f ? 1 : 0)) * 31) + (this.f137958g ? 1 : 0)) * 31) + (this.f137959h ? 1 : 0);
    }

    public boolean j() {
        return this.f137957f || this.f137958g;
    }

    public boolean k() {
        return this.f137959h;
    }

    e m() {
        this.f137958g = true;
        return this;
    }

    public String toString() {
        return this.f137952a;
    }
}
