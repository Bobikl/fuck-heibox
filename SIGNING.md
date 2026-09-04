# Release 签名

从 `0.8.0` 开始，正式 APK 使用固定 Release 证书，不再使用 Android debug key。

## 证书指纹

```text
SHA-256: 14:68:CD:12:DB:1F:05:7C:E7:91:4C:6D:B9:49:10:A1:49:E2:64:77:D9:FF:B3:D1:D5:C7:D5:EB:B0:63:7F:84
```

`0.7.5` 及更早 APK 使用旧 debug 证书，与 `0.8.0` 的正式证书不兼容。
首次迁移需要卸载旧模块再安装新版；之后必须始终使用上面的证书签名，才能覆盖升级。

## 本地配置

在仓库根目录创建不会提交的 `keystore.properties`：

```properties
storeFile=.signing/heybox-release.jks
storePassword=<store password>
keyAlias=heybox-release
keyPassword=<key password>
```

密钥文件、属性文件及密码均已加入 `.gitignore`。必须单独加密备份；丢失私钥后无法继续发布可覆盖升级的 APK。

CI 也可以使用以下环境变量：

```text
HEYBOX_RELEASE_STORE_FILE
HEYBOX_RELEASE_STORE_PASSWORD
HEYBOX_RELEASE_KEY_ALIAS
HEYBOX_RELEASE_KEY_PASSWORD
```

缺少完整配置时，Gradle 只生成 unsigned Release，不会使用 debug key。
