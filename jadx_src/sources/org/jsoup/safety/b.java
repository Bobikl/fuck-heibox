package org.jsoup.safety;

import com.max.hbsearch.l;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jsoup.nodes.f;

/* JADX INFO: compiled from: Whitelist.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<d> f137991a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<d, Set<a>> f137992b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<d, Map<a, C1247b>> f137993c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<d, Map<a, Set<c>>> f137994d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f137995e = false;

    /* JADX INFO: compiled from: Whitelist.java */
    public static class a extends e {
        a(String str) {
            super(str);
        }

        static a a(String str) {
            return new a(str);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.safety.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Whitelist.java */
    public static class C1247b extends e {
        C1247b(String str) {
            super(str);
        }

        static C1247b a(String str) {
            return new C1247b(str);
        }
    }

    /* JADX INFO: compiled from: Whitelist.java */
    public static class c extends e {
        c(String str) {
            super(str);
        }

        static c a(String str) {
            return new c(str);
        }
    }

    /* JADX INFO: compiled from: Whitelist.java */
    public static class d extends e {
        d(String str) {
            super(str);
        }

        static d a(String str) {
            return new d(str);
        }
    }

    /* JADX INFO: compiled from: Whitelist.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f137996a;

        e(String str) {
            org.jsoup.helper.d.j(str);
            this.f137996a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            String str = this.f137996a;
            if (str == null) {
                if (eVar.f137996a != null) {
                    return false;
                }
            } else if (!str.equals(eVar.f137996a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f137996a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f137996a;
        }
    }

    public static b e() {
        return new b().d(ak.av, "b", "blockquote", com.google.android.exoplayer2.text.ttml.d.f49807t, "cite", "code", "dd", "dl", SocializeProtocolConstants.PROTOCOL_KEY_DT, "em", "i", "li", "ol", "p", "pre", "q", "small", "strike", "strong", "sub", "sup", ak.aG, "ul").a(ak.av, "href").a("blockquote", "cite").a("q", "cite").c(ak.av, "href", "ftp", "http", "https", "mailto").c("blockquote", "cite", "http", "https").c("cite", "cite", "http", "https").b(ak.av, "rel", "nofollow");
    }

    public static b f() {
        return e().d(SocialConstants.PARAM_IMG_URL).a(SocialConstants.PARAM_IMG_URL, "align", "alt", "height", l.W, "title", "width").c(SocialConstants.PARAM_IMG_URL, l.W, "http", "https");
    }

    public static b j() {
        return new b();
    }

    public static b l() {
        return new b().d(ak.av, "b", "blockquote", com.google.android.exoplayer2.text.ttml.d.f49807t, "caption", "cite", "code", "col", "colgroup", "dd", com.google.android.exoplayer2.text.ttml.d.f49801q, "dl", SocializeProtocolConstants.PROTOCOL_KEY_DT, "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", SocialConstants.PARAM_IMG_URL, "li", "ol", "p", "pre", "q", "small", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", ak.aG, "ul").a(ak.av, "href", "title").a("blockquote", "cite").a("col", com.google.android.exoplayer2.text.ttml.d.f49805s, "width").a("colgroup", com.google.android.exoplayer2.text.ttml.d.f49805s, "width").a(SocialConstants.PARAM_IMG_URL, "align", "alt", "height", l.W, "title", "width").a("ol", com.google.android.exoplayer2.text.ttml.d.f49798o0, "type").a("q", "cite").a("table", "summary", "width").a("td", "abbr", "axis", "colspan", "rowspan", "width").a("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").a("ul", "type").c(ak.av, "href", "ftp", "http", "https", "mailto").c("blockquote", "cite", "http", "https").c(SocialConstants.PARAM_IMG_URL, l.W, "http", "https").c("q", "cite", "http", "https");
    }

    public static b m() {
        return new b().d("b", "em", "i", "strong", ak.aG);
    }

    private boolean n(f fVar, org.jsoup.nodes.a aVar, Set<c> set) {
        String strA = fVar.a(aVar.getKey());
        if (strA.length() == 0) {
            strA = aVar.getValue();
        }
        if (!this.f137995e) {
            aVar.setValue(strA);
        }
        Iterator<c> it = set.iterator();
        while (it.hasNext()) {
            if (strA.toLowerCase().startsWith(it.next().toString() + ":")) {
                return true;
            }
        }
        return false;
    }

    public b a(String str, String... strArr) {
        org.jsoup.helper.d.h(str);
        org.jsoup.helper.d.j(strArr);
        org.jsoup.helper.d.e(strArr.length > 0, "No attributes supplied.");
        d dVarA = d.a(str);
        if (!this.f137991a.contains(dVarA)) {
            this.f137991a.add(dVarA);
        }
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            org.jsoup.helper.d.h(str2);
            hashSet.add(a.a(str2));
        }
        if (this.f137992b.containsKey(dVarA)) {
            this.f137992b.get(dVarA).addAll(hashSet);
        } else {
            this.f137992b.put(dVarA, hashSet);
        }
        return this;
    }

    public b b(String str, String str2, String str3) {
        org.jsoup.helper.d.h(str);
        org.jsoup.helper.d.h(str2);
        org.jsoup.helper.d.h(str3);
        d dVarA = d.a(str);
        if (!this.f137991a.contains(dVarA)) {
            this.f137991a.add(dVarA);
        }
        a aVarA = a.a(str2);
        C1247b c1247bA = C1247b.a(str3);
        if (this.f137993c.containsKey(dVarA)) {
            this.f137993c.get(dVarA).put(aVarA, c1247bA);
        } else {
            HashMap map = new HashMap();
            map.put(aVarA, c1247bA);
            this.f137993c.put(dVarA, map);
        }
        return this;
    }

    public b c(String str, String str2, String... strArr) {
        Map<a, Set<c>> map;
        Set<c> set;
        org.jsoup.helper.d.h(str);
        org.jsoup.helper.d.h(str2);
        org.jsoup.helper.d.j(strArr);
        d dVarA = d.a(str);
        a aVarA = a.a(str2);
        if (this.f137994d.containsKey(dVarA)) {
            map = this.f137994d.get(dVarA);
        } else {
            HashMap map2 = new HashMap();
            this.f137994d.put(dVarA, map2);
            map = map2;
        }
        if (map.containsKey(aVarA)) {
            set = map.get(aVarA);
        } else {
            HashSet hashSet = new HashSet();
            map.put(aVarA, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            org.jsoup.helper.d.h(str3);
            set.add(c.a(str3));
        }
        return this;
    }

    public b d(String... strArr) {
        org.jsoup.helper.d.j(strArr);
        for (String str : strArr) {
            org.jsoup.helper.d.h(str);
            this.f137991a.add(d.a(str));
        }
        return this;
    }

    org.jsoup.nodes.b g(String str) {
        org.jsoup.nodes.b bVar = new org.jsoup.nodes.b();
        d dVarA = d.a(str);
        if (this.f137993c.containsKey(dVarA)) {
            for (Map.Entry<a, C1247b> entry : this.f137993c.get(dVarA).entrySet()) {
                bVar.t(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        return bVar;
    }

    boolean h(String str, f fVar, org.jsoup.nodes.a aVar) {
        d dVarA = d.a(str);
        a aVarA = a.a(aVar.getKey());
        if (!this.f137992b.containsKey(dVarA) || !this.f137992b.get(dVarA).contains(aVarA)) {
            return !str.equals(":all") && h(":all", fVar, aVar);
        }
        if (!this.f137994d.containsKey(dVarA)) {
            return true;
        }
        Map<a, Set<c>> map = this.f137994d.get(dVarA);
        return !map.containsKey(aVarA) || n(fVar, aVar, map.get(aVarA));
    }

    protected boolean i(String str) {
        return this.f137991a.contains(d.a(str));
    }

    public b k(boolean z10) {
        this.f137995e = z10;
        return this;
    }
}
