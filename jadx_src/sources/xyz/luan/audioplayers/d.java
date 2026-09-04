package xyz.luan.audioplayers;

import com.umeng.analytics.pro.ak;
import io.flutter.plugin.common.MethodCall;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0003\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002*j\u0010\u0010\"2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\u0004\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n22\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\u0004\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¨\u0006\u0011"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lio/flutter/plugin/common/MethodCall;", "", "name", ak.aF, "(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Enum;", "d", "Lxyz/luan/audioplayers/a;", "b", "Lkotlin/Function2;", "Lkotlin/m0;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "response", "Lkotlin/b2;", "FlutterHandler", "audioplayers_android_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioContextAndroid b(MethodCall methodCall) {
        Boolean bool = (Boolean) methodCall.argument("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required".toString());
        }
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) methodCall.argument("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required".toString());
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        Integer num = (Integer) methodCall.argument("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required".toString());
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) methodCall.argument("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required".toString());
        }
        int iIntValue2 = num2.intValue();
        Integer num3 = (Integer) methodCall.argument("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required".toString());
        }
        int iIntValue3 = num3.intValue();
        Integer num4 = (Integer) methodCall.argument("audioMode");
        if (num4 != null) {
            return new AudioContextAndroid(zBooleanValue, zBooleanValue2, iIntValue, iIntValue2, iIntValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required".toString());
    }

    private static final /* synthetic */ <T extends Enum<T>> T c(MethodCall methodCall, String str) {
        String str2 = (String) methodCall.argument(str);
        if (str2 == null) {
            return null;
        }
        String strD = d((String) CollectionsKt___CollectionsKt.k3(StringsKt__StringsKt.T4(str2, new char[]{lg.a.f131414g}, false, 0, 6, null)));
        f0.y(5, androidx.exifinterface.media.a.f23244d5);
        return (T) Enum.valueOf(null, strD);
    }

    @dl.d
    public static final String d(@dl.d String str) {
        f0.p(str, "<this>");
        String upperCase = new Regex("(.) (.)").m(new Regex("(.)(\\p{Upper})").m(str, "$1_$2"), "$1_$2").toUpperCase(Locale.ROOT);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
