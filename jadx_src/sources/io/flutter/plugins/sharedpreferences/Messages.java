package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@n0 String str, @p0 String str2, @p0 Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface SharedPreferencesApi {
        @n0
        Boolean clear(@n0 String str, @p0 List<String> list);

        @n0
        Map<String, Object> getAll(@n0 String str, @p0 List<String> list);

        @n0
        Boolean remove(@n0 String str);

        @n0
        Boolean setBool(@n0 String str, @n0 Boolean bool);

        @n0
        Boolean setDouble(@n0 String str, @n0 Double d10);

        @n0
        Boolean setInt(@n0 String str, @n0 Long l10);

        @n0
        Boolean setString(@n0 String str, @n0 String str2);

        @n0
        Boolean setStringList(@n0 String str, @n0 List<String> list);
    }

    @n0
    protected static ArrayList<Object> wrapError(@n0 Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th2.toString());
            arrayList.add(th2.getClass().getSimpleName());
            arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        }
        return arrayList;
    }
}
