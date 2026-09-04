package androidx.browser.trusted;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: TokenContents.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final byte[] f3291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private String f3292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private List<byte[]> f3293c;

    private o(@n0 byte[] bArr) {
        this.f3291a = bArr;
    }

    private o(@n0 byte[] bArr, @n0 String str, @n0 List<byte[]> list) {
        this.f3291a = bArr;
        this.f3292b = str;
        this.f3293c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f3293c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i10 = 0; i10 < Math.min(bArr.length, bArr2.length); i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    @n0
    static o c(String str, List<byte[]> list) throws IOException {
        return new o(d(str, list), str, list);
    }

    @n0
    private static byte[] d(@n0 String str, @n0 List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.b((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @n0
    static o e(@n0 byte[] bArr) {
        return new o(bArr);
    }

    private void i() throws IOException {
        if (this.f3292b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f3291a));
        this.f3292b = dataInputStream.readUTF();
        int i10 = dataInputStream.readInt();
        this.f3293c = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = dataInputStream.readInt();
            byte[] bArr = new byte[i12];
            if (dataInputStream.read(bArr) != i12) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f3293c.add(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3291a, ((o) obj).f3291a);
    }

    @n0
    public byte[] f(int i10) throws IOException {
        i();
        List<byte[]> list = this.f3293c;
        if (list != null) {
            return Arrays.copyOf(list.get(i10), this.f3293c.get(i10).length);
        }
        throw new IllegalStateException();
    }

    public int g() throws IOException {
        i();
        List<byte[]> list = this.f3293c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @n0
    public String h() throws IOException {
        i();
        String str = this.f3292b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3291a);
    }

    @n0
    public byte[] j() {
        byte[] bArr = this.f3291a;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
