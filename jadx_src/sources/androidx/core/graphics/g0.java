package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import kotlin.b2;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class g0 {

    /* JADX INFO: compiled from: ImageDecoder.kt */
    @kotlin.jvm.internal.t0({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeBitmap$1\n*L\n1#1,56:1\n*E\n"})
    public static final class a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, b2> f20731a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, b2> qVar) {
            this.f20731a = qVar;
        }

        public final void onHeaderDecoded(@dl.d ImageDecoder decoder, @dl.d ImageDecoder.ImageInfo info, @dl.d ImageDecoder.Source source) {
            kotlin.jvm.internal.f0.p(decoder, "decoder");
            kotlin.jvm.internal.f0.p(info, "info");
            kotlin.jvm.internal.f0.p(source, "source");
            this.f20731a.invoke(decoder, info, source);
        }
    }

    /* JADX INFO: compiled from: ImageDecoder.kt */
    @kotlin.jvm.internal.t0({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n*L\n1#1,56:1\n*E\n"})
    public static final class b implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, b2> f20732a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(yh.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, b2> qVar) {
            this.f20732a = qVar;
        }

        public final void onHeaderDecoded(@dl.d ImageDecoder decoder, @dl.d ImageDecoder.ImageInfo info, @dl.d ImageDecoder.Source source) {
            kotlin.jvm.internal.f0.p(decoder, "decoder");
            kotlin.jvm.internal.f0.p(info, "info");
            kotlin.jvm.internal.f0.p(source, "source");
            this.f20732a.invoke(decoder, info, source);
        }
    }

    @dl.d
    @androidx.annotation.w0(28)
    public static final Bitmap a(@dl.d ImageDecoder.Source source, @dl.d yh.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, b2> action) throws IOException {
        kotlin.jvm.internal.f0.p(source, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new a(action));
        kotlin.jvm.internal.f0.o(bitmapDecodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return bitmapDecodeBitmap;
    }

    @dl.d
    @androidx.annotation.w0(28)
    public static final Drawable b(@dl.d ImageDecoder.Source source, @dl.d yh.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, b2> action) throws IOException {
        kotlin.jvm.internal.f0.p(source, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new b(action));
        kotlin.jvm.internal.f0.o(drawableDecodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return drawableDecodeDrawable;
    }
}
