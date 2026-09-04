package androidx.p001datastore.preferences.protobuf;

import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k3 {

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteString f22499a;

        a(ByteString byteString) {
            this.f22499a = byteString;
        }

        @Override // androidx.datastore.preferences.protobuf.k3.c
        public byte a(int i10) {
            return this.f22499a.h(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.k3.c
        public int size() {
            return this.f22499a.size();
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f22500a;

        b(byte[] bArr) {
            this.f22500a = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.k3.c
        public byte a(int i10) {
            return this.f22500a[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.k3.c
        public int size() {
            return this.f22500a.length;
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public interface c {
        byte a(int i10);

        int size();
    }

    private k3() {
    }

    static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    static String b(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bA = cVar.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String str) {
        return a(ByteString.w(str));
    }
}
