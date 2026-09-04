package io.flutter.embedding.engine.loader;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Build;
import androidx.annotation.k1;
import androidx.annotation.n0;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public class ResourceExtractor {
    private static final String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
    private static final String TAG = "ResourceExtractor";
    private static final String TIMESTAMP_PREFIX = "res_timestamp-";

    @n0
    private final AssetManager mAssetManager;

    @n0
    private final String mDataDirPath;
    private ExtractTask mExtractTask;

    @n0
    private final PackageManager mPackageManager;

    @n0
    private final String mPackageName;

    @n0
    private final HashSet<String> mResources = new HashSet<>();

    public static class ExtractTask extends AsyncTask<Void, Void, Void> {

        @n0
        private final AssetManager mAssetManager;

        @n0
        private final String mDataDirPath;

        @n0
        private final PackageManager mPackageManager;

        @n0
        private final String mPackageName;

        @n0
        private final HashSet<String> mResources;

        ExtractTask(@n0 String str, @n0 HashSet<String> hashSet, @n0 String str2, @n0 PackageManager packageManager, @n0 AssetManager assetManager) {
            this.mDataDirPath = str;
            this.mResources = hashSet;
            this.mAssetManager = assetManager;
            this.mPackageName = str2;
            this.mPackageManager = packageManager;
        }

        @k1
        private boolean extractAPK(@n0 File file) {
            for (String str : this.mResources) {
                try {
                    File file2 = new File(file, str);
                    if (!file2.exists()) {
                        if (file2.getParentFile() != null) {
                            file2.getParentFile().mkdirs();
                        }
                        InputStream inputStreamOpen = this.mAssetManager.open(str);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                ResourceExtractor.copy(inputStreamOpen, fileOutputStream);
                                fileOutputStream.close();
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    }
                } catch (FileNotFoundException unused) {
                } catch (IOException e10) {
                    Log.w(ResourceExtractor.TAG, "Exception unpacking resources: " + e10.getMessage());
                    ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            File file = new File(this.mDataDirPath);
            String strCheckTimestamp = ResourceExtractor.checkTimestamp(file, this.mPackageManager, this.mPackageName);
            if (strCheckTimestamp == null) {
                return null;
            }
            ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
            if (!extractAPK(file)) {
                return null;
            }
            try {
                new File(file, strCheckTimestamp).createNewFile();
            } catch (IOException unused) {
                Log.w(ResourceExtractor.TAG, "Failed to write resource timestamp");
            }
            return null;
        }
    }

    ResourceExtractor(@n0 String str, @n0 String str2, @n0 PackageManager packageManager, @n0 AssetManager assetManager) {
        this.mDataDirPath = str;
        this.mPackageName = str2;
        this.mPackageManager = packageManager;
        this.mAssetManager = assetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String checkTimestamp(@n0 File file, @n0 PackageManager packageManager, @n0 String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return TIMESTAMP_PREFIX;
            }
            String str2 = TIMESTAMP_PREFIX + getVersionCode(packageInfo) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + packageInfo.lastUpdateTime;
            String[] existingTimestamps = getExistingTimestamps(file);
            if (existingTimestamps != null && existingTimestamps.length == 1 && str2.equals(existingTimestamps[0])) {
                return null;
            }
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return TIMESTAMP_PREFIX;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copy(@n0 InputStream inputStream, @n0 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[16384];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(@n0 String str, @n0 HashSet<String> hashSet) {
        File file = new File(str);
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            File file2 = new File(file, it.next());
            if (file2.exists()) {
                file2.delete();
            }
        }
        String[] existingTimestamps = getExistingTimestamps(file);
        if (existingTimestamps == null) {
            return;
        }
        for (String str2 : existingTimestamps) {
            new File(file, str2).delete();
        }
    }

    private static String[] getExistingTimestamps(File file) {
        return file.list(new FilenameFilter() { // from class: io.flutter.embedding.engine.loader.ResourceExtractor.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return str.startsWith(ResourceExtractor.TIMESTAMP_PREFIX);
            }
        });
    }

    static long getVersionCode(@n0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    ResourceExtractor addResource(@n0 String str) {
        this.mResources.add(str);
        return this;
    }

    ResourceExtractor addResources(@n0 Collection<String> collection) {
        this.mResources.addAll(collection);
        return this;
    }

    ResourceExtractor start() {
        ExtractTask extractTask = new ExtractTask(this.mDataDirPath, this.mResources, this.mPackageName, this.mPackageManager, this.mAssetManager);
        this.mExtractTask = extractTask;
        extractTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    void waitForCompletion() {
        ExtractTask extractTask = this.mExtractTask;
        if (extractTask == null) {
            return;
        }
        try {
            extractTask.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            deleteFiles(this.mDataDirPath, this.mResources);
        }
    }
}
