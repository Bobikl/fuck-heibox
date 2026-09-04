package d6;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.UnsupportedEncodingException;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f108150a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f108151b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, com.google.common.base.a.f56668u, 19, com.google.common.base.a.f56671x, com.google.common.base.a.f56672y, com.google.common.base.a.f56673z, com.google.common.base.a.A, com.google.common.base.a.B, com.google.common.base.a.C, -1, -1, -1, -1, -1, -1, com.google.common.base.a.D, com.google.common.base.a.E, com.google.common.base.a.F, com.google.common.base.a.G, com.google.common.base.a.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, -1, -1, -1, -1, -1};

    public static byte[] a(String str) throws UnsupportedEncodingException {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        byte b12;
        int i13;
        byte b13;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i14 = 0;
        loop0: while (i14 < length) {
            while (true) {
                i10 = i14 + 1;
                b10 = f108151b[bytes[i14]];
                if (i10 >= length || b10 != -1) {
                    break;
                }
                i14 = i10;
            }
            if (b10 == -1) {
                break;
            }
            while (true) {
                i11 = i10 + 1;
                b11 = f108151b[bytes[i10]];
                if (i11 >= length || b11 != -1) {
                    break;
                }
                i10 = i11;
            }
            if (b11 == -1) {
                break;
            }
            stringBuffer.append((char) ((b10 << 2) | ((b11 & org.apache.tools.tar.c.F) >>> 4)));
            while (true) {
                i12 = i11 + 1;
                byte b14 = bytes[i11];
                if (b14 == 61) {
                    break loop0;
                }
                b12 = f108151b[b14];
                if (i12 >= length || b12 != -1) {
                    break;
                }
                i11 = i12;
            }
            if (b12 == -1) {
                break;
            }
            stringBuffer.append((char) (((b11 & 15) << 4) | ((b12 & 60) >>> 2)));
            while (true) {
                i13 = i12 + 1;
                byte b15 = bytes[i12];
                if (b15 == 61) {
                    break loop0;
                }
                b13 = f108151b[b15];
                if (i13 >= length || b13 != -1) {
                    break;
                }
                i12 = i13;
            }
            if (b13 == -1) {
                break;
            }
            stringBuffer.append((char) (b13 | ((b12 & 3) << 6)));
            i14 = i13;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }
}
