package org.jsoup.parser;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.Iterator;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;

/* JADX INFO: loaded from: classes5.dex */
public enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.g()) {
                bVar.M(token.b());
            } else {
                if (!token.h()) {
                    bVar.x0(HtmlTreeBuilderState.BeforeHtml);
                    return bVar.e(token);
                }
                Token.d dVarC = token.c();
                bVar.t().i0(new org.jsoup.nodes.e(dVarC.m(), dVarC.n(), dVarC.o(), bVar.s()));
                if (dVarC.p()) {
                    bVar.t().c2(Document.QuirksMode.quirks);
                }
                bVar.x0(HtmlTreeBuilderState.BeforeHtml);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean anythingElse(Token token, b bVar) {
            bVar.I(LinkDraftObj.DRAFT_TYPE_HTML);
            bVar.x0(HtmlTreeBuilderState.BeforeHead);
            return bVar.e(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.h()) {
                bVar.m(this);
                return false;
            }
            if (token.g()) {
                bVar.M(token.b());
            } else {
                if (HtmlTreeBuilderState.isWhitespace(token)) {
                    return true;
                }
                if (!token.k() || !token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                    if ((!token.j() || !org.jsoup.helper.c.a(token.d().x(), "head", "body", LinkDraftObj.DRAFT_TYPE_HTML, com.google.android.exoplayer2.text.ttml.d.f49807t)) && token.j()) {
                        bVar.m(this);
                        return false;
                    }
                    return anythingElse(token, bVar);
                }
                bVar.J(token.e());
                bVar.x0(HtmlTreeBuilderState.BeforeHead);
            }
            return true;
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.g()) {
                bVar.M(token.b());
            } else {
                if (token.h()) {
                    bVar.m(this);
                    return false;
                }
                if (token.k() && token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                    return HtmlTreeBuilderState.InBody.process(token, bVar);
                }
                if (!token.k() || !token.e().x().equals("head")) {
                    if (token.j() && org.jsoup.helper.c.a(token.d().x(), "head", "body", LinkDraftObj.DRAFT_TYPE_HTML, com.google.android.exoplayer2.text.ttml.d.f49807t)) {
                        bVar.e(new Token.g("head"));
                        return bVar.e(token);
                    }
                    if (token.j()) {
                        bVar.m(this);
                        return false;
                    }
                    bVar.e(new Token.g("head"));
                    return bVar.e(token);
                }
                bVar.u0(bVar.J(token.e()));
                bVar.x0(HtmlTreeBuilderState.InHead);
            }
            return true;
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        private boolean anythingElse(Token token, h hVar) {
            hVar.e(new Token.f("head"));
            return hVar.e(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.L(token.a());
                return true;
            }
            int i10 = a.f137907a[token.f137910a.ordinal()];
            if (i10 == 1) {
                bVar.M(token.b());
            } else {
                if (i10 == 2) {
                    bVar.m(this);
                    return false;
                }
                if (i10 == 3) {
                    Token.g gVarE = token.e();
                    String strX = gVarE.x();
                    if (strX.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        return HtmlTreeBuilderState.InBody.process(token, bVar);
                    }
                    if (org.jsoup.helper.c.a(strX, com.google.android.exoplayer2.text.ttml.d.X, "basefont", "bgsound", "command", "link")) {
                        org.jsoup.nodes.f fVarN = bVar.N(gVarE);
                        if (strX.equals(com.google.android.exoplayer2.text.ttml.d.X) && fVarN.v("href")) {
                            bVar.Z(fVarN);
                        }
                    } else if (strX.equals("meta")) {
                        bVar.N(gVarE);
                    } else if (strX.equals("title")) {
                        HtmlTreeBuilderState.handleRcData(gVarE, bVar);
                    } else if (org.jsoup.helper.c.a(strX, "noframes", "style")) {
                        HtmlTreeBuilderState.handleRawtext(gVarE, bVar);
                    } else if (strX.equals("noscript")) {
                        bVar.J(gVarE);
                        bVar.x0(HtmlTreeBuilderState.InHeadNoscript);
                    } else {
                        if (!strX.equals(GameObj.FILTER_HEAD_SCRIPT)) {
                            if (!strX.equals("head")) {
                                return anythingElse(token, bVar);
                            }
                            bVar.m(this);
                            return false;
                        }
                        bVar.J(gVarE);
                        bVar.f137977b.x(TokeniserState.ScriptData);
                        bVar.Y();
                        bVar.x0(HtmlTreeBuilderState.Text);
                    }
                } else {
                    if (i10 != 4) {
                        return anythingElse(token, bVar);
                    }
                    String strX2 = token.d().x();
                    if (!strX2.equals("head")) {
                        if (org.jsoup.helper.c.a(strX2, "body", LinkDraftObj.DRAFT_TYPE_HTML, com.google.android.exoplayer2.text.ttml.d.f49807t)) {
                            return anythingElse(token, bVar);
                        }
                        bVar.m(this);
                        return false;
                    }
                    bVar.e0();
                    bVar.x0(HtmlTreeBuilderState.AfterHead);
                }
            }
            return true;
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean anythingElse(Token token, b bVar) {
            bVar.m(this);
            bVar.e(new Token.f("noscript"));
            return bVar.e(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.h()) {
                bVar.m(this);
                return true;
            }
            if (token.k() && token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.j() && token.d().x().equals("noscript")) {
                bVar.e0();
                bVar.x0(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token) || token.g() || (token.k() && org.jsoup.helper.c.a(token.e().x(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
                return bVar.i0(token, HtmlTreeBuilderState.InHead);
            }
            if (token.j() && token.d().x().equals(com.google.android.exoplayer2.text.ttml.d.f49807t)) {
                return anythingElse(token, bVar);
            }
            if ((!token.k() || !org.jsoup.helper.c.a(token.e().x(), "head", "noscript")) && !token.j()) {
                return anythingElse(token, bVar);
            }
            bVar.m(this);
            return false;
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean anythingElse(Token token, b bVar) {
            bVar.e(new Token.g("body"));
            bVar.n(true);
            return bVar.e(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.L(token.a());
                return true;
            }
            if (token.g()) {
                bVar.M(token.b());
                return true;
            }
            if (token.h()) {
                bVar.m(this);
                return true;
            }
            if (!token.k()) {
                if (!token.j()) {
                    anythingElse(token, bVar);
                    return true;
                }
                if (org.jsoup.helper.c.a(token.d().x(), "body", LinkDraftObj.DRAFT_TYPE_HTML)) {
                    anythingElse(token, bVar);
                    return true;
                }
                bVar.m(this);
                return false;
            }
            Token.g gVarE = token.e();
            String strX = gVarE.x();
            if (strX.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (strX.equals("body")) {
                bVar.J(gVarE);
                bVar.n(false);
                bVar.x0(HtmlTreeBuilderState.InBody);
                return true;
            }
            if (strX.equals("frameset")) {
                bVar.J(gVarE);
                bVar.x0(HtmlTreeBuilderState.InFrameset);
                return true;
            }
            if (!org.jsoup.helper.c.a(strX, com.google.android.exoplayer2.text.ttml.d.X, "basefont", "bgsound", "link", "meta", "noframes", GameObj.FILTER_HEAD_SCRIPT, "style", "title")) {
                if (strX.equals("head")) {
                    bVar.m(this);
                    return false;
                }
                anythingElse(token, bVar);
                return true;
            }
            bVar.m(this);
            org.jsoup.nodes.f fVarW = bVar.w();
            bVar.j0(fVarW);
            bVar.i0(token, HtmlTreeBuilderState.InHead);
            bVar.n0(fVarW);
            return true;
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        boolean anyOtherEndTag(Token token, b bVar) {
            String strX = token.d().x();
            Iterator<org.jsoup.nodes.f> itDescendingIterator = bVar.y().descendingIterator();
            while (itDescendingIterator.hasNext()) {
                org.jsoup.nodes.f next = itDescendingIterator.next();
                if (next.y().equals(strX)) {
                    bVar.q(strX);
                    if (!strX.equals(bVar.a().y())) {
                        bVar.m(this);
                    }
                    bVar.g0(strX);
                    return true;
                }
                if (bVar.X(next)) {
                    bVar.m(this);
                    return false;
                }
            }
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            org.jsoup.nodes.f fVar;
            int i10 = a.f137907a[token.f137910a.ordinal()];
            boolean z10 = true;
            if (i10 == 1) {
                bVar.M(token.b());
            } else {
                if (i10 == 2) {
                    bVar.m(this);
                    return false;
                }
                if (i10 != 3) {
                    if (i10 == 4) {
                        Token.f fVarD = token.d();
                        String strX = fVarD.x();
                        if (strX.equals("body")) {
                            if (!bVar.B("body")) {
                                bVar.m(this);
                                return false;
                            }
                            bVar.x0(HtmlTreeBuilderState.AfterBody);
                        } else if (strX.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                            if (bVar.e(new Token.f("body"))) {
                                return bVar.e(fVarD);
                            }
                        } else if (!org.jsoup.helper.c.a(strX, "address", BBSLinkObj.LIST_TYPE_ARTICLE, "aside", "blockquote", "button", com.google.android.exoplayer2.text.ttml.d.f49794m0, "details", "dir", com.google.android.exoplayer2.text.ttml.d.f49801q, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", GameRecommendAdapter.f85958h, "nav", "ol", "pre", "section", "summary", "ul")) {
                            org.jsoup.nodes.f fVar2 = null;
                            if (strX.equals(j5.c.f124295c)) {
                                org.jsoup.nodes.f fVarU = bVar.u();
                                bVar.s0(null);
                                if (fVarU == null || !bVar.B(strX)) {
                                    bVar.m(this);
                                    return false;
                                }
                                bVar.p();
                                if (!bVar.a().y().equals(strX)) {
                                    bVar.m(this);
                                }
                                bVar.n0(fVarU);
                            } else if (strX.equals("p")) {
                                if (!bVar.z(strX)) {
                                    bVar.m(this);
                                    bVar.e(new Token.g(strX));
                                    return bVar.e(fVarD);
                                }
                                bVar.q(strX);
                                if (!bVar.a().y().equals(strX)) {
                                    bVar.m(this);
                                }
                                bVar.g0(strX);
                            } else if (strX.equals("li")) {
                                if (!bVar.A(strX)) {
                                    bVar.m(this);
                                    return false;
                                }
                                bVar.q(strX);
                                if (!bVar.a().y().equals(strX)) {
                                    bVar.m(this);
                                }
                                bVar.g0(strX);
                            } else if (org.jsoup.helper.c.a(strX, "dd", SocializeProtocolConstants.PROTOCOL_KEY_DT)) {
                                if (!bVar.B(strX)) {
                                    bVar.m(this);
                                    return false;
                                }
                                bVar.q(strX);
                                if (!bVar.a().y().equals(strX)) {
                                    bVar.m(this);
                                }
                                bVar.g0(strX);
                            } else if (org.jsoup.helper.c.a(strX, "h1", "h2", "h3", "h4", "h5", "h6")) {
                                if (!bVar.D(new String[]{"h1", "h2", "h3", "h4", "h5", "h6"})) {
                                    bVar.m(this);
                                    return false;
                                }
                                bVar.q(strX);
                                if (!bVar.a().y().equals(strX)) {
                                    bVar.m(this);
                                }
                                bVar.h0("h1", "h2", "h3", "h4", "h5", "h6");
                            } else {
                                if (strX.equals("sarcasm")) {
                                    return anyOtherEndTag(token, bVar);
                                }
                                if (org.jsoup.helper.c.a(strX, ak.av, "b", "big", "code", "em", UiKitSpanObj.TYPE_FONT, "i", "nobr", ak.aB, "small", "strike", "strong", com.google.android.exoplayer2.text.ttml.d.f49795n, ak.aG)) {
                                    int i11 = 0;
                                    while (i11 < 8) {
                                        org.jsoup.nodes.f fVarR = bVar.r(strX);
                                        if (fVarR == null) {
                                            return anyOtherEndTag(token, bVar);
                                        }
                                        if (!bVar.b0(fVarR)) {
                                            bVar.m(this);
                                            bVar.m0(fVarR);
                                            return z10;
                                        }
                                        if (!bVar.B(fVarR.y())) {
                                            bVar.m(this);
                                            return false;
                                        }
                                        if (bVar.a() != fVarR) {
                                            bVar.m(this);
                                        }
                                        DescendableLinkedList<org.jsoup.nodes.f> descendableLinkedListY = bVar.y();
                                        int i12 = 0;
                                        boolean z11 = false;
                                        org.jsoup.nodes.f fVar3 = fVar2;
                                        while (true) {
                                            if (i12 >= descendableLinkedListY.size() || i12 >= 64) {
                                                fVar = fVar2;
                                                break;
                                            }
                                            fVar = descendableLinkedListY.get(i12);
                                            if (fVar != fVarR) {
                                                if (z11 && bVar.X(fVar)) {
                                                    break;
                                                }
                                            } else {
                                                fVar3 = descendableLinkedListY.get(i12 - 1);
                                                z11 = z10;
                                            }
                                            i12++;
                                        }
                                        if (fVar == null) {
                                            bVar.g0(fVarR.y());
                                            bVar.m0(fVarR);
                                            return z10;
                                        }
                                        int i13 = 0;
                                        org.jsoup.nodes.f fVarG = fVar;
                                        org.jsoup.nodes.g gVar = fVarG;
                                        for (int i14 = 3; i13 < i14; i14 = 3) {
                                            if (bVar.b0(fVarG)) {
                                                fVarG = bVar.g(fVarG);
                                            }
                                            if (!bVar.V(fVarG)) {
                                                bVar.n0(fVarG);
                                            } else {
                                                if (fVarG == fVarR) {
                                                    break;
                                                }
                                                org.jsoup.nodes.f fVar4 = new org.jsoup.nodes.f(e.n(fVarG.y()), bVar.s());
                                                bVar.o0(fVarG, fVar4);
                                                bVar.q0(fVarG, fVar4);
                                                if (gVar.F() != null) {
                                                    gVar.J();
                                                }
                                                fVar4.i0(gVar);
                                                fVarG = fVar4;
                                                gVar = fVarG;
                                            }
                                            i13++;
                                        }
                                        if (org.jsoup.helper.c.a(fVar3.y(), "table", "tbody", "tfoot", "thead", "tr")) {
                                            if (gVar.F() != null) {
                                                gVar.J();
                                            }
                                            bVar.O(gVar);
                                        } else {
                                            if (gVar.F() != null) {
                                                gVar.J();
                                            }
                                            fVar3.i0(gVar);
                                        }
                                        org.jsoup.nodes.f fVar5 = new org.jsoup.nodes.f(e.n(strX), bVar.s());
                                        for (org.jsoup.nodes.g gVar2 : (org.jsoup.nodes.g[]) fVar.o().toArray(new org.jsoup.nodes.g[fVar.n()])) {
                                            fVar5.i0(gVar2);
                                        }
                                        fVar.i0(fVar5);
                                        bVar.m0(fVarR);
                                        bVar.n0(fVarR);
                                        bVar.R(fVar, fVar5);
                                        i11++;
                                        z10 = true;
                                        fVar2 = null;
                                    }
                                } else {
                                    if (!org.jsoup.helper.c.a(strX, "applet", "marquee", "object")) {
                                        if (!strX.equals(com.google.android.exoplayer2.text.ttml.d.f49807t)) {
                                            return anyOtherEndTag(token, bVar);
                                        }
                                        bVar.m(this);
                                        bVar.e(new Token.g(com.google.android.exoplayer2.text.ttml.d.f49807t));
                                        return false;
                                    }
                                    if (!bVar.B("name")) {
                                        if (!bVar.B(strX)) {
                                            bVar.m(this);
                                            return false;
                                        }
                                        bVar.p();
                                        if (!bVar.a().y().equals(strX)) {
                                            bVar.m(this);
                                        }
                                        bVar.g0(strX);
                                        bVar.h();
                                    }
                                }
                            }
                        } else {
                            if (!bVar.B(strX)) {
                                bVar.m(this);
                                return false;
                            }
                            bVar.p();
                            if (!bVar.a().y().equals(strX)) {
                                bVar.m(this);
                            }
                            bVar.g0(strX);
                        }
                    } else if (i10 == 5) {
                        Token.b bVarA = token.a();
                        if (bVarA.m().equals(HtmlTreeBuilderState.nullString)) {
                            bVar.m(this);
                            return false;
                        }
                        if (HtmlTreeBuilderState.isWhitespace(bVarA)) {
                            bVar.l0();
                            bVar.L(bVarA);
                        } else {
                            bVar.l0();
                            bVar.L(bVarA);
                            bVar.n(false);
                        }
                    }
                    return z10;
                }
                Token.g gVarE = token.e();
                String strX2 = gVarE.x();
                if (strX2.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                    bVar.m(this);
                    org.jsoup.nodes.f first = bVar.y().getFirst();
                    for (org.jsoup.nodes.a aVar : gVarE.v()) {
                        if (!first.v(aVar.getKey())) {
                            first.i().u(aVar);
                        }
                    }
                } else {
                    if (org.jsoup.helper.c.a(strX2, com.google.android.exoplayer2.text.ttml.d.X, "basefont", "bgsound", "command", "link", "meta", "noframes", GameObj.FILTER_HEAD_SCRIPT, "style", "title")) {
                        return bVar.i0(token, HtmlTreeBuilderState.InHead);
                    }
                    if (strX2.equals("body")) {
                        bVar.m(this);
                        DescendableLinkedList<org.jsoup.nodes.f> descendableLinkedListY2 = bVar.y();
                        if (descendableLinkedListY2.size() == 1 || (descendableLinkedListY2.size() > 2 && !descendableLinkedListY2.get(1).y().equals("body"))) {
                            return false;
                        }
                        bVar.n(false);
                        org.jsoup.nodes.f fVar6 = descendableLinkedListY2.get(1);
                        for (org.jsoup.nodes.a aVar2 : gVarE.v()) {
                            if (!fVar6.v(aVar2.getKey())) {
                                fVar6.i().u(aVar2);
                            }
                        }
                    } else if (strX2.equals("frameset")) {
                        bVar.m(this);
                        DescendableLinkedList<org.jsoup.nodes.f> descendableLinkedListY3 = bVar.y();
                        if (descendableLinkedListY3.size() == 1 || ((descendableLinkedListY3.size() > 2 && !descendableLinkedListY3.get(1).y().equals("body")) || !bVar.o())) {
                            return false;
                        }
                        org.jsoup.nodes.f fVar7 = descendableLinkedListY3.get(1);
                        if (fVar7.F() != null) {
                            fVar7.J();
                        }
                        for (int i15 = 1; descendableLinkedListY3.size() > i15; i15 = 1) {
                            descendableLinkedListY3.removeLast();
                        }
                        bVar.J(gVarE);
                        bVar.x0(HtmlTreeBuilderState.InFrameset);
                    } else if (org.jsoup.helper.c.a(strX2, "address", BBSLinkObj.LIST_TYPE_ARTICLE, "aside", "blockquote", com.google.android.exoplayer2.text.ttml.d.f49794m0, "details", "dir", com.google.android.exoplayer2.text.ttml.d.f49801q, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", GameRecommendAdapter.f85958h, "nav", "ol", "p", "section", "summary", "ul")) {
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.J(gVarE);
                    } else if (org.jsoup.helper.c.a(strX2, "h1", "h2", "h3", "h4", "h5", "h6")) {
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        if (org.jsoup.helper.c.a(bVar.a().y(), "h1", "h2", "h3", "h4", "h5", "h6")) {
                            bVar.m(this);
                            bVar.e0();
                        }
                        bVar.J(gVarE);
                    } else if (org.jsoup.helper.c.a(strX2, "pre", "listing")) {
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.J(gVarE);
                        bVar.n(false);
                    } else if (strX2.equals(j5.c.f124295c)) {
                        if (bVar.u() != null) {
                            bVar.m(this);
                            return false;
                        }
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.s0(bVar.J(gVarE));
                    } else if (strX2.equals("li")) {
                        bVar.n(false);
                        DescendableLinkedList<org.jsoup.nodes.f> descendableLinkedListY4 = bVar.y();
                        for (int size = descendableLinkedListY4.size() - 1; size > 0; size--) {
                            org.jsoup.nodes.f fVar8 = descendableLinkedListY4.get(size);
                            if (fVar8.y().equals("li")) {
                                bVar.e(new Token.f("li"));
                                break;
                            }
                            if (bVar.X(fVar8) && !org.jsoup.helper.c.a(fVar8.y(), "address", com.google.android.exoplayer2.text.ttml.d.f49801q, "p")) {
                                break;
                            }
                        }
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.J(gVarE);
                    } else if (org.jsoup.helper.c.a(strX2, "dd", SocializeProtocolConstants.PROTOCOL_KEY_DT)) {
                        bVar.n(false);
                        DescendableLinkedList<org.jsoup.nodes.f> descendableLinkedListY5 = bVar.y();
                        for (int size2 = descendableLinkedListY5.size() - 1; size2 > 0; size2--) {
                            org.jsoup.nodes.f fVar9 = descendableLinkedListY5.get(size2);
                            if (org.jsoup.helper.c.a(fVar9.y(), "dd", SocializeProtocolConstants.PROTOCOL_KEY_DT)) {
                                bVar.e(new Token.f(fVar9.y()));
                                break;
                            }
                            if (bVar.X(fVar9) && !org.jsoup.helper.c.a(fVar9.y(), "address", com.google.android.exoplayer2.text.ttml.d.f49801q, "p")) {
                                break;
                            }
                        }
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.J(gVarE);
                    } else if (strX2.equals("plaintext")) {
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.J(gVarE);
                        bVar.f137977b.x(TokeniserState.PLAINTEXT);
                    } else if (strX2.equals("button")) {
                        if (bVar.z("button")) {
                            bVar.m(this);
                            bVar.e(new Token.f("button"));
                            bVar.e(gVarE);
                        } else {
                            bVar.l0();
                            bVar.J(gVarE);
                            bVar.n(false);
                        }
                    } else if (strX2.equals(ak.av)) {
                        if (bVar.r(ak.av) != null) {
                            bVar.m(this);
                            bVar.e(new Token.f(ak.av));
                            org.jsoup.nodes.f fVarV = bVar.v(ak.av);
                            if (fVarV != null) {
                                bVar.m0(fVarV);
                                bVar.n0(fVarV);
                            }
                        }
                        bVar.l0();
                        bVar.k0(bVar.J(gVarE));
                    } else if (org.jsoup.helper.c.a(strX2, "b", "big", "code", "em", UiKitSpanObj.TYPE_FONT, "i", ak.aB, "small", "strike", "strong", com.google.android.exoplayer2.text.ttml.d.f49795n, ak.aG)) {
                        bVar.l0();
                        bVar.k0(bVar.J(gVarE));
                    } else if (strX2.equals("nobr")) {
                        bVar.l0();
                        if (bVar.B("nobr")) {
                            bVar.m(this);
                            bVar.e(new Token.f("nobr"));
                            bVar.l0();
                        }
                        bVar.k0(bVar.J(gVarE));
                    } else if (org.jsoup.helper.c.a(strX2, "applet", "marquee", "object")) {
                        bVar.l0();
                        bVar.J(gVarE);
                        bVar.P();
                        bVar.n(false);
                    } else if (strX2.equals("table")) {
                        if (bVar.t().b2() != Document.QuirksMode.quirks && bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.J(gVarE);
                        bVar.n(false);
                        bVar.x0(HtmlTreeBuilderState.InTable);
                    } else if (org.jsoup.helper.c.a(strX2, "area", com.google.android.exoplayer2.text.ttml.d.f49807t, "embed", SocialConstants.PARAM_IMG_URL, "keygen", "wbr")) {
                        bVar.l0();
                        bVar.N(gVarE);
                        bVar.n(false);
                    } else if (strX2.equals("input")) {
                        bVar.l0();
                        if (!bVar.N(gVarE).g("type").equalsIgnoreCase("hidden")) {
                            bVar.n(false);
                        }
                    } else if (org.jsoup.helper.c.a(strX2, RemoteMessageConst.MessageBody.PARAM, "source", "track")) {
                        bVar.N(gVarE);
                    } else if (strX2.equals("hr")) {
                        if (bVar.z("p")) {
                            bVar.e(new Token.f("p"));
                        }
                        bVar.N(gVarE);
                        bVar.n(false);
                    } else {
                        if (strX2.equals("image")) {
                            gVarE.y(SocialConstants.PARAM_IMG_URL);
                            return bVar.e(gVarE);
                        }
                        if (strX2.equals("isindex")) {
                            bVar.m(this);
                            if (bVar.u() != null) {
                                return false;
                            }
                            bVar.f137977b.a();
                            bVar.e(new Token.g(j5.c.f124295c));
                            if (gVarE.f137922f.o("action")) {
                                bVar.u().h("action", gVarE.f137922f.m("action"));
                            }
                            bVar.e(new Token.g("hr"));
                            bVar.e(new Token.g(BasePuzzleInfo.PUZZLE_TYPE_LABEL));
                            bVar.e(new Token.b(gVarE.f137922f.o("prompt") ? gVarE.f137922f.m("prompt") : "This is a searchable index. Enter search keywords: "));
                            org.jsoup.nodes.b bVar2 = new org.jsoup.nodes.b();
                            for (org.jsoup.nodes.a aVar3 : gVarE.f137922f) {
                                if (!org.jsoup.helper.c.a(aVar3.getKey(), "name", "action", "prompt")) {
                                    bVar2.u(aVar3);
                                }
                            }
                            bVar2.t("name", "isindex");
                            bVar.e(new Token.g("input", bVar2));
                            bVar.e(new Token.f(BasePuzzleInfo.PUZZLE_TYPE_LABEL));
                            bVar.e(new Token.g("hr"));
                            bVar.e(new Token.f(j5.c.f124295c));
                        } else if (strX2.equals("textarea")) {
                            bVar.J(gVarE);
                            bVar.f137977b.x(TokeniserState.Rcdata);
                            bVar.Y();
                            bVar.n(false);
                            bVar.x0(HtmlTreeBuilderState.Text);
                        } else if (strX2.equals("xmp")) {
                            if (bVar.z("p")) {
                                bVar.e(new Token.f("p"));
                            }
                            bVar.l0();
                            bVar.n(false);
                            HtmlTreeBuilderState.handleRawtext(gVarE, bVar);
                        } else if (strX2.equals("iframe")) {
                            bVar.n(false);
                            HtmlTreeBuilderState.handleRawtext(gVarE, bVar);
                        } else if (strX2.equals("noembed")) {
                            HtmlTreeBuilderState.handleRawtext(gVarE, bVar);
                        } else if (strX2.equals(AddressListActivity.N)) {
                            bVar.l0();
                            bVar.J(gVarE);
                            bVar.n(false);
                            HtmlTreeBuilderState htmlTreeBuilderStateW0 = bVar.w0();
                            if (htmlTreeBuilderStateW0.equals(HtmlTreeBuilderState.InTable) || htmlTreeBuilderStateW0.equals(HtmlTreeBuilderState.InCaption) || htmlTreeBuilderStateW0.equals(HtmlTreeBuilderState.InTableBody) || htmlTreeBuilderStateW0.equals(HtmlTreeBuilderState.InRow) || htmlTreeBuilderStateW0.equals(HtmlTreeBuilderState.InCell)) {
                                bVar.x0(HtmlTreeBuilderState.InSelectInTable);
                            } else {
                                bVar.x0(HtmlTreeBuilderState.InSelect);
                            }
                        } else if (org.jsoup.helper.c.a("optgroup", "option")) {
                            if (bVar.a().y().equals("option")) {
                                bVar.e(new Token.f("option"));
                            }
                            bVar.l0();
                            bVar.J(gVarE);
                        } else if (org.jsoup.helper.c.a("rp", "rt")) {
                            if (bVar.B(com.google.android.exoplayer2.text.ttml.d.N)) {
                                bVar.p();
                                if (!bVar.a().y().equals(com.google.android.exoplayer2.text.ttml.d.N)) {
                                    bVar.m(this);
                                    bVar.f0(com.google.android.exoplayer2.text.ttml.d.N);
                                }
                                bVar.J(gVarE);
                            }
                        } else if (strX2.equals("math") || strX2.equals("svg")) {
                            bVar.l0();
                            bVar.J(gVarE);
                            bVar.f137977b.a();
                        } else {
                            if (org.jsoup.helper.c.a(strX2, "caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                                bVar.m(this);
                                return false;
                            }
                            bVar.l0();
                            bVar.J(gVarE);
                        }
                    }
                }
            }
            return true;
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.f()) {
                bVar.L(token.a());
                return true;
            }
            if (token.i()) {
                bVar.m(this);
                bVar.e0();
                bVar.x0(bVar.c0());
                return bVar.e(token);
            }
            if (!token.j()) {
                return true;
            }
            bVar.e0();
            bVar.x0(bVar.c0());
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        boolean anythingElse(Token token, b bVar) {
            bVar.m(this);
            if (!org.jsoup.helper.c.a(bVar.a().y(), "table", "tbody", "tfoot", "thead", "tr")) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            bVar.t0(true);
            boolean zI0 = bVar.i0(token, HtmlTreeBuilderState.InBody);
            bVar.t0(false);
            return zI0;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.f()) {
                bVar.a0();
                bVar.Y();
                bVar.x0(HtmlTreeBuilderState.InTableText);
                return bVar.e(token);
            }
            if (token.g()) {
                bVar.M(token.b());
                return true;
            }
            if (token.h()) {
                bVar.m(this);
                return false;
            }
            if (token.k()) {
                Token.g gVarE = token.e();
                String strX = gVarE.x();
                if (strX.equals("caption")) {
                    bVar.k();
                    bVar.P();
                    bVar.J(gVarE);
                    bVar.x0(HtmlTreeBuilderState.InCaption);
                } else if (strX.equals("colgroup")) {
                    bVar.k();
                    bVar.J(gVarE);
                    bVar.x0(HtmlTreeBuilderState.InColumnGroup);
                } else {
                    if (strX.equals("col")) {
                        bVar.e(new Token.g("colgroup"));
                        return bVar.e(token);
                    }
                    if (org.jsoup.helper.c.a(strX, "tbody", "tfoot", "thead")) {
                        bVar.k();
                        bVar.J(gVarE);
                        bVar.x0(HtmlTreeBuilderState.InTableBody);
                    } else {
                        if (org.jsoup.helper.c.a(strX, "td", "th", "tr")) {
                            bVar.e(new Token.g("tbody"));
                            return bVar.e(token);
                        }
                        if (strX.equals("table")) {
                            bVar.m(this);
                            if (bVar.e(new Token.f("table"))) {
                                return bVar.e(token);
                            }
                        } else {
                            if (org.jsoup.helper.c.a(strX, "style", GameObj.FILTER_HEAD_SCRIPT)) {
                                return bVar.i0(token, HtmlTreeBuilderState.InHead);
                            }
                            if (strX.equals("input")) {
                                if (!gVarE.f137922f.m("type").equalsIgnoreCase("hidden")) {
                                    return anythingElse(token, bVar);
                                }
                                bVar.N(gVarE);
                            } else {
                                if (!strX.equals(j5.c.f124295c)) {
                                    return anythingElse(token, bVar);
                                }
                                bVar.m(this);
                                if (bVar.u() != null) {
                                    return false;
                                }
                                bVar.s0(bVar.N(gVarE));
                            }
                        }
                    }
                }
            } else if (token.j()) {
                String strX2 = token.d().x();
                if (!strX2.equals("table")) {
                    if (!org.jsoup.helper.c.a(strX2, "body", "caption", "col", "colgroup", LinkDraftObj.DRAFT_TYPE_HTML, "tbody", "td", "tfoot", "th", "thead", "tr")) {
                        return anythingElse(token, bVar);
                    }
                    bVar.m(this);
                    return false;
                }
                if (!bVar.H(strX2)) {
                    bVar.m(this);
                    return false;
                }
                bVar.g0("table");
                bVar.r0();
            } else if (token.i()) {
                if (bVar.a().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                    bVar.m(this);
                }
                return true;
            }
            return anythingElse(token, bVar);
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (a.f137907a[token.f137910a.ordinal()] == 5) {
                Token.b bVarA = token.a();
                if (bVarA.m().equals(HtmlTreeBuilderState.nullString)) {
                    bVar.m(this);
                    return false;
                }
                bVar.x().add(bVarA);
                return true;
            }
            if (bVar.x().size() > 0) {
                for (Token.b bVar2 : bVar.x()) {
                    if (HtmlTreeBuilderState.isWhitespace(bVar2)) {
                        bVar.L(bVar2);
                    } else {
                        bVar.m(this);
                        if (org.jsoup.helper.c.a(bVar.a().y(), "table", "tbody", "tfoot", "thead", "tr")) {
                            bVar.t0(true);
                            bVar.i0(bVar2, HtmlTreeBuilderState.InBody);
                            bVar.t0(false);
                        } else {
                            bVar.i0(bVar2, HtmlTreeBuilderState.InBody);
                        }
                    }
                }
                bVar.a0();
            }
            bVar.x0(bVar.c0());
            return bVar.e(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.j() && token.d().x().equals("caption")) {
                if (!bVar.H(token.d().x())) {
                    bVar.m(this);
                    return false;
                }
                bVar.p();
                if (!bVar.a().y().equals("caption")) {
                    bVar.m(this);
                }
                bVar.g0("caption");
                bVar.h();
                bVar.x0(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((token.k() && org.jsoup.helper.c.a(token.e().x(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (token.j() && token.d().x().equals("table"))) {
                bVar.m(this);
                if (bVar.e(new Token.f("caption"))) {
                    return bVar.e(token);
                }
                return true;
            }
            if (!token.j() || !org.jsoup.helper.c.a(token.d().x(), "body", "col", "colgroup", LinkDraftObj.DRAFT_TYPE_HTML, "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            bVar.m(this);
            return false;
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        private boolean anythingElse(Token token, h hVar) {
            if (hVar.e(new Token.f("colgroup"))) {
                return hVar.e(token);
            }
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.L(token.a());
                return true;
            }
            int i10 = a.f137907a[token.f137910a.ordinal()];
            if (i10 == 1) {
                bVar.M(token.b());
            } else if (i10 == 2) {
                bVar.m(this);
            } else if (i10 == 3) {
                Token.g gVarE = token.e();
                String strX = gVarE.x();
                if (strX.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                    return bVar.i0(token, HtmlTreeBuilderState.InBody);
                }
                if (!strX.equals("col")) {
                    return anythingElse(token, bVar);
                }
                bVar.N(gVarE);
            } else {
                if (i10 != 4) {
                    if (i10 == 6 && bVar.a().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        return true;
                    }
                    return anythingElse(token, bVar);
                }
                if (!token.d().x().equals("colgroup")) {
                    return anythingElse(token, bVar);
                }
                if (bVar.a().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                    bVar.m(this);
                    return false;
                }
                bVar.e0();
                bVar.x0(HtmlTreeBuilderState.InTable);
            }
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean anythingElse(Token token, b bVar) {
            return bVar.i0(token, HtmlTreeBuilderState.InTable);
        }

        private boolean exitTableBody(Token token, b bVar) {
            if (!bVar.H("tbody") && !bVar.H("thead") && !bVar.B("tfoot")) {
                bVar.m(this);
                return false;
            }
            bVar.j();
            bVar.e(new Token.f(bVar.a().y()));
            return bVar.e(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            int i10 = a.f137907a[token.f137910a.ordinal()];
            if (i10 == 3) {
                Token.g gVarE = token.e();
                String strX = gVarE.x();
                if (strX.equals("tr")) {
                    bVar.j();
                    bVar.J(gVarE);
                    bVar.x0(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (!org.jsoup.helper.c.a(strX, "th", "td")) {
                    return org.jsoup.helper.c.a(strX, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? exitTableBody(token, bVar) : anythingElse(token, bVar);
                }
                bVar.m(this);
                bVar.e(new Token.g("tr"));
                return bVar.e(gVarE);
            }
            if (i10 != 4) {
                return anythingElse(token, bVar);
            }
            String strX2 = token.d().x();
            if (!org.jsoup.helper.c.a(strX2, "tbody", "tfoot", "thead")) {
                if (strX2.equals("table")) {
                    return exitTableBody(token, bVar);
                }
                if (!org.jsoup.helper.c.a(strX2, "body", "caption", "col", "colgroup", LinkDraftObj.DRAFT_TYPE_HTML, "td", "th", "tr")) {
                    return anythingElse(token, bVar);
                }
                bVar.m(this);
                return false;
            }
            if (!bVar.H(strX2)) {
                bVar.m(this);
                return false;
            }
            bVar.j();
            bVar.e0();
            bVar.x0(HtmlTreeBuilderState.InTable);
            return true;
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean anythingElse(Token token, b bVar) {
            return bVar.i0(token, HtmlTreeBuilderState.InTable);
        }

        private boolean handleMissingTr(Token token, h hVar) {
            if (hVar.e(new Token.f("tr"))) {
                return hVar.e(token);
            }
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.k()) {
                Token.g gVarE = token.e();
                String strX = gVarE.x();
                if (!org.jsoup.helper.c.a(strX, "th", "td")) {
                    return org.jsoup.helper.c.a(strX, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? handleMissingTr(token, bVar) : anythingElse(token, bVar);
                }
                bVar.l();
                bVar.J(gVarE);
                bVar.x0(HtmlTreeBuilderState.InCell);
                bVar.P();
                return true;
            }
            if (!token.j()) {
                return anythingElse(token, bVar);
            }
            String strX2 = token.d().x();
            if (strX2.equals("tr")) {
                if (!bVar.H(strX2)) {
                    bVar.m(this);
                    return false;
                }
                bVar.l();
                bVar.e0();
                bVar.x0(HtmlTreeBuilderState.InTableBody);
                return true;
            }
            if (strX2.equals("table")) {
                return handleMissingTr(token, bVar);
            }
            if (!org.jsoup.helper.c.a(strX2, "tbody", "tfoot", "thead")) {
                if (!org.jsoup.helper.c.a(strX2, "body", "caption", "col", "colgroup", LinkDraftObj.DRAFT_TYPE_HTML, "td", "th")) {
                    return anythingElse(token, bVar);
                }
                bVar.m(this);
                return false;
            }
            if (bVar.H(strX2)) {
                bVar.e(new Token.f("tr"));
                return bVar.e(token);
            }
            bVar.m(this);
            return false;
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean anythingElse(Token token, b bVar) {
            return bVar.i0(token, HtmlTreeBuilderState.InBody);
        }

        private void closeCell(b bVar) {
            if (bVar.H("td")) {
                bVar.e(new Token.f("td"));
            } else {
                bVar.e(new Token.f("th"));
            }
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (!token.j()) {
                if (!token.k() || !org.jsoup.helper.c.a(token.e().x(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return anythingElse(token, bVar);
                }
                if (bVar.H("td") || bVar.H("th")) {
                    closeCell(bVar);
                    return bVar.e(token);
                }
                bVar.m(this);
                return false;
            }
            String strX = token.d().x();
            if (!org.jsoup.helper.c.a(strX, "td", "th")) {
                if (org.jsoup.helper.c.a(strX, "body", "caption", "col", "colgroup", LinkDraftObj.DRAFT_TYPE_HTML)) {
                    bVar.m(this);
                    return false;
                }
                if (!org.jsoup.helper.c.a(strX, "table", "tbody", "tfoot", "thead", "tr")) {
                    return anythingElse(token, bVar);
                }
                if (bVar.H(strX)) {
                    closeCell(bVar);
                    return bVar.e(token);
                }
                bVar.m(this);
                return false;
            }
            if (!bVar.H(strX)) {
                bVar.m(this);
                bVar.x0(HtmlTreeBuilderState.InRow);
                return false;
            }
            bVar.p();
            if (!bVar.a().y().equals(strX)) {
                bVar.m(this);
            }
            bVar.g0(strX);
            bVar.h();
            bVar.x0(HtmlTreeBuilderState.InRow);
            return true;
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        private boolean anythingElse(Token token, b bVar) {
            bVar.m(this);
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            switch (a.f137907a[token.f137910a.ordinal()]) {
                case 1:
                    bVar.M(token.b());
                    return true;
                case 2:
                    bVar.m(this);
                    return false;
                case 3:
                    Token.g gVarE = token.e();
                    String strX = gVarE.x();
                    if (strX.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        return bVar.i0(gVarE, HtmlTreeBuilderState.InBody);
                    }
                    if (strX.equals("option")) {
                        bVar.e(new Token.f("option"));
                        bVar.J(gVarE);
                        return true;
                    }
                    if (strX.equals("optgroup")) {
                        if (bVar.a().y().equals("option")) {
                            bVar.e(new Token.f("option"));
                        } else if (bVar.a().y().equals("optgroup")) {
                            bVar.e(new Token.f("optgroup"));
                        }
                        bVar.J(gVarE);
                        return true;
                    }
                    if (strX.equals(AddressListActivity.N)) {
                        bVar.m(this);
                        return bVar.e(new Token.f(AddressListActivity.N));
                    }
                    if (!org.jsoup.helper.c.a(strX, "input", "keygen", "textarea")) {
                        return strX.equals(GameObj.FILTER_HEAD_SCRIPT) ? bVar.i0(token, HtmlTreeBuilderState.InHead) : anythingElse(token, bVar);
                    }
                    bVar.m(this);
                    if (!bVar.E(AddressListActivity.N)) {
                        return false;
                    }
                    bVar.e(new Token.f(AddressListActivity.N));
                    return bVar.e(gVarE);
                case 4:
                    String strX2 = token.d().x();
                    if (strX2.equals("optgroup")) {
                        if (bVar.a().y().equals("option") && bVar.g(bVar.a()) != null && bVar.g(bVar.a()).y().equals("optgroup")) {
                            bVar.e(new Token.f("option"));
                        }
                        if (bVar.a().y().equals("optgroup")) {
                            bVar.e0();
                            return true;
                        }
                        bVar.m(this);
                        return true;
                    }
                    if (strX2.equals("option")) {
                        if (bVar.a().y().equals("option")) {
                            bVar.e0();
                            return true;
                        }
                        bVar.m(this);
                        return true;
                    }
                    if (!strX2.equals(AddressListActivity.N)) {
                        return anythingElse(token, bVar);
                    }
                    if (!bVar.E(strX2)) {
                        bVar.m(this);
                        return false;
                    }
                    bVar.g0(strX2);
                    bVar.r0();
                    return true;
                case 5:
                    Token.b bVarA = token.a();
                    if (bVarA.m().equals(HtmlTreeBuilderState.nullString)) {
                        bVar.m(this);
                        return false;
                    }
                    bVar.L(bVarA);
                    return true;
                case 6:
                    if (bVar.a().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        return true;
                    }
                    bVar.m(this);
                    return true;
                default:
                    return anythingElse(token, bVar);
            }
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.k() && org.jsoup.helper.c.a(token.e().x(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                bVar.m(this);
                bVar.e(new Token.f(AddressListActivity.N));
                return bVar.e(token);
            }
            if (!token.j() || !org.jsoup.helper.c.a(token.d().x(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                return bVar.i0(token, HtmlTreeBuilderState.InSelect);
            }
            bVar.m(this);
            if (!bVar.H(token.d().x())) {
                return false;
            }
            bVar.e(new Token.f(AddressListActivity.N));
            return bVar.e(token);
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.g()) {
                bVar.M(token.b());
                return true;
            }
            if (token.h()) {
                bVar.m(this);
                return false;
            }
            if (token.k() && token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.j() && token.d().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                if (bVar.U()) {
                    bVar.m(this);
                    return false;
                }
                bVar.x0(HtmlTreeBuilderState.AfterAfterBody);
                return true;
            }
            if (token.i()) {
                return true;
            }
            bVar.m(this);
            bVar.x0(HtmlTreeBuilderState.InBody);
            return bVar.e(token);
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.L(token.a());
            } else if (token.g()) {
                bVar.M(token.b());
            } else {
                if (token.h()) {
                    bVar.m(this);
                    return false;
                }
                if (token.k()) {
                    Token.g gVarE = token.e();
                    String strX = gVarE.x();
                    if (strX.equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        return bVar.i0(gVarE, HtmlTreeBuilderState.InBody);
                    }
                    if (strX.equals("frameset")) {
                        bVar.J(gVarE);
                    } else {
                        if (!strX.equals("frame")) {
                            if (strX.equals("noframes")) {
                                return bVar.i0(gVarE, HtmlTreeBuilderState.InHead);
                            }
                            bVar.m(this);
                            return false;
                        }
                        bVar.N(gVarE);
                    }
                } else if (token.j() && token.d().x().equals("frameset")) {
                    if (bVar.a().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        bVar.m(this);
                        return false;
                    }
                    bVar.e0();
                    if (!bVar.U() && !bVar.a().y().equals("frameset")) {
                        bVar.x0(HtmlTreeBuilderState.AfterFrameset);
                    }
                } else {
                    if (!token.i()) {
                        bVar.m(this);
                        return false;
                    }
                    if (!bVar.a().y().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                        bVar.m(this);
                    }
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.L(token.a());
                return true;
            }
            if (token.g()) {
                bVar.M(token.b());
                return true;
            }
            if (token.h()) {
                bVar.m(this);
                return false;
            }
            if (token.k() && token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.j() && token.d().x().equals(LinkDraftObj.DRAFT_TYPE_HTML)) {
                bVar.x0(HtmlTreeBuilderState.AfterAfterFrameset);
                return true;
            }
            if (token.k() && token.e().x().equals("noframes")) {
                return bVar.i0(token, HtmlTreeBuilderState.InHead);
            }
            if (token.i()) {
                return true;
            }
            bVar.m(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.g()) {
                bVar.M(token.b());
                return true;
            }
            if (token.h() || HtmlTreeBuilderState.isWhitespace(token) || (token.k() && token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML))) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.i()) {
                return true;
            }
            bVar.m(this);
            bVar.x0(HtmlTreeBuilderState.InBody);
            return bVar.e(token);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            if (token.g()) {
                bVar.M(token.b());
                return true;
            }
            if (token.h() || HtmlTreeBuilderState.isWhitespace(token) || (token.k() && token.e().x().equals(LinkDraftObj.DRAFT_TYPE_HTML))) {
                return bVar.i0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.i()) {
                return true;
            }
            if (token.k() && token.e().x().equals("noframes")) {
                return bVar.i0(token, HtmlTreeBuilderState.InHead);
            }
            bVar.m(this);
            return false;
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, b bVar) {
            return true;
        }
    };

    private static String nullString = String.valueOf((char) 0);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137907a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f137907a = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137907a[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137907a[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137907a[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137907a[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f137907a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(Token.g gVar, b bVar) {
        bVar.J(gVar);
        bVar.f137977b.x(TokeniserState.Rawtext);
        bVar.Y();
        bVar.x0(Text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(Token.g gVar, b bVar) {
        bVar.J(gVar);
        bVar.f137977b.x(TokeniserState.Rcdata);
        bVar.Y();
        bVar.x0(Text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(Token token) {
        if (!token.f()) {
            return false;
        }
        String strM = token.a().m();
        for (int i10 = 0; i10 < strM.length(); i10++) {
            if (!org.jsoup.helper.c.d(strM.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    abstract boolean process(Token token, b bVar);
}
