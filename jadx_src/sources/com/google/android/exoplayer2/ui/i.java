package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.a2;
import java.util.Locale;

/* JADX INFO: compiled from: DefaultTrackNameProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public class i implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f50731a;

    public i(Resources resources) {
        this.f50731a = (Resources) com.google.android.exoplayer2.util.a.g(resources);
    }

    private String b(a2 a2Var) {
        int i10 = a2Var.f43606z;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f50731a.getString(R.string.exo_track_mono);
        }
        if (i10 == 2) {
            return this.f50731a.getString(R.string.exo_track_stereo);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f50731a.getString(R.string.exo_track_surround_5_point_1);
        }
        return i10 != 8 ? this.f50731a.getString(R.string.exo_track_surround) : this.f50731a.getString(R.string.exo_track_surround_7_point_1);
    }

    private String c(a2 a2Var) {
        int i10 = a2Var.f43589i;
        return i10 == -1 ? "" : this.f50731a.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(a2 a2Var) {
        return TextUtils.isEmpty(a2Var.f43583c) ? "" : a2Var.f43583c;
    }

    private String e(a2 a2Var) {
        String strJ = j(f(a2Var), h(a2Var));
        return TextUtils.isEmpty(strJ) ? d(a2Var) : strJ;
    }

    private String f(a2 a2Var) {
        String str = a2Var.f43584d;
        if (TextUtils.isEmpty(str) || com.google.android.exoplayer2.j.f46383c1.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = com.google.android.exoplayer2.util.u0.f51536a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeZ = com.google.android.exoplayer2.util.u0.Z();
        String displayName = localeForLanguageTag.getDisplayName(localeZ);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            String strValueOf = String.valueOf(displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeZ));
            String strValueOf2 = String.valueOf(displayName.substring(iOffsetByCodePoints));
            displayName = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        } catch (IndexOutOfBoundsException unused) {
        }
        return displayName;
    }

    private String g(a2 a2Var) {
        int i10 = a2Var.f43598r;
        int i11 = a2Var.f43599s;
        return (i10 == -1 || i11 == -1) ? "" : this.f50731a.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(a2 a2Var) {
        String string = (a2Var.f43586f & 2) != 0 ? this.f50731a.getString(R.string.exo_track_role_alternate) : "";
        if ((a2Var.f43586f & 4) != 0) {
            string = j(string, this.f50731a.getString(R.string.exo_track_role_supplementary));
        }
        if ((a2Var.f43586f & 8) != 0) {
            string = j(string, this.f50731a.getString(R.string.exo_track_role_commentary));
        }
        return (a2Var.f43586f & bb.c.b.Wh) != 0 ? j(string, this.f50731a.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private static int i(a2 a2Var) {
        int iL = com.google.android.exoplayer2.util.y.l(a2Var.f43593m);
        if (iL != -1) {
            return iL;
        }
        if (com.google.android.exoplayer2.util.y.o(a2Var.f43590j) != null) {
            return 2;
        }
        if (com.google.android.exoplayer2.util.y.c(a2Var.f43590j) != null) {
            return 1;
        }
        if (a2Var.f43598r == -1 && a2Var.f43599s == -1) {
            return (a2Var.f43606z == -1 && a2Var.A == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f50731a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // com.google.android.exoplayer2.ui.v0
    public String a(a2 a2Var) {
        String strJ;
        int i10 = i(a2Var);
        if (i10 == 2) {
            strJ = j(h(a2Var), g(a2Var), c(a2Var));
        } else {
            strJ = i10 == 1 ? j(e(a2Var), b(a2Var), c(a2Var)) : e(a2Var);
        }
        return strJ.length() == 0 ? this.f50731a.getString(R.string.exo_track_unknown) : strJ;
    }
}
