package com.huawei.secure.android.common.util;

import android.util.Log;
import androidx.annotation.w0;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63103a = "FileUtil";

    @w0(api = 26)
    public static boolean a(File file) throws IOException {
        if (file == null) {
            Log.e(f63103a, "file is null when isInSecureDir");
            return false;
        }
        try {
            Path path = Paths.get(file.getCanonicalPath(), new String[0]);
            if (path != null) {
                return a(path, (UserPrincipal) null);
            }
            Log.e(f63103a, "path is null when isInSecureDir");
            return false;
        } catch (IOException e10) {
            Log.e(f63103a, "failed to get canonical path: ", e10);
            return false;
        }
    }

    public static boolean a(String str) throws UnsupportedEncodingException {
        if (str == null || str.equals("")) {
            return true;
        }
        if (str.contains("%")) {
            str = str.replaceAll("%(?![0-9a-fA-F]{2})", "%25");
        }
        String strDecode = URLDecoder.decode(str, "utf-8");
        return (strDecode.contains("..") || strDecode.contains("./") || strDecode.contains(".\\.\\") || strDecode.contains("%00")) ? false : true;
    }

    public static boolean a(String str, String str2) throws IOException {
        if (str != null && !str.equals("") && str2 != null && !str2.equals("")) {
            String strDecode = URLDecoder.decode(str2, "utf-8");
            String strDecode2 = URLDecoder.decode(str, "utf-8");
            if (!strDecode2.contains("..") && !strDecode2.contains("./") && !strDecode2.contains(".\\.\\") && !strDecode2.contains("%00") && !strDecode.contains("..") && !strDecode.contains("./") && !strDecode.contains(".\\.\\") && !strDecode.contains("%00")) {
                return new File(strDecode2, strDecode).getCanonicalPath().startsWith(new File(strDecode2).getCanonicalPath());
            }
        }
        return false;
    }

    public static boolean a(String str, String[] strArr) {
        if (str != null && !str.isEmpty() && strArr != null) {
            String strB = b(str);
            for (String str2 : strArr) {
                if (strB.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @w0(api = 26)
    public static boolean a(Path path) throws IOException {
        return a(path, (UserPrincipal) null);
    }

    @w0(api = 26)
    public static boolean a(Path path, UserPrincipal userPrincipal) throws IOException {
        return a(path, userPrincipal, 5);
    }

    @w0(api = 26)
    public static boolean a(Path path, UserPrincipal userPrincipal, int i10) throws IOException {
        if (!path.isAbsolute()) {
            path = path.toAbsolutePath();
        }
        if (i10 <= 0) {
            return false;
        }
        FileSystem fileSystem = null;
        try {
            try {
                fileSystem = Paths.get(path.getRoot().toString(), new String[0]).getFileSystem();
                UserPrincipalLookupService userPrincipalLookupService = fileSystem.getUserPrincipalLookupService();
                fileSystem.close();
                try {
                    UserPrincipal userPrincipalLookupPrincipalByName = userPrincipalLookupService.lookupPrincipalByName("root");
                    if (userPrincipal == null) {
                        userPrincipal = userPrincipalLookupService.lookupPrincipalByName(System.getProperty("user.name"));
                    }
                    if (userPrincipalLookupPrincipalByName != null && userPrincipal != null) {
                        for (int i11 = 1; i11 <= path.getNameCount(); i11++) {
                            try {
                                Path path2 = Paths.get(path.getRoot().toString(), path.subpath(0, i11).toString());
                                try {
                                    if (!Files.isSymbolicLink(path2)) {
                                        UserPrincipal owner = Files.getOwner(path2, new LinkOption[0]);
                                        if (!userPrincipal.equals(owner) && !userPrincipalLookupPrincipalByName.equals(owner)) {
                                            Log.w(f63103a, "partial path , root: , user: , owner: ");
                                            return false;
                                        }
                                        Set<PosixFilePermission> setPermissions = ((PosixFileAttributes) Files.readAttributes(path2, PosixFileAttributes.class, new LinkOption[0])).permissions();
                                        if (!setPermissions.contains(PosixFilePermission.GROUP_WRITE) && !setPermissions.contains(PosixFilePermission.OTHERS_WRITE)) {
                                        }
                                        Log.w(f63103a, "permission of partial path is insecure by GROUP_WRITE or OTHERS_WRITE");
                                        return false;
                                    }
                                    Log.w(f63103a, "partial path " + path2.toString() + "is a symbolic link");
                                    if (!a(Files.readSymbolicLink(path2), userPrincipal, i10 - 1)) {
                                        return false;
                                    }
                                } catch (IOException e10) {
                                    Log.e(f63103a, "get IOException: ", e10);
                                    return false;
                                }
                            } catch (Exception e11) {
                                Log.e(f63103a, "get partial path error: ", e11);
                                return false;
                            }
                        }
                        return true;
                    }
                } catch (IOException unused) {
                }
                return false;
            } catch (Throwable th2) {
                if (fileSystem != null) {
                    fileSystem.close();
                }
                throw th2;
            }
        } catch (Exception e12) {
            Log.e(f63103a, "get fileSystem error: ", e12);
            if (fileSystem != null) {
                fileSystem.close();
            }
            return false;
        }
    }

    private static String b(String str) {
        int iLastIndexOf;
        int i10;
        return (str.isEmpty() || (iLastIndexOf = str.lastIndexOf(".")) == -1 || (i10 = iLastIndexOf + 1) == str.length()) ? "" : str.substring(i10).toLowerCase(Locale.ENGLISH);
    }

    @w0(api = 26)
    public static boolean b(Path path) {
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (attributes == null) {
                Log.e(f63103a, "attr is null when isRegularFile");
                return false;
            }
            if (attributes.isRegularFile()) {
                return true;
            }
            Log.e(f63103a, "file is not a regular file");
            return false;
        } catch (IOException unused) {
            Log.e(f63103a, "failed to read attributes of file: ");
            return false;
        }
    }
}
