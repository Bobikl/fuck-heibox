package org.jsoup.parser;

import com.max.xiaoheihe.bean.game.GameObj;
import com.tencent.qcloud.core.util.IOUtils;
import kotlin.text.y;

/* JADX INFO: loaded from: classes5.dex */
public enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                gVar.k(aVar.b());
            } else {
                if (cM == '&') {
                    gVar.b(TokeniserState.CharacterReferenceInData);
                    return;
                }
                if (cM == '<') {
                    gVar.b(TokeniserState.TagOpen);
                } else if (cM != 65535) {
                    gVar.l(aVar.j(y.f128595d, y.f128596e, 0));
                } else {
                    gVar.m(new Token.e());
                }
            }
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char[] cArrE = gVar.e(null, false);
            if (cArrE == null) {
                gVar.k(y.f128595d);
            } else {
                gVar.n(cArrE);
            }
            gVar.x(TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.k((char) 65533);
            } else {
                if (cM == '&') {
                    gVar.b(TokeniserState.CharacterReferenceInRcdata);
                    return;
                }
                if (cM == '<') {
                    gVar.b(TokeniserState.RcdataLessthanSign);
                } else if (cM != 65535) {
                    gVar.l(aVar.j(y.f128595d, y.f128596e, 0));
                } else {
                    gVar.m(new Token.e());
                }
            }
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char[] cArrE = gVar.e(null, false);
            if (cArrE == null) {
                gVar.k(y.f128595d);
            } else {
                gVar.n(cArrE);
            }
            gVar.x(TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.k((char) 65533);
            } else if (cM == '<') {
                gVar.b(TokeniserState.RawtextLessthanSign);
            } else if (cM != 65535) {
                gVar.l(aVar.j(y.f128596e, 0));
            } else {
                gVar.m(new Token.e());
            }
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.k((char) 65533);
            } else if (cM == '<') {
                gVar.b(TokeniserState.ScriptDataLessthanSign);
            } else if (cM != 65535) {
                gVar.l(aVar.j(y.f128596e, 0));
            } else {
                gVar.m(new Token.e());
            }
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.k((char) 65533);
            } else if (cM != 65535) {
                gVar.l(aVar.h((char) 0));
            } else {
                gVar.m(new Token.e());
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == '!') {
                gVar.b(TokeniserState.MarkupDeclarationOpen);
                return;
            }
            if (cM == '/') {
                gVar.b(TokeniserState.EndTagOpen);
                return;
            }
            if (cM == '?') {
                gVar.b(TokeniserState.BogusComment);
                return;
            }
            if (aVar.w()) {
                gVar.h(true);
                gVar.x(TokeniserState.TagName);
            } else {
                gVar.t(this);
                gVar.k(y.f128596e);
                gVar.x(TokeniserState.Data);
            }
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.n()) {
                gVar.r(this);
                gVar.l("</");
                gVar.x(TokeniserState.Data);
            } else if (aVar.w()) {
                gVar.h(false);
                gVar.x(TokeniserState.TagName);
            } else if (aVar.r(y.f128597f)) {
                gVar.t(this);
                gVar.b(TokeniserState.Data);
            } else {
                gVar.t(this);
                gVar.b(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            gVar.f137971h.s(aVar.j('\t', '\n', '\r', '\f', ' ', IOUtils.DIR_SEPARATOR_UNIX, y.f128597f, 0).toLowerCase());
            char cB = aVar.b();
            if (cB == 0) {
                gVar.f137971h.s(TokeniserState.replacementStr);
                return;
            }
            if (cB != ' ') {
                if (cB == '/') {
                    gVar.x(TokeniserState.SelfClosingStartTag);
                    return;
                }
                if (cB == '>') {
                    gVar.q();
                    gVar.x(TokeniserState.Data);
                    return;
                } else if (cB == 65535) {
                    gVar.r(this);
                    gVar.x(TokeniserState.Data);
                    return;
                } else if (cB != '\t' && cB != '\n' && cB != '\f' && cB != '\r') {
                    return;
                }
            }
            gVar.x(TokeniserState.BeforeAttributeName);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.r(IOUtils.DIR_SEPARATOR_UNIX)) {
                gVar.i();
                gVar.b(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (aVar.w()) {
                if (!aVar.l("</" + gVar.c())) {
                    gVar.f137971h = new Token.f(gVar.c());
                    gVar.q();
                    aVar.B();
                    gVar.x(TokeniserState.Data);
                    return;
                }
            }
            gVar.l("<");
            gVar.x(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.w()) {
                gVar.l("</");
                gVar.x(TokeniserState.Rcdata);
            } else {
                gVar.h(false);
                gVar.f137971h.r(Character.toLowerCase(aVar.m()));
                gVar.f137970g.append(Character.toLowerCase(aVar.m()));
                gVar.b(TokeniserState.RCDATAEndTagName);
            }
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        private void anythingElse(g gVar, a aVar) {
            gVar.l("</" + gVar.f137970g.toString());
            aVar.B();
            gVar.x(TokeniserState.Rcdata);
        }

        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                String strF = aVar.f();
                gVar.f137971h.s(strF.toLowerCase());
                gVar.f137970g.append(strF);
                return;
            }
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                if (gVar.v()) {
                    gVar.x(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    anythingElse(gVar, aVar);
                    return;
                }
            }
            if (cB == '/') {
                if (gVar.v()) {
                    gVar.x(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(gVar, aVar);
                    return;
                }
            }
            if (cB != '>') {
                anythingElse(gVar, aVar);
            } else if (!gVar.v()) {
                anythingElse(gVar, aVar);
            } else {
                gVar.q();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.r(IOUtils.DIR_SEPARATOR_UNIX)) {
                gVar.i();
                gVar.b(TokeniserState.RawtextEndTagOpen);
            } else {
                gVar.k(y.f128596e);
                gVar.x(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                gVar.h(false);
                gVar.x(TokeniserState.RawtextEndTagName);
            } else {
                gVar.l("</");
                gVar.x(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        private void anythingElse(g gVar, a aVar) {
            gVar.l("</" + gVar.f137970g.toString());
            gVar.x(TokeniserState.Rawtext);
        }

        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                String strF = aVar.f();
                gVar.f137971h.s(strF.toLowerCase());
                gVar.f137970g.append(strF);
                return;
            }
            if (!gVar.v() || aVar.n()) {
                anythingElse(gVar, aVar);
                return;
            }
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeAttributeName);
                return;
            }
            if (cB == '/') {
                gVar.x(TokeniserState.SelfClosingStartTag);
            } else if (cB != '>') {
                gVar.f137970g.append(cB);
                anythingElse(gVar, aVar);
            } else {
                gVar.q();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '!') {
                gVar.l("<!");
                gVar.x(TokeniserState.ScriptDataEscapeStart);
            } else if (cB == '/') {
                gVar.i();
                gVar.x(TokeniserState.ScriptDataEndTagOpen);
            } else {
                gVar.l("<");
                aVar.B();
                gVar.x(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                gVar.h(false);
                gVar.x(TokeniserState.ScriptDataEndTagName);
            } else {
                gVar.l("</");
                gVar.x(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        private void anythingElse(g gVar, a aVar) {
            gVar.l("</" + gVar.f137970g.toString());
            gVar.x(TokeniserState.ScriptData);
        }

        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                String strF = aVar.f();
                gVar.f137971h.s(strF.toLowerCase());
                gVar.f137970g.append(strF);
                return;
            }
            if (!gVar.v() || aVar.n()) {
                anythingElse(gVar, aVar);
                return;
            }
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeAttributeName);
                return;
            }
            if (cB == '/') {
                gVar.x(TokeniserState.SelfClosingStartTag);
            } else if (cB != '>') {
                gVar.f137970g.append(cB);
                anythingElse(gVar, aVar);
            } else {
                gVar.q();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.r('-')) {
                gVar.x(TokeniserState.ScriptData);
            } else {
                gVar.k('-');
                gVar.b(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.r('-')) {
                gVar.x(TokeniserState.ScriptData);
            } else {
                gVar.k('-');
                gVar.b(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.n()) {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
                return;
            }
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.k((char) 65533);
            } else if (cM == '-') {
                gVar.k('-');
                gVar.b(TokeniserState.ScriptDataEscapedDash);
            } else if (cM != '<') {
                gVar.l(aVar.j('-', y.f128596e, 0));
            } else {
                gVar.b(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.n()) {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
                return;
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.k((char) 65533);
                gVar.x(TokeniserState.ScriptDataEscaped);
            } else if (cB == '-') {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataEscapedDashDash);
            } else if (cB == '<') {
                gVar.x(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.n()) {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
                return;
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.k((char) 65533);
                gVar.x(TokeniserState.ScriptDataEscaped);
            } else {
                if (cB == '-') {
                    gVar.k(cB);
                    return;
                }
                if (cB == '<') {
                    gVar.x(TokeniserState.ScriptDataEscapedLessthanSign);
                } else if (cB != '>') {
                    gVar.k(cB);
                    gVar.x(TokeniserState.ScriptDataEscaped);
                } else {
                    gVar.k(cB);
                    gVar.x(TokeniserState.ScriptData);
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.w()) {
                if (aVar.r(IOUtils.DIR_SEPARATOR_UNIX)) {
                    gVar.i();
                    gVar.b(TokeniserState.ScriptDataEscapedEndTagOpen);
                    return;
                } else {
                    gVar.k(y.f128596e);
                    gVar.x(TokeniserState.ScriptDataEscaped);
                    return;
                }
            }
            gVar.i();
            gVar.f137970g.append(Character.toLowerCase(aVar.m()));
            gVar.l("<" + aVar.m());
            gVar.b(TokeniserState.ScriptDataDoubleEscapeStart);
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.w()) {
                gVar.l("</");
                gVar.x(TokeniserState.ScriptDataEscaped);
            } else {
                gVar.h(false);
                gVar.f137971h.r(Character.toLowerCase(aVar.m()));
                gVar.f137970g.append(aVar.m());
                gVar.b(TokeniserState.ScriptDataEscapedEndTagName);
            }
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        private void anythingElse(g gVar, a aVar) {
            gVar.l("</" + gVar.f137970g.toString());
            gVar.x(TokeniserState.ScriptDataEscaped);
        }

        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                String strF = aVar.f();
                gVar.f137971h.s(strF.toLowerCase());
                gVar.f137970g.append(strF);
                return;
            }
            if (!gVar.v() || aVar.n()) {
                anythingElse(gVar, aVar);
                return;
            }
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeAttributeName);
                return;
            }
            if (cB == '/') {
                gVar.x(TokeniserState.SelfClosingStartTag);
            } else if (cB != '>') {
                gVar.f137970g.append(cB);
                anythingElse(gVar, aVar);
            } else {
                gVar.q();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                String strF = aVar.f();
                gVar.f137970g.append(strF.toLowerCase());
                gVar.l(strF);
                return;
            }
            char cB = aVar.b();
            if (cB != '\t' && cB != '\n' && cB != '\f' && cB != '\r' && cB != ' ' && cB != '/' && cB != '>') {
                aVar.B();
                gVar.x(TokeniserState.ScriptDataEscaped);
            } else {
                if (gVar.f137970g.toString().equals(GameObj.FILTER_HEAD_SCRIPT)) {
                    gVar.x(TokeniserState.ScriptDataDoubleEscaped);
                } else {
                    gVar.x(TokeniserState.ScriptDataEscaped);
                }
                gVar.k(cB);
            }
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.k((char) 65533);
            } else if (cM == '-') {
                gVar.k(cM);
                gVar.b(TokeniserState.ScriptDataDoubleEscapedDash);
            } else if (cM == '<') {
                gVar.k(cM);
                gVar.b(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cM != 65535) {
                gVar.l(aVar.j('-', y.f128596e, 0));
            } else {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.k((char) 65533);
                gVar.x(TokeniserState.ScriptDataDoubleEscaped);
            } else if (cB == '-') {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (cB == '<') {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cB != 65535) {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.k((char) 65533);
                gVar.x(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            if (cB == '-') {
                gVar.k(cB);
                return;
            }
            if (cB == '<') {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (cB == '>') {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptData);
            } else if (cB != 65535) {
                gVar.k(cB);
                gVar.x(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.r(IOUtils.DIR_SEPARATOR_UNIX)) {
                gVar.x(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            gVar.k(IOUtils.DIR_SEPARATOR_UNIX);
            gVar.i();
            gVar.b(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                String strF = aVar.f();
                gVar.f137970g.append(strF.toLowerCase());
                gVar.l(strF);
                return;
            }
            char cB = aVar.b();
            if (cB != '\t' && cB != '\n' && cB != '\f' && cB != '\r' && cB != ' ' && cB != '/' && cB != '>') {
                aVar.B();
                gVar.x(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                if (gVar.f137970g.toString().equals(GameObj.FILTER_HEAD_SCRIPT)) {
                    gVar.x(TokeniserState.ScriptDataEscaped);
                } else {
                    gVar.x(TokeniserState.ScriptDataDoubleEscaped);
                }
                gVar.k(cB);
            }
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.z();
                aVar.B();
                gVar.x(TokeniserState.AttributeName);
                return;
            }
            if (cB != ' ') {
                if (cB != '\"' && cB != '\'') {
                    if (cB == '/') {
                        gVar.x(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cB == 65535) {
                        gVar.r(this);
                        gVar.x(TokeniserState.Data);
                        return;
                    }
                    if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r') {
                        return;
                    }
                    switch (cB) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            gVar.q();
                            gVar.x(TokeniserState.Data);
                            break;
                        default:
                            gVar.f137971h.z();
                            aVar.B();
                            gVar.x(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                gVar.t(this);
                gVar.f137971h.z();
                gVar.f137971h.m(cB);
                gVar.x(TokeniserState.AttributeName);
            }
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            gVar.f137971h.n(aVar.j('\t', '\n', '\r', '\f', ' ', IOUtils.DIR_SEPARATOR_UNIX, n5.a.f132013h, y.f128597f, 0, y.f128593b, '\'', y.f128596e).toLowerCase());
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.m((char) 65533);
                return;
            }
            if (cB != ' ') {
                if (cB != '\"' && cB != '\'') {
                    if (cB == '/') {
                        gVar.x(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cB == 65535) {
                        gVar.r(this);
                        gVar.x(TokeniserState.Data);
                        return;
                    } else if (cB != '\t' && cB != '\n' && cB != '\f' && cB != '\r') {
                        switch (cB) {
                            case '=':
                                gVar.x(TokeniserState.BeforeAttributeValue);
                                break;
                            case '>':
                                gVar.q();
                                gVar.x(TokeniserState.Data);
                                break;
                        }
                        return;
                    }
                }
                gVar.t(this);
                gVar.f137971h.m(cB);
                return;
            }
            gVar.x(TokeniserState.AfterAttributeName);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.m((char) 65533);
                gVar.x(TokeniserState.AttributeName);
                return;
            }
            if (cB != ' ') {
                if (cB != '\"' && cB != '\'') {
                    if (cB == '/') {
                        gVar.x(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cB == 65535) {
                        gVar.r(this);
                        gVar.x(TokeniserState.Data);
                        return;
                    }
                    if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r') {
                        return;
                    }
                    switch (cB) {
                        case '<':
                            break;
                        case '=':
                            gVar.x(TokeniserState.BeforeAttributeValue);
                            break;
                        case '>':
                            gVar.q();
                            gVar.x(TokeniserState.Data);
                            break;
                        default:
                            gVar.f137971h.z();
                            aVar.B();
                            gVar.x(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                gVar.t(this);
                gVar.f137971h.z();
                gVar.f137971h.m(cB);
                gVar.x(TokeniserState.AttributeName);
            }
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.o((char) 65533);
                gVar.x(TokeniserState.AttributeValue_unquoted);
                return;
            }
            if (cB != ' ') {
                if (cB == '\"') {
                    gVar.x(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                if (cB != '`') {
                    if (cB == 65535) {
                        gVar.r(this);
                        gVar.x(TokeniserState.Data);
                        return;
                    }
                    if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r') {
                        return;
                    }
                    if (cB == '&') {
                        aVar.B();
                        gVar.x(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    if (cB == '\'') {
                        gVar.x(TokeniserState.AttributeValue_singleQuoted);
                        return;
                    }
                    switch (cB) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            gVar.t(this);
                            gVar.q();
                            gVar.x(TokeniserState.Data);
                            break;
                        default:
                            aVar.B();
                            gVar.x(TokeniserState.AttributeValue_unquoted);
                            break;
                    }
                    return;
                }
                gVar.t(this);
                gVar.f137971h.o(cB);
                gVar.x(TokeniserState.AttributeValue_unquoted);
            }
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            String strJ = aVar.j(y.f128593b, y.f128595d, 0);
            if (strJ.length() > 0) {
                gVar.f137971h.p(strJ);
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.o((char) 65533);
                return;
            }
            if (cB == '\"') {
                gVar.x(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (cB != '&') {
                if (cB != 65535) {
                    return;
                }
                gVar.r(this);
                gVar.x(TokeniserState.Data);
                return;
            }
            char[] cArrE = gVar.e(Character.valueOf(y.f128593b), true);
            if (cArrE != null) {
                gVar.f137971h.q(cArrE);
            } else {
                gVar.f137971h.o(y.f128595d);
            }
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            String strJ = aVar.j('\'', y.f128595d, 0);
            if (strJ.length() > 0) {
                gVar.f137971h.p(strJ);
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.o((char) 65533);
                return;
            }
            if (cB == 65535) {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
            } else if (cB != '&') {
                if (cB != '\'') {
                    return;
                }
                gVar.x(TokeniserState.AfterAttributeValue_quoted);
            } else {
                char[] cArrE = gVar.e('\'', true);
                if (cArrE != null) {
                    gVar.f137971h.q(cArrE);
                } else {
                    gVar.f137971h.o(y.f128595d);
                }
            }
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            String strJ = aVar.j('\t', '\n', '\r', '\f', ' ', y.f128595d, y.f128597f, 0, y.f128593b, '\'', y.f128596e, n5.a.f132013h, '`');
            if (strJ.length() > 0) {
                gVar.f137971h.p(strJ);
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137971h.o((char) 65533);
                return;
            }
            if (cB != ' ') {
                if (cB != '\"' && cB != '`') {
                    if (cB == 65535) {
                        gVar.r(this);
                        gVar.x(TokeniserState.Data);
                        return;
                    }
                    if (cB != '\t' && cB != '\n' && cB != '\f' && cB != '\r') {
                        if (cB == '&') {
                            char[] cArrE = gVar.e(Character.valueOf(y.f128597f), true);
                            if (cArrE != null) {
                                gVar.f137971h.q(cArrE);
                                return;
                            } else {
                                gVar.f137971h.o(y.f128595d);
                                return;
                            }
                        }
                        if (cB != '\'') {
                            switch (cB) {
                                case '>':
                                    gVar.q();
                                    gVar.x(TokeniserState.Data);
                                    break;
                            }
                            return;
                        }
                    }
                }
                gVar.t(this);
                gVar.f137971h.o(cB);
                return;
            }
            gVar.x(TokeniserState.BeforeAttributeName);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeAttributeName);
                return;
            }
            if (cB == '/') {
                gVar.x(TokeniserState.SelfClosingStartTag);
                return;
            }
            if (cB == '>') {
                gVar.q();
                gVar.x(TokeniserState.Data);
            } else if (cB == 65535) {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
            } else {
                gVar.t(this);
                aVar.B();
                gVar.x(TokeniserState.BeforeAttributeName);
            }
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '>') {
                gVar.f137971h.f137921e = true;
                gVar.q();
                gVar.x(TokeniserState.Data);
            } else if (cB != 65535) {
                gVar.t(this);
                gVar.x(TokeniserState.BeforeAttributeName);
            } else {
                gVar.r(this);
                gVar.x(TokeniserState.Data);
            }
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            aVar.B();
            Token.c cVar = new Token.c();
            cVar.f137913c = true;
            cVar.f137912b.append(aVar.h(y.f128597f));
            gVar.m(cVar);
            gVar.b(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.p("--")) {
                gVar.f();
                gVar.x(TokeniserState.CommentStart);
            } else if (aVar.q("DOCTYPE")) {
                gVar.x(TokeniserState.Doctype);
            } else if (aVar.p("[CDATA[")) {
                gVar.x(TokeniserState.CdataSection);
            } else {
                gVar.t(this);
                gVar.b(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137973j.f137912b.append((char) 65533);
                gVar.x(TokeniserState.Comment);
                return;
            }
            if (cB == '-') {
                gVar.x(TokeniserState.CommentStartDash);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else if (cB != 65535) {
                gVar.f137973j.f137912b.append(cB);
                gVar.x(TokeniserState.Comment);
            } else {
                gVar.r(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137973j.f137912b.append((char) 65533);
                gVar.x(TokeniserState.Comment);
                return;
            }
            if (cB == '-') {
                gVar.x(TokeniserState.CommentStartDash);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else if (cB != 65535) {
                gVar.f137973j.f137912b.append(cB);
                gVar.x(TokeniserState.Comment);
            } else {
                gVar.r(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cM = aVar.m();
            if (cM == 0) {
                gVar.t(this);
                aVar.a();
                gVar.f137973j.f137912b.append((char) 65533);
            } else if (cM == '-') {
                gVar.b(TokeniserState.CommentEndDash);
            } else {
                if (cM != 65535) {
                    gVar.f137973j.f137912b.append(aVar.j('-', 0));
                    return;
                }
                gVar.r(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                StringBuilder sb2 = gVar.f137973j.f137912b;
                sb2.append('-');
                sb2.append((char) 65533);
                gVar.x(TokeniserState.Comment);
                return;
            }
            if (cB == '-') {
                gVar.x(TokeniserState.CommentEnd);
                return;
            }
            if (cB == 65535) {
                gVar.r(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else {
                StringBuilder sb3 = gVar.f137973j.f137912b;
                sb3.append('-');
                sb3.append(cB);
                gVar.x(TokeniserState.Comment);
            }
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                StringBuilder sb2 = gVar.f137973j.f137912b;
                sb2.append("--");
                sb2.append((char) 65533);
                gVar.x(TokeniserState.Comment);
                return;
            }
            if (cB == '!') {
                gVar.t(this);
                gVar.x(TokeniserState.CommentEndBang);
                return;
            }
            if (cB == '-') {
                gVar.t(this);
                gVar.f137973j.f137912b.append('-');
                return;
            }
            if (cB == '>') {
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else if (cB == 65535) {
                gVar.r(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else {
                gVar.t(this);
                StringBuilder sb3 = gVar.f137973j.f137912b;
                sb3.append("--");
                sb3.append(cB);
                gVar.x(TokeniserState.Comment);
            }
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                StringBuilder sb2 = gVar.f137973j.f137912b;
                sb2.append("--!");
                sb2.append((char) 65533);
                gVar.x(TokeniserState.Comment);
                return;
            }
            if (cB == '-') {
                gVar.f137973j.f137912b.append("--!");
                gVar.x(TokeniserState.CommentEndDash);
                return;
            }
            if (cB == '>') {
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else if (cB == 65535) {
                gVar.r(this);
                gVar.o();
                gVar.x(TokeniserState.Data);
            } else {
                StringBuilder sb3 = gVar.f137973j.f137912b;
                sb3.append("--!");
                sb3.append(cB);
                gVar.x(TokeniserState.Comment);
            }
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeDoctypeName);
                return;
            }
            if (cB != 65535) {
                gVar.t(this);
                gVar.x(TokeniserState.BeforeDoctypeName);
                return;
            }
            gVar.r(this);
            gVar.g();
            gVar.f137972i.f137917e = true;
            gVar.p();
            gVar.x(TokeniserState.Data);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                gVar.g();
                gVar.x(TokeniserState.DoctypeName);
                return;
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137972i.f137914b.append((char) 65533);
                gVar.x(TokeniserState.DoctypeName);
                return;
            }
            if (cB != ' ') {
                if (cB == 65535) {
                    gVar.r(this);
                    gVar.g();
                    gVar.f137972i.f137917e = true;
                    gVar.p();
                    gVar.x(TokeniserState.Data);
                    return;
                }
                if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r') {
                    return;
                }
                gVar.g();
                gVar.f137972i.f137914b.append(cB);
                gVar.x(TokeniserState.DoctypeName);
            }
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w()) {
                gVar.f137972i.f137914b.append(aVar.f().toLowerCase());
                return;
            }
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137972i.f137914b.append((char) 65533);
                return;
            }
            if (cB != ' ') {
                if (cB == '>') {
                    gVar.p();
                    gVar.x(TokeniserState.Data);
                    return;
                }
                if (cB == 65535) {
                    gVar.r(this);
                    gVar.f137972i.f137917e = true;
                    gVar.p();
                    gVar.x(TokeniserState.Data);
                    return;
                }
                if (cB != '\t' && cB != '\n' && cB != '\f' && cB != '\r') {
                    gVar.f137972i.f137914b.append(cB);
                    return;
                }
            }
            gVar.x(TokeniserState.AfterDoctypeName);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.n()) {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (aVar.t('\t', '\n', '\r', '\f', ' ')) {
                aVar.a();
                return;
            }
            if (aVar.r(y.f128597f)) {
                gVar.p();
                gVar.b(TokeniserState.Data);
            } else if (aVar.q("PUBLIC")) {
                gVar.x(TokeniserState.AfterDoctypePublicKeyword);
            } else {
                if (aVar.q("SYSTEM")) {
                    gVar.x(TokeniserState.AfterDoctypeSystemKeyword);
                    return;
                }
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.b(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeDoctypePublicIdentifier);
                return;
            }
            if (cB == '\"') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cB == '\'') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.x(TokeniserState.BogusDoctype);
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                return;
            }
            if (cB == '\"') {
                gVar.x(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (cB == '\'') {
                gVar.x(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.x(TokeniserState.BogusDoctype);
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137972i.f137915c.append((char) 65533);
                return;
            }
            if (cB == '\"') {
                gVar.x(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.f137972i.f137915c.append(cB);
                return;
            }
            gVar.r(this);
            gVar.f137972i.f137917e = true;
            gVar.p();
            gVar.x(TokeniserState.Data);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137972i.f137915c.append((char) 65533);
                return;
            }
            if (cB == '\'') {
                gVar.x(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.f137972i.f137915c.append(cB);
                return;
            }
            gVar.r(this);
            gVar.f137972i.f137917e = true;
            gVar.p();
            gVar.x(TokeniserState.Data);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
                return;
            }
            if (cB == '\"') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cB == '\'') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cB == '>') {
                gVar.p();
                gVar.x(TokeniserState.Data);
            } else if (cB != 65535) {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.x(TokeniserState.BogusDoctype);
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                return;
            }
            if (cB == '\"') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cB == '\'') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cB == '>') {
                gVar.p();
                gVar.x(TokeniserState.Data);
            } else if (cB != 65535) {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.x(TokeniserState.BogusDoctype);
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                gVar.x(TokeniserState.BeforeDoctypeSystemIdentifier);
                return;
            }
            if (cB == '\"') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cB == '\'') {
                gVar.t(this);
                gVar.x(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                return;
            }
            if (cB == '\"') {
                gVar.x(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (cB == '\'') {
                gVar.x(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.x(TokeniserState.BogusDoctype);
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137972i.f137916d.append((char) 65533);
                return;
            }
            if (cB == '\"') {
                gVar.x(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.f137972i.f137916d.append(cB);
                return;
            }
            gVar.r(this);
            gVar.f137972i.f137917e = true;
            gVar.p();
            gVar.x(TokeniserState.Data);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == 0) {
                gVar.t(this);
                gVar.f137972i.f137916d.append((char) 65533);
                return;
            }
            if (cB == '\'') {
                gVar.x(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (cB == '>') {
                gVar.t(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
                return;
            }
            if (cB != 65535) {
                gVar.f137972i.f137916d.append(cB);
                return;
            }
            gVar.r(this);
            gVar.f137972i.f137917e = true;
            gVar.p();
            gVar.x(TokeniserState.Data);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '\t' || cB == '\n' || cB == '\f' || cB == '\r' || cB == ' ') {
                return;
            }
            if (cB == '>') {
                gVar.p();
                gVar.x(TokeniserState.Data);
            } else if (cB != 65535) {
                gVar.t(this);
                gVar.x(TokeniserState.BogusDoctype);
            } else {
                gVar.r(this);
                gVar.f137972i.f137917e = true;
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char cB = aVar.b();
            if (cB == '>') {
                gVar.p();
                gVar.x(TokeniserState.Data);
            } else {
                if (cB != 65535) {
                    return;
                }
                gVar.p();
                gVar.x(TokeniserState.Data);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            gVar.l(aVar.i("]]>"));
            aVar.p("]]>");
            gVar.x(TokeniserState.Data);
        }
    };

    private static final char eof = 65535;
    private static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr = String.valueOf((char) 65533);

    abstract void read(g gVar, a aVar);
}
