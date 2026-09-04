package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: TypefaceCompatApi29Impl.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b1 extends c1 {
    private Font o(@androidx.annotation.n0 FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iP = p(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iP2 = p(fontStyle, font2.getStyle());
            if (iP2 < iP) {
                font = font2;
                iP = iP2;
            }
        }
        return font;
    }

    private static int p(@androidx.annotation.n0 FontStyle fontStyle, @androidx.annotation.n0 FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (androidx.core.content.res.f.e eVar : dVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.b()).setWeight(eVar.e()).setSlant(eVar.f() ? 1 : 0).setTtcIndex(eVar.c()).setFontVariationSettings(eVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface$CustomFallbackBuilder(fontFamilyBuild).setStyle(o(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface d(Context context, @androidx.annotation.p0 CancellationSignal cancellationSignal, @androidx.annotation.n0 androidx.core.provider.j.c[] cVarArr, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (androidx.core.provider.j.c cVar : cVarArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface$CustomFallbackBuilder(fontFamilyBuild).setStyle(o(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.c1
    protected Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.p0
    public Typeface f(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.c1
    @androidx.annotation.n0
    Typeface g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // androidx.core.graphics.c1
    protected androidx.core.provider.j.c l(androidx.core.provider.j.c[] cVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
