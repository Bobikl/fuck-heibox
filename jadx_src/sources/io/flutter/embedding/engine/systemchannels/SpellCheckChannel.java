package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SpellCheckChannel {
    private static final String TAG = "SpellCheckChannel";
    public final MethodChannel channel;

    @n0
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    private SpellCheckMethodHandler spellCheckMethodHandler;

    public interface SpellCheckMethodHandler {
        void initiateSpellCheck(@n0 String str, @n0 String str2, @n0 MethodChannel.Result result);
    }

    public SpellCheckChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SpellCheckChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                if (SpellCheckChannel.this.spellCheckMethodHandler == null) {
                    Log.v(SpellCheckChannel.TAG, "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(SpellCheckChannel.TAG, "Received '" + str + "' message.");
                str.hashCode();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    result.notImplemented();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    SpellCheckChannel.this.spellCheckMethodHandler.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), result);
                } catch (IllegalStateException e10) {
                    result.error("error", e10.getMessage(), null);
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/spellcheck", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setSpellCheckMethodHandler(@p0 SpellCheckMethodHandler spellCheckMethodHandler) {
        this.spellCheckMethodHandler = spellCheckMethodHandler;
    }
}
