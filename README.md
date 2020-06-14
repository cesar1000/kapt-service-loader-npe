# KAPT: Flaky NPE through `org.jetbrains.kotlin.kapt3.base.ProcessorLoader.doLoadProcessors`

This is a reproducer of https://youtrack.jetbrains.com/issue/KT-34604. The build runs on 500 identical projects, each one of which runs five annotation processors. Use the following command line to run the build:
```
./gradlew test --parallel --rerun-tasks -s -PkotlinVersion=1.3.72 # or 1.4-M2
```
The bug is caused by a race condition, but it usually repros after 1-2 attempts.
