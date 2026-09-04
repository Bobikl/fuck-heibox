package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SharedPreferencesPlugin implements FlutterPlugin, Messages.SharedPreferencesApi {
    private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private static final String TAG = "SharedPreferencesPlugin";
    private SharedPreferencesListEncoder listEncoder;
    private SharedPreferences preferences;

    public static class ListEncoder implements SharedPreferencesListEncoder {
        ListEncoder() {
        }

        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        @n0
        public List<String> decode(@n0 String str) throws RuntimeException {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        @n0
        public String encode(@n0 List<String> list) throws RuntimeException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public SharedPreferencesPlugin() {
        this(new ListEncoder());
    }

    @j1
    SharedPreferencesPlugin(@n0 SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        this.listEncoder = sharedPreferencesListEncoder;
    }

    @n0
    private Map<String, Object> getAllPrefs(@n0 String str, @p0 Set<String> set) throws RuntimeException {
        Map<String, ?> all = this.preferences.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                map.put(str2, transformPref(str2, all.get(str2)));
            }
        }
        return map;
    }

    public static void registerWith(@n0 PluginRegistry.Registrar registrar) {
        new SharedPreferencesPlugin().setUp(registrar.messenger(), registrar.context());
    }

    private void setUp(@n0 BinaryMessenger binaryMessenger, @n0 Context context) {
        this.preferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        try {
            i.j(binaryMessenger, this);
        } catch (Exception e10) {
            Log.e(TAG, "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    private Object transformPref(@n0 String str, @n0 Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith(LIST_IDENTIFIER)) {
                return this.listEncoder.decode(str2.substring(40));
            }
            if (str2.startsWith(BIG_INTEGER_PREFIX)) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith(DOUBLE_PREFIX)) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.preferences.edit().remove(str).putString(str, LIST_IDENTIFIER + this.listEncoder.encode(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean clear(@n0 String str, @p0 List<String> list) throws RuntimeException {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        Map<String, ?> all = this.preferences.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Map<String, Object> getAll(@n0 String str, @p0 List<String> list) throws RuntimeException {
        return getAllPrefs(str, list == null ? null : new HashSet(list));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.j(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean remove(@n0 String str) {
        return Boolean.valueOf(this.preferences.edit().remove(str).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean setBool(@n0 String str, @n0 Boolean bool) {
        return Boolean.valueOf(this.preferences.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean setDouble(@n0 String str, @n0 Double d10) {
        String string = Double.toString(d10.doubleValue());
        return Boolean.valueOf(this.preferences.edit().putString(str, DOUBLE_PREFIX + string).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean setInt(@n0 String str, @n0 Long l10) {
        return Boolean.valueOf(this.preferences.edit().putLong(str, l10.longValue()).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean setString(@n0 String str, @n0 String str2) {
        if (str2.startsWith(LIST_IDENTIFIER) || str2.startsWith(BIG_INTEGER_PREFIX) || str2.startsWith(DOUBLE_PREFIX)) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @n0
    public Boolean setStringList(@n0 String str, @n0 List<String> list) throws RuntimeException {
        return Boolean.valueOf(this.preferences.edit().putString(str, LIST_IDENTIFIER + this.listEncoder.encode(list)).commit());
    }
}
