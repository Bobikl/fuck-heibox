package io.flutter.view;

import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class FlutterCallbackInformation {
    public final String callbackClassName;
    public final String callbackLibraryPath;
    public final String callbackName;

    private FlutterCallbackInformation(String str, String str2, String str3) {
        this.callbackName = str;
        this.callbackClassName = str2;
        this.callbackLibraryPath = str3;
    }

    public static FlutterCallbackInformation lookupCallbackInformation(long j10) {
        return FlutterJNI.nativeLookupCallbackInformation(j10);
    }
}
