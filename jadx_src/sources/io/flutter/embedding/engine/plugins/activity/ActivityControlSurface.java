package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.android.ExclusiveAppComponent;

/* JADX INFO: loaded from: classes4.dex */
public interface ActivityControlSurface {
    void attachToActivity(@n0 ExclusiveAppComponent<Activity> exclusiveAppComponent, @n0 Lifecycle lifecycle);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i10, int i11, @p0 Intent intent);

    void onNewIntent(@n0 Intent intent);

    boolean onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr);

    void onRestoreInstanceState(@p0 Bundle bundle);

    void onSaveInstanceState(@n0 Bundle bundle);

    void onUserLeaveHint();
}
