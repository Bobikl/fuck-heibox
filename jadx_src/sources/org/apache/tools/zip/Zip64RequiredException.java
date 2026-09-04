package org.apache.tools.zip;

import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes5.dex */
public class Zip64RequiredException extends ZipException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f137375b = "archive's size exceeds the limit of 4GByte.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f137376c = "archive contains more than 65535 entries.";
    private static final long serialVersionUID = 20110809;

    public Zip64RequiredException(String str) {
        super(str);
    }

    static String a(t tVar) {
        return tVar.getName() + "'s size exceeds the limit of 4GByte.";
    }
}
