package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformChannel {
    private static final String TAG = "PlatformChannel";

    @n0
    public final MethodChannel channel;

    @j1
    @n0
    final MethodChannel.MethodCallHandler parsingMethodCallHandler;

    @p0
    private PlatformMessageHandler platformMessageHandler;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        static {
            int[] iArr = new int[SystemUiMode.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode = iArr;
            try {
                iArr[SystemUiMode.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[SystemUiMode.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SystemUiOverlay.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = iArr2;
            try {
                iArr2[SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[DeviceOrientation.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation = iArr3;
            try {
                iArr3[DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class AppSwitcherDescription {
        public final int color;

        @n0
        public final String label;

        public AppSwitcherDescription(int i10, @n0 String str) {
            this.color = i10;
            this.label = str;
        }
    }

    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        @n0
        private String encodedName;

        Brightness(String str) {
            this.encodedName = str;
        }

        @n0
        static Brightness fromValue(@n0 String str) throws NoSuchFieldException {
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum ClipboardContentFormat {
        PLAIN_TEXT("text/plain");


        @n0
        private String encodedName;

        ClipboardContentFormat(String str) {
            this.encodedName = str;
        }

        @n0
        static ClipboardContentFormat fromValue(@n0 String str) throws NoSuchFieldException {
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        @n0
        private String encodedName;

        DeviceOrientation(String str) {
            this.encodedName = str;
        }

        @n0
        static DeviceOrientation fromValue(@n0 String str) throws NoSuchFieldException {
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        @p0
        private final String encodedName;

        HapticFeedbackType(String str) {
            this.encodedName = str;
        }

        @n0
        static HapticFeedbackType fromValue(@p0 String str) throws NoSuchFieldException {
            for (HapticFeedbackType hapticFeedbackType : values()) {
                String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface PlatformMessageHandler {
        boolean clipboardHasStrings();

        @p0
        CharSequence getClipboardData(@p0 ClipboardContentFormat clipboardContentFormat);

        void playSystemSound(@n0 SoundType soundType);

        void popSystemNavigator();

        void restoreSystemUiOverlays();

        void setApplicationSwitcherDescription(@n0 AppSwitcherDescription appSwitcherDescription);

        void setClipboardData(@n0 String str);

        void setFrameworkHandlesBack(boolean z10);

        void setPreferredOrientations(int i10);

        void setSystemUiChangeListener();

        void setSystemUiOverlayStyle(@n0 SystemChromeStyle systemChromeStyle);

        void share(@n0 String str);

        void showSystemOverlays(@n0 List<SystemUiOverlay> list);

        void showSystemUiMode(@n0 SystemUiMode systemUiMode);

        void vibrateHapticFeedback(@n0 HapticFeedbackType hapticFeedbackType);
    }

    public enum SoundType {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        @n0
        private final String encodedName;

        SoundType(String str) {
            this.encodedName = str;
        }

        @n0
        static SoundType fromValue(@n0 String str) throws NoSuchFieldException {
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class SystemChromeStyle {

        @p0
        public final Integer statusBarColor;

        @p0
        public final Brightness statusBarIconBrightness;

        @p0
        public final Integer systemNavigationBarColor;

        @p0
        public final Boolean systemNavigationBarContrastEnforced;

        @p0
        public final Integer systemNavigationBarDividerColor;

        @p0
        public final Brightness systemNavigationBarIconBrightness;

        @p0
        public final Boolean systemStatusBarContrastEnforced;

        public SystemChromeStyle(@p0 Integer num, @p0 Brightness brightness, @p0 Boolean bool, @p0 Integer num2, @p0 Brightness brightness2, @p0 Integer num3, @p0 Boolean bool2) {
            this.statusBarColor = num;
            this.statusBarIconBrightness = brightness;
            this.systemStatusBarContrastEnforced = bool;
            this.systemNavigationBarColor = num2;
            this.systemNavigationBarIconBrightness = brightness2;
            this.systemNavigationBarDividerColor = num3;
            this.systemNavigationBarContrastEnforced = bool2;
        }
    }

    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        @n0
        private String encodedName;

        SystemUiMode(String str) {
            this.encodedName = str;
        }

        @n0
        static SystemUiMode fromValue(@n0 String str) throws NoSuchFieldException {
            for (SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        @n0
        private String encodedName;

        SystemUiOverlay(String str) {
            this.encodedName = str;
        }

        @n0
        static SystemUiOverlay fromValue(@n0 String str) throws NoSuchFieldException {
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public PlatformChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                ClipboardContentFormat clipboardContentFormatFromValue;
                if (PlatformChannel.this.platformMessageHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(PlatformChannel.TAG, "Received '" + str + "' message.");
                try {
                    switch (str) {
                        case "SystemSound.play":
                            try {
                                PlatformChannel.this.platformMessageHandler.playSystemSound(SoundType.fromValue((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException e10) {
                                result.error("error", e10.getMessage(), null);
                                return;
                            }
                        case "HapticFeedback.vibrate":
                            try {
                                PlatformChannel.this.platformMessageHandler.vibrateHapticFeedback(HapticFeedbackType.fromValue((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException e11) {
                                result.error("error", e11.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setPreferredOrientations":
                            try {
                                PlatformChannel.this.platformMessageHandler.setPreferredOrientations(PlatformChannel.this.decodeOrientations((JSONArray) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e12) {
                                result.error("error", e12.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setApplicationSwitcherDescription":
                            try {
                                PlatformChannel.this.platformMessageHandler.setApplicationSwitcherDescription(PlatformChannel.this.decodeAppSwitcherDescription((JSONObject) obj));
                                result.success(null);
                                return;
                            } catch (JSONException e13) {
                                result.error("error", e13.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setEnabledSystemUIOverlays":
                            try {
                                PlatformChannel.this.platformMessageHandler.showSystemOverlays(PlatformChannel.this.decodeSystemUiOverlays((JSONArray) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e14) {
                                result.error("error", e14.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setEnabledSystemUIMode":
                            try {
                                PlatformChannel.this.platformMessageHandler.showSystemUiMode(PlatformChannel.this.decodeSystemUiMode((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e15) {
                                result.error("error", e15.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setSystemUIChangeListener":
                            PlatformChannel.this.platformMessageHandler.setSystemUiChangeListener();
                            result.success(null);
                            return;
                        case "SystemChrome.restoreSystemUIOverlays":
                            PlatformChannel.this.platformMessageHandler.restoreSystemUiOverlays();
                            result.success(null);
                            return;
                        case "SystemChrome.setSystemUIOverlayStyle":
                            try {
                                PlatformChannel.this.platformMessageHandler.setSystemUiOverlayStyle(PlatformChannel.this.decodeSystemChromeStyle((JSONObject) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e16) {
                                result.error("error", e16.getMessage(), null);
                                return;
                            }
                        case "SystemNavigator.setFrameworkHandlesBack":
                            PlatformChannel.this.platformMessageHandler.setFrameworkHandlesBack(((Boolean) obj).booleanValue());
                            result.success(null);
                            return;
                        case "SystemNavigator.pop":
                            PlatformChannel.this.platformMessageHandler.popSystemNavigator();
                            result.success(null);
                            return;
                        case "Clipboard.getData":
                            String str2 = (String) obj;
                            if (str2 != null) {
                                try {
                                    clipboardContentFormatFromValue = ClipboardContentFormat.fromValue(str2);
                                } catch (NoSuchFieldException unused) {
                                    result.error("error", "No such clipboard content format: " + str2, null);
                                    clipboardContentFormatFromValue = null;
                                }
                                break;
                            } else {
                                clipboardContentFormatFromValue = null;
                            }
                            CharSequence clipboardData = PlatformChannel.this.platformMessageHandler.getClipboardData(clipboardContentFormatFromValue);
                            if (clipboardData == null) {
                                result.success(null);
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("text", clipboardData);
                            result.success(jSONObject);
                            return;
                        case "Clipboard.setData":
                            PlatformChannel.this.platformMessageHandler.setClipboardData(((JSONObject) obj).getString("text"));
                            result.success(null);
                            return;
                        case "Clipboard.hasStrings":
                            boolean zClipboardHasStrings = PlatformChannel.this.platformMessageHandler.clipboardHasStrings();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("value", zClipboardHasStrings);
                            result.success(jSONObject2);
                            return;
                        case "Share.invoke":
                            PlatformChannel.this.platformMessageHandler.share((String) obj);
                            result.success(null);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                } catch (JSONException e17) {
                    result.error("error", "JSON error: " + e17.getMessage(), null);
                }
                result.error("error", "JSON error: " + e17.getMessage(), null);
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public AppSwitcherDescription decodeAppSwitcherDescription(@n0 JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("primaryColor");
        if (i10 != 0) {
            i10 |= androidx.core.view.j1.f21601t;
        }
        return new AppSwitcherDescription(i10, jSONObject.getString(BasePuzzleInfo.PUZZLE_TYPE_LABEL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0053 A[RETURN] */
    public int decodeOrientations(@n0 JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            int i13 = AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[DeviceOrientation.fromValue(jSONArray.getString(i12)).ordinal()];
            if (i13 == 1) {
                i10 |= 1;
            } else if (i13 == 2) {
                i10 |= 4;
            } else if (i13 == 3) {
                i10 |= 2;
            } else if (i13 == 4) {
                i10 |= 8;
            }
            if (i11 == 0) {
                i11 = i10;
            }
        }
        if (i10 == 0) {
            return -1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i11 != 2) {
                    if (i11 == 4) {
                        return 9;
                    }
                    if (i11 != 8) {
                        return 1;
                    }
                    return 8;
                }
                return 0;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public SystemChromeStyle decodeSystemChromeStyle(@n0 JSONObject jSONObject) throws JSONException, NoSuchFieldException {
        return new SystemChromeStyle(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public SystemUiMode decodeSystemUiMode(@n0 String str) throws JSONException, NoSuchFieldException {
        int i10 = AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[SystemUiMode.fromValue(str).ordinal()];
        if (i10 == 1) {
            return SystemUiMode.LEAN_BACK;
        }
        if (i10 == 2) {
            return SystemUiMode.IMMERSIVE;
        }
        if (i10 != 3) {
            return i10 != 4 ? SystemUiMode.EDGE_TO_EDGE : SystemUiMode.EDGE_TO_EDGE;
        }
        return SystemUiMode.IMMERSIVE_STICKY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public List<SystemUiOverlay> decodeSystemUiOverlays(@n0 JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[SystemUiOverlay.fromValue(jSONArray.getString(i10)).ordinal()];
            if (i11 == 1) {
                arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
            } else if (i11 == 2) {
                arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void setPlatformMessageHandler(@p0 PlatformMessageHandler platformMessageHandler) {
        this.platformMessageHandler = platformMessageHandler;
    }

    public void systemChromeChanged(boolean z10) {
        Log.v(TAG, "Sending 'systemUIChange' message.");
        this.channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z10)));
    }
}
