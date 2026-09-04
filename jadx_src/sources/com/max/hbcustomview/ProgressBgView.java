package com.max.hbcustomview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressBgView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f68577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TranslateAnimation f68578c;

    public ProgressBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68577b = new ImageView(getContext());
        this.f68577b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.f68577b);
    }

    private void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.V8, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ((FrameLayout.LayoutParams) this.f68577b.getLayoutParams()).setMargins(-i10, 0, 0, 0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i10, 0.0f, 0.0f);
        this.f68578c = translateAnimation;
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.f68578c.setDuration(400L);
        this.f68578c.setRepeatCount(-1);
    }

    public void b() {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.W8, new Class[0], Void.TYPE).isSupported || (imageView = this.f68577b) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f68577b.startAnimation(this.f68578c);
    }

    public void c() {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.X8, new Class[0], Void.TYPE).isSupported || (imageView = this.f68577b) == null) {
            return;
        }
        imageView.clearAnimation();
        this.f68577b.setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Y8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        TranslateAnimation translateAnimation = this.f68578c;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
    }

    public void setBackgroundAsTile(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.U8, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i10);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapDecodeResource);
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        a(bitmapDecodeResource.getWidth());
        this.f68577b.setBackgroundDrawable(bitmapDrawable);
    }
}
