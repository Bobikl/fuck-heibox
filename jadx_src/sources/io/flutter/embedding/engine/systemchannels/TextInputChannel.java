package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";

    @n0
    public final MethodChannel channel;

    @j1
    @n0
    final MethodChannel.MethodCallHandler parsingMethodHandler;

    @p0
    private TextInputMethodHandler textInputMethodHandler;

    public static class Configuration {

        @p0
        public final String actionLabel;
        public final boolean autocorrect;

        @p0
        public final Autofill autofill;

        @p0
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;

        @p0
        public final Configuration[] fields;

        @p0
        public final Integer inputAction;

        @n0
        public final InputType inputType;
        public final boolean obscureText;

        @n0
        public final TextCapitalization textCapitalization;

        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(@n0 String str, @n0 String[] strArr, @p0 String str2, @n0 TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            @n0
            public static Autofill fromJson(@n0 JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = translateAutofillHint(jSONArray.getString(i10));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:7:0x0033  */
            @n0
            private static String translateAutofillHint(@n0 String str) {
                int i10 = Build.VERSION.SDK_INT;
                byte b10 = com.google.common.base.a.D;
                if (i10 < 26) {
                    return str;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (!str.equals("birthdayYear")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -1917283616:
                        if (!str.equals("oneTimeCode")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case -1844815832:
                        if (!str.equals(g0.a.f118927k)) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case -1825589953:
                        if (!str.equals("telephoneNumberNational")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case -1821235109:
                        if (!str.equals(g0.a.F)) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case -1757573738:
                        if (!str.equals(g0.a.f118925i)) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case -1682373820:
                        if (!str.equals(g0.a.f118929m)) {
                            b10 = -1;
                        } else {
                            b10 = 6;
                        }
                        break;
                    case -1658955742:
                        if (!str.equals("fullStreetAddress")) {
                            b10 = -1;
                        } else {
                            b10 = 7;
                        }
                        break;
                    case -1567118045:
                        if (!str.equals("telephoneNumberDevice")) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case -1476752575:
                        if (!str.equals("countryName")) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case -1413737489:
                        if (!str.equals("middleInitial")) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    case -1377792129:
                        if (!str.equals("addressCity")) {
                            b10 = -1;
                        } else {
                            b10 = 11;
                        }
                        break;
                    case -1249512767:
                        if (!str.equals(g0.a.G)) {
                            b10 = -1;
                        } else {
                            b10 = 12;
                        }
                        break;
                    case -1186060294:
                        if (!str.equals("postalAddressExtendedPostalCode")) {
                            b10 = -1;
                        } else {
                            b10 = 13;
                        }
                        break;
                    case -1151034798:
                        if (!str.equals(g0.a.f118924h)) {
                            b10 = -1;
                        } else {
                            b10 = 14;
                        }
                        break;
                    case -835992323:
                        if (!str.equals("namePrefix")) {
                            b10 = -1;
                        } else {
                            b10 = 15;
                        }
                        break;
                    case -818219584:
                        if (!str.equals("middleName")) {
                            b10 = -1;
                        } else {
                            b10 = 16;
                        }
                        break;
                    case -747304516:
                        if (!str.equals("nameSuffix")) {
                            b10 = -1;
                        } else {
                            b10 = 17;
                        }
                        break;
                    case -613980922:
                        if (!str.equals(g0.a.f118926j)) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.f56668u;
                        }
                        break;
                    case -613352043:
                        if (!str.equals(g0.a.f118928l)) {
                            b10 = -1;
                        } else {
                            b10 = 19;
                        }
                        break;
                    case -549230602:
                        if (!str.equals("telephoneNumberCountryCode")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.f56671x;
                        }
                        break;
                    case -265713450:
                        if (!str.equals(g0.a.f118919c)) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.f56672y;
                        }
                        break;
                    case 3373707:
                        if (!str.equals("name")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.f56673z;
                        }
                        break;
                    case 96619420:
                        if (!str.equals("email")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.A;
                        }
                        break;
                    case 253202685:
                        if (!str.equals("addressState")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.B;
                        }
                        break;
                    case 588174851:
                        if (!str.equals("birthdayMonth")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.C;
                        }
                        break;
                    case 798554127:
                        if (!str.equals("familyName")) {
                            b10 = -1;
                        }
                        break;
                    case 892233837:
                        if (!str.equals("telephoneNumber")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.E;
                        }
                        break;
                    case 991032982:
                        if (!str.equals(g0.a.E)) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.F;
                        }
                        break;
                    case 1069376125:
                        if (!str.equals("birthday")) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.G;
                        }
                        break;
                    case 1216985755:
                        if (!str.equals(g0.a.f118920d)) {
                            b10 = -1;
                        } else {
                            b10 = com.google.common.base.a.H;
                        }
                        break;
                    case 1469046696:
                        if (!str.equals("givenName")) {
                            b10 = -1;
                        } else {
                            b10 = 31;
                        }
                        break;
                    case 1662667945:
                        if (!str.equals(g0.a.f118922f)) {
                            b10 = -1;
                        } else {
                            b10 = 32;
                        }
                        break;
                    case 1921869058:
                        if (!str.equals("postalAddressExtended")) {
                            b10 = -1;
                        } else {
                            b10 = 33;
                        }
                        break;
                    case 2011152728:
                        if (!str.equals(g0.a.f118923g)) {
                            b10 = -1;
                        } else {
                            b10 = 34;
                        }
                        break;
                    case 2011773919:
                        if (!str.equals("birthdayDay")) {
                            b10 = -1;
                        } else {
                            b10 = 35;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        return g0.a.K;
                    case 1:
                        return g0.a.L;
                    case 2:
                        return g0.a.f118927k;
                    case 3:
                        return g0.a.D;
                    case 4:
                        return g0.a.F;
                    case 5:
                        return g0.a.f118925i;
                    case 6:
                        return g0.a.f118929m;
                    case 7:
                        return g0.a.f118933q;
                    case 8:
                        return g0.a.B;
                    case 9:
                        return g0.a.f118930n;
                    case 10:
                        return g0.a.f118940x;
                    case 11:
                        return g0.a.f118932p;
                    case 12:
                        return g0.a.G;
                    case 13:
                        return g0.a.f118935s;
                    case 14:
                        return g0.a.f118924h;
                    case 15:
                        return g0.a.f118941y;
                    case 16:
                        return g0.a.f118939w;
                    case 17:
                        return g0.a.f118942z;
                    case 18:
                        return g0.a.f118926j;
                    case 19:
                        return g0.a.f118928l;
                    case 20:
                        return g0.a.C;
                    case 21:
                        return g0.a.f118919c;
                    case 22:
                        return g0.a.f118936t;
                    case 23:
                        return g0.a.f118917a;
                    case 24:
                        return g0.a.f118931o;
                    case 25:
                        return g0.a.J;
                    case 26:
                        return g0.a.f118938v;
                    case 27:
                        return g0.a.A;
                    case 28:
                        return g0.a.E;
                    case 29:
                        return g0.a.H;
                    case 30:
                        return g0.a.f118920d;
                    case 31:
                        return g0.a.f118937u;
                    case 32:
                        return g0.a.f118922f;
                    case 33:
                        return g0.a.f118934r;
                    case 34:
                        return g0.a.f118923g;
                    case 35:
                        return g0.a.I;
                    default:
                        return str;
                }
            }
        }

        public Configuration(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @n0 TextCapitalization textCapitalization, @n0 InputType inputType, @p0 Integer num, @p0 String str, @p0 Autofill autofill, @p0 String[] strArr, @p0 Configuration[] configurationArr) {
            this.obscureText = z10;
            this.autocorrect = z11;
            this.enableSuggestions = z12;
            this.enableIMEPersonalizedLearning = z13;
            this.enableDeltaModel = z14;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
        }

        @n0
        public static Configuration fromJson(@n0 JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                Configuration[] configurationArr2 = new Configuration[length];
                for (int i10 = 0; i10 < length; i10++) {
                    configurationArr2[i10] = fromJson(jSONArray.getJSONObject(i10));
                }
                configurationArr = configurationArr2;
            }
            Integer numInputActionFromTextInputAction = inputActionFromTextInputAction(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    arrayList.add(jSONArray2.optString(i11));
                }
            }
            return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject(RemoteMessageConst.INPUT_TYPE)), numInputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr);
        }

        @n0
        private static Integer inputActionFromTextInputAction(@n0 String str) {
            str.hashCode();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;

        @n0
        public final TextInputType type;

        public InputType(@n0 TextInputType textInputType, boolean z10, boolean z11) {
            this.type = textInputType;
            this.isSigned = z10;
            this.isDecimal = z11;
        }

        @n0
        public static InputType fromJson(@n0 JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        @n0
        private final String encodedName;

        TextCapitalization(String str) {
            this.encodedName = str;
        }

        static TextCapitalization fromValue(@n0 String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;

        @n0
        public final String text;

        public TextEditState(@n0 String str, int i10, int i11, int i12, int i13) throws IndexOutOfBoundsException {
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            }
            if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            }
            if (i13 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
            }
            if (i11 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
            }
            this.text = str;
            this.selectionStart = i10;
            this.selectionEnd = i11;
            this.composingStart = i12;
            this.composingEnd = i13;
        }

        @n0
        public static TextEditState fromJson(@n0 JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i10 = this.composingStart;
            return i10 >= 0 && this.composingEnd > i10;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z10);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(@n0 String str, @n0 Bundle bundle);

        void setClient(int i10, @n0 Configuration configuration);

        void setEditableSizeAndTransform(double d10, double d11, @n0 double[] dArr);

        void setEditingState(@n0 TextEditState textEditState);

        void setPlatformViewClient(int i10, boolean z10);

        void show();
    }

    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        @n0
        private final String encodedName;

        TextInputType(String str) {
            this.encodedName = str;
        }

        static TextInputType fromValue(@n0 String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public TextInputChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(TextInputChannel.TAG, "Received '" + str + "' message.");
                str.hashCode();
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            break;
                        } catch (JSONException e10) {
                            result.error("error", e10.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditingState":
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            result.success(null);
                            break;
                        } catch (JSONException e11) {
                            result.error("error", e11.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e12) {
                            result.error("error", e12.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.hide":
                        TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        break;
                    case "TextInput.show":
                        TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        break;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            break;
                        } catch (JSONException e13) {
                            result.error("error", e13.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d10 = jSONObject3.getDouble("width");
                            double d11 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i10 = 0; i10 < 16; i10++) {
                                dArr[i10] = jSONArray2.getDouble(i10);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d10, d11, dArr);
                            result.success(null);
                            break;
                        } catch (JSONException e14) {
                            result.error("error", e14.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.finishAutofillContext":
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        result.success(null);
                        break;
                    case "TextInput.clearClient":
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        break;
                    case "TextInput.requestAutofill":
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i10));
        map.put("selectionExtent", Integer.valueOf(i11));
        map.put("composingBase", Integer.valueOf(i12));
        map.put("composingExtent", Integer.valueOf(i13));
        return map;
    }

    public void commitContent(int i10, Map<String, Object> map) {
        Log.v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.commitContent", map));
    }

    public void done(int i10) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.done"));
    }

    public void go(int i10) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.go"));
    }

    public void newline(int i10) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.newline"));
    }

    public void next(int i10) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i10, @n0 String str, @n0 Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i10), map));
    }

    public void previous(int i10) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i10) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.search"));
    }

    public void send(int i10) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(@p0 TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i10) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i10, @n0 String str, int i11, int i12, int i13, int i14) {
        Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i11 + "\nSelection end: " + i12 + "\nComposing start: " + i13 + "\nComposing end: " + i14);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i10), createEditingStateJSON(str, i11, i12, i13, i14)));
    }

    public void updateEditingStateWithDeltas(int i10, @n0 ArrayList<TextEditingDelta> arrayList) {
        Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i10), createEditingDeltaJSON(arrayList)));
    }

    public void updateEditingStateWithTag(int i10, @n0 HashMap<String, TextEditState> map) {
        Log.v(TAG, "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : map.entrySet()) {
            TextEditState value = entry.getValue();
            map2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i10), map2));
    }
}
