package com.google.android.play.core.splitinstall.internal;

import android.content.res.AssetManager;
import io.flutter.embedding.android.KeyboardMap;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.b f56303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private XmlPullParser f56304b;

    public l(com.google.android.play.core.splitcompat.b bVar) {
        this.f56303a = bVar;
    }

    public final long a() throws XmlPullParserException, IOException {
        int next;
        if (this.f56304b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.f56304b.next();
            if (next == 2) {
                if (!this.f56304b.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.f56304b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f56304b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i10 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i10;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i10) & KeyboardMap.kValueMask);
                    } catch (NumberFormatException e10) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e10.getMessage()));
                    }
                } catch (NumberFormatException e11) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e11.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) throws IOException {
        this.f56304b = assetManager.openXmlResourceParser(com.google.android.play.core.splitcompat.b.c(assetManager, file), "AndroidManifest.xml");
    }
}
