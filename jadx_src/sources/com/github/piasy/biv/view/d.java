package com.github.piasy.biv.view;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.File;

/* JADX INFO: compiled from: ImageViewFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    protected View a(Context context, int i10, int i11) {
        return null;
    }

    public final View b(Context context, int i10, int i11) {
        return (i10 == 1 || i10 == 2) ? a(context, i10, i11) : c(context);
    }

    protected SubsamplingScaleImageView c(Context context) {
        return new SubsamplingScaleImageView(context);
    }

    public View d(Context context, ImageView.ScaleType scaleType, boolean z10) {
        ImageView imageView = new ImageView(context);
        if (scaleType != null) {
            imageView.setScaleType(scaleType);
        }
        return imageView;
    }

    public boolean e(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void f(View view, int i10, File file) {
    }

    public void g(View view, Uri uri) {
        if (view instanceof SubsamplingScaleImageView) {
            ((SubsamplingScaleImageView) view).setImage(ImageSource.uri(uri));
        }
    }

    public void h(View view, Uri uri) {
    }

    public void i(View view, File file) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageURI(Uri.fromFile(file));
        }
    }
}
