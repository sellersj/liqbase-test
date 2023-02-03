# liqbase-test

This is to test the high memory usage and load done by issue 2111
https://github.com/liquibase/liquibase/issues/2111

### Using different versions liquibase
```
3.9.0
ChangeSet classpath:/db/changelog.xml::2::chrlembeck ran successfully in 240ms

4.4.3
ChangeSet db/changelog.xml::2::chrlembeck ran successfully in 2950ms

4.19.0
ChangeSet db/changelog.xml::2::chrlembeck ran successfully in 374ms
```
