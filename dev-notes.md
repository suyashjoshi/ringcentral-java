## Setup - Create Enviornment Variables

Update your system enviornment variables for your RingCentral production app credentials that has all permissions needed to run all tests.

For example on Mac/Linux, update your `.bashrc` or `.zshrc` file by adding variables and thier values as mentioned below:

```shell
# RingCentral Production Credentials
export RINGCENTRAL_CLIENT_ID=
export RINGCENTRAL_CLIENT_SECRET=
export RINGCENTRAL_SERVER_URL=https://platform.ringcentral.com
export RINGCENTRAL_USERNAME=
export RINGCENTRAL_EXTENSION=
export RINGCENTRAL_PASSWORD=
```

## Test

To run all tests:

```
./gradlew test
```

Test a specific test case:

```
./gradlew test --tests com.ringcentral.OkHttpClientTest
```


## Auto generate models

All the files inside `src/main/java/com/ringcentral/definitions/` and `src/main/java/com/ringcentral/paths/` are auto-generated.

The generated code is formatted by IntelliJ IDEA.

## Release a new version

Update version numbers in `build.gradle`.

```
./gradlew publish
```

Go to https://s01.oss.sonatype.org/#stagingRepositories

Login, "Close" and "Release" the SDK.


## Publish Java Doc

```
./gradlew javadoc
cp -r build/docs/javadoc/* ./docs/
```

Issue: https://stackoverflow.com/questions/52326318/maven-javadoc-search-redirects-to-undefined-url

Fix by edit `search.js` and let method `getURLPrefix` return empty string.
