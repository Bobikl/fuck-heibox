"""Run actual JVM regression tests with UTF-8 output and Unicode command arguments.

Gradle compiles production/test classes; JUnit is started without a launcher
@argfile, avoiding Windows ANSI decoding of Gradle's UTF-8 classpath argfile.
"""
import argparse
import os
from pathlib import Path
import subprocess
import sys


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--gradle", required=True, type=Path)
    parser.add_argument("--java-home", required=True, type=Path)
    parser.add_argument("--sdk-dir", required=True, type=Path)
    parser.add_argument("--gradle-user-home", type=Path)
    args = parser.parse_args()
    root = Path(__file__).resolve().parents[1]
    env = os.environ.copy()
    env["JAVA_HOME"] = str(args.java_home.resolve())
    cache = (args.gradle_user_home or Path(env.get(
        "GRADLE_USER_HOME", str(Path.home() / ".gradle")))).resolve()
    env["GRADLE_USER_HOME"] = str(cache)
    utf8_options = (
        "-Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 "
        "-Dsun.stderr.encoding=UTF-8")
    env["JAVA_TOOL_OPTIONS"] = env.get("JAVA_TOOL_OPTIONS", "") + " " + utf8_options

    def run(command):
        result = subprocess.run(command, cwd=root, env=env, stdout=subprocess.PIPE,
                                stderr=subprocess.STDOUT, encoding="utf-8", errors="strict")
        print(result.stdout, end="", flush=True)
        return result.returncode

    # No shell-built strings and no non-ASCII stdin pipe.
    code = run([str(args.gradle.resolve()), "--no-daemon",
                "compileDebugUnitTestJavaWithJavac", "bundleDebugClassesToRuntimeJar"])
    if code:
        return code

    def dependency(group, name, version):
        jars = list((cache / "caches/modules-2/files-2.1" / group / name / version).glob("*/*.jar"))
        if len(jars) != 1:
            raise RuntimeError(f"Expected one cached JAR for {group}:{name}:{version}")
        return jars[0]

    classpath = [
        root / "app/build/intermediates/javac/debugUnitTest/compileDebugUnitTestJavaWithJavac/classes",
        root / "app/build/intermediates/runtime_app_classes_jar/debug/bundleDebugClassesToRuntimeJar/classes.jar",
        dependency("junit", "junit", "4.13.2"),
        dependency("org.hamcrest", "hamcrest-core", "1.3"),
        args.sdk_dir.resolve() / "platforms/android-35/android.jar",
    ]
    for path in classpath:
        if not path.exists():
            raise FileNotFoundError(path)
    return run([str(args.java_home.resolve() / "bin/java.exe"),
                "-Dfile.encoding=UTF-8", "-Dsun.stdout.encoding=UTF-8",
                "-Dsun.stderr.encoding=UTF-8", "-cp",
                os.pathsep.join(str(path) for path in classpath),
                "org.junit.runner.JUnitCore",
                "dev.heybox.hook.SafePreferencesTest",
                "dev.heybox.hook.DialogSessionsTest"])


if __name__ == "__main__":
    sys.stdout.reconfigure(encoding="utf-8", errors="strict")
    raise SystemExit(main())
