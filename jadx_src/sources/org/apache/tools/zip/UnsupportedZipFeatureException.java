package org.apache.tools.zip;

import java.io.Serializable;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes5.dex */
public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20161221;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature f137369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient t f137370c;

    public static class Feature implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Feature f137371c = new Feature("encryption");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Feature f137372d = new Feature("compression method");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Feature f137373e = new Feature("data descriptor");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f137374b;

        private Feature(String str) {
            this.f137374b = str;
        }

        public String toString() {
            return this.f137374b;
        }
    }

    public UnsupportedZipFeatureException(Feature feature, t tVar) {
        super("unsupported feature " + feature + " used in entry " + tVar.getName());
        this.f137369b = feature;
        this.f137370c = tVar;
    }

    public t a() {
        return this.f137370c;
    }

    public Feature b() {
        return this.f137369b;
    }
}
