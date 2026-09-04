package io.flutter.plugins.pathprovider;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

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

    public interface PathProviderApi {
        @p0
        String getApplicationCachePath();

        @p0
        String getApplicationDocumentsPath();

        @p0
        String getApplicationSupportPath();

        @n0
        List<String> getExternalCachePaths();

        @p0
        String getExternalStoragePath();

        @n0
        List<String> getExternalStoragePaths(@n0 StorageDirectory storageDirectory);

        @p0
        String getTemporaryPath();
    }

    public enum StorageDirectory {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);

        final int index;

        StorageDirectory(int i10) {
            this.index = i10;
        }
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
