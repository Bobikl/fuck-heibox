package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.util.u0;
import com.tencent.cos.xml.model.tag.DomainConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f46928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46929d;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    TextInformationFrame(Parcel parcel) {
        super((String) u0.k(parcel.readString()));
        this.f46928c = parcel.readString();
        this.f46929d = (String) u0.k(parcel.readString());
    }

    public TextInformationFrame(String str, @p0 String str2, String str3) {
        super(str);
        this.f46928c = str2;
        this.f46929d = str3;
    }

    private static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return u0.c(this.f46914b, textInformationFrame.f46914b) && u0.c(this.f46928c, textInformationFrame.f46928c) && u0.c(this.f46929d, textInformationFrame.f46929d);
    }

    public int hashCode() {
        int iHashCode = (bb.c.b.f30674h7 + this.f46914b.hashCode()) * 31;
        String str = this.f46928c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46929d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void m(m2.b bVar) {
        String str = this.f46914b;
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals(DomainConfiguration.REPLACE_TXT)) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = com.google.common.base.a.f56668u;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = com.google.common.base.a.f56671x;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = com.google.common.base.a.f56672y;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.L(this.f46929d);
                    break;
                case 1:
                case 11:
                    bVar.R(this.f46929d);
                    break;
                case 2:
                case 12:
                    bVar.d0(Integer.valueOf(Integer.parseInt(this.f46929d.substring(2, 4)))).c0(Integer.valueOf(Integer.parseInt(this.f46929d.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.M(this.f46929d);
                    break;
                case 4:
                case 18:
                    bVar.K(this.f46929d);
                    break;
                case 5:
                case 19:
                    bVar.S(this.f46929d);
                    break;
                case 6:
                case 20:
                    String[] strArrP1 = u0.p1(this.f46929d, "/");
                    bVar.m0(Integer.valueOf(Integer.parseInt(strArrP1[0]))).l0(strArrP1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrP1[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.j0(this.f46929d);
                    break;
                case 8:
                case 15:
                    bVar.o0(this.f46929d);
                    break;
                case 9:
                case 21:
                    bVar.e0(Integer.valueOf(Integer.parseInt(this.f46929d)));
                    break;
                case 13:
                    List<Integer> listA = a(this.f46929d);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.c0(listA.get(2));
                            }
                        }
                        bVar.d0(listA.get(1));
                    }
                    bVar.e0(listA.get(0));
                    break;
                case 14:
                    List<Integer> listA2 = a(this.f46929d);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.f0(listA2.get(2));
                            }
                        }
                        bVar.g0(listA2.get(1));
                    }
                    bVar.h0(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46928c;
        String str3 = this.f46929d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46914b);
        parcel.writeString(this.f46928c);
        parcel.writeString(this.f46929d);
    }
}
