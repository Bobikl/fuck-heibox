package org.jsoup.parser;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ParseErrorList extends ArrayList<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f137908c = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f137909b;

    ParseErrorList(int i10, int i11) {
        super(i10);
        this.f137909b = i11;
    }

    static ParseErrorList e() {
        return new ParseErrorList(0, 0);
    }

    static ParseErrorList g(int i10) {
        return new ParseErrorList(16, i10);
    }

    boolean a() {
        return size() < this.f137909b;
    }

    int b() {
        return this.f137909b;
    }
}
