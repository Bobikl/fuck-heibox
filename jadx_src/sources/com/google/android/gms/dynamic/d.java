package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public interface d {
    @v8.a
    void onCreate(@p0 Bundle bundle);

    @n0
    @v8.a
    View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle);

    @v8.a
    void onDestroy();

    @v8.a
    void onDestroyView();

    @v8.a
    void onInflate(@n0 Activity activity, @n0 Bundle bundle, @p0 Bundle bundle2);

    @v8.a
    void onLowMemory();

    @v8.a
    void onPause();

    @v8.a
    void onResume();

    @v8.a
    void onSaveInstanceState(@n0 Bundle bundle);

    @v8.a
    void onStart();

    @v8.a
    void onStop();
}
