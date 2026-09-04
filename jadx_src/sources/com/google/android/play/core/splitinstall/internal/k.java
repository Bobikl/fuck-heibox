package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements com.google.android.play.core.splitinstall.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.f f56299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f56300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f56301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.t f56302e;

    public k(Context context, Executor executor, m mVar, com.google.android.play.core.splitcompat.f fVar, com.google.android.play.core.splitcompat.t tVar) {
        this.f56298a = context;
        this.f56299b = fVar;
        this.f56300c = mVar;
        this.f56301d = executor;
        this.f56302e = tVar;
    }

    static /* bridge */ /* synthetic */ void c(k kVar, List list, com.google.android.play.core.splitinstall.t0 t0Var) {
        Integer numE = kVar.e(list);
        if (numE == null) {
            return;
        }
        if (numE.intValue() == 0) {
            t0Var.y();
        } else {
            t0Var.a(numE.intValue());
        }
    }

    static /* bridge */ /* synthetic */ void d(k kVar, com.google.android.play.core.splitinstall.t0 t0Var) {
        try {
            if (com.google.android.play.core.splitcompat.a.f(q0.a(kVar.f56298a))) {
                Log.i("SplitCompat", "Splits installed.");
                t0Var.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                t0Var.a(-12);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error emulating splits.", e10);
            t0Var.a(-12);
        }
    }

    @l9.a
    @androidx.annotation.p0
    private final Integer e(List list) {
        FileLock fileLockTryLock;
        try {
            FileChannel channel = new RandomAccessFile(this.f56299b.d(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    int i10 = 0;
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f56298a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                File fileE = this.f56299b.e(stringExtra);
                                if ((fileE.exists() && fileE.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileE.exists()) {
                                    if (!this.f56299b.g(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i11 = bufferedInputStream.read(bArr);
                                                    if (i11 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i11);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th2) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th3) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th4) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th5) {
                                            bufferedInputStream.close();
                                            throw th5;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th6) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th7) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                    }
                                }
                                throw th6;
                            }
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            File[] fileArrListFiles = this.f56299b.b().listFiles();
                            try {
                                if (this.f56300c.c(fileArrListFiles) && this.f56300c.a(fileArrListFiles)) {
                                    try {
                                        File[] fileArrListFiles2 = this.f56299b.b().listFiles();
                                        Arrays.sort(fileArrListFiles2);
                                        int length = fileArrListFiles2.length;
                                        while (true) {
                                            length--;
                                            if (length < 0) {
                                                break;
                                            }
                                            com.google.android.play.core.splitcompat.f.m(fileArrListFiles2[length]);
                                            File file = fileArrListFiles2[length];
                                            file.renameTo(this.f56299b.f(file));
                                        }
                                        Log.i("SplitCompat", "Splits verified.");
                                    } catch (IOException e10) {
                                        Log.e("SplitCompat", "Cannot write verified split.", e10);
                                        i10 = -13;
                                    }
                                } else {
                                    Log.e("SplitCompat", "Split verification failed.");
                                    i10 = -11;
                                }
                            } catch (Exception e11) {
                                Log.e("SplitCompat", "Error verifying splits.", e11);
                            }
                        } catch (IOException e12) {
                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e12);
                        }
                    } catch (Exception e13) {
                        Log.e("SplitCompat", "Error copying splits.", e13);
                    }
                    numValueOf = Integer.valueOf(i10);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th8) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th9) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                    }
                }
                throw th8;
            }
        } catch (Exception e14) {
            Log.e("SplitCompat", "Error locking files.", e14);
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.v0
    public final void a(List list, com.google.android.play.core.splitinstall.t0 t0Var) {
        if (!com.google.android.play.core.splitcompat.a.g()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f56301d.execute(new j(this, list, t0Var));
    }
}
