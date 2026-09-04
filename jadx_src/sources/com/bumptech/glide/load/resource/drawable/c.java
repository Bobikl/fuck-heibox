package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.content.res.i;

/* JADX INFO: compiled from: DrawableDecoderCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f41648a = true;

    private c() {
    }

    public static Drawable a(Context context, @v int i10, @p0 Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, @v int i10) {
        return c(context, context2, i10, null);
    }

    private static Drawable c(Context context, Context context2, @v int i10, @p0 Resources.Theme theme) {
        try {
            if (f41648a) {
                return e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return androidx.core.content.d.i(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f41648a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    private static Drawable d(Context context, @v int i10, @p0 Resources.Theme theme) {
        return i.g(context.getResources(), i10, theme);
    }

    private static Drawable e(Context context, @v int i10, @p0 Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return b0.a.b(context, i10);
    }
}
