package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.k0;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f56197a;

    public b(f fVar) {
        this.f56197a = fVar;
    }

    public static final int c(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) k0.d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + iIntValue);
        return iIntValue;
    }

    public final synchronized void a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c(assets, (File) it.next());
        }
    }

    final synchronized boolean b(Context context, Set set) {
        StrictMode.ThreadPolicy threadPolicy;
        boolean z10;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
            } catch (Exception e10) {
                e = e10;
                Log.i("SplitCompat", "Unable to set up strict mode.", e);
            }
        } catch (Exception e11) {
            e = e11;
            threadPolicy = null;
        }
        try {
            try {
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add(this.f56197a.g((String) it.next()));
                }
                a(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                z10 = true;
            } catch (Throwable th2) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th2;
            }
        } catch (Exception e12) {
            Log.e("SplitCompat", "Error installing additional splits", e12);
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            z10 = false;
        }
        return z10;
    }
}
