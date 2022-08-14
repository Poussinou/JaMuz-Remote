# Contributing

By contributing to this project you agree to license your contribution under the terms of the [GNU GPLv3](LICENSE).

[[_TOC_]]

## Issues

[Open an issue](https://github.com/phramusca/JaMuz-Remote/issues?state=open) for anything you would like to see in JaMuz, but please check other issues first.

## Internationalization

Using [weblate.org](https://hosted.weblate.org/engage/jamuz-remote/)

## Pull Requests

Pull requests are welcome.
Please submit to the `master` branch.

### Get Started

- Clone repository
- Open project using [Android Studio](https://developer.android.com/studio/)
- You can now run and enjoy (hopefully)

## Release process

1. Update year in strings.xml :  

    ```xml
    <string name="mainWelcomeYear" translatable="false">2021</string>
    ```

1. Update app/build.gradle

    ```text
    versionName "x.y.z"
    versionCode +1
    ```

    - [About versioning](https://developer.android.com/studio/publish/versioning): "Typically, you would release the first version of your app with `versionCode` set to 1, then monotonically increase the value with each release, regardless of whether the release constitutes a major or minor release"

1. Build APK with Android Studio: `Build / Build bundle(s) / APK(s) / Build APK(s)`

1. Rename it to JaMuz_Remote_vx.y.z[-beta].apk

    ```bash
    version=x.y.z
    
    mv app/build/outputs/apk/debug/app-debug.apk app/JaMuz_Remote_v$(version).apk
    ```

1. **TEST**
1. Commit (named vx.y.z) & PUSH
1. [Create release on github](https://github.com/phramusca/JaMuz-Remote/releases/new) based on [previous ones](https://github.com/phramusca/JaMuz-Remote/releases)
    - Drop APK built earlier
    - Update gh-pages with link to new release

1. Update app/build.gradle

    ```text
    versionName "x.y.z+1-dev" 
    ```

1. Commit (named vx.y.z-dev) & PUSH
1. If any change to any of the following, export modified vocal commands to md :
    - VoiceKeyWords
    - `strings*.xml : string arrays voiceCommands_*`