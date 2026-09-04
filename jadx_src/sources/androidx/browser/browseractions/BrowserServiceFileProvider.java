package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f3047r = "BrowserServiceFP";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f3048s = ".image_provider";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f3049t = "content";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f3050u = "image_provider";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f3051v = "image_provider_images/";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f3052w = ".png";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f3053x = "image_provider_uris";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f3054y = "last_cleanup_time";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static Object f3055z = new Object();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentResolver f3056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f3057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.b f3058d;

        a(ContentResolver contentResolver, Uri uri, androidx.concurrent.futures.b bVar) {
            this.f3056b = contentResolver;
            this.f3057c = uri;
            this.f3058d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f3056b.openFileDescriptor(this.f3057c, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    this.f3058d.q(new FileNotFoundException());
                    return;
                }
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                parcelFileDescriptorOpenFileDescriptor.close();
                if (bitmapDecodeFileDescriptor == null) {
                    this.f3058d.q(new IOException("File could not be decoded."));
                } else {
                    this.f3058d.p(bitmapDecodeFileDescriptor);
                }
            } catch (IOException e10) {
                this.f3058d.q(e10);
            }
        }
    }

    public static class b extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f3059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f3060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f3061d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3062a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f3059b = timeUnit.toMillis(7L);
            f3060c = timeUnit.toMillis(7L);
            f3061d = timeUnit.toMillis(1L);
        }

        b(Context context) {
            this.f3062a = context.getApplicationContext();
        }

        private static boolean b(File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean c(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(BrowserServiceFileProvider.f3054y, System.currentTimeMillis()) + f3060c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f3062a.getSharedPreferences(this.f3062a.getPackageName() + BrowserServiceFileProvider.f3048s, 0);
            if (!c(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.f3055z) {
                File file = new File(this.f3062a.getFilesDir(), BrowserServiceFileProvider.f3050u);
                if (!file.exists()) {
                    return null;
                }
                File[] fileArrListFiles = file.listFiles();
                long jCurrentTimeMillis = System.currentTimeMillis() - f3059b;
                boolean z10 = true;
                for (File file2 : fileArrListFiles) {
                    if (b(file2) && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                        Log.e(BrowserServiceFileProvider.f3047r, "Fail to delete image: " + file2.getAbsoluteFile());
                        z10 = false;
                    }
                }
                long jCurrentTimeMillis2 = z10 ? System.currentTimeMillis() : (System.currentTimeMillis() - f3060c) + f3061d;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(BrowserServiceFileProvider.f3054y, jCurrentTimeMillis2);
                editorEdit.apply();
                return null;
            }
        }
    }

    public static class c extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f3065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f3066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.concurrent.futures.b<Uri> f3067e;

        c(Context context, String str, Bitmap bitmap, Uri uri, androidx.concurrent.futures.b<Uri> bVar) {
            this.f3063a = context.getApplicationContext();
            this.f3064b = str;
            this.f3065c = bitmap;
            this.f3066d = uri;
            this.f3067e = bVar;
        }

        private void c(File file) {
            FileOutputStream fileOutputStreamH;
            androidx.core.util.b bVar = new androidx.core.util.b(file);
            try {
                fileOutputStreamH = bVar.h();
                try {
                    this.f3065c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamH);
                    fileOutputStreamH.close();
                    bVar.c(fileOutputStreamH);
                    this.f3067e.p(this.f3066d);
                } catch (IOException e10) {
                    e = e10;
                    bVar.b(fileOutputStreamH);
                    this.f3067e.q(e);
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStreamH = null;
            }
        }

        private void d() {
            File file = new File(this.f3063a.getFilesDir(), BrowserServiceFileProvider.f3050u);
            synchronized (BrowserServiceFileProvider.f3055z) {
                if (!file.exists() && !file.mkdir()) {
                    this.f3067e.q(new IOException("Could not create file directory."));
                    return;
                }
                File file2 = new File(file, this.f3064b + ".png");
                if (file2.exists()) {
                    this.f3067e.p(this.f3066d);
                } else {
                    c(file2);
                }
                file2.setLastModified(System.currentTimeMillis());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            d();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            new b(this.f3063a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private static Uri j(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + f3048s).path(f3051v + str + ".png").build();
    }

    public static void k(@n0 Intent intent, @p0 List<Uri> list, @n0 Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData clipDataNewUri = ClipData.newUri(contentResolver, f3053x, list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipDataNewUri.addItem(new ClipData.Item(list.get(i10)));
        }
        intent.setClipData(clipDataNewUri);
    }

    @n0
    public static com.google.common.util.concurrent.p0<Bitmap> l(@n0 ContentResolver contentResolver, @n0 Uri uri) {
        androidx.concurrent.futures.b bVarU = androidx.concurrent.futures.b.u();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, bVarU));
        return bVarU;
    }

    @n0
    @i1
    public static androidx.concurrent.futures.b<Uri> m(@n0 Context context, @n0 Bitmap bitmap, @n0 String str, int i10) {
        String str2 = str + lg.a.f131412e + Integer.toString(i10);
        Uri uriJ = j(context, str2);
        androidx.concurrent.futures.b<Uri> bVarU = androidx.concurrent.futures.b.u();
        new c(context, str2, bitmap, uriJ, bVarU).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return bVarU;
    }
}
