package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: compiled from: KeyFrameArray.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: compiled from: KeyFrameArray.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f17724d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f17725a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CustomAttribute[] f17726b = new CustomAttribute[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17727c;

        public a() {
            b();
        }

        public void a(int i10, CustomAttribute customAttribute) {
            if (this.f17726b[i10] != null) {
                e(i10);
            }
            this.f17726b[i10] = customAttribute;
            int[] iArr = this.f17725a;
            int i11 = this.f17727c;
            this.f17727c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f17725a, 999);
            Arrays.fill(this.f17726b, (Object) null);
            this.f17727c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f17725a, this.f17727c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f17727c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f17725a[i10];
        }

        public void e(int i10) {
            this.f17726b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f17727c;
                if (i11 >= i13) {
                    this.f17727c = i13 - 1;
                    return;
                }
                int[] iArr = this.f17725a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f17727c;
        }

        public CustomAttribute g(int i10) {
            return this.f17726b[this.f17725a[i10]];
        }
    }

    /* JADX INFO: compiled from: KeyFrameArray.java */
    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f17728d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f17729a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.motion.a[] f17730b = new androidx.constraintlayout.core.motion.a[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17731c;

        public b() {
            b();
        }

        public void a(int i10, androidx.constraintlayout.core.motion.a aVar) {
            if (this.f17730b[i10] != null) {
                e(i10);
            }
            this.f17730b[i10] = aVar;
            int[] iArr = this.f17729a;
            int i11 = this.f17731c;
            this.f17731c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f17729a, 999);
            Arrays.fill(this.f17730b, (Object) null);
            this.f17731c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f17729a, this.f17731c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f17731c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f17729a[i10];
        }

        public void e(int i10) {
            this.f17730b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f17731c;
                if (i11 >= i13) {
                    this.f17731c = i13 - 1;
                    return;
                }
                int[] iArr = this.f17729a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f17731c;
        }

        public androidx.constraintlayout.core.motion.a g(int i10) {
            return this.f17730b[this.f17729a[i10]];
        }
    }

    /* JADX INFO: compiled from: KeyFrameArray.java */
    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f17732d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f17733a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float[][] f17734b = new float[101][];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17735c;

        public c() {
            b();
        }

        public void a(int i10, float[] fArr) {
            if (this.f17734b[i10] != null) {
                e(i10);
            }
            this.f17734b[i10] = fArr;
            int[] iArr = this.f17733a;
            int i11 = this.f17735c;
            this.f17735c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f17733a, 999);
            Arrays.fill(this.f17734b, (Object) null);
            this.f17735c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f17733a, this.f17735c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f17735c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(Arrays.toString(g(i10)));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f17733a[i10];
        }

        public void e(int i10) {
            this.f17734b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f17735c;
                if (i11 >= i13) {
                    this.f17735c = i13 - 1;
                    return;
                }
                int[] iArr = this.f17733a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f17735c;
        }

        public float[] g(int i10) {
            return this.f17734b[this.f17733a[i10]];
        }
    }
}
