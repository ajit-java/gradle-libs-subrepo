## Refer: 

https://github.com/ajit-java/gradle-libs/blob/master/README.md

## root folder:
gradle-libs-subrepo/settings.gradle
```java
include('app', 'utilities')
```

## main project
gradle-libs-subrepo/app/build.gradle
```java
plugins {
    id 'gradle.libs.subrepo.java-application-conventions'
}

dependencies {
    implementation project(':utilities')
}
```

## library project
