package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements com.google.android.play.core.splitinstall.internal.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56362a;

    public n(com.google.android.play.core.splitinstall.internal.a1 a1Var) {
        this.f56362a = a1Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.a1
    @androidx.annotation.p0
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context contextA = ((l) this.f56362a).a();
        try {
            Bundle bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextA.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
