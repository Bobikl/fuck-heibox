package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: ModelTypes.java */
/* JADX INFO: loaded from: classes6.dex */
public interface g<T> {
    @androidx.annotation.j
    @Deprecated
    T a(@p0 URL url);

    @n0
    @androidx.annotation.j
    T b(@p0 File file);

    @n0
    @androidx.annotation.j
    T c(@p0 Drawable drawable);

    @n0
    @androidx.annotation.j
    T d(@p0 Object obj);

    @n0
    @androidx.annotation.j
    T e(@p0 Uri uri);

    @n0
    @androidx.annotation.j
    T f(@p0 byte[] bArr);

    @n0
    @androidx.annotation.j
    T g(@p0 Bitmap bitmap);

    @n0
    @androidx.annotation.j
    T h(@u0 @v @p0 Integer num);

    @n0
    @androidx.annotation.j
    T load(@p0 String str);
}
