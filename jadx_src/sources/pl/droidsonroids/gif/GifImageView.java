package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes5.dex */
public class GifImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f138316b;

    public GifImageView(Context context) {
        super(context);
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(j.c(this, attributeSet, 0, 0));
    }

    public GifImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(j.c(this, attributeSet, i10, 0));
    }

    @w0(21)
    public GifImageView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(j.c(this, attributeSet, i10, i11));
    }

    private void a(j.a aVar) {
        this.f138316b = aVar.f138376a;
        int i10 = aVar.f138374c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = aVar.f138375d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        gifViewSavedState.a(getDrawable(), 0);
        gifViewSavedState.a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new GifViewSavedState(super.onSaveInstanceState(), this.f138316b ? getDrawable() : null, this.f138316b ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (j.e(this, false, i10)) {
            return;
        }
        super.setBackgroundResource(i10);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f138316b = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (j.e(this, true, i10)) {
            return;
        }
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (j.d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
