package org.jsoup.parser;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.tencent.open.SocialConstants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;

/* JADX INFO: compiled from: HtmlTreeBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f137928s = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HtmlTreeBuilderState f137929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HtmlTreeBuilderState f137930i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.jsoup.nodes.f f137932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.jsoup.nodes.f f137933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.jsoup.nodes.f f137934m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f137931j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DescendableLinkedList<org.jsoup.nodes.f> f137935n = new DescendableLinkedList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<Token.b> f137936o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f137937p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f137938q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f137939r = false;

    b() {
    }

    private boolean F(String str, String[] strArr, String[] strArr2) {
        return G(new String[]{str}, strArr, strArr2);
    }

    private boolean G(String[] strArr, String[] strArr2, String[] strArr3) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            String strY = itDescendingIterator.next().y();
            if (org.jsoup.helper.c.a(strY, strArr)) {
                return true;
            }
            if (org.jsoup.helper.c.a(strY, strArr2)) {
                return false;
            }
            if (strArr3 != null && org.jsoup.helper.c.a(strY, strArr3)) {
                return false;
            }
        }
        org.jsoup.helper.d.a("Should not be reachable");
        return false;
    }

    private void Q(org.jsoup.nodes.g gVar) {
        if (this.f137979d.size() == 0) {
            this.f137978c.i0(gVar);
        } else if (T()) {
            O(gVar);
        } else {
            a().i0(gVar);
        }
    }

    private boolean S(DescendableLinkedList<org.jsoup.nodes.f> descendableLinkedList, org.jsoup.nodes.f fVar) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = descendableLinkedList.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == fVar) {
                return true;
            }
        }
        return false;
    }

    private boolean W(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
        return fVar.y().equals(fVar2.y()) && fVar.i().equals(fVar2.i());
    }

    private void i(String... strArr) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            org.jsoup.nodes.f next = itDescendingIterator.next();
            if (org.jsoup.helper.c.a(next.y(), strArr) || next.y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                return;
            } else {
                itDescendingIterator.remove();
            }
        }
    }

    private void p0(LinkedList<org.jsoup.nodes.f> linkedList, org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
        int iLastIndexOf = linkedList.lastIndexOf(fVar);
        org.jsoup.helper.d.d(iLastIndexOf != -1);
        linkedList.remove(iLastIndexOf);
        linkedList.add(iLastIndexOf, fVar2);
    }

    boolean A(String str) {
        return C(str, new String[]{"ol", "ul"});
    }

    boolean B(String str) {
        return C(str, null);
    }

    boolean C(String str, String[] strArr) {
        return F(str, new String[]{"applet", "caption", LinkDraftObj.DRAFT_TYPE_HTML, "table", "td", "th", "marquee", "object"}, strArr);
    }

    boolean D(String[] strArr) {
        return G(strArr, new String[]{"applet", "caption", LinkDraftObj.DRAFT_TYPE_HTML, "table", "td", "th", "marquee", "object"}, null);
    }

    boolean E(String str) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            String strY = itDescendingIterator.next().y();
            if (strY.equals(str)) {
                return true;
            }
            if (!org.jsoup.helper.c.a(strY, "optgroup", "option")) {
                return false;
            }
        }
        org.jsoup.helper.d.a("Should not be reachable");
        return false;
    }

    boolean H(String str) {
        return F(str, new String[]{LinkDraftObj.DRAFT_TYPE_HTML, "table"}, null);
    }

    org.jsoup.nodes.f I(String str) {
        org.jsoup.nodes.f fVar = new org.jsoup.nodes.f(e.n(str), this.f137980e);
        K(fVar);
        return fVar;
    }

    org.jsoup.nodes.f J(Token.g gVar) {
        if (!gVar.w()) {
            org.jsoup.nodes.f fVar = new org.jsoup.nodes.f(e.n(gVar.x()), this.f137980e, gVar.f137922f);
            K(fVar);
            return fVar;
        }
        org.jsoup.nodes.f fVarN = N(gVar);
        this.f137979d.add(fVarN);
        this.f137977b.m(new Token.f(fVarN.F1()));
        return fVarN;
    }

    void K(org.jsoup.nodes.f fVar) {
        Q(fVar);
        this.f137979d.add(fVar);
    }

    void L(Token.b bVar) {
        a().i0(org.jsoup.helper.c.a(a().F1(), GameObj.FILTER_HEAD_SCRIPT, "style") ? new org.jsoup.nodes.d(bVar.m(), this.f137980e) : new org.jsoup.nodes.h(bVar.m(), this.f137980e));
    }

    void M(Token.c cVar) {
        Q(new org.jsoup.nodes.c(cVar.m(), this.f137980e));
    }

    org.jsoup.nodes.f N(Token.g gVar) {
        e eVarN = e.n(gVar.x());
        org.jsoup.nodes.f fVar = new org.jsoup.nodes.f(eVarN, this.f137980e, gVar.f137922f);
        Q(fVar);
        if (gVar.w()) {
            if (!eVarN.h()) {
                eVarN.m();
                this.f137977b.a();
            } else if (eVarN.j()) {
                this.f137977b.a();
            }
        }
        return fVar;
    }

    void O(org.jsoup.nodes.g gVar) {
        org.jsoup.nodes.f fVarG;
        org.jsoup.nodes.f fVarV = v("table");
        boolean z10 = false;
        if (fVarV == null) {
            fVarG = this.f137979d.get(0);
        } else if (fVarV.F() != null) {
            fVarG = fVarV.F();
            z10 = true;
        } else {
            fVarG = g(fVarV);
        }
        if (!z10) {
            fVarG.i0(gVar);
        } else {
            org.jsoup.helper.d.j(fVarV);
            fVarV.l(gVar);
        }
    }

    void P() {
        this.f137935n.add(null);
    }

    void R(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
        int iLastIndexOf = this.f137979d.lastIndexOf(fVar);
        org.jsoup.helper.d.d(iLastIndexOf != -1);
        this.f137979d.add(iLastIndexOf + 1, fVar2);
    }

    boolean T() {
        return this.f137938q;
    }

    boolean U() {
        return this.f137939r;
    }

    boolean V(org.jsoup.nodes.f fVar) {
        return S(this.f137935n, fVar);
    }

    boolean X(org.jsoup.nodes.f fVar) {
        return org.jsoup.helper.c.a(fVar.y(), "address", "applet", "area", BBSLinkObj.LIST_TYPE_ARTICLE, "aside", com.google.android.exoplayer2.text.ttml.d.X, "basefont", "bgsound", "blockquote", "body", com.google.android.exoplayer2.text.ttml.d.f49807t, "button", "caption", com.google.android.exoplayer2.text.ttml.d.f49794m0, "col", "colgroup", "command", "dd", "details", "dir", com.google.android.exoplayer2.text.ttml.d.f49801q, "dl", SocializeProtocolConstants.PROTOCOL_KEY_DT, "embed", "fieldset", "figcaption", "figure", "footer", j5.c.f124295c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", LinkDraftObj.DRAFT_TYPE_HTML, "iframe", SocialConstants.PARAM_IMG_URL, "input", "isindex", "li", "link", "listing", "marquee", GameRecommendAdapter.f85958h, "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", RemoteMessageConst.MessageBody.PARAM, "plaintext", "pre", GameObj.FILTER_HEAD_SCRIPT, "section", AddressListActivity.N, "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp");
    }

    void Y() {
        this.f137930i = this.f137929h;
    }

    void Z(org.jsoup.nodes.f fVar) {
        if (this.f137931j) {
            return;
        }
        String strA = fVar.a("href");
        if (strA.length() != 0) {
            this.f137980e = strA;
            this.f137931j = true;
            this.f137978c.R(strA);
        }
    }

    void a0() {
        this.f137936o = new ArrayList();
    }

    boolean b0(org.jsoup.nodes.f fVar) {
        return S(this.f137979d, fVar);
    }

    HtmlTreeBuilderState c0() {
        return this.f137930i;
    }

    @Override // org.jsoup.parser.h
    Document d(String str, String str2, ParseErrorList parseErrorList) {
        this.f137929h = HtmlTreeBuilderState.Initial;
        return super.d(str, str2, parseErrorList);
    }

    List<org.jsoup.nodes.g> d0(String str, org.jsoup.nodes.f fVar, String str2, ParseErrorList parseErrorList) {
        org.jsoup.nodes.f fVar2;
        this.f137929h = HtmlTreeBuilderState.Initial;
        b(str, str2, parseErrorList);
        this.f137934m = fVar;
        this.f137939r = true;
        if (fVar != null) {
            if (fVar.E() != null) {
                this.f137978c.c2(fVar.E().b2());
            }
            String strF1 = fVar.F1();
            if (org.jsoup.helper.c.a(strF1, "title", "textarea")) {
                this.f137977b.x(TokeniserState.Rcdata);
            } else if (org.jsoup.helper.c.a(strF1, "iframe", "noembed", "noframes", "style", "xmp")) {
                this.f137977b.x(TokeniserState.Rawtext);
            } else if (strF1.equals(GameObj.FILTER_HEAD_SCRIPT)) {
                this.f137977b.x(TokeniserState.ScriptData);
            } else if (!strF1.equals("noscript") && strF1.equals("plaintext")) {
                this.f137977b.x(TokeniserState.Data);
            } else {
                this.f137977b.x(TokeniserState.Data);
            }
            fVar2 = new org.jsoup.nodes.f(e.n(LinkDraftObj.DRAFT_TYPE_HTML), str2);
            this.f137978c.i0(fVar2);
            this.f137979d.push(fVar2);
            r0();
        } else {
            fVar2 = null;
        }
        f();
        return fVar != null ? fVar2.o() : this.f137978c.o();
    }

    @Override // org.jsoup.parser.h
    protected boolean e(Token token) {
        this.f137981f = token;
        return this.f137929h.process(token, this);
    }

    org.jsoup.nodes.f e0() {
        if (this.f137979d.peekLast().y().equals("td") && !this.f137929h.name().equals("InCell")) {
            org.jsoup.helper.d.c(true, "pop td not in cell");
        }
        if (this.f137979d.peekLast().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
            org.jsoup.helper.d.c(true, "popping html!");
        }
        return this.f137979d.pollLast();
    }

    void f0(String str) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext() && !itDescendingIterator.next().y().equals(str)) {
            itDescendingIterator.remove();
        }
    }

    org.jsoup.nodes.f g(org.jsoup.nodes.f fVar) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == fVar) {
                return itDescendingIterator.next();
            }
        }
        return null;
    }

    void g0(String str) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next().y().equals(str)) {
                itDescendingIterator.remove();
                return;
            }
            itDescendingIterator.remove();
        }
    }

    void h() {
        while (!this.f137935n.isEmpty()) {
            org.jsoup.nodes.f fVarPeekLast = this.f137935n.peekLast();
            this.f137935n.removeLast();
            if (fVarPeekLast == null) {
                return;
            }
        }
    }

    void h0(String... strArr) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (org.jsoup.helper.c.a(itDescendingIterator.next().y(), strArr)) {
                itDescendingIterator.remove();
                return;
            }
            itDescendingIterator.remove();
        }
    }

    boolean i0(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f137981f = token;
        return htmlTreeBuilderState.process(token, this);
    }

    void j() {
        i("tbody", "tfoot", "thead");
    }

    void j0(org.jsoup.nodes.f fVar) {
        this.f137979d.add(fVar);
    }

    void k() {
        i("table");
    }

    void k0(org.jsoup.nodes.f fVar) {
        org.jsoup.nodes.f next;
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137935n.descendingIterator();
        int i10 = 0;
        while (itDescendingIterator.hasNext() && (next = itDescendingIterator.next()) != null) {
            if (W(fVar, next)) {
                i10++;
            }
            if (i10 == 3) {
                itDescendingIterator.remove();
                break;
            }
        }
        this.f137935n.add(fVar);
    }

    void l() {
        i("tr");
    }

    void l0() {
        int size = this.f137935n.size();
        if (size == 0 || this.f137935n.getLast() == null || b0(this.f137935n.getLast())) {
            return;
        }
        org.jsoup.nodes.f last = this.f137935n.getLast();
        boolean z10 = true;
        int i10 = size - 1;
        int i11 = i10;
        while (i11 != 0) {
            i11--;
            last = this.f137935n.get(i11);
            if (last == null || b0(last)) {
                z10 = false;
                break;
            }
        }
        while (true) {
            if (!z10) {
                i11++;
                last = this.f137935n.get(i11);
            }
            org.jsoup.helper.d.j(last);
            org.jsoup.nodes.f fVarI = I(last.y());
            fVarI.i().g(last.i());
            this.f137935n.add(i11, fVarI);
            this.f137935n.remove(i11 + 1);
            if (i11 == i10) {
                return;
            } else {
                z10 = false;
            }
        }
    }

    void m(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.f137982g.a()) {
            this.f137982g.add(new c(this.f137976a.z(), "Unexpected token [%s] when in state [%s]", this.f137981f.l(), htmlTreeBuilderState));
        }
    }

    void m0(org.jsoup.nodes.f fVar) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137935n.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == fVar) {
                itDescendingIterator.remove();
                return;
            }
        }
    }

    void n(boolean z10) {
        this.f137937p = z10;
    }

    boolean n0(org.jsoup.nodes.f fVar) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == fVar) {
                itDescendingIterator.remove();
                return true;
            }
        }
        return false;
    }

    boolean o() {
        return this.f137937p;
    }

    void o0(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
        p0(this.f137935n, fVar, fVar2);
    }

    void p() {
        q(null);
    }

    void q(String str) {
        while (str != null && !a().y().equals(str) && org.jsoup.helper.c.a(a().y(), "dd", SocializeProtocolConstants.PROTOCOL_KEY_DT, "li", "option", "optgroup", "p", "rp", "rt")) {
            e0();
        }
    }

    void q0(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
        p0(this.f137979d, fVar, fVar2);
    }

    org.jsoup.nodes.f r(String str) {
        org.jsoup.nodes.f next;
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137935n.descendingIterator();
        while (itDescendingIterator.hasNext() && (next = itDescendingIterator.next()) != null) {
            if (next.y().equals(str)) {
                return next;
            }
        }
        return null;
    }

    void r0() {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        boolean z10 = false;
        while (itDescendingIterator.hasNext()) {
            org.jsoup.nodes.f next = itDescendingIterator.next();
            if (!itDescendingIterator.hasNext()) {
                z10 = true;
                next = this.f137934m;
            }
            String strY = next.y();
            if (AddressListActivity.N.equals(strY)) {
                x0(HtmlTreeBuilderState.InSelect);
                return;
            }
            if ("td".equals(strY) || ("td".equals(strY) && !z10)) {
                x0(HtmlTreeBuilderState.InCell);
                return;
            }
            if ("tr".equals(strY)) {
                x0(HtmlTreeBuilderState.InRow);
                return;
            }
            if ("tbody".equals(strY) || "thead".equals(strY) || "tfoot".equals(strY)) {
                x0(HtmlTreeBuilderState.InTableBody);
                return;
            }
            if ("caption".equals(strY)) {
                x0(HtmlTreeBuilderState.InCaption);
                return;
            }
            if ("colgroup".equals(strY)) {
                x0(HtmlTreeBuilderState.InColumnGroup);
                return;
            }
            if ("table".equals(strY)) {
                x0(HtmlTreeBuilderState.InTable);
                return;
            }
            if ("head".equals(strY)) {
                x0(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("body".equals(strY)) {
                x0(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("frameset".equals(strY)) {
                x0(HtmlTreeBuilderState.InFrameset);
                return;
            } else if (LinkDraftObj.DRAFT_TYPE_HTML.equals(strY)) {
                x0(HtmlTreeBuilderState.BeforeHead);
                return;
            } else if (z10) {
                x0(HtmlTreeBuilderState.InBody);
                return;
            }
        }
    }

    String s() {
        return this.f137980e;
    }

    void s0(org.jsoup.nodes.f fVar) {
        this.f137933l = fVar;
    }

    Document t() {
        return this.f137978c;
    }

    void t0(boolean z10) {
        this.f137938q = z10;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f137981f + ", state=" + this.f137929h + ", currentElement=" + a() + '}';
    }

    org.jsoup.nodes.f u() {
        return this.f137933l;
    }

    void u0(org.jsoup.nodes.f fVar) {
        this.f137932k = fVar;
    }

    org.jsoup.nodes.f v(String str) {
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            org.jsoup.nodes.f next = itDescendingIterator.next();
            if (next.y().equals(str)) {
                return next;
            }
        }
        return null;
    }

    void v0(List<Token.b> list) {
        this.f137936o = list;
    }

    org.jsoup.nodes.f w() {
        return this.f137932k;
    }

    HtmlTreeBuilderState w0() {
        return this.f137929h;
    }

    List<Token.b> x() {
        return this.f137936o;
    }

    void x0(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f137929h = htmlTreeBuilderState;
    }

    DescendableLinkedList<org.jsoup.nodes.f> y() {
        return this.f137979d;
    }

    boolean z(String str) {
        return C(str, new String[]{"button"});
    }
}
