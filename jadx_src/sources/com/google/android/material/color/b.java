package com.google.android.material.color;

import android.annotation.NonNull;
import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* JADX INFO: compiled from: ColorResourcesLoaderCreator.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(30)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53644a = "b";

    private b() {
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.res.loader.ResourcesLoader] */
    @p0
    static ResourcesLoader a(@n0 Context context, @n0 Map<Integer, Integer> map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrI = e.i(context, map);
            Log.i(f53644a, "Table created, length: " + bArrI.length);
            if (bArrI.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(bArrI);
                        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            ?? r10 = new Object() { // from class: android.content.res.loader.ResourcesLoader
                                static {
                                    throw new NoClassDefFoundError();
                                }

                                public native /* synthetic */ void addProvider(@NonNull ResourcesProvider resourcesProvider);
                            };
                            r10.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            if (fileDescriptorMemfd_create != null) {
                                Os.close(fileDescriptorMemfd_create);
                            }
                            return r10;
                        } catch (Throwable th2) {
                            if (parcelFileDescriptorDup != null) {
                                try {
                                    parcelFileDescriptorDup.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                fileDescriptorMemfd_create = null;
            }
        } catch (Exception e10) {
            Log.e(f53644a, "Failed to create the ColorResourcesTableCreator.", e10);
            return null;
        }
    }
}
