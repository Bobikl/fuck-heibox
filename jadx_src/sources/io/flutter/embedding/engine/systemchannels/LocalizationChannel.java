package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";

    @n0
    public final MethodChannel channel;

    @j1
    @n0
    public final MethodChannel.MethodCallHandler handler;

    @p0
    private LocalizationMessageHandler localizationMessageHandler;

    public interface LocalizationMessageHandler {
        @n0
        String getStringResource(@n0 String str, @n0 String str2);
    }

    public LocalizationChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                if (LocalizationChannel.this.localizationMessageHandler == null) {
                    return;
                }
                String str = methodCall.method;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    result.notImplemented();
                    return;
                }
                JSONObject jSONObject = (JSONObject) methodCall.arguments();
                try {
                    result.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e10) {
                    result.error("error", e10.getMessage(), null);
                }
            }
        };
        this.handler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void sendLocales(@n0 List<Locale> list) {
        Log.v(TAG, "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            Log.v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.channel.invokeMethod("setLocale", arrayList);
    }

    public void setLocalizationMessageHandler(@p0 LocalizationMessageHandler localizationMessageHandler) {
        this.localizationMessageHandler = localizationMessageHandler;
    }
}
