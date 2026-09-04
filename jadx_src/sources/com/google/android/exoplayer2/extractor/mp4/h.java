package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final int A = 1885823344;
    private static final int B = 1936683886;
    private static final int C = 1953919848;
    private static final int D = 757935405;
    private static final int E = 3;

    @j1
    static final String[] F = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", com.google.common.net.c.J0, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    private static final int G = 169;
    private static final int H = 253;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45466a = "MetadataUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f45467b = 7233901;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45468c = 7631467;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f45469d = 6516084;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f45470e = 6578553;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f45471f = 4280916;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f45472g = 7630703;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45473h = 6384738;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45474i = 6516589;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45475j = 7828084;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45476k = 7108978;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45477l = 6776174;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45478m = 1668249202;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45479n = 1735291493;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45480o = 6779504;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45481p = 1684632427;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45482q = 1953655662;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f45483r = 1953329263;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45484s = 1668311404;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f45485t = 1631670868;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f45486u = 1936682605;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f45487v = 1936679276;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f45488w = 1936679282;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f45489x = 1936679265;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f45490y = 1936679791;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f45491z = 1920233063;

    private h() {
    }

    @p0
    private static CommentFrame a(int i10, e0 e0Var) {
        int iO = e0Var.o();
        if (e0Var.o() == 1684108385) {
            e0Var.T(8);
            String strB = e0Var.B(iO - 16);
            return new CommentFrame(com.google.android.exoplayer2.j.f46383c1, strB, strB);
        }
        String strValueOf = String.valueOf(a.a(i10));
        u.m(f45466a, strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    @p0
    private static ApicFrame b(e0 e0Var) {
        String str;
        int iO = e0Var.o();
        if (e0Var.o() != 1684108385) {
            u.m(f45466a, "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(e0Var.o());
        if (iB == 13) {
            str = "image/jpeg";
        } else {
            str = iB == 14 ? com.max.mediaselector.lib.config.f.D : null;
        }
        if (str == null) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unrecognized cover art flags: ");
            sb2.append(iB);
            u.m(f45466a, sb2.toString());
            return null;
        }
        e0Var.T(4);
        int i10 = iO - 16;
        byte[] bArr = new byte[i10];
        e0Var.k(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    @p0
    public static Metadata.Entry c(e0 e0Var) {
        int iE = e0Var.e() + e0Var.o();
        int iO = e0Var.o();
        int i10 = (iO >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iO;
                if (i11 == f45469d) {
                    CommentFrame commentFrameA = a(iO, e0Var);
                    e0Var.S(iE);
                    return commentFrameA;
                }
                if (i11 == f45467b || i11 == f45468c) {
                    TextInformationFrame textInformationFrameH = h(iO, "TIT2", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH;
                }
                if (i11 == f45474i || i11 == f45475j) {
                    TextInformationFrame textInformationFrameH2 = h(iO, "TCOM", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH2;
                }
                if (i11 == f45470e) {
                    TextInformationFrame textInformationFrameH3 = h(iO, "TDRC", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH3;
                }
                if (i11 == f45471f) {
                    TextInformationFrame textInformationFrameH4 = h(iO, "TPE1", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH4;
                }
                if (i11 == f45472g) {
                    TextInformationFrame textInformationFrameH5 = h(iO, "TSSE", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH5;
                }
                if (i11 == f45473h) {
                    TextInformationFrame textInformationFrameH6 = h(iO, "TALB", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH6;
                }
                if (i11 == f45476k) {
                    TextInformationFrame textInformationFrameH7 = h(iO, "USLT", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH7;
                }
                if (i11 == f45477l) {
                    TextInformationFrame textInformationFrameH8 = h(iO, "TCON", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH8;
                }
                if (i11 == f45480o) {
                    TextInformationFrame textInformationFrameH9 = h(iO, "TIT1", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH9;
                }
            } else {
                if (iO == f45479n) {
                    TextInformationFrame textInformationFrameG = g(e0Var);
                    e0Var.S(iE);
                    return textInformationFrameG;
                }
                if (iO == f45481p) {
                    TextInformationFrame textInformationFrameD = d(iO, "TPOS", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameD;
                }
                if (iO == f45482q) {
                    TextInformationFrame textInformationFrameD2 = d(iO, "TRCK", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameD2;
                }
                if (iO == f45483r) {
                    Id3Frame id3FrameI = i(iO, "TBPM", e0Var, true, false);
                    e0Var.S(iE);
                    return id3FrameI;
                }
                if (iO == f45484s) {
                    Id3Frame id3FrameI2 = i(iO, "TCMP", e0Var, true, true);
                    e0Var.S(iE);
                    return id3FrameI2;
                }
                if (iO == f45478m) {
                    ApicFrame apicFrameB = b(e0Var);
                    e0Var.S(iE);
                    return apicFrameB;
                }
                if (iO == f45485t) {
                    TextInformationFrame textInformationFrameH10 = h(iO, "TPE2", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH10;
                }
                if (iO == f45486u) {
                    TextInformationFrame textInformationFrameH11 = h(iO, "TSOT", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH11;
                }
                if (iO == f45487v) {
                    TextInformationFrame textInformationFrameH12 = h(iO, "TSO2", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH12;
                }
                if (iO == f45488w) {
                    TextInformationFrame textInformationFrameH13 = h(iO, "TSOA", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH13;
                }
                if (iO == f45489x) {
                    TextInformationFrame textInformationFrameH14 = h(iO, "TSOP", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH14;
                }
                if (iO == f45490y) {
                    TextInformationFrame textInformationFrameH15 = h(iO, "TSOC", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH15;
                }
                if (iO == f45491z) {
                    Id3Frame id3FrameI3 = i(iO, "ITUNESADVISORY", e0Var, false, false);
                    e0Var.S(iE);
                    return id3FrameI3;
                }
                if (iO == A) {
                    Id3Frame id3FrameI4 = i(iO, "ITUNESGAPLESS", e0Var, false, true);
                    e0Var.S(iE);
                    return id3FrameI4;
                }
                if (iO == B) {
                    TextInformationFrame textInformationFrameH16 = h(iO, "TVSHOWSORT", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH16;
                }
                if (iO == C) {
                    TextInformationFrame textInformationFrameH17 = h(iO, "TVSHOW", e0Var);
                    e0Var.S(iE);
                    return textInformationFrameH17;
                }
                if (iO == D) {
                    Id3Frame id3FrameE = e(e0Var, iE);
                    e0Var.S(iE);
                    return id3FrameE;
                }
            }
            String strValueOf = String.valueOf(a.a(iO));
            u.b(f45466a, strValueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf) : new String("Skipped unknown metadata entry: "));
            e0Var.S(iE);
            return null;
        } catch (Throwable th2) {
            e0Var.S(iE);
            throw th2;
        }
    }

    @p0
    private static TextInformationFrame d(int i10, String str, e0 e0Var) {
        int iO = e0Var.o();
        if (e0Var.o() == 1684108385 && iO >= 22) {
            e0Var.T(10);
            int iM = e0Var.M();
            if (iM > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(iM);
                String string = sb2.toString();
                int iM2 = e0Var.M();
                if (iM2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 12);
                    sb3.append(strValueOf);
                    sb3.append("/");
                    sb3.append(iM2);
                    string = sb3.toString();
                }
                return new TextInformationFrame(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(a.a(i10));
        u.m(f45466a, strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    @p0
    private static Id3Frame e(e0 e0Var, int i10) {
        int i11 = -1;
        int i12 = -1;
        String strB = null;
        String strB2 = null;
        while (e0Var.e() < i10) {
            int iE = e0Var.e();
            int iO = e0Var.o();
            int iO2 = e0Var.o();
            e0Var.T(4);
            if (iO2 == 1835360622) {
                strB = e0Var.B(iO - 12);
            } else if (iO2 == 1851878757) {
                strB2 = e0Var.B(iO - 12);
            } else {
                if (iO2 == 1684108385) {
                    i11 = iE;
                    i12 = iO;
                }
                e0Var.T(iO - 12);
            }
        }
        if (strB == null || strB2 == null || i11 == -1) {
            return null;
        }
        e0Var.S(i11);
        e0Var.T(16);
        return new InternalFrame(strB, strB2, e0Var.B(i12 - 16));
    }

    @p0
    public static MdtaMetadataEntry f(e0 e0Var, int i10, String str) {
        while (true) {
            int iE = e0Var.e();
            if (iE >= i10) {
                return null;
            }
            int iO = e0Var.o();
            if (e0Var.o() == 1684108385) {
                int iO2 = e0Var.o();
                int iO3 = e0Var.o();
                int i11 = iO - 16;
                byte[] bArr = new byte[i11];
                e0Var.k(bArr, 0, i11);
                return new MdtaMetadataEntry(str, bArr, iO3, iO2);
            }
            e0Var.S(iE + iO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @p0
    private static TextInformationFrame g(e0 e0Var) {
        String str;
        int iJ = j(e0Var);
        if (iJ > 0) {
            String[] strArr = F;
            if (iJ <= strArr.length) {
                str = strArr[iJ - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        u.m(f45466a, "Failed to parse standard genre code");
        return null;
    }

    @p0
    private static TextInformationFrame h(int i10, String str, e0 e0Var) {
        int iO = e0Var.o();
        if (e0Var.o() == 1684108385) {
            e0Var.T(8);
            return new TextInformationFrame(str, null, e0Var.B(iO - 16));
        }
        String strValueOf = String.valueOf(a.a(i10));
        u.m(f45466a, strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    @p0
    private static Id3Frame i(int i10, String str, e0 e0Var, boolean z10, boolean z11) {
        int iJ = j(e0Var);
        if (z11) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z10 ? new TextInformationFrame(str, null, Integer.toString(iJ)) : new CommentFrame(com.google.android.exoplayer2.j.f46383c1, str, Integer.toString(iJ));
        }
        String strValueOf = String.valueOf(a.a(i10));
        u.m(f45466a, strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int j(e0 e0Var) {
        e0Var.T(4);
        if (e0Var.o() == 1684108385) {
            e0Var.T(8);
            return e0Var.G();
        }
        u.m(f45466a, "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, w wVar, a2.b bVar) {
        if (i10 == 1 && wVar.a()) {
            bVar.N(wVar.f46211a).O(wVar.f46212b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static void l(int i10, @p0 Metadata metadata, @p0 Metadata metadata2, a2.b bVar, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i10 == 1) {
            if (metadata == null) {
                metadata = metadata3;
                break;
            }
        } else {
            if (i10 != 2 || metadata2 == null) {
                metadata = metadata3;
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= metadata2.d()) {
                    metadata = metadata3;
                    break;
                }
                Metadata.Entry entryC = metadata2.c(i11);
                if (entryC instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryC;
                    if (MdtaMetadataEntry.f46952f.equals(mdtaMetadataEntry.f46953b)) {
                        metadata = new Metadata(mdtaMetadataEntry);
                        break;
                    }
                }
                i11++;
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.b(metadata4);
        }
        if (metadata.d() > 0) {
            bVar.X(metadata);
        }
    }
}
