package com.github.piasy.biv.view;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.io.File;

/* JADX INFO: compiled from: GlideImageViewFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends d {
    @Override // com.github.piasy.biv.view.d
    protected final View a(Context context, int i10, int i11) {
        if (i10 != 1 && i10 != 2) {
            return super.a(context, i10, i11);
        }
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(BigImageView.scaleType(i11));
        return imageView;
    }

    @Override // com.github.piasy.biv.view.d
    public final void f(View view, int i10, File file) {
        if (i10 != 1 && i10 != 2) {
            super.f(view, i10, file);
        } else if (view instanceof ImageView) {
            Glide.F(view.getContext()).b(file).C1((ImageView) view);
        }
    }

    @Override // com.github.piasy.biv.view.d
    public void h(View view, Uri uri) {
        if (view instanceof ImageView) {
            Glide.F(view.getContext()).e(uri).C1((ImageView) view);
        }
    }
}
